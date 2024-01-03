package com.example.infiniteStreamsApiSSE.service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.infiniteStreamsApiSSE.model.Weather;
import com.example.infiniteStreamsApiSSE.model.WeatherEvent;

import reactor.core.publisher.Flux;

@Service
public class WeatherService {

    public Flux<WeatherEvent> streamWeather() {
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(1));

        Flux<WeatherEvent> event = Flux.fromStream(
                Stream.generate(() -> new WeatherEvent(new Weather(getTemprature(), getHumidity(), getWindSpeed()),
                        LocalDateTime.now())));

        return Flux.zip(event, interval, (key, value) -> key);

    }

    //------------------------------------another way---------------------------------------
    // public Flux<WeatherEvent> streamWeather() {
    //     return Flux.interval(Duration.ofSeconds(1))
    //             .map(interval -> new WeatherEvent(
    //                     new Weather(getTemprature(), getHumidity(), getWindSpeed()),
    //                     LocalDateTime.now()
    //             ));
    // }

    private String getWindSpeed() {
        String[] windSpeeds = "100 km/h,101 km/h, 102 km/h,103 km/h, 104 km/h".split(",");
        return windSpeeds[new Random().nextInt(windSpeeds.length)]; // Picking a random element from the array
    }

    private String getHumidity() {
        String[] humidity = "40%,41%, 42%,42%,44%,45%,46%".split(",");
        return humidity[new Random().nextInt(humidity.length)]; // Picking a random element from the array
    }

    private String getTemprature() {
        String[] tempratures = "19C,19.5C,20C,20.5C, 21C,21.5 C,22C,22.5C,23C,23.5C,24 C".split(",");
        return tempratures[new Random().nextInt(tempratures.length)]; // Picking a random element from the array
    }

}
