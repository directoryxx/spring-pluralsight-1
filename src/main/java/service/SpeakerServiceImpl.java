package service;

import model.Speaker;
import repository.SpeakerRepository;
import repository.SpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService{

    private SpeakerRepository repository = new SpeakerRepositoryImpl();

    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
