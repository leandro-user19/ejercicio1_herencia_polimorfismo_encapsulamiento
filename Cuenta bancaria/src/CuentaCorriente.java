class CuentaCorriente extends CuentaBancaria {

    private final double LIMITE_SOBREGIRO = 500;

    public CuentaCorriente(String numeroCuenta, String titular, double saldoInicial) {
        super(numeroCuenta, titular, saldoInicial);
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && (saldo - monto) >= -LIMITE_SOBREGIRO) {
            saldo -= monto;
        } else {
            System.out.println("Sobregiro excedido o retiro inválido");
        }
    }

    @Override
    public double calcularInteresMensual() {
        return 0; // No genera interés
    }
}
