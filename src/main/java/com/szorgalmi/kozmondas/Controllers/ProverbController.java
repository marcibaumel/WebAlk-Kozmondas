package com.szorgalmi.kozmondas.Controllers;

import com.szorgalmi.kozmondas.Entity.Proverb;
import com.szorgalmi.kozmondas.Services.ProverbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping(path="/proverbs")
public class ProverbController {

   private final ProverbService proverbService;

   public ProverbController(ProverbService proverbService){
       this.proverbService = proverbService;
   }


    @GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Proverb> getAllProverbs() throws SQLException, ClassNotFoundException {
        return proverbService.readProverbs();

    }

    @GetMapping(path = "/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Proverb getProverbById(@PathVariable("id") Integer id) throws SQLException {
        return proverbService.getProverbById(id);
    }


    @PostMapping(path = "")
    public void saveProverb(@RequestBody @Valid Proverb proverb) throws SQLException, ClassNotFoundException {
       proverbService.saveProverb(proverb);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteProverbById(@PathVariable("id") Integer id) throws SQLException {
        proverbService.deleteById(id);
    }


}
