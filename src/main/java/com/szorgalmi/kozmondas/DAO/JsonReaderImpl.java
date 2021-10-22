package com.szorgalmi.kozmondas.DAO;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.szorgalmi.kozmondas.Model.Proverb;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

@Component
public class JsonReaderImpl {

    private Proverb readJSON(String path) throws FileNotFoundException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        Proverb proverb = gson.fromJson(bufferedReader, Proverb.class);
        return proverb;
    }

}
