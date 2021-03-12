package com.mercadoLibre.startWars.repository;

import com.mercadoLibre.startWars.dto.CharacterDto;

import java.util.List;


public interface ICharacterRepository {
    public List<CharacterDto> findByName(String name);
}
