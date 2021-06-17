package conexionDB;

import dto.ActorDto;

import java.sql.*;

public class Connect {

    public String conexion(String nombre,String apellido){

        // establecer conexión con la BD
        Connection connection = null;



        ActorDto actor = new ActorDto();
        nombre= actor.getNombre_act();
        apellido= actor.getApellido_act();

        try {
            connection = DriverManager.getConnection("jdbc:mysql://sofka-training.cpxphmd1h1ok.us-east-1.rds.amazonaws.com/YarleyMoreno","sofka_training","BZenX643bQHw");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(40);
            ResultSet rs = statement.executeQuery("select fi.film_id, fi.title,ac.first_name,ac.actor_id ,ca.name from actor ac\n" +
                    "inner join film_actor fac on ac.actor_id = fac.actor_id\n" +
                    "inner join film fi on fac.film_id = fi.film_id\n" +
                    "inner join film_category fca on fca.film_id = fi.film_id\n" +
                    "inner join category ca on ca.category_id = fca.category_id\n" +
                    "where ac.first_name ="+nombre+" and ac.last_name ="+apellido);
            while (rs.next()){
                System.out.println("Código_pel: " + rs.getString("fi.film_id")+" Titulo: "+ rs.getString("fi.title")
                        +" nombre_actor: " + rs.getString("ac.first_name")+" actor_id: "+ rs.getString("ac.actor_id")
                        +" nombre_categoria: "+ rs.getString("ca.name"));
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
        return nombre;


    }

}
