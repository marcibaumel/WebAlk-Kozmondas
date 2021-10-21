package com.szorgalmi.kozmondas.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="proverb")
public class Proverb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Integer id;
    //TODO kisbbetűre ProverbContent
    @NotNull
    private String ProverbContent;

    public Proverb(Integer id, String ProverbContent) {
        this.id = id;
        this.ProverbContent = ProverbContent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProverbContent() {
        return ProverbContent;
    }

    public void setProverbContent(String proverbContent) {
        ProverbContent = proverbContent;
    }
}
