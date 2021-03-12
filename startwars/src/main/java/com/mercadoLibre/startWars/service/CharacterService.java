package com.mercadoLibre.startWars.service;

import com.mercadoLibre.startWars.dto.CharacterDto;
import com.mercadoLibre.startWars.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService implements ICharacterService {
    @Autowired
    CharacterRepository characterRepository;

    public List<CharacterDto> findByName(String name){
        return characterRepository.findByName(name.toLowerCase());
    }
}
