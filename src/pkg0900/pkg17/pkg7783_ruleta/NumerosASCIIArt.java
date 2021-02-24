package pkg0900.pkg17.pkg7783_ruleta;

/**
 *
 * @author edydu
 */

//clase que devuelve Strin con ASCII Art de los digitos del 0 al 9 en formato rectangular.
public class NumerosASCIIArt {
    
    public static String cero =""
            + "\u001B[34m ___ \n"
            + "\u001B[34m|   |\n"
            + "\u001B[34m|   |\n"
            + "\u001B[34m|___|\n\u001B[0m";
    
    public static String uno =""
            + "\u001B[31m /|  \n"
            + "\u001B[31m/ |  \n"
            + "\u001B[31m  |  \n"
            + "\u001B[31m _|_ \n";
    
    public static String dos =""
            + "\u001B[34m ___ \n"
            + "\u001B[34m   _|\n"
            + "\u001B[34m _-  \n" 
            + "\u001B[34m|____\n";
    
    
    public static String tres =""
            + "\u001B[31m ____\n"
            + "\u001B[31m     |\n"
            + "\u001B[31m  ---|\n"
            + "\u001B[31m ____|\n";
    
    public static String cuatro =""
            + "\u001B[34m|   |\n"
            + "\u001B[34m|___|\n"
            + "\u001B[34m    |\n"
            + "\u001B[34m    |\n";
    
    public static String cinco =""
            + "\u001B[31m ____\n"
            + "\u001B[31m|___ \n"
            + "\u001B[31m    |\n"
            + "\u001B[31m|___|\n";
    
    public static String seis =""
            + "\u001B[34m ____\n"
            + "\u001B[34m|___ \n"
            + "\u001B[34m|   |\n"
            + "\u001B[34m|___|\n";
    
    public static String siete =""
            + "\u001B[31m ____\n"
            + "\u001B[31m    /\n"
            + "\u001B[31m   / \n"
            + "\u001B[31m  /  \n";
        
    public static String ocho =""
            + "\u001B[34m  ___  \n"
            + "\u001B[34m| ╔╗ |\n"
            + "\u001B[34m| ╚╝ |\n"
            + "\u001B[34m| ╔╗ |\n"
            + "\u001B[34m|_╚╝_|\n\u001B[0m";
    
    
     public static String nueve =""
            + "\u001B[31m  ___  \n"
            + "\u001B[31m| ╔╗ |\n"
            + "\u001B[31m|_╚╝ |\n"
            + "\u001B[31m    | |\n"
            + "\u001B[31m    |_|\n\u001B[0m";
    
     public static String diez =""
            + "\u001B[34m      ___ \n"
            + "\u001B[34m /|  |   |\n"
            + "\u001B[34m  |  |   |\n"
            + "\u001B[34m _|_ |___|\n";
            
    
    
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
