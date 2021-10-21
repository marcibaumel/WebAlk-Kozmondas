package com.szorgalmi.kozmondas.Services;

import com.szorgalmi.kozmondas.Entity.Proverb;

public interface ProverbService {
    Iterable<Proverb> findAllProverbs();
}
