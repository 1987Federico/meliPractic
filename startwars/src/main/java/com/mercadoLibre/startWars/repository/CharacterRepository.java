package com.mercadoLibre.startWars.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mercadoLibre.startWars.dto.CharacterDto;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class CharacterRepository implements ICharacterRepository {

    public List<CharacterDto> findByName(String name){
        String finalName = name.toLowerCase();
        List<CharacterDto> characterDtos = loadDataBase();

        return characterDtos.stream().filter((CharacterDto a)->
                a.getName().toLowerCase().contains(finalName)).collect(Collectors.toList());
    }

    private List<CharacterDto> loadDataBase(){
        File file = null;

        try {
            file = ResourceUtils.getFile("starwars.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<CharacterDto>> typeReference = new TypeReference<>(){};
        List<CharacterDto> characterDtos = null;
        try {
            characterDtos = objectMapper.readValue(file,typeReference);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return characterDtos;
    }
}
