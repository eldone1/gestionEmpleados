package sistemagestionempleadosbasico.logica;

public class Empleado {
    private int id_emp;
    private String nombreEmp;
    private String cargoEmp;
    private double salarioEmp;

    public Empleado() {
    }

    public Empleado(int id_emp, String nombreEmp, String cargoEmp, double salarioEmp) {
        this.id_emp = id_emp;
        this.nombreEmp = nombreEmp;
        this.cargoEmp = cargoEmp;
        this.salarioEmp = salarioEmp;
    }

    public int getId_emp() {
        return id_emp;
    }

    public void setId_emp(int id_emp) {
        this.id_emp = id_emp;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public String getCargoEmp() {
        return cargoEmp;
    }

    public void setCargoEmp(String cargoEmp) {
        this.cargoEmp = cargoEmp;
    }

    public double getSalarioEmp() {
        return salarioEmp;
    }

    public void setSalarioEmp(double salarioEmp) {
        this.salarioEmp = salarioEmp;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id_emp=" + id_emp + ", nombreEmp=" + nombreEmp + ", cargoEmp=" + cargoEmp + ", salarioEmp=" + salarioEmp + '}';
    }
    
    
}
