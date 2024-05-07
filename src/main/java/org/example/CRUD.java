package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CRUD {
    private static final String INSERT_DATA = "INSERT INTO gehStofe(bezeichnung, verwendung, heizwert, massenstrom, betribes, grund) VALUES(?, ?, ?, ?, ?, ?);";

    //метод для чтения БД method GET
//    public static List<GehStofe> getGehStofeData(String query){
//        List<GehStofe> gehStofes = new ArrayList<>();
//
//        try (Connection connection = DBUtils.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(query)){
//            ResultSet rs = preparedStatement.executeQuery();
//
//            while (rs.next()){
//                String bezeichnung = rs.getString ("bezeichnung");
//                String verwendung = rs.getString("verwendung");
//                Double heizwert = rs.getDouble("heizwert");
//                Integer massenstrom = rs.getInt("massenstrom");
//                Boolean betribes = rs.getBoolean("betribes");
//                String grund = rs.getString("grund");
//
//                gehStofes.add(new GehStofe(bezeichnung, verwendung, heizwert, massenstrom, betribes, grund));
//            }
//
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//
//        }
//    return gehStofes;
//    }

//    Метод для сохранения method create
    public static List<GehStofe> saveGehStofe(GehStofe gehStofe){
        List<GehStofe> gehStofes = new ArrayList<>();

        try (Connection connection = DBUtils.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DATA)){

            preparedStatement.setString(1, gehStofe.getBezName());
            preparedStatement.setString(2, gehStofe.getVerv());
            preparedStatement.setInt(3, gehStofe.getHeizwertVal());
            preparedStatement.setInt(4, gehStofe.getMasVal());
            preparedStatement.setBoolean(5, gehStofe.getBetrib());
            preparedStatement.setString(6, gehStofe.getGrungText());
            preparedStatement.executeUpdate();
            connection.commit();

            System.out.println(preparedStatement);

            if(preparedStatement.executeUpdate() > 0)
                gehStofes.add(gehStofe);

            System.out.println(gehStofe);

        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
        return gehStofes;
    }

}
