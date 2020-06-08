package com.directoryxx.repository;

import com.directoryxx.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class SpeakerRepositoryImpl implements SpeakerRepository {


    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Angga");
        speaker.setLastName("Wijaya");

        speakers.add(speaker);

        return speakers;
    }
}
