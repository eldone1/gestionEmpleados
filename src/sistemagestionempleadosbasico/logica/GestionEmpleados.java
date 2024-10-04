package sistemagestionempleadosbasico.logica;

import java.util.ArrayList;
import java.util.List;

public class GestionEmpleados {
    private List<Empleado> listaEmpleados = new ArrayList<Empleado>();
    private int idCont = 1;
    
    public void agregarEmpleado(String nombreEmp, String cargoEmp, double salarioEmp){
        listaEmpleados.add(new Empleado(idCont++, nombreEmp, cargoEmp, salarioEmp));
        System.out.println("Empleado agregado correctamente.");
    }
    
    public void listarEmpleados(){
        for(Empleado emp : listaEmpleados){
            System.out.println("Datos: " + emp.getNombreEmp() + " " + emp.getCargoEmp());
        }
    }
    
    public void buscarEmpleadoPorNombre(String nombreEmp){
        boolean bandera = false;
        for(Empleado emp : listaEmpleados){
            if(emp.getNombreEmp().equalsIgnoreCase(nombreEmp)){
                System.out.println("Empleado encontrado: " + emp);
                bandera = true;
            }
        }if(!bandera){
            System.out.println("Empleado no encontrado.");
        }
    }
    
    public void eliminarEmpleadoPorId(int id_emp){
        Empleado empleadoEliminar = null;
        for(Empleado emp : listaEmpleados){
            if(emp.getId_emp() == id_emp){
                empleadoEliminar = emp;
                break;
            }
        }if(empleadoEliminar != null){
            listaEmpleados.remove(empleadoEliminar);
            System.out.println("Empleado eliminado correctamente. " + empleadoEliminar);
        }else{
            System.out.println("Empleado con id " + id_emp + " no encontrado.");
        }
    }
            
}
