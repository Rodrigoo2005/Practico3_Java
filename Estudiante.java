package Practico3;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    private String legajo;

    //CONSTRUCTOR VACIO//
    public Estudiante(){
    }
     //CONSTRUCTOR CON DATOS//
    public Estudiante(String nombre, String apellido, int edad, String documento, String legajo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.legajo = legajo;
    }
    //GETTERS//
    public String getNombre()   {return nombre;}
    public String getApellido() {return apellido;}
    public int getEdad()        {return edad;}
    public String getDocumento(){return documento;}
    public String getLegajo(){return legajo;}
    //SETTERS//
    public void setNombre(String nombre)      {this.nombre = nombre;}
    public void setApellido(String apellido)  {this.apellido = apellido;}
    public void setEdad(int edad)             {this.edad = edad;}
    public void setDocumento(String documento){this.documento = documento;}
    public void setLegajo(String legajo){this.legajo = legajo;}

    //ToSTRING//
    @Override
    public String toString() {
        return "Nombre: " + nombre +"\nApellido: " + apellido +"\nEdad: " + edad +"\nDocumento: " + documento +"\nLegajo: " + legajo;
    }
}
