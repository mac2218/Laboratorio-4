public class TarjetaPresentacion {
    
    private String nombre;
    private String trabajo;
    private String telefono;
    private String correo;


    public TarjetaPresentacion() {
        this.nombre = "";
        this.trabajo = "";
        this.telefono = "";
        this.correo = "";
    }


    public TarjetaPresentacion(String nombre, String trabajo, String telefono, String correo) {
        this.nombre = nombre;
        this.trabajo = trabajo;
        this.telefono = telefono;
        this.correo = correo;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTrabajo() {
        return this.trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", trabajo='" + getTrabajo() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", correo='" + getCorreo() + "'" +
            "}";
    }

}
