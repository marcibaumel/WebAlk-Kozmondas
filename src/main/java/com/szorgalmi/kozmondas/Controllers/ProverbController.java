package com.szorgalmi.kozmondas.Controllers;

import com.szorgalmi.kozmondas.Entity.Proverb;
import com.szorgalmi.kozmondas.Services.ProverbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path="/proverbs")
public class ProverbController {

   private final ProverbService proverbService;

   public ProverbController(ProverbService proverbService){
       this.proverbService = proverbService;
   }

    @GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Proverb> getAllProverbs(){
        return proverbService.readProverbs();
    }

    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Proverb getAccountById(@PathVariable("id") Integer id){
        return proverbService.getProverbById(id);
    }

    @PostMapping(path = "")
    public void saveProverb(@RequestBody @Valid Proverb proverb){
       proverbService.saveProverb(proverb);
    }

}
