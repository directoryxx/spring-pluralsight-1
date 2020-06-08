package com.directoryxx.repository;

import com.directoryxx.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
