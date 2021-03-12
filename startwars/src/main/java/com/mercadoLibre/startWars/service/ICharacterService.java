package com.mercadoLibre.startWars.service;

import com.mercadoLibre.startWars.dto.CharacterDto;

import java.util.List;

public interface ICharacterService {
    public List<CharacterDto> findByName(String name);
}
