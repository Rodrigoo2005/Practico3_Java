package Practico3;

public class Universidad {
    private String nombre;
    private String direccion;
    private IndiceEstudiantes listaEstudiantes;
    private int cantidadEstudiantes;
    private Double factorCargaMax;

    //CONSTRUCTOR//
    public Universidad (String nombre, String direccion, int cantidadEstudiantes, Double factorCargaMax){
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadEstudiantes = cantidadEstudiantes;
        this.factorCargaMax=factorCargaMax;
        this.listaEstudiantes = new IndiceEstudiantes(cantidadEstudiantes, factorCargaMax);
    }
    
    //GETS//
    public String getNombre() {return nombre;}
    public String getDireccion() {return direccion;}
    public IndiceEstudiantes getListaEstudiantes() {return listaEstudiantes;}
    public int getCantidadEstudiantes() {return cantidadEstudiantes;}
    public Double getFactorCargaMax() {return factorCargaMax;}
    
    //SETS//
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public void setListaEstudiantes(IndiceEstudiantes listaEstudiantes){this.listaEstudiantes=listaEstudiantes;}
    public void setCantidadEstudiantes(int cantidadEstudiantes){this.cantidadEstudiantes=cantidadEstudiantes;}
    public void setFactorCargaMax(Double factorCargaMax){this.factorCargaMax=factorCargaMax;}
}
