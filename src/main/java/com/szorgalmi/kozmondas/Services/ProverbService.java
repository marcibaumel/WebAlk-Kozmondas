package com.szorgalmi.kozmondas.Services;

import com.szorgalmi.kozmondas.Entity.Proverb;

import java.util.List;

public interface ProverbService {
    List<Proverb> readProverbs();
    Proverb getProverbById(Integer id);
    void deleteById(Integer id);
    void saveProverb(Proverb proverb);
    void deleteAll();
}
