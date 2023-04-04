public class Auth extends Funcionario{
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

    @Override
    public double getBonificacion() {
        // TODO Auto-generated method stub
        return 0;
    }
}
