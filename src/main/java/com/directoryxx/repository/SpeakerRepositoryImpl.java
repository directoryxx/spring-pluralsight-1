package com.directoryxx.repository;

import com.directoryxx.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class SpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar calendarFac;

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Angga");
        speaker.setLastName("Wijaya");

        System.out.println("Calendar" + calendarFac.getTime());

        speakers.add(speaker);

        return speakers;
    }
}
