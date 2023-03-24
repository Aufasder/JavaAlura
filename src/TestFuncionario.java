public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setName("Diego");
        diego.setDocument(444556655);
        diego.setSalario(2000);

        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());

        //Gerente gerente = new Gerente();
        Gerente gerente = new Gerente();
        gerente.setDocument(5000);
        gerente.setSalario(5000);
        gerente.setTipo(1);
        gerente.setPassword("hola");

        System.out.println("el salario es " 
        + gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("hola"));
    }
    
}
