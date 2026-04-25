public class Solicitante {
    private String nombreCompleto;
    private String cedula;
    private double ingresoMensual;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    public Solicitante(String nombreCompleto, String cedula, double ingresoMensual, int cantidadVehiculos, boolean viveEnEcuador){
        this.nombreCompleto=nombreCompleto;
        this.cedula=cedula;
        this.ingresoMensual=ingresoMensual;
        this.cantidadVehiculos=cantidadVehiculos;
        this.viveEnEcuador=viveEnEcuador;
    }

    public void setIngresoMensual(double ingresoMensual) {
        if (ingresoMensual>=470){
            this.ingresoMensual=ingresoMensual;
        }else{
            System.out.println("Ingreso no admitido");
        }

    }

    public void setCantidadVehiculos(int cantidadVehiculos){
        if (cantidadVehiculos>=0){
            this.cantidadVehiculos=cantidadVehiculos;
        }else{
            System.out.println("Cantidad no admitida");
        }
    }

    public void setViveEnEcuador(boolean viveEnEcuador){
        this.viveEnEcuador=viveEnEcuador;
    }


}
