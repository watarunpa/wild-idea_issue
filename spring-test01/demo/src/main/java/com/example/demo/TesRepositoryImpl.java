package com.example.demo;

public class TesRepositoryImpl implements TesRepository {

    @Override
    public String searchByNo(String number) {

        String name;
        if (number.equals("1000")) {
            name = "DI なし いち";
        } else {
            name = "DI なし に";
        }

        return name;
    }
}