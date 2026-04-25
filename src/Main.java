import java.util.Scanner;

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Solicitante.mostrarReglasSubsidio();

    System.out.print("Ingrese su nombre: ");
    String nombre=sc.nextLine();

    System.out.print("Ingrese su cedula: ");
    String cedula=sc.nextLine();

    System.out.print("Ingrese sus ingresos: ");
    double ingresos=sc.nextDouble();

    System.out.print("Ingrese la cantidad de vehiculos: ");
    int vehiculo=sc.nextInt();

    System.out.print("¿Vive en ecuador?(true/false): ");
    boolean respuesta=sc.nextBoolean();

    Solicitante s1 = new Solicitante(nombre, cedula, ingresos, vehiculo, respuesta);

    System.out.println(s1);
    s1.generarResultado();

    System.out.println("\n---------Consumo mensual-----");
    System.out.println("Consumo mensual estimado: "+s1.calcularConsumoMensual());
    System.out.println("Consumo mensual estimado(con km extra): "+s1.calcularConsumoMensual(200));

}
