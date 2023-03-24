

public class TestCuentas {
    public static void main(String[] args) {
        CuentaCorriente corriente = new CuentaCorriente(1, 1);
        CuentaAhorros ahorro = new CuentaAhorros(2, 3);
        System.out.println(corriente.consultarSaldo());
        corriente.depositar(2000);
        corriente.transferir(1000, ahorro);
        System.out.println(corriente.consultarSaldo());
        System.out.println(ahorro.consultarSaldo());
        
    }
}
