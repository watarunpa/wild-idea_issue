package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class TesRepositoryImpl implements TesRepository {

    @Override
    public String searchByNo(String number) {

        String name;
        if (number.equals("1000")) {
            name = "DI あり いち";
        } else {
            name = "DI あり に";
        }

        return name;
    }
}
