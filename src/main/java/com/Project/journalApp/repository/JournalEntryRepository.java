package com.Project.journalApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Project.journalApp.entity.JournalEntry;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalEntryRepository extends MongoRepository<JournalEntry, String >{
    
}
