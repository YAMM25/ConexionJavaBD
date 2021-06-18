package dto;

import java.util.ArrayList;

public class ActorDto {


    private ArrayList<String> codigo_act = new ArrayList<String>();
    private ArrayList<String> nombre_act = new ArrayList<String>();
    private ArrayList<String> apellido_act = new ArrayList<String>();


    public ArrayList<String> getCodigo_act() {
        return codigo_act;
    }

    public void setCodigo_act(ArrayList<String> codigo_act) {
        this.codigo_act = codigo_act;
    }

    public ArrayList<String> getNombre_act() {
        return nombre_act;
    }

    public void setNombre_act(ArrayList<String> nombre_act) {
        this.nombre_act = nombre_act;
    }

    public ArrayList<String> getApellido_act() {
        return apellido_act;
    }

    public void setApellido_act(ArrayList<String> apellido_act) {
        this.apellido_act = apellido_act;
    }
}
