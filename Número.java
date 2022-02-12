
/**
 * En ésta clase podrás digitar un número y utilizar su método para transformarlo de String a long.
 * Básicamente ésta clase existe para heredar el constructor.
 * 
 * @author (Nayarith Jiménez 2017100188) 
 * @version (1 - 2 de julio de 2021)
 */
import javax.swing.JOptionPane;
public class Número
{
    // instance variables - replace the example below with your own
    public String Número, Num;
    public long iNum;
    /**
     * Constructor for objects of class Número
     */
    public Número(String Número)
    {
        // initialise instance variables
         Num = Número;
    }

    /**
     * Éste método transforma el número String en Int
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String StringToInt()
    {
        // put your code here
         if(MétodoHerramienta.SValidar(Num)){
         
        long iNum = Integer.parseInt(Num);
        
        return "El número es: " + iNum;
    } else {return null;}
        
    }
}
