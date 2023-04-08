public class AuthUtil {
    private String password;

    public boolean iniciarSesion(String clave){
        return this.password == clave;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
}
