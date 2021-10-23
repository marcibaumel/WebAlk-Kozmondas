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

    @NotNull
    private String proverbContent;

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
        proverbContent = proverbContent;
    }
}
