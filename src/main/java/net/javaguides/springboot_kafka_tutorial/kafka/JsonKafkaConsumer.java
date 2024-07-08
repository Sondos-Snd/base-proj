//package net.javaguides.springboot_kafka_tutorial.kafka;
//
//import net.javaguides.springboot_kafka_tutorial.payload.User;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class JsonKafkaConsumer {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
//
//    @KafkaListener(topics = "javaguides",groupId = "myGroup")
//    public void consume(User message) {
//        LOGGER.info(String.format("message recieved -> "+ message.toString()));
//    }
//}
