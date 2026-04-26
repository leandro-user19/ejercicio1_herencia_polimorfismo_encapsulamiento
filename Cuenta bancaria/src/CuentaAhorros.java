class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial);
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Retiro inválido en Cuenta de Ahorros");
        }
    }

    @Override
    public double calcularInteresMensual() {
        double tasaAnual = 0.03;
        double interes = saldo * (tasaAnual / 12);
        saldo += interes;
        return interes;
    }
}
