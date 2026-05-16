package Practico3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Creacion de lista//
        //Universidad->indiceEstudiantes->Arreglo Estudiantes//
        Universidad universidadUnvime= new Universidad ("Unvime", "Juan Llerena y Garcia Lorca - Villa Mercedes", 17, 0.7);

        //PRUEBAS//
        System.out.println("\t\t\t\tPRUEBAS");
        //CREACION DE ESTUDIANTES//
            System.out.println("\t\t\tCREACION DE ESTUDIANTES:");
            Estudiante e1 = new Estudiante("Juan","Perez",20,"45111222","AB12");
            Estudiante e2 = new Estudiante("Maria","Gomez",23,"40999888","ZX90");
            Estudiante e3 = new Estudiante("Lucia","Lopez",25,"44888777","LQ33");
            Estudiante e4 = new Estudiante("Martin","Fernandez",21,"42005120","AC11");
            Estudiante e5 = new Estudiante("Sofia","Ramirez",22,"46032103","AD10");
            Estudiante e6 = new Estudiante("Lucas","Herrera",24,"43103204","CA11");
        //INSERCION//
            System.out.println("\t\t(Insercion estudiante 1)");  
            universidadUnvime.getListaEstudiantes().insertar(e1);
            System.out.println("\t\t(Insercion estudiante 2)");
            universidadUnvime.getListaEstudiantes().insertar(e2);
            System.out.println("\t\t(Insercion estudiante 3)");
            universidadUnvime.getListaEstudiantes().insertar(e3);
            System.out.println("\t\t(Insercion estudiante 4)");
            universidadUnvime.getListaEstudiantes().insertar(e4);
            System.out.println("\t\t(Insercion estudiante 5)");
            universidadUnvime.getListaEstudiantes().insertar(e5);
            System.out.println("\t\t(Insercion estudiante 6)");
            universidadUnvime.getListaEstudiantes().insertar(e6);
        //MOSTRAR LISTA//
            universidadUnvime.getListaEstudiantes().mostrarTabla();
        //BUSQUEDAS//
            System.out.println("\t\t\tBUSQUEDA DE ESTUDIANTE (Clave: AB12)");
            Estudiante buscado=universidadUnvime.getListaEstudiantes().buscar("AB12");
            if (buscado!=null){ 
                System.out.println(buscado.toString());
            }

        //MENU//
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\t\t\t=== MENU ===");
            System.out.println("1) Agregar estudiante a la lista");
            System.out.println("2) Mostrar lista de estudiantes");
            System.out.println("3) Buscar estudiante con legajo");
            System.out.println("4) Salir");
            System.out.print  ("Opcion: ");

            opcion = lector.nextInt();
            lector.nextLine();

            switch (opcion) {
                case 1:
                    //Inicializar estudiante y añadir datos//
                    Estudiante estudiante= new Estudiante ();
                        //Nombre de estudiante//
                        System.out.println("\nINTRODUZCA EL NOMBRE/s DEL ESTUDIANTE: ");
                        estudiante.setNombre(lector.nextLine());

                        //Apellido de estudiante//
                        System.out.println("\nINTRODUZCA EL APELLIDO/s DEL ESTUDIANTE: ");
                        estudiante.setApellido(lector.nextLine());

                        //Edad de estudiante//
                        System.out.println("\nINTRODUZCA LA EDAD DEL ESTUDIANTE: ");
                        estudiante.setEdad(lector.nextInt());
                        lector.nextLine();

                        //Documento de estudiante//
                        System.out.println("\nINTRODUZCA EL DOCUMENTO DEL ESTUDIANTE: ");
                        estudiante.setDocumento(lector.nextLine());

                        //Legajo de estudiante//
                        System.out.println("\nINTRODUZCA EL LEGAJO DEL ESTUDIANTE: ");
                        estudiante.setLegajo(lector.nextLine());

                    //Insertar//
                    universidadUnvime.getListaEstudiantes().insertar(estudiante);
                    break;
                case 2:
                    universidadUnvime.getListaEstudiantes().mostrarTabla();
                    break;
                case 3:
                    //Asegurar que no este vacio//
                    if (universidadUnvime.getListaEstudiantes().getCantidadActual()!=0){
                        System.out.println("\nINTRODUZCA EL LEGAJO DEL ESTUDIANTE A BUSCAR: ");
                        estudiante = universidadUnvime.getListaEstudiantes().buscar(lector.nextLine());
                        if (estudiante!=null){ 
                            System.out.println(estudiante.toString());
                        }
                        //Si no se encontro//
                        else{
                            System.out.println("ERROR: no se encontro el estudiante");
                        }
                    }
                    //Si esta vacio//
                    else{
                        System.out.println ("No se ingresaron estudiantes todavia");
                    }
                    break;
                case 4:
                    System.out.println("\t\tSaliendo...");
                    break;
                default:
                    System.out.println("\t\tOpcion invalida");
            }
            
        } while (opcion != 4);

        lector.close();
    }
}
