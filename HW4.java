/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class HW4 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
//        List<List<String>> ls2d = new ArrayList<List<String>>();
//List<String> x = new ArrayList<String>();
//x.add("Hello");
//x.add("world!");
//ls2d.add(x);
//
//System.out.println(Arrays.deepToString(ls2d.toArray()));

    
        
        Scanner input = new Scanner(System.in);
        Administrator admin= new Administrator();
        while(true){
        System.out.println("register as :  ");
        System.out.println("1.Owner");
        System.out.println("2.Player");
        
        int choice=input.nextInt();
        if(choice==1){
            Owner o1=new Owner();
            //o1.display();
            while(true){
            System.out.println("1.Add playground");
            System.out.println("2.Display your information");
            System.out.println("3.Exit");
            int choice1=input.nextInt();
            if(choice1==1){
                Playground p1 = new Playground ();
                o1.addPlayground(p1);
                admin.addOwner(o1);
                admin.addPlayground(p1);
            }
            else if(choice1==2){
                o1.display();
            }
            else
                break;
            }
        }
        else if(choice==2){
            Player p1=new Player();
            
            System.out.println("1.Book playground");
            System.out.println("2.Display your information");
            int choice1=input.nextInt();
            if(choice1==1){
                
                admin.displayAllPlaygrounds();
                System.out.println("Please enter the number of the playground you like to book");
                int playgroundNum=input.nextInt();
                admin.playgrounds.get(playgroundNum-1).displayHours();
                System.out.println("Please enter the start hour");
                String from=input.next();
                System.out.println("please enter end hour : ");
                String to=input.next();
                admin.playgrounds.get(playgroundNum-1).filterHours(from, to);
                
                
            }
            
            
            //p1.display();
        }
        else
           System.out.println("Invalid choice  "); 
            continue;
    }
        
    }
    
    
    
   
}
