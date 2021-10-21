package com.szorgalmi.kozmondas.Services;

import com.szorgalmi.kozmondas.Entity.Proverb;
import com.szorgalmi.kozmondas.Repositories.ProverbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProverbServiceImpl implements ProverbService{


    private final ProverbRepository proverbRepository;

    @Autowired
    public ProverbServiceImpl(ProverbRepository proverbRepository){
        this.proverbRepository = proverbRepository;
    }

    @Override
    public List<Proverb> readProverbs() throws SQLException, ClassNotFoundException {
        return proverbRepository.findAllProverbs();
    }

    /*
    @Override
    public Proverb getProverbById(Integer id) {
        return proverbRepository.findById(id).get();
    }


    @Override
    public void deleteById(Integer id) {
        proverbRepository.deleteById(id);
    }

    @Override
    public void saveProverb(Proverb proverb) {
        proverbRepository.save(proverb);
    }

    @Override
    public void deleteAll() {
        proverbRepository.deleteAll();
    }

     */

}
