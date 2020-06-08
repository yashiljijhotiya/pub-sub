package com.MessageBroker.MessageBroker.repository;

import com.MessageBroker.MessageBroker.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPublisherRepository extends JpaRepository<Publisher, Long> {
}
