package com.napptilus.willywonka.reactive.service;

import com.napptilus.willywonka.entity.OompaLoompa;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @author Mohamed Riyas (riyas90cse@gmail.com)
 * OompaLoompa Service Interface
 */
public interface IOompaLoompaService {

    /**
     * Save Method
     * @param oompaLoompa object
     * @return object
     */
    Mono<OompaLoompa> save(OompaLoompa oompaLoompa);

    /**
     * Save All Method
     * @param oompaLoompas list of object
     * @return Objects
     */
    Flux<OompaLoompa> saveAll(List<OompaLoompa> oompaLoompas);

    /**
     * Find By Id Method
     * @param id Long
     * @return Object
     */
    Mono<OompaLoompa> findById(Long id);

    /**
     * Find All Method
     * @return list of Objects
     */
    Flux<OompaLoompa> findAll();

    /**
     * Find By Name Method
     * @param name name
     * @return OompaLoompa
     */
    Mono<OompaLoompa> findByName(String name);
}
