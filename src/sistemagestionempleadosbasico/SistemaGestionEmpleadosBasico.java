package sistemagestionempleadosbasico;

import java.util.Scanner;
import sistemagestionempleadosbasico.logica.GestionEmpleados;


public class SistemaGestionEmpleadosBasico {

    public static void main(String[] args) {
        GestionEmpleados gestionar = new GestionEmpleados();
        Scanner teclado = new Scanner(System.in);
        int opc;
        
        do {
            System.out.println("\n--- Sistema de Gestión de Empleados ---");
            System.out.println("1. Agregar nuevo empleado");
            System.out.println("2. Listar empleados");
            System.out.println("3. Buscar empleado por nombre");
            System.out.println("4. Eliminar empleado por ID");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opc = teclado.nextInt();
            teclado.nextLine();  // Limpiar buffer

            switch (opc) {
                case 1:
                    System.out.print("Nombre del empleado: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Puesto del empleado: ");
                    String cargo = teclado.nextLine();
                    
                    System.out.print("Salario del empleado: ");
                    double salario = teclado.nextDouble();
                    gestionar.agregarEmpleado(nombre, cargo, salario);
                    break;
                case 2:
                    gestionar.listarEmpleados();
                    break;
                case 3:
                    System.out.print("Nombre del empleado a buscar: ");
                    String nombreBuscar = teclado.nextLine();
                    gestionar.buscarEmpleadoPorNombre(nombreBuscar);
                    break;
                case 4:
                    System.out.print("ID del empleado a eliminar: ");
                    int idEliminar = teclado.nextInt();
                    gestionar.eliminarEmpleadoPorId(idEliminar);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        } while (opc != 5);

        teclado.close();
    }

}
