package com.Project.journalApp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.Project.journalApp.entity.JournalEntry;
import com.Project.journalApp.repository.JournalEntryRepository;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryService {
    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }
}
