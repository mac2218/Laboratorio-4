import java.io.Console;
import java.util.ArrayList;

public class Radio implements InterfaceB{
    private String banda;
    private String frecuencia;
    private double estacionActual;
    private ArrayList<Contacto> listaContactos;
    private String modo;    
    private Integer volumen;    
    private ArrayList<Cancion> listaReproduccion;
    private ArrayList<TarjetaPresentacion> listaTarjetaPresentacion;


    public Radio() {
        this.banda = "FM";
        this.frecuencia = "";
        this.estacionActual = 0.0;
        this.modo = "APAGADA";
        this.volumen = 0;            

        ArrayList<Contacto> listaContactos = new ArrayList<Contacto>();
        this.listaContactos = listaContactos;        

        ArrayList<Cancion> listaReproduccion = new ArrayList<Cancion>();
        this.listaReproduccion = listaReproduccion;

        ArrayList<TarjetaPresentacion> listaTarjetaPresentacion = new ArrayList<TarjetaPresentacion>();
        this.listaTarjetaPresentacion = listaTarjetaPresentacion;
    }


    public Radio(String banda, String frecuencia, double estacionActual, ArrayList<Contacto> listaContactos, String modo, Integer volumen, ArrayList<Cancion> listaReproduccion, ArrayList<TarjetaPresentacion> listaTarjetaPresentacion) {        
        this.banda = banda;
        this.frecuencia = frecuencia;
        this.estacionActual = estacionActual;
        this.listaContactos = listaContactos;
        this.modo = modo;        
        this.volumen = volumen;
        this.listaReproduccion = listaReproduccion;
        this.listaTarjetaPresentacion = listaTarjetaPresentacion;
    }


    public String getBanda() {
        return this.banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getFrecuencia() {
        return this.frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getEstacionActual() {
        return this.estacionActual;
    }

    public void setEstacionActual(double estacionActual) {
        this.estacionActual = estacionActual;
    }

    public ArrayList<Contacto> getListaContactos() {
        return this.listaContactos;
    }

    public void setListaContactos(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public String getModo() {
        return this.modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public Integer getVolumen() {
        return this.volumen;
    }

    public void setVolumen(Integer volumen) {
        this.volumen = volumen;
    }

    public ArrayList<Cancion> getListaReproduccion() {
        return this.listaReproduccion;
    }

    public void setListaReproduccion(ArrayList<Cancion> listaReproduccion) {
        this.listaReproduccion = listaReproduccion;
    }

    public ArrayList<TarjetaPresentacion> getListaTarjetaPresentacion() {
        return this.listaTarjetaPresentacion;
    }

    public void setListaTarjetaPresentacion(ArrayList<TarjetaPresentacion> listaTarjetaPresentacion) {
        this.listaTarjetaPresentacion = listaTarjetaPresentacion;
    }

    @Override
    public String toString() {
        return "{" +
            " banda='" + getBanda() + "'" +
            ", frecuencia='" + getFrecuencia() + "'" +
            ", estacionActual='" + getEstacionActual() + "'" +
            ", listaContactos='" + getListaContactos() + "'" +
            ", modo='" + getModo() + "'" +            
            ", volumen='" + getVolumen() + "'" +
            ", listaReproduccion='" + getListaReproduccion() + "'" +
            ", listaTarjetaPresentacion='" + getListaTarjetaPresentacion() + "'" +
            "}";
    }


    @Override
    public void encenderApagar() {                
        if(getModo() != "ENCENDIDA"){
            setModo("ENCENDIDA");
            System.out.println("RADIO ENCENDIDA");
        }else{
            setModo("APAGADA");
            System.out.println("RADIO APAGADA");
        }
    }

    @Override
    public void cambiarVolumen(int subir) {
        setVolumen(getVolumen() + subir);
        System.out.println("Volumen: " + getVolumen() + "%");        
    }

    //-Modo Radio
    @Override
    public void cambiarRadio() {
        if(getBanda() != "FM"){
            setBanda("FM");
            System.out.println("Radio suena en FM");
        }else{
            setBanda("AM");
            System.out.println("Radio suena en AM");
        }
        
    }

    @Override
    public void cambiarEmisora(double bajar) {
        setEstacionActual(getEstacionActual() + bajar);
        System.out.println("Emisora " + getEstacionActual());        
    }

    @Override
    public void guardarEmisora() {        
    }
    
    @Override
    public void desplegarEmisoras() {                
    }


    //Modo Reproduccion    
    @Override
    public void desplegarListas() {
        for(int i=0; i<= getListaReproduccion().size() - 1; i++){
            System.out.println(i + " " + getListaReproduccion().get(i).getNombre() + " " + getListaReproduccion().get(i).getCantante() + " " + getListaReproduccion().get(i).getGenero() + " " + getListaReproduccion().get(i).getDuracion());
        }        
    }

    @Override
    public void seleccionarLista(int lista) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public void cambiarCancion(int subirBajar) {
        System.out.println(subirBajar + " " + getListaReproduccion().get(subirBajar).getNombre() + " " + getListaReproduccion().get(subirBajar).getCantante() + " " + getListaReproduccion().get(subirBajar).getGenero() + " " + getListaReproduccion().get(subirBajar).getDuracion());
        
    }

    @Override
    public void escucharCancion(int cancion) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void desplegarCancion() {
        // TODO Auto-generated method stub
        
    }

    //Modo telefono
    @Override
    public void desconectar() {
        System.out.println("Desconectando telefono"); 
    }

    @Override
    public void cambiarModo(int modo) {        
        
    }

    @Override
    public void conecar(int numeroTelefono) {        
        System.out.println("Conectando Telefono " + numeroTelefono);                
    }

    @Override
    public void desplegarContactos() {
        for(int i=0; i<= getListaContactos().size()-1; i++){
            System.out.println(i + " " + getListaContactos().get(i).getNombre() + " " + getListaContactos().get(i).getTelefono());
        }        
        
    }

    @Override
    public void llamarColgar(int opcion, int contacto) {
        if(opcion == 1){
            System.out.println("Colgando a numero..." + getListaContactos().get(contacto).getTelefono());
        }else{
            System.out.println("Llamando a numero..." + getListaContactos().get(contacto).getTelefono());
        }
        
        
    }



    //Modo productividad
    @Override
    public void desplegarTarjetas() {
        for(int i=0; i<= getListaTarjetaPresentacion().size()-1; i++){
            System.out.println(i + " " + getListaTarjetaPresentacion().get(i).getNombre() + " " + getListaTarjetaPresentacion().get(i).getTrabajo() + " " + getListaTarjetaPresentacion().get(i).getTelefono() + " " + getListaTarjetaPresentacion().get(i).getCorreo());
        }            
    }
}
