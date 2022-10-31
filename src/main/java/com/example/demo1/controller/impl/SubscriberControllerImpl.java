package com.example.demo1.controller.impl;

import com.example.demo1.controller.SubscriberController;
import com.example.demo1.domain.Subscriber;
import com.example.demo1.service.SubscriberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubscriberControllerImpl implements SubscriberController {

    private final Logger logger = LoggerFactory.getLogger(SubscriberControllerImpl.class);

    private SubscriberService subscriberService;

    @Autowired
    public SubscriberControllerImpl(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @Override
    public List<Subscriber> showAllSubscribers() {
        var list = subscriberService.getAllSubscribers();
        list.forEach(s -> logger.info("{}",s.toString()));
        return list;
    }

    @Override
    public Subscriber createNewSubscriber(Subscriber subscriber) {
        return subscriberService.createSubscriber(subscriber);
    }
}
