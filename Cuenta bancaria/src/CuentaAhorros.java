class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial);
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Retiro inválido en Ahorros");
        }
    }

    @Override
    public double calcularInteresMensual() {
        double interes = saldo * (0.03 / 12);
        saldo += interes;
        return interes;
    }
}
