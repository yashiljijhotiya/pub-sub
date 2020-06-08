package com.MessageBroker.MessageBroker.repository;

import com.MessageBroker.MessageBroker.models.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubscriberRepository extends JpaRepository<Subscriber, Long> {
}
