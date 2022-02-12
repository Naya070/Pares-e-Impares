
/**
 * Clase para validar datos, para que éstos no sean letras.
 * 
 * @author (Nayarith Jiménez 2017100188) 
 * @version (1 - 2 de julio de 2021)
 */
import javax.swing.JOptionPane;
public class MétodoHerramienta
{
    // instance variables - replace the example below with your own
    public static boolean SValidar(String Num){
      
     
      try {
        Double.parseDouble(Num); //Es una cadena numérica
        return true;
        
        }catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número Inválido, por favor inserte números unicamente.");
            return false; //No es una cadena numérica
            
        }  
     
    }   
}
