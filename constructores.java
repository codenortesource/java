package codenorte;

public class java_constructores {

    public static void main(String args[]) {

        sueldo s1 = new sueldo(9000000, 100000);
        sueldo s2 = new sueldo(1000000, 100000);
        sueldo s3 = new sueldo(2000000, 100000);
        Trabajador empleado1 = new Trabajador("Carlos ", "Slim", s1);
        Trabajador empleado2 = new Trabajador("Bill ", "Gates", s2);
        Trabajador empleado3 = new Trabajador("Ramos  ", "Valdez", s3);
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
    }
}

class Trabajador {

    private String nombre;
    private String apellido;
    private sueldo s1;
    // constructor para inicializar nombre, fecha de nacimiento y fecha de contrataci�n

    public Trabajador(String nombre, String apellido, sueldo s1) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.s1 = s1;
    }

    public String toString() {
        return this.nombre + "," + this.apellido + "," + this.s1.getAnual() + "," + this.s1.getMensual();
    }
}

class sueldo {

    private int anual;
    private int mensual;
    // constructor para inicializar nombre, fecha de nacimiento y fecha de contrataci�n

    public sueldo(int anual, int mensual) {
        this.anual = anual;
        this.mensual = mensual;
    }

    public int getAnual() {
        return this.anual;
    }

    public int getMensual() {
        return this.mensual;
    }

    public String toString() {
        return this.anual + "," + this.mensual;
    }
}

