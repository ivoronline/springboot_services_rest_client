package com.ivoronline.springboot_services_rest_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class SpringbootServicesRestClientApplication {

  public static void main(String[] args) throws URISyntaxException {
    SpringApplication.run(SpringbootServicesRestClientApplication.class, args);

    //CALL MICROSERVICE
    RestTemplate restTemplate = new RestTemplate();
    String       result       = restTemplate.getForObject(new URI("http://localhost:8081/Hello"), String.class);

    //RETURN SOMETHING
    System.out.println(result);

  }

}
