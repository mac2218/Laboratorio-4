public class Cancion {

    private String cantante;
    private String duracion;
    private String nombre;
    private String genero;


    public Cancion() {
        this.cantante = "";
        this.duracion = "";
        this.nombre = "";
        this.genero = "";
    }


    public Cancion(String cantante, String duracion, String nombre, String genero) {
        this.cantante = cantante;
        this.duracion = duracion;
        this.nombre = nombre;
        this.genero = genero;
    }


    public String getCantante() {
        return this.cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "{" +
            " cantante='" + getCantante() + "'" +
            ", duracion='" + getDuracion() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", genero='" + getGenero() + "'" +
            "}";
    }

}