public class Cliente implements IAuth{
    private String nombre;
    private String documento;
    private String telefono;

    private AuthUtil util;


    public Cliente() {
        super();
        this.util = new AuthUtil();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
