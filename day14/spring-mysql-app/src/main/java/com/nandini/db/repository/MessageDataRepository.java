package com.nandini.db.repository;

import com.nandini.db.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageDataRepository extends CrudRepository<Message, Integer> {
}
