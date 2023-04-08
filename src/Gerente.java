public class Gerente extends Funcionario implements IAuth {
 
    private AuthUtil util;

    public Gerente() {
        super();
        this.util = new AuthUtil();
    }
    @Override
    public double getBonificacion(){
        return super.getSalario() + (super.getSalario() * 0.05) ;
    }

    //auth interface
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
