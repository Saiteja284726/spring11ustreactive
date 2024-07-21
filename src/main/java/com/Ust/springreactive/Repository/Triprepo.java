package com.Ust.springreactive.Repository;

import com.Ust.springreactive.entity.Trip;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface Triprepo extends ReactiveMongoRepository<Trip,String> {
}
