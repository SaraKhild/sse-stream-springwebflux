# Server Sent Events in Spring WebFlux

<br>

## Overview
In the world of web development, real-time communication between a server and its clients is crucial.<br>This brings us to SSE is a standard that allows a server to push updates to a client whenever there’s new data available.<br>In this project, I have implemented a simple example that provides updates about the current temperature, humidity, and wind speed of the weather. These updates are sent to the client every second.
 
 <br>
 
## Usages
- Spring WebFlux
- Lombok
    
<br> 

## Architecture of the Project

 ### 1-src folder

   - EndPoint
   - Model
   - Service
   
### 2-Maven pom.xml
<br> 
    
```
 <dependencies>
   		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-webflux</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>io.projectreactor</groupId>
			<artifactId>reactor-test</artifactId>
			<scope>test</scope>
		</dependency>
 </dependencies>
 ```

<br>

###### Output :star_struck:

https://github.com/SaraKhild/sse-stream-springwebflux/assets/67427643/11f2fc50-fc9d-4ea7-a299-4854bcc8c14f




