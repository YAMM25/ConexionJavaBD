package dto;

import java.util.ArrayList;

public class CategoryDto {

    private ArrayList<String> codigo_cat = new ArrayList<String>();
    private ArrayList<String> nombre_cat = new ArrayList<String>();

    public ArrayList<String> getCodigo_cat() {
        return codigo_cat;
    }

    public void setCodigo_cat(ArrayList<String> codigo_cat) {
        this.codigo_cat = codigo_cat;
    }

    public ArrayList<String> getNombre_cat() {
        return nombre_cat;
    }

    public void setNombre_cat(ArrayList<String> nombre_cat) {
        this.nombre_cat = nombre_cat;
    }
}
