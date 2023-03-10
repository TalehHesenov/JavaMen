
package util;

import java.util.Scanner;








public class SoutScannerYazdir {
  
   public static String stringYazdir(String text){
   Scanner sc = new Scanner(System.in);
       System.out.println(text);
       String cavab = sc.nextLine();
       
       return cavab;
  }
     public static int intYazdir(String text){
   Scanner sc = new Scanner(System.in);
       System.out.println(text);
       int cavab = sc.nextInt();
       
       return cavab;
  }
      public static double doubleYazdir(String text){
   Scanner sc = new Scanner(System.in);
       System.out.println(text);
       double cavab = sc.nextDouble();
       
       return cavab;
  }
   
        
}
