package com.szorgalmi.kozmondas.Controllers;

import com.szorgalmi.kozmondas.Entity.Proverb;
import com.szorgalmi.kozmondas.Services.ProverbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/proverbs")
public class MainController {

   private final ProverbService proverbService;

   public MainController(ProverbService proverbService){
       this.proverbService = proverbService;
   }

    @GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Proverb> getAllProverbs(){
        return proverbService.readProverbs();
    }

}
