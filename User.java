/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.util.Scanner;


/**
 * This class is an interface class to the player and owner class
 * @author Sara Mohamed Ali 
 */
 class User {
    
   
   protected String name ;
   protected int id ;
   protected  String password,email ,phone ,location ;
   
   /**
    * This a parametrize constructor that sets the class attributes 
    * @param name name user name
    * @param id id user id 
    * @param password password  user password 
    * @param email email user email
    * @param phone phone user phone
    * @param location location user location
    */
    public User(String name, int id, String password, String email, String phone, String location) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.location = location;
    }
    /**
     * this a default  constructor to enable the user to enter his information
     */
     public User(){
         System.out.println("please enter Name: ");
         Scanner input = new Scanner(System.in);
//         name=input.nextLine();
//         System.out.println("please enter password : ");
//         password=input.nextLine();
//         System.out.println("please enter email : ");
//         email=input.nextLine();
//         System.out.println("please enter phone : ");
//         phone=input.nextLine();
//         System.out.println("please enter defualt location : ");
//         location=input.nextLine();
     
     }
     
    /**
     * this function to get user's name
     *
     * @return name name of user
     */

    public String getName() {
        return name;
    }
    /**
     * this function to get user's ID
     *
     * @return id user's ID
     */

    public int getId() {
        return id;
    }
    /**
     * this function to get user's Password
     *
     * @return password user'Password
     */
    public String getPassword() {
        return password;
    }
    /**
     * this function to get user's email
     *
     * @return email user's email
     */
    public String getEmail() {
        return email;
    }
    /**
     * this function to get user's phone
     *
     * @return phone user's phone
     */
    public String getPhone() {
        return phone;
    }
    /**
     * this function to get user's location
     *
     * @return location user's location
     */
    public String getLocation() {
        return location;
    }
   
   /**
    * function to display all user's information
    */
   public void display()
   {
       System.out.println("Name: "+name);
       System.out.println("ID: "+id);
       System.out.println("Password: "+password);
       System.out.println("Email: "+email);
       System.out.println("Phone: "+phone);
       System.out.println("Location: "+location);
   }
    
}
