public class TestReferencias {
        public static void main(String[] args) {
            Funcionario funcionario = new Contador();
            funcionario.setName("cesar");
            funcionario.setSalario(2000);

            Gerente gerente = new Gerente();
            gerente.setName("ivan");
            gerente.setSalario(10000);

            gerente.iniciarSesion("afasfd");

        }
}
