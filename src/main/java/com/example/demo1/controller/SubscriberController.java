package com.example.demo1.controller;

import com.example.demo1.domain.Subscriber;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api")
public interface SubscriberController {

    final Logger logger = LoggerFactory.getLogger(SubscriberController.class);

    /**
     * Returns all subscribers.
     * */
    @GetMapping(value="/all", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Shows all subscribers",
                notes="Returns all the subscribers in the system",
                response = Subscriber.class)
    public List<Subscriber> showAllSubscribers();

    /**
     * Creates a new subscriber instance.
     * */
    @PostMapping(value="/new", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Subscriber createNewSubscriber(@RequestBody Subscriber subscriber);

    /**
     * Returns basic health check information.
     * */
    @GetMapping(value = "/ping", produces = MediaType.APPLICATION_JSON_VALUE)
    default String currentTime(){
        logger.debug("debug log");
        logger.info("info log");
        logger.error("error log");

        return "The current time is: " + Instant.now().toString();

    }

}
