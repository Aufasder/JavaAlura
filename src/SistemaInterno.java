public class SistemaInterno {
    private String llave = "12345"; 

    public boolean autenticar(Gerente gerente) {
        boolean puedeIniciarSesion = gerente.iniciarSesion(llave);
        if (puedeIniciarSesion){
            System.out.println("Login Exitoso");
            return true;
        }
        else{
            System.out.println("Error de sesion");
            return false;
        }
    }
}
