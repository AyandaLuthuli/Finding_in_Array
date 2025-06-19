/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findstring;
import java.util.Scanner;
/**
 *
 * @author ayand
 */
public class Findstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       
       String src="Ayanda";
       
        String [][] marks=new String[4][4]     ;
       
       marks[0][0]="Andile";
       marks[0][1]= "Chris";
       marks[0][2]= "Bayanda";
       marks[0][3]= "Kilo";
       marks[1][0]= "Lou";
       marks[1][1]= "Wizzy";
       marks[1][2]= "Mpho";
       marks[1][3]= "Ayanda";
       marks[2][0]= "Sihle";
       marks[2][1]= "Faith";
       marks[2][2]= "Mbali";
       marks[2][3]= "Likho";
       marks[3][0]= "Alton";
       marks[3][1]= "Luthuli";
       marks[3][2]= "Nako";
       marks[3][3]= "Zwane";
       
       for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
            }
             System.out.println();
        }
        
         System.out.println("which number should we find:");
        String name =scanner.next();
       
        find(marks, name);
        
        
    }
    
    
      public static void find(String [][] marks , String name) {
        
    int index=0;
    boolean found=false;
        
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks.length; j++) {
                
                if ( marks[i][j].equalsIgnoreCase(name)) {
                    System.out.println("found on " + i +";"+j);
                    found=true;
                    
                } 
                
                }
               
            } if (found==false) {
                    System.out.println("not found");
                
            
            }
            
         
    }
}
