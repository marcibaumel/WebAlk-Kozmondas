package com.szorgalmi.kozmondas.Repositories;

import com.szorgalmi.kozmondas.Entity.Proverb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProverbRepository extends JpaRepository<Proverb, Integer> {
    boolean existsByProverbContent(String proverbContent);

    //List<Proverb> findByProverb(String proverb);
    @Query("select max(p.id) from Proverb p")
    Integer findMaxId();

    @Modifying
    @Query(value = "insert into Proverb (id,proverb_content) VALUES (:id, :proverb_content)", nativeQuery = true)
    @Transactional
    void insertNewProverb(@Param("id") Integer insertLink, @Param("proverb_content") String proverb_content);
}
