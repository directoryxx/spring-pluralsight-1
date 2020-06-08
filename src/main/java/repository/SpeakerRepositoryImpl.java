package repository;

import model.Speaker;

import java.util.ArrayList;
import java.util.List;

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
