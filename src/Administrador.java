public class Administrador extends Funcionario implements IAuth {
    private AuthUtil util;

    public Administrador() {
        super();
        this.util = new AuthUtil();
    }

    @Override
    public double getBonificacion() {
        return this.getSalario();
    }

    //Auth interface
    @Override
    public String getPassword() {
        return this.util.getPassword();
    }

    @Override
    public void setPassword(String password) {
        this.util.setPassword(password);
    }

    @Override
    public boolean iniciarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
    
}
