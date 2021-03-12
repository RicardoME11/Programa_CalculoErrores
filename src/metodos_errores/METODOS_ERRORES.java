package metodos_errores;
import java.util.Scanner;
public class METODOS_ERRORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double Real, Aproximado;
        System.out.println("ingrese el valor Real");
        Real=teclado.nextDouble();
        System.out.println("Ingrese el valor Aproximado");
        Aproximado=teclado.nextDouble();
        System.out.println("");
        
        
        Errores prueba=new Errores(Real, Aproximado);
        System.out.println("Valor Real = " + prueba.getValorReal());
        System.out.println("Valor Aproximado" + prueba.getValorAproximado());
        System.out.println("Error Absoluto = " + prueba.ErrorAbsoluto());
        System.out.println("Error Relativo = " + prueba.ErrorRelativo());
        System.out.println("Error Relativo Porcentual = " + prueba.ErrorRelativoProcentual() + " %");
        
        
    }
    
}
