package pkg0900.pkg17.pkg7783_ruleta;

/**
 *
 * @author edydu
 */

//clase que devuelve Strin con ASCII Art de los digitos del 0 al 9 en formato rectangular.
public class NumerosASCIIArt {
    
    public static String cero =""
            + " ___ \n"
            + "|   |\n"
            + "|   |\n"
            + "|___|\n";
    
    public static String uno =""
            + " /|  \n"
            + "/ |  \n"
            + "  |  \n"
            + " _|_ \n";
    
    public static String dos =""
            + " ___ \n"
            + "   _|\n"
            + " _-  \n" 
            + "|____\n";
    
    
    public static String tres =""
            + "____\n"
            + "    |\n"
            + " ---|\n"
            + "____|\n";
    
    public static String cuatro =""
            + "|   |\n"
            + "|___|\n"
            + "    |\n"
            + "    |\n";
    
    public static String cinco =""
            + " ____\n"
            + "|___ \n"
            + "    |\n"
            + "|___|\n";
    
    public static String seis =""
            + " ____\n"
            + "|___ \n"
            + "|   |\n"
            + "|___|\n";
    
    public static String siete =""
            + " ____\n"
            + "    /\n"
            + "   / \n"
            + "  /  \n";
        
    public static String ocho =""
            + "  ___  \n"
            + "|  _  |\n"
            + "| |_| |\n"
            + "|  _  |\n"
            + "| |_| |\n"
            + "| ___ |\n";
    
    
     public static String nueve =""
            + "  ___  \n"
            + "|  _  |\n"
            + "| |_| |\n"
            + "|_ _  |\n"
            + "    | |\n"
            + "    |_|\n";
    
     public static String diez =""
            + "      ___ \n"
            + " /|  |   |\n"
            + "  |  |   |\n"
            + " _|_ |___|\n";
            
    
    
    public static String[] getNumerosASCIIArt() {
        String[] numeros = new String[11];
        
        numeros[0] = cero;
        numeros[1] = uno;
        numeros[2] = dos;
        numeros[3] = tres;
        numeros[4] = cuatro;
        numeros[5] = cinco;
        numeros[6] = seis;
        numeros[7] = siete;
        numeros[8] = ocho;
        numeros[9] = nueve;
        numeros[10] = diez;
        
        return numeros;
    }

   
    
}
