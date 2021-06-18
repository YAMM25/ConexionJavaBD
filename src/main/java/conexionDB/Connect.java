package conexionDB;

import java.sql.*;
import java.util.ArrayList;

public class Connect {


    public ArrayList<String> actorCod = new ArrayList<>();
    public ArrayList<String> actorNom = new ArrayList<String>();
    public ArrayList<String> actorApell= new ArrayList<>();
    public ArrayList<String> peliculCod = new ArrayList<>();
    public ArrayList<String> peliculaNom= new ArrayList<>();
    public ArrayList<String> categoriaCod = new ArrayList<>();
    public ArrayList<String> categorialaNom= new ArrayList<>();
    //public ArrayList<String> list = new ArrayList<>();

    public void conexion(String consulta){

        // establecer conexión con la BD
         Connection connection = null;




        try {
            connection = DriverManager.getConnection("jdbc:mysql://sofka-training.cpxphmd1h1ok.us-east-1.rds.amazonaws.com/YarleyMoreno","sofka_training","BZenX643bQHw");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(40);
            ResultSet rs = statement.executeQuery(consulta);
            while (rs.next()){
                actorCod.add(rs.getString("ac.actor_id"));
                actorNom.add(rs.getString("ac.first_name"));
                actorApell.add(rs.getString("ac.last_name"));
                peliculCod.add(rs.getString("fi.film_id"));
                peliculaNom.add(rs.getString("fi.title"));
                categoriaCod.add(rs.getString("ca.category_id"));
                categorialaNom.add(rs.getString("ca.name"));


            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if (connection != null){
                    connection.close();
                }
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }


    }


}
