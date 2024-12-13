package com.example.demo;

public class TesServiceImpl implements TesService {

    @Override
    public String findByNo(String number) {

        TesRepository tesRepository = new TesRepositoryImpl();
        String name = tesRepository.searchByNo(number);
        return name;
    }
}
