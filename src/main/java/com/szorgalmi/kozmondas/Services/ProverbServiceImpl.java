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

    @Override
    public void saveProverb(Proverb proverb) throws SQLException, ClassNotFoundException {
        proverbRepository.save(proverb);
    }


    @Override
    public Proverb getProverbById(Integer id) throws SQLException {
        return proverbRepository.findProverbById(id);
    }


    @Override
    public void deleteById(Integer id) {
        proverbRepository.deleteById(id);
    }

    /*
    @Override
    public void saveProverb(Proverb proverb) {
        proverbRepository.save(proverb);
    }
   */

}
