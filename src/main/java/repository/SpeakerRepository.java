package repository;

import model.Speaker;

import java.util.ArrayList;
import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
