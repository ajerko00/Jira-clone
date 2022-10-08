package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Ticket;

// This will be AUTO IMPLEMENTED by Spring into a Bean called TicketRepository
// CRUD refers Create, Read, Update, Delete

public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}