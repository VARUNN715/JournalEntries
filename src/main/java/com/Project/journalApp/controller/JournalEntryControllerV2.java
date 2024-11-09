package com.Project.journalApp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.journalApp.entity.JournalEntry;
import com.Project.journalApp.service.JournalEntryService;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {
    //special type of components handles http request 

    @Autowired
    private JournalEntryService journalEntryService;
    
    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }
    
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
        return true;
    }

    @GetMapping("id/{myid}")
    public JournalEntry getById(@PathVariable Long myid){
        return null;
    }

    @DeleteMapping("id/{removedId}")
    public JournalEntry removeById(@PathVariable Long removedId){
        return null;
    }

    
}
