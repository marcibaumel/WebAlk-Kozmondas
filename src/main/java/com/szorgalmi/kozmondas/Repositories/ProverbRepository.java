package com.szorgalmi.kozmondas.Repositories;

import com.szorgalmi.kozmondas.Entity.Proverb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

//TODO make a connection, find all, find by id külőn branch-en
@Repository
public interface ProverbRepository {
    List<Proverb> findAllProverbs() throws SQLException, ClassNotFoundException;
}
