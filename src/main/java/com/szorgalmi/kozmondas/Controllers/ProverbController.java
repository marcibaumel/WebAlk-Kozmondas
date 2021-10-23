package com.szorgalmi.kozmondas.Controllers;

import com.szorgalmi.kozmondas.Entity.Proverb;
import com.szorgalmi.kozmondas.Services.ProverbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/proverbs")
public class ProverbController {

   private final ProverbService proverbService;

    public ProverbController(ProverbService proverbService){
       this.proverbService = proverbService;
    }

    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(){
        return "The application is up...";
    }

    @GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Proverb> getAllProverbs(){
        return proverbService.readProverbs();
    }

    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Proverb getAccountById(@PathVariable("id") Integer id){
        return proverbService.getProverbById(id);
    }


    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String createStudent(@RequestBody Proverb proverb){
         return proverbService.createProverb(proverb);
    }

    

}
