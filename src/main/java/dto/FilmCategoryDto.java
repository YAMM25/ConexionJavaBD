package dto;

import java.util.ArrayList;

public class FilmCategoryDto {

    private ArrayList<String> codigo_cat = new ArrayList<String>();
    private ArrayList<String> codigo_fil = new ArrayList<String>();

    public ArrayList<String> getCodigo_cat() {
        return codigo_cat;
    }

    public void setCodigo_cat(ArrayList<String> codigo_cat) {
        this.codigo_cat = codigo_cat;
    }

    public ArrayList<String> getCodigo_fil() {
        return codigo_fil;
    }

    public void setCodigo_fil(ArrayList<String> codigo_fil) {
        this.codigo_fil = codigo_fil;
    }
}
