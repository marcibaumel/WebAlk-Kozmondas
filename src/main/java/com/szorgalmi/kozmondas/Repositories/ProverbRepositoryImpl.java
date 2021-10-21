package com.szorgalmi.kozmondas.Repositories;

import com.szorgalmi.kozmondas.Entity.Proverb;
import org.springframework.stereotype.Component;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProverbRepositoryImpl implements ProverbRepository{

    private Statement s = null;
    private Connection conn= null;
    private ResultSet rs= null;
    private PreparedStatement ps;

    public void Connect() {
        try {
            String url= new File("proverb.db").getAbsolutePath();
            conn = DriverManager.getConnection("jdbc:sqlite:"+url);
            System.out.println("Good registration");
        } catch (SQLException e) {
            System.out.println("Not good registration");
        }
    }

    public void DisConnect(){
        try{
            conn.close();
            System.out.println("Disconnected");
        }catch (SQLException e){
            System.out.println("Disconnected exception");
        }
    }

    @Override
    public List<Proverb> findAllProverbs() throws SQLException, ClassNotFoundException {
        Connect();
        s = conn.createStatement();
        String sql = "Select * from proverb";
        rs = s.executeQuery(sql);
        List<Proverb> proverbsList = new ArrayList<>();
        while (rs.next()) {
            Proverb proverb = new Proverb(rs.getInt("id"), rs.getString("proverb_content"));
            proverbsList.add(proverb);
        }
        DisConnect();
        return proverbsList;
    }

    @Override
    public void save(Proverb proverb) {
        Connect();
        String sqlp = "insert into proverb values ("+proverb.getId()+",'"+proverb.getProverbContent()+"');";
        try{
            s=conn.createStatement();
            s.execute(sqlp);
            System.out.println("\nProverb recorded");

        }catch(SQLException e){
            System.out.println("JDB Insert: "+ e.getMessage());
        }
        DisConnect();
    }
}
