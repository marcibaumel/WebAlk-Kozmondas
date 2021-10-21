package com.szorgalmi.kozmondas;

import com.szorgalmi.kozmondas.Repositories.ProverbRepository;
import com.szorgalmi.kozmondas.Repositories.ProverbRepositoryImpl;

public class DbMethodTest {



    public static void main(String[] args){
        ProverbRepositoryImpl db = new ProverbRepositoryImpl();
        db.Connect();
    }
}
