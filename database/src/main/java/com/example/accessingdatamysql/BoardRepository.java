package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Board;

// This will be AUTO IMPLEMENTED by Spring into a Bean called TicketRepository
// CRUD refers Create, Read, Update, Delete

public interface BoardRepository extends CrudRepository<Board, Integer> {

}