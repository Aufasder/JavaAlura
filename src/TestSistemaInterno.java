public class TestSistemaInterno {
    public static void main(String[] args) {
        SistemaInterno sistemaInterno = new SistemaInterno();
        Gerente gerente1 = new Gerente();
        Administrador admin1 = new Administrador();

        gerente1.setPassword("12345");
        admin1.setPassword("12345");

        sistemaInterno.autenticar(gerente1);
        sistemaInterno.autenticar(admin1);
    }
}
