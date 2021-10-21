package com.szorgalmi.kozmondas.Services;

import com.szorgalmi.kozmondas.Entity.Proverb;
import com.szorgalmi.kozmondas.Repositories.ProverbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProverbServiceImpl implements ProverbService{

    @Autowired
    private ProverbRepository proverbRepository;

    @Override
    public List<Proverb> readProverbs(){
        return proverbRepository.findAll();
    }
}
