package com.szorgalmi.kozmondas.Services;

import com.szorgalmi.kozmondas.Entity.Proverb;

import java.sql.SQLException;
import java.util.List;

public interface ProverbService {
    List<Proverb> readProverbs() throws SQLException, ClassNotFoundException;

    Proverb getProverbById(Integer id) throws SQLException;
    void deleteById(Integer id);
    void saveProverb(Proverb proverb) throws SQLException, ClassNotFoundException;
    Proverb getRandomProverb() throws SQLException, ClassNotFoundException;

}
