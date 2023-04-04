public class Gerente extends Auth {
 
    @Override
    public double getBonificacion(){
        return super.getSalario() + (super.getSalario() * 0.05) ;
    }
    
}
