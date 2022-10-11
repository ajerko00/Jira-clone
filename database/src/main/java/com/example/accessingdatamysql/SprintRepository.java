package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Sprint;

// This will be AUTO IMPLEMENTED by Spring into a Bean called TicketRepository
// CRUD refers Create, Read, Update, Delete

public interface SprintRepository extends CrudRepository<Sprint, Integer> {

}