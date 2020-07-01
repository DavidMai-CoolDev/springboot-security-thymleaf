package com.example.selflearning.demo.thymleafsercurity.service;

import com.example.selflearning.demo.thymleafsercurity.emtity.Player;
import com.example.selflearning.demo.thymleafsercurity.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;
    public List<Player> GetAllPlayers(){
        return playerRepository.findAll();
    }
}
