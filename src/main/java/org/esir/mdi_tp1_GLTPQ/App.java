package org.esir.mdi_tp1_GLTPQ;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String calc = "";
    	System.out.println( "Hello World!" );
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez le type de calculatrice désiré :");
        System.out.println("1 : Normale");
        System.out.println("2 : Scientifique");
        int type = sc.nextInt();
        
        if(type == 1) {
        	calc = "normale";
        }
        else if(type == 2) {
        	calc = "scientifique";
        }
        
        sc.close();
        System.out.println("Type choisi : "+calc);
    }
}
