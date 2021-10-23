package com.szorgalmi.kozmondas.Services;

import java.sql.SQLException;

public interface GameService {
    //void getRandomStudent(int maxStudentNumber);
    String generatePlay(int randomStudent) throws SQLException, ClassNotFoundException;
}
