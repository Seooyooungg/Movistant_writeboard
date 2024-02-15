package com.project.movistant.service;

import com.project.movistant.entity.MovistantBoard;
import com.project.movistant.repository.MovistantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovistantService {

    @Autowired
    private MovistantRepository movistantRepository;
    public void write(MovistantBoard movistantBoard) {

        movistantRepository.save(movistantBoard);

    }
}
