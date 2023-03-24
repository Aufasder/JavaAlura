public abstract class Funcionario {
    private String name;
    private int document;
    private double salario;
    private int tipo;

    public Funcionario() {
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDocument() {
        return document;
    }
    public void setDocument(int document) {
        this.document = document;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public abstract double getBonificacion();
    
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
