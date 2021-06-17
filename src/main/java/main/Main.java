package main;

import conexionDB.Connect;
import dto.ActorDto;

public class Main {
    public static void main(String[] args) {

        Connect conexion = new Connect();
        ActorDto actor =new ActorDto();
        actor.setNombre_act("KARL");
        actor.setApellido_act("BERRY");








    }

}
