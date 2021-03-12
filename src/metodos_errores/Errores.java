package metodos_errores;

/**
 *
 * @author Ricardo
 */
public class Errores {
    private double ValorReal;
    private double ValorAproximado;

    Errores (double ValorReal, double ValorAproximado){
        this.ValorReal=ValorReal;
        this.ValorAproximado=ValorAproximado;        
    }
    double getValorReal(){
        return ValorReal;
    }
    double getValorAproximado(){
        return ValorAproximado;
    }
    
    public double ErrorAbsoluto(){
        double Absoluto;
        Absoluto=(ValorReal-ValorAproximado);
        return Absoluto;
    } 
    
    public double ErrorRelativo(){
        double Relativo;
        Relativo=(ErrorAbsoluto()/ValorReal);
        return Relativo;
    }
    
    public double ErrorRelativoProcentual(){
        double ERP;
        ERP=(ErrorRelativo()*100);
        return ERP;
    }
}
