package com.example.demo1.service.impl;

import com.example.demo1.domain.Subscriber;
import com.example.demo1.domain.SubscriberRepository;
import com.example.demo1.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubscriberServiceImpl implements SubscriberService {

    private final SubscriberRepository subsRepo;

    @Autowired
    public SubscriberServiceImpl(SubscriberRepository subsRepo) {
        this.subsRepo = subsRepo;
    }

    @Override
    public List<Subscriber> getAllSubscribers() {
        var allSubs = new ArrayList<Subscriber>();
        subsRepo.findAll().forEach(allSubs::add);
        return allSubs;
    }

    @Override
    public Subscriber createSubscriber(String first, String last, String email) {
        var s = new Subscriber();
        s.setFirst(first);
        s.setLast(last);
        s.setEmail(email);
        Subscriber s2 = subsRepo.save(s);
        return s2;
    }

    @Override
    public Subscriber createSubscriber(Subscriber newSubscriber){
        System.out.println("----payload-----\n" + newSubscriber);
        var s = subsRepo.save(newSubscriber);
        return s;
    }
}
