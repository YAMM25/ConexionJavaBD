package dto;

import java.util.ArrayList;

public class FilmActorDto {

    private ArrayList<String> codigo_act = new ArrayList<String>();
    private ArrayList<String> nombre_fil = new ArrayList<String>();

    public ArrayList<String> getCodigo_act() {
        return codigo_act;
    }

    public void setCodigo_act(ArrayList<String> codigo_act) {
        this.codigo_act = codigo_act;
    }

    public ArrayList<String> getNombre_fil() {
        return nombre_fil;
    }

    public void setNombre_fil(ArrayList<String> nombre_fil) {
        this.nombre_fil = nombre_fil;
    }
}
