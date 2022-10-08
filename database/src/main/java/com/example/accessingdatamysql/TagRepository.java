package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Tag;

// This will be AUTO IMPLEMENTED by Spring into a Bean called TicketRepository
// CRUD refers Create, Read, Update, Delete

public interface TagRepository extends CrudRepository<Tag, Integer> {

}