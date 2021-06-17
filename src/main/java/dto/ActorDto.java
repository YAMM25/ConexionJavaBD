package dto;

public class ActorDto {

    private int codigo_act ;
    private String nombre_act;
    private String apellido_act ;

    public int getCodigo_act() {
        return codigo_act;
    }

    public void setCodigo_act(int codigo_act) {
        this.codigo_act = codigo_act;
    }

    public String getNombre_act() {
        return nombre_act;
    }

    public void setNombre_act(String nombre_act) {
        this.nombre_act = nombre_act;
    }

    public String getApellido_act() {
        return apellido_act;
    }

    public void setApellido_act(String apellido_act) {
        this.apellido_act = apellido_act;
    }
}
