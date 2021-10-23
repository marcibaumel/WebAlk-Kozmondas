package com.szorgalmi.kozmondas.Entity;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="proverb")
public class Proverb {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Integer id;
    private String proverbContent;

    public Proverb(Integer id, String ProverbContent) {
        this.id = id;
        this.proverbContent = ProverbContent;
    }

    public Proverb() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProverbContent() {
        return proverbContent;
    }

    public void setProverbContent(String proverbContent) {
        this.proverbContent = proverbContent;
    }
}
