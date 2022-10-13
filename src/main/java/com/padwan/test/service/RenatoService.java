package com.padwan.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RenatoService {

    public List<String> skills(){
        List<String> skills = new ArrayList<>();
        skills.add("Puxar!");
        skills.add("Empurrra!");
        skills.add("aperto de força");
        skills.add("Choquue de Força");
        skills.add("Sabre de Luz Verde");
        skills.add("Piloto Mestre");
        skills.add("Telepatia");
        return skills;
    }

}
