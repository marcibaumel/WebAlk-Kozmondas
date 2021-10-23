package com.szorgalmi.kozmondas.Services;

import com.szorgalmi.kozmondas.Repositories.ProverbRepository;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.sql.SQLException;

@Service
public class GameServiceImpl implements GameService {

    private int randomStudent;

    private final ProverbRepository proverbRepository;

    public GameServiceImpl(ProverbRepository proverbRepository) {
        this.proverbRepository = proverbRepository;
    }

    /*
    @Override
    public void getRandomStudent(int maxStudentNumber) {
        SecureRandom secureRandom = new SecureRandom();
        randomStudent = secureRandom.nextInt(maxStudentNumber - 1) + 1;
    }
    */

    @Override
    public String generatePlay(int maxStudentNumber) throws SQLException, ClassNotFoundException {
        String randomProverb = proverbRepository.getRandomProverb().getProverbContent();
        SecureRandom secureRandom = new SecureRandom();
        randomStudent = secureRandom.nextInt(maxStudentNumber - 1) + 1;
        return randomStudent+"----"+randomProverb;
    }
}
