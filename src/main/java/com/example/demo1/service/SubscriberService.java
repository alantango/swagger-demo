package com.example.demo1.service;

import com.example.demo1.domain.Subscriber;
import lombok.NonNull;

import java.util.List;

public interface SubscriberService {

    List<Subscriber> getAllSubscribers();

    Subscriber createSubscriber(@NonNull String first, @NonNull String last, @NonNull String email);

    Subscriber createSubscriber(Subscriber newSubscriber);
}
