package com.example.demo.repositorio;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modelo.Reserva;

public interface ReservaRepository extends MongoRepository<Reserva, String> {
    List<Reserva> findDistinctBy();

}
