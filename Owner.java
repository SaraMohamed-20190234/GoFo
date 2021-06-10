/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.util.ArrayList;

/**
 *this class inherits from class user and create an array list of playgrounds that the owner has
 * @author Sara Mohamed ali
 */
public class Owner extends User {
    private static int counter = 0;
    private ArrayList <Playground> playgrounds= new ArrayList <Playground>(); 
    /**
     * this a default constrictor to initialize the class elements
     */
    public Owner() {
        id=counter;
        counter++;
    }
    /**
     * this a function to add playground to the array list
     * @param playground playground is the playground that will be added
     */
    public  void addPlayground(Playground playground){
        playgrounds.add(playground);
    }
    /**
    * function to display all player's information and his playgrounds
    */
    public void display()
   {
       System.out.println("Name: "+name);
       System.out.println("ID: "+id);
       System.out.println("Password: "+password);
       System.out.println("Email: "+email);
       System.out.println("Phone: "+phone);
       System.out.println("Location: "+location);
       
       for(int  i=0; i<playgrounds.size();i++){
           System.out.println("playground "+(i+1)+" information ");
           playgrounds.get(i).display();
       }
   }
    
    
}
