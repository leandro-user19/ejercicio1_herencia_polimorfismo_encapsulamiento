import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<CuentaBancaria> cuentas = new ArrayList<>();

        cuentas.add(new CuentaAhorros("001", "Ana Pérez", 1200));
        cuentas.add(new CuentaCorriente("002", "Luis Gómez", 800));
        cuentas.add(new CuentaInversion("003", "María López", 7000));

        double totalIntereses = 0;

        System.out.println("===== REPORTE BANCARIO =====");

        for (CuentaBancaria cuenta : cuentas) {
            double interes = cuenta.calcularInteresMensual();
            totalIntereses += interes;

            System.out.println("\nTitular: " + cuenta.getTitular());
            System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("Interés mensual: $" + String.format("%.2f", interes));
            System.out.println("Saldo actual: $" + String.format("%.2f", cuenta.getSaldo()));
        }

        System.out.println("\n💰 TOTAL INTERESES DEL BANCO: $" + String.format("%.2f", totalIntereses));
    }
}