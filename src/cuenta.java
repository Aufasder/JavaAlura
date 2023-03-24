public abstract class cuenta {
    protected double saldo;
    private Cliente titular = new Cliente();
    private int numero;
    private int agencia;
    private static int total = 0;

    public cuenta(int agencia, int numero) {
        
        if (agencia <= 0){
            System.out.println("No se puede crear con cerola agencia");
            this.agencia =1;
        }else{
            this.agencia = agencia;
        }
        this.numero = numero;
        this.saldo = 0;
        total++;
        System.out.println("el total de cuentas es:" + total);
    }

    public abstract void depositar(double valor);

    public boolean retirar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, cuenta account) {
        if (this.retirar(valor)) {
            account.depositar(valor);
            return true;
        }
        return false;
    }

    public double consultarSaldo(){
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia >0) {
            this.agencia = agencia;
            return;
        }
        System.out.println("solo valores mayores a cero");
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal(){
        return cuenta.total;
    }
    
}
