package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class TesServiceImpl implements TesService {
    
    private final TesRepository tesRepository;

    // TesRepositoryのDI適用
    public TesServiceImpl(TesRepository tesRepository) {
        this.tesRepository = tesRepository;
    }

    @Override
    public String findByNo(String number) {

        String name = tesRepository.searchByNo(number);
        return name;
    }
}
