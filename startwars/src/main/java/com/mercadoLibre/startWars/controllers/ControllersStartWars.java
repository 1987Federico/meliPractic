package com.mercadoLibre.startWars.controllers;

import com.mercadoLibre.startWars.dto.CharacterDto;
import com.mercadoLibre.startWars.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ControllersStartWars {
    @Autowired
    CharacterService character;
    // AGUANTE CORDOBA!!! Y LE FERNET
    @PostMapping("/name")
    public List<CharacterDto> findByName(@RequestBody CharacterDto characterDto){
        return character.findByName(characterDto.getName());
    }
}
