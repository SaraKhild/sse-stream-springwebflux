package com.example.infiniteStreamsApiSSE.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.infiniteStreamsApiSSE.model.WeatherEvent;
import com.example.infiniteStreamsApiSSE.service.WeatherService;

import reactor.core.publisher.Flux;

@RestController
public class Controller {

    @Autowired
    private WeatherService weatherService;

    @GetMapping(value = "weather-stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<WeatherEvent> streamWitherr() {
        return this.weatherService.streamWeather();
    }

}
