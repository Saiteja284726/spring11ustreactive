package com.Ust.springreactive.service;

import com.Ust.springreactive.Repository.Triprepo;
import com.Ust.springreactive.dto.Tripdto;
import com.Ust.springreactive.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class Tripservice {

    @Autowired
    private Triprepo repo;

    public Mono<Tripdto> addTrip(Mono<Tripdto> tripdtomono) {
        return tripdtomono.map(AppUtils::dtoToEntity)
                .flatMap(repo::insert)
                .map(AppUtils::entityToDto);
    }

    public Flux<Tripdto> getAllTrips() {
        return repo.findAll().map(AppUtils::entityToDto);
    }

    public Mono<Tripdto> getTripById(String id) {
        return repo.findById(id).map(AppUtils::entityToDto);
    }

    public Mono<Tripdto> updateTrip(String id, Mono<Tripdto> tripdtomono) {
        return repo.findById(id)
                .flatMap(p -> tripdtomono.map(AppUtils::dtoToEntity)
                        .doOnNext(e -> e.setId(id))
                        .flatMap(repo::save)
                        .map(AppUtils::entityToDto));
    }

    public Mono<Void> deleteTrip(String id) {
        return repo.deleteById(id);

    }
}










