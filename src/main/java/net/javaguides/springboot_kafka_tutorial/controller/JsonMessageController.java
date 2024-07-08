package net.javaguides.springboot_kafka_tutorial.controller;

import net.javaguides.springboot_kafka_tutorial.kafka.JsonKafkaProducer;
import net.javaguides.springboot_kafka_tutorial.kafka.KafkaProducer;
import net.javaguides.springboot_kafka_tutorial.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private JsonKafkaProducer jsonKafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    // http:localhost:8080/api/v1/kafka/json-publish
    // {
    //  "id":1,
    //     "firstName":"test",
    //    "lastName":"test"
    //}
    @PostMapping ("/json-publish")
    public ResponseEntity<String> publish(@RequestBody User userData) {

        jsonKafkaProducer.sendMessage(userData);
        return ResponseEntity.ok("json message sent successfully");
    }
}
