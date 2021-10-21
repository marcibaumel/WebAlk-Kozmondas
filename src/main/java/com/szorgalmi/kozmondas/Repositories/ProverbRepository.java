package com.szorgalmi.kozmondas.Repositories;

import com.szorgalmi.kozmondas.Entity.Proverb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProverbRepository extends JpaRepository<Proverb, Integer> {

}
