public class Solicitante {
    private String nombreCompleto;
    private String cedula;
    private double ingresoMensual;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    public Solicitante(String nombreCompleto, String cedula, double ingresoMensual, int cantidadVehiculos, boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.ingresoMensual = ingresoMensual;
        this.cantidadVehiculos = cantidadVehiculos;
        this.viveEnEcuador = viveEnEcuador;
    }

    public void setIngresoMensual(double ingresoMensual) {
        if (ingresoMensual >= 470) {
            this.ingresoMensual = ingresoMensual;
        } else {
            System.out.println("Ingreso no admitido");
        }
    }

    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos >= 0) {
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("Cantidad no admitida");
        }
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }

    public boolean isViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public boolean subsidioAprobado() {
        return ingresoMensual <= 1200
                && cantidadVehiculos <= 1
                && viveEnEcuador;
    }

    public void generarResultado(){
        if (subsidioAprobado()){
            System.out.println("\n-------Resultado de la evaluación------");
            System.out.println("Subsidio aprobado: Cumple todos los requisitos");
        }else{
            System.out.println("Subsidio no aprobado (Motivos): ");

            if (getIngresoMensual()>1200){
                System.out.println("Ingreso mayor a $1200");
            }

            if (getCantidadVehiculos()>1){
                System.out.println("Mas de un vehiculo");
            }
            if (!viveEnEcuador){
                System.out.println("No vive en Ecuador");
            }
        }
    }

    public String toString(){
        return "\n------Datos del solicitante------"+
                "\nNombre: "+nombreCompleto+
                "\nCedula: " + cedula+
                "\nIngreso: " + ingresoMensual+
                "\nVehiculos: " + cantidadVehiculos+
                "\nVive en Ecuador: " + viveEnEcuador+
        "\n";
    }

    public static void mostrarReglasSubsidio(){
        System.out.println("-----Condiciones para el subsidio-----");
        System.out.println("1.Tener ingresos mensuales menores o iguales a $1,200.");
        System.out.println("2.No poseer más de un vehículo registrado.");
        System.out.println("3.Tener residencia en Ecuador");
        System.out.println("-----------------------------------------");
        System.out.println("\n");
    }

    public double calcularConsumoMensual(){
        double km = 1000;
        return km/40;
    }

    public double calcularConsumoMensual(double kmextra){
        double km = 1000+kmextra;
        return km/40;

    }
}

