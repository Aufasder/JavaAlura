public class CuentaAhorros extends cuenta {

    public CuentaAhorros(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {
       this.saldo  += valor;
    }
    
}
