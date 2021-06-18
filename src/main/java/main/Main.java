package main;

import conexionDB.Connect;
import dto.ActorDto;
import dto.CategoryDto;
import dto.FilmDto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String nombre,apellido;

        Connect conexion = new Connect();
        ActorDto actor =new ActorDto();
        FilmDto pelicula = new FilmDto();
        CategoryDto categoria = new CategoryDto();



        conexion.conexion("select fi.film_id, fi.title,ac.first_name,ac.last_name,ac.actor_id ,ca.category_id,ca.name from actor ac\n" +
                "inner join film_actor fac on ac.actor_id = fac.actor_id\n" +
                "inner join film fi on fac.film_id = fi.film_id\n" +
                "inner join film_category fca on fca.film_id = fi.film_id\n" +
                "inner join category ca on ca.category_id = fca.category_id\n" +
                "where ac.first_name ='KARL' and ac.last_name ='BERRY'");


        //listo todas las peliculas y las categorías en las que ha actuado KARL BERRY

        System.out.println("\nNombre completo del actor" );
        actor.setNombre_act(conexion.actorNom);
        actor.setApellido_act(conexion.actorApell);
        System.out.println(actor.getNombre_act().get(0)+ " " + actor.getApellido_act().get(0));

        System.out.println("\nPelicula en las que ha actuado el actor:\n" );
        pelicula.setNombre_fil(conexion.peliculaNom);
        System.out.println(pelicula.getNombre_fil());

        System.out.println("\nCategoría a las que pertenecen las películas:\n" );
        categoria.setNombre_cat(conexion.categorialaNom);
        System.out.println(categoria.getNombre_cat());












    }

}
