public class Gerente extends Funcionario {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean iniciarSesion(String clave){
        return this.password == clave;
    }

    public double getBonificacion(){
        return super.getSalario() + (super.getSalario() * 0.05) ;
    }
    
}
