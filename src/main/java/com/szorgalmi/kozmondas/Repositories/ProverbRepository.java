package com.szorgalmi.kozmondas.Repositories;

import com.szorgalmi.kozmondas.Entity.Proverb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//TODO make a connection, find all, find by id
@Repository
public interface ProverbRepository extends JpaRepository<Proverb, Integer> {

}
