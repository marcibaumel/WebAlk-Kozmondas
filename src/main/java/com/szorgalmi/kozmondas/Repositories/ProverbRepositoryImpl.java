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

    @Override
    public void Connect() {
        try {
            String url= new File("proverb.db").getAbsolutePath();
            conn = DriverManager.getConnection("jdbc:sqlite:"+url);
            System.out.println("Good registration");
        } catch (SQLException e) {
            System.out.println("Not good registration");
        }
    }


    @Override
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
    public Proverb findProverbById(Integer id) throws SQLException {
        Connect();
        s = conn.createStatement();
        String sql = "Select * from proverb where id="+id+";";
        rs = s.executeQuery(sql);
        Proverb proverb = new Proverb();
        while (rs.next()) {
            proverb = new Proverb(rs.getInt("id"), rs.getString("proverb_content"));
        }
        DisConnect();
        return proverb;
    }

    @Override
    public void deleteById(Integer id) {
        Connect();
        String sqlp="delete from proverb where id="+id+";";
        try{
            s=conn.createStatement();
            s.execute(sqlp);
            System.out.println("Delete OK!");

        }catch(SQLException e){
            System.out.println("JDB delete: "+ e.getMessage());
        }
        DisConnect();
    }


    @Override
    public Long save(Proverb proverb) throws SQLException, ClassNotFoundException {
        int found = findProverbByGivenIdCheck(proverb.getId());

        /*
        if (found != -1) {
            Proverb givenProverb = findAllProverbs().get(found);
            givenProverb.setId(proverb.getId());
            givenProverb.setProverbContent(proverb.getProverbContent());
        } else {
            articles.add(articleDto);
        }
        */
        return null;
    }

    public int findProverbByGivenIdCheck(Integer id) throws SQLException, ClassNotFoundException {
        int found = -1;
        for (int i = 0; i < findAllProverbs().size(); i++) {
            if (findAllProverbs().get(i).getId().equals(id)) {
                found = i;
                break;
            }
        }
        return found;
    }

}
