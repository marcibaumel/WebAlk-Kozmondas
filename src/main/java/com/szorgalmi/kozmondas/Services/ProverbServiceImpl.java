package com.szorgalmi.kozmondas.Services;

import com.szorgalmi.kozmondas.Entity.Proverb;
import com.szorgalmi.kozmondas.Repositories.ProverbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProverbServiceImpl implements ProverbService{

    @Autowired
    private ProverbRepository proverbRepository;

    @Override
    public List<Proverb> readProverbs(){
        return proverbRepository.findAll();
    }

    @Override
    public Proverb getProverbById(Integer id) {
        return proverbRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        proverbRepository.deleteById(id);
    }

    @Transactional
    public String createProverb(Proverb proverb) {
      try {
          if (!proverbRepository.existsByProverbContent(proverb.getProverbContent())) {
              proverb.setId(null == proverbRepository.findMaxId() ? 0 : proverbRepository.findMaxId() + 1);
              proverbRepository.save(proverb);
              return "Proverb saved";
          } else {
              return "Already existing data";
          }
      }catch (Exception e){ throw e; }
    }

    @Override
    public void deleteAll() {
        proverbRepository.deleteAll();
    }


}
