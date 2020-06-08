package com.directoryxx.service;

import com.directoryxx.model.Speaker;
import com.directoryxx.repository.SpeakerRepository;
import com.directoryxx.repository.SpeakerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class SpeakerServiceImpl implements SpeakerService{

    private SpeakerRepository repository ;

    public SpeakerServiceImpl(){
        System.out.println("No args constructor");
    }

    public SpeakerServiceImpl (SpeakerRepository speakerRepository){
        System.out.println("With repository constructor");
        repository = speakerRepository;
    }

    public List<Speaker> findAll(){
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakServiceImpl setter");
        this.repository = repository;
    }
}
