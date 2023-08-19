package pkgEjercicio;

public class ClsEjercicio6 {

    private int carnet;
    private String nombre;
    private double sueldo_base;
    private double descuentos;
    private double sueldo_liquido;

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getSueldo_liquido() {
        return sueldo_liquido;
    }

    public void setSueldo_liquido(double sueldo_liquido) {
        this.sueldo_liquido = sueldo_liquido;
    }

    public static void main(String[] args) {
        ClsEjercicio6 ej1 = new ClsEjercicio6();
        ej1.setCarnet(12345);
        ej1.setNombre("Juan García");
        ej1.setSueldo_base(3500);
        ej1.setDescuentos(250);
        ej1.setSueldo_liquido(ej1.getSueldo_base() - ej1.getDescuentos());

        ClsEjercicio6 ej2 = new ClsEjercicio6();
        ej2.setCarnet(67890);
        ej2.setNombre("Maria Rodriguez");
        ej2.setSueldo_base(3500);
        ej2.setDescuentos(250);
        ej2.setSueldo_liquido(ej2.getSueldo_base() - ej2.getDescuentos());

        ClsEjercicio6 ej3 = new ClsEjercicio6();
        ej3.setCarnet(10111);
        ej3.setNombre("Alejandro López");
        ej3.setSueldo_base(3500);
        ej3.setDescuentos(250);
        ej3.setSueldo_liquido(ej3.getSueldo_base() - ej3.getDescuentos());

        ClsEjercicio6 ej4 = new ClsEjercicio6();
        ej4.setCarnet(21314);
        ej4.setNombre("Laura Martinez");
        ej4.setSueldo_base(3500);
        ej4.setDescuentos(250);
        ej4.setSueldo_liquido(ej4.getSueldo_base() - ej4.getDescuentos());

        ClsEjercicio6 ej5 = new ClsEjercicio6();
        ej5.setCarnet(21314);
        ej5.setNombre("Carlos Gonzales");
        ej5.setSueldo_base(3500);
        ej5.setDescuentos(250);
        ej5.setSueldo_liquido(ej5.getSueldo_base() - ej5.getDescuentos());

        System.out.println("Datos del ej 1:");
        System.out.println("Carnet: " + ej1.getCarnet());
        System.out.println("Nombre: " + ej1.getNombre());
        System.out.println("Sueldo Base: " + ej1.getSueldo_base());
        System.out.println("Descuentos: " + ej1.getDescuentos());
        System.out.println("Sueldo Líquido: " + ej1.getSueldo_liquido());
        System.out.println();

        System.out.println("Datos del ej 2:");
        System.out.println("Carnet: " + ej2.getCarnet());
        System.out.println("Nombre: " + ej2.getNombre());
        System.out.println("Sueldo Base: " + ej2.getSueldo_base());
        System.out.println("Descuentos: " + ej2.getDescuentos());
        System.out.println("Sueldo Líquido: " + ej2.getSueldo_liquido());

        System.out.println("Datos del ej 3:");
        System.out.println("Carnet: " + ej3.getCarnet());
        System.out.println("Nombre: " + ej3.getNombre());
        System.out.println("Sueldo Base: " + ej3.getSueldo_base());
        System.out.println("Descuentos: " + ej3.getDescuentos());
        System.out.println("Sueldo Líquido: " + ej3.getSueldo_liquido());

        System.out.println("Datos del ej 4:");
        System.out.println("Carnet: " + ej4.getCarnet());
        System.out.println("Nombre: " + ej4.getNombre());
        System.out.println("Sueldo Base: " + ej4.getSueldo_base());
        System.out.println("Descuentos: " + ej4.getDescuentos());
        System.out.println("Sueldo Líquido: " + ej4.getSueldo_liquido());

        System.out.println("Datos del ej 5:");
        System.out.println("Carnet: " + ej5.getCarnet());
        System.out.println("Nombre: " + ej5.getNombre());
        System.out.println("Sueldo Base: " + ej5.getSueldo_base());
        System.out.println("Descuentos: " + ej5.getDescuentos());
        System.out.println("Sueldo Líquido: " + ej5.getSueldo_liquido());
    }
}
