package com.szorgalmi.kozmondas.Services;

import com.szorgalmi.kozmondas.Entity.Proverb;
import com.szorgalmi.kozmondas.Repositories.ProverbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("proverbService")
public class ProverbServiceImpl implements ProverbService{

    @Autowired
    private ProverbRepository proverbRepository;

    @Override
    public Iterable<Proverb> findAllProverbs() {
        return proverbRepository.findAll();
    }
}
