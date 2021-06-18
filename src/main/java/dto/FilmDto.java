package dto;

import java.util.ArrayList;

public class FilmDto {

    private ArrayList<String> codigo_fil = new ArrayList<String>();
    private ArrayList<String> nombre_fil = new ArrayList<String>();
    private ArrayList<String> description_fil = new ArrayList<String>();

    public ArrayList<String> getCodigo_fil() {
        return codigo_fil;
    }

    public void setCodigo_fil(ArrayList<String> codigo_fil) {
        this.codigo_fil = codigo_fil;
    }

    public ArrayList<String> getNombre_fil() {
        return nombre_fil;
    }

    public void setNombre_fil(ArrayList<String> nombre_fil) {
        this.nombre_fil = nombre_fil;
    }

    public ArrayList<String> getDescription_fil() {
        return description_fil;
    }

    public void setDescription_fil(ArrayList<String> description_fil) {
        this.description_fil = description_fil;
    }
}
