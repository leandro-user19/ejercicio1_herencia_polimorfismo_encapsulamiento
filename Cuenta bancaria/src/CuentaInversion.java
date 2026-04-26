class CuentaInversion extends CuentaBancaria {

    public CuentaInversion(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial);
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Retiro inválido en Cuenta de Inversión");
        }
    }

    @Override
    public double calcularInteresMensual() {
        double tasa;

        if (saldo < 1000) {
            tasa = 0.04;
        } else if (saldo <= 5000) {
            tasa = 0.05;
        } else {
            tasa = 0.06;
        }

        double interes = saldo * (tasa / 12);
        saldo += interes;
        return interes;
    }
}