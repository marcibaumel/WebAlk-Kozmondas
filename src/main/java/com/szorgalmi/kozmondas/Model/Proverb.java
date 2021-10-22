package com.szorgalmi.kozmondas.Model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Proverb {

    @NotNull
    private Integer id;
    @NotEmpty
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
        this.proverbContent = proverbContent;
    }
}
