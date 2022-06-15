package randomize_no;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Randomize_no {
    
     
    public static void main(String[] args) {
     Random random = new Random();
     
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter 5 numbers");
      
        int numOne = scan.nextInt();
        int numTwo = scan.nextInt();
        int numThree = scan.nextInt();
        int numFour = scan.nextInt();
        int numFive = scan.nextInt();   
      
       List<Integer> list = new ArrayList<>();
        
        list.add(numOne);
        list.add(numTwo);
        list.add(numThree);
        list.add(numFour);
        list.add(numFive);
 
        Randomize_no obj = new Randomize_no();
 
        System.out.println("---------------------------------------------");
        System.out.println(obj.getRandomElement(list));
    }
 
   
    public int getRandomElement(List<Integer> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}
     
         

 
