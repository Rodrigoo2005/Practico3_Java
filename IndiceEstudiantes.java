package Practico3;

public class IndiceEstudiantes {
    private Estudiante[] tabla;
    private int tamaño;
    private Double factorCargaMax;
    private int cantidadActual;

    //CONSTRUCTOR//
    public IndiceEstudiantes(int tamaño, Double factorCargaMax) { 
        this.tamaño = tamaño;
        this.factorCargaMax = factorCargaMax;
        this.tabla = new Estudiante[tamaño];
        this.cantidadActual = 0;
    }
    // GETS //
    public Estudiante[] getTabla() {return tabla;}
    public int getTamaño() {return tamaño;}
    public Double getFactorCargaMax() {return factorCargaMax;}
    public int getCantidadActual() {return cantidadActual;}
    // SETS //
    public void setTabla(Estudiante[] tabla) {this.tabla = tabla;}
    public void setTamaño(int tamaño) {this.tamaño = tamaño;}
    public void setFactorCargaMax(Double factorCargaMax) {this.factorCargaMax = factorCargaMax;}
    public void setCantidadActual(int cantidadActual) {this.cantidadActual = cantidadActual;}

    //INSERTAR//
    public void insertar(Estudiante e) {
        //Asegurar que no hay legajos repetidos//
        if (buscar(e.getLegajo()) == null) {
        
            //ASEGURAR QUE NO SUPERE FACTOR CARGA//
            if ((double)cantidadActual/tamaño >= factorCargaMax){
                System.out.println ("ERROR: Se alcanzo el limite de estudiantes");
                return;
            }

            int colisiones=0;
            int posicion=hash(e.getLegajo(), tamaño);

            //Exploracion cuadratica//
            int contador=0;
            while (tabla[posicion]!=null){
                colisiones++;
                contador++;
                posicion= (posicion + (int)Math.pow(contador, 2)) % tamaño;
            }

            //Posicion final//
            tabla[posicion]=e;
            cantidadActual++;
            System.out.println("Se inserto satisfactoriamente:\n*Posicion = "+ posicion + "\n*Colisiones = "+ colisiones);
        }
        
        //Si hay legajos repetidos//
        else{
            System.out.println("ERROR: ya existe un estudiante con ese legajo");
        }
    }

    //CALCULO DE POSICION EN TABLA//
    private int hash (String clave, int tamaño) {
        int sumaclave=0;

        //SUMA DE CARACTERES ASCII//
        for (int contador=0; contador<clave.length(); contador++){
            sumaclave+= (int)clave.charAt(contador);
        }

        return sumaclave % tamaño;
    }

    //BUSCAR//
    public Estudiante buscar (String legajo) {
        //Calculo de posicion//
        int posicion=hash(legajo, tamaño);

        //Exploracion cuadratica//
        int colisiones=0;
        while (tabla[posicion]!=null){
            if (tabla[posicion].getLegajo().equals(legajo)){
                return tabla[posicion];
            }
            colisiones++;
            posicion = (posicion + (int)Math.pow(colisiones, 2)) % tamaño;
        }

        //Si no se encontro//           
        return null;
    }

    //MOSTRAR//
    public void mostrarTabla () {
        //Si no esta vacio//
        if (cantidadActual!=0){

            //Mostrar//
            System.out.println ("\t\t\t\tLISTA DE ESTUDIANTES:");
            for (int contador=0; contador<tabla.length;contador++){
                if (tabla[contador]!=null){ 
                    System.out.println("\t\t\t Posicion " + contador + ":");
                    System.out.println(tabla[contador].toString());
                }
            }
        }
        //Si esta vacio//
        else{
            System.out.println ("No se ingresaron estudiantes todavia");
        }
    }
}
