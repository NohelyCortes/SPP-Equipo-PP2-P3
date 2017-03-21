/*Ángel Ávalos Ortega A01410325
Alberto Isaac Gómez Jiménez A01410769
Jorge Daniel Bombardier
Miguel Ángel Méndez 
Nohely Cortés del Ángel A01410768
*/
package spp.equipo.pp2.p3;
import java.util.*;
/**
 *
 * @author Nohely C
 */
public class SPPEquipoPP2P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matriz();
    }
    public static void matriz(){
        int m,n;
        
        System.out.println("Introduzca las dimensiones de la matriz");
        m=solicitaTamaño("valor deseado para el número de filas");
        n=solicitaTamaño("valor deseado para el número de columnas");
        System.out.println("\nValores de la matriz: ");
        int[][]A=solicitaValores(m,n);
        System.out.println("Cadena de caracteres *:");
        for (int i = 0; i < A.length; i++){
            System.out.println();
            for (int j = 0; j < A[0].length; j++){
                for(int k=1;k<=A[i][j];k++){
                    System.out.print("*");
                }
                if(!(j==(A[0].length-1)))System.out.print(" - ");
            }
            System.out.print("\n");
        }
        
        }
        public static int solicitaEntero(){
        Scanner kb= new Scanner (System.in);
        boolean flag;
        int n=0;
        do{
            System.out.println("Introduce un número entero");
            try{
                n=kb.nextInt();
                flag=false;
                
            }
            catch(Exception er){
                System.out.println("Lo que introdujo no es un entero, Inténtalo de nuevo");
                flag=true;
                kb.nextLine();
            }
        }while (flag);
        
        return n;
        }
        public static int[][] solicitaValores(int m, int n){
            int[][] matriz = new int [m][n];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println("Introduzca el valor para"+i+", "+j);
                    matriz [i][j]=solicitaEntero();
                }    
            }

            return matriz;
        }
    
    
        public static int solicitaTamaño(String dimension){
            int x;
            boolean flag;
            System.out.println("Valor de "+dimension);
            do{
                x=solicitaEntero();
                flag=true;
                if(x<1){
                    System.out.println("Favor de introducir un valor entero positiv)");
                    flag=false;
                }
            }while(flag==false);

            return x; 
}
}
