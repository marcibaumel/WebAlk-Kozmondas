package com.szorgalmi.kozmondas.Repositories;

import com.szorgalmi.kozmondas.Entity.Proverb;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("proverbRepository")
public interface ProverbRepository extends CrudRepository<Proverb, Integer> {
}
