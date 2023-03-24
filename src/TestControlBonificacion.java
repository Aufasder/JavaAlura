public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setName("diego");
        diego.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setName("jimena");
        jimena.setSalario(10000);

        ControlBonificacion controlBonificacion = 
                            new ControlBonificacion();
        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(jimena);
        Contador cesar =  new Contador();
        cesar.setName("alex");
        cesar.setSalario(7000);
        controlBonificacion.registrarSalario(cesar);
        
        System.out.println();

    }
}
