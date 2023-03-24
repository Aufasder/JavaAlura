public abstract class FuncionarioAuth {
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
}
