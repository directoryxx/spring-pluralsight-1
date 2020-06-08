package com.directoryxx.service;

import com.directoryxx.model.Speaker;
import com.directoryxx.repository.SpeakerRepository;
import com.directoryxx.repository.SpeakerRepositoryImpl;

import java.util.List;


public class SpeakerServiceImpl implements SpeakerService{

    private SpeakerRepository repository ;


    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
