
/**
 * Esta clase tiene dos métodos Imp_Par, uno se encarga de ver si hay números pares e impares. 
 * El otro método Imp_Par se encarga de decirte cuales son los números pares que se colocó.
 * Utilice el método main, coloque el número y los dos datos anteriores serán arrojados.
 * 
 *@author (Nayarith Jiménez 2017100188) 
 * @version (1 - 2 de julio de 2021)
 */
import javax.swing.JOptionPane;
public class Imp_Par extends Número
{
    // instance variables - replace the example below with your own
    int NúmerosPares, NúmerosImpares;  
    String mensaje, sPares;
    long iNum;
    String ssPares;
    /**
     * Constructor for objects of class Imp_Par
     */
    public Imp_Par(String Num)
    {
        // initialise instance variables
        super(Num);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String Im_Pa()
    {
        // put your code here
    
        if(MétodoHerramienta.SValidar(Num)){
         
        iNum = Integer.parseInt(Num);
        
     
    
      String sNum=Long.toString(iNum);
                   
     for(int i=0; i<sNum.length(); i++){
         char n = sNum.charAt(i);
        if (n % 2 == 0) {
        ++NúmerosPares; 
   
         } else {
        ++NúmerosImpares;
       }
       }
       
    if (NúmerosPares>=1 && NúmerosImpares>=1){
       mensaje ="Hay números pares e impares";
    }
    if (NúmerosPares>=1 && NúmerosImpares==0){
       mensaje ="Sólo hay números pares";
    }
    if (NúmerosPares==0 && NúmerosImpares>=1){
       mensaje = "Sólo hay números Impares";
    }
    JOptionPane.showMessageDialog(null, mensaje);
    
    }
    return mensaje;
}
        

/**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String Im_Pa(int fantasma)
    {
    if(MétodoHerramienta.SValidar(Num)){
         
        iNum = Integer.parseInt(Num);
        
    
      String sNum=Long.toString(iNum);
    sPares = "";
        
        for(int i=0; i<sNum.length(); i++){
         char n = sNum.charAt(i);
        
        
         if (n % 2 == 0) { 
         
         sPares = sPares +""+ n;
         } else{sPares = "Ninguno";}
          
    }
    JOptionPane.showMessageDialog(null,"Los números pares son :"+ sPares);
    
} 
return "Los números pares son :"+ sPares;
}
public static void main(String [] ar) {
    
    String entradaUsuario = JOptionPane.showInputDialog ( "Introduzca un número:" );
    
    Imp_Par Imp_Par1;    
    Imp_Par1 = new Imp_Par(entradaUsuario);
    Imp_Par1.Im_Pa();
    Imp_Par1.Im_Pa(1);
    
       
    }  
}
