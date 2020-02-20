package com.mohim;

import io.dekorate.kubernetes.annotation.Env;
import io.dekorate.kubernetes.annotation.KubernetesApplication;
import io.dekorate.kubernetes.annotation.ServiceType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@KubernetesApplication(envVars = {
        @Env(name = "RABBIT_URI", value = "amqp://rabbitmq-url:5672"),
        @Env(name = "SPRING_APPLICATION_JSON", value = "{\"spring\": {\"zipkin\": {\"baseUrl\": \"http://zipkin:9411\"}}}")},
        serviceType = ServiceType.LoadBalancer)
public class ShazamApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShazamApplication.class, args);
    }

}
