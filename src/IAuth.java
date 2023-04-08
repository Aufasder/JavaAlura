public interface IAuth {

    public String getPassword();

    public void setPassword(String password);

    public boolean iniciarSesion(String clave);

    
}
