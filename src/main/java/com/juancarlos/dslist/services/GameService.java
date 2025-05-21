package com.juancarlos.dslist.services;

import com.juancarlos.dslist.entities.Games;
import com.juancarlos.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Games> findAll(){
        List<Games> result = gameRepository.findAll();
        return  result;
    }
}
