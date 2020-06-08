package com.directoryxx.service;

import com.directoryxx.model.Speaker;
import com.directoryxx.repository.SpeakerRepository;
import com.directoryxx.repository.SpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService{

    private SpeakerRepository repository = new SpeakerRepositoryImpl();

    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
