/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author smart
 */
public class Playground {
    private String name,size,location,type;
    private int priceHour,startHour,endHour,f,t;
    private int cancellationPeriod=24;
    private Status status;
    private String []hours={"00:00","01:00","02:00","03:00","04:00","05:00",
                            "06:00","07:00","08:00","09:00","10:00","11:00",
                            "12:00","13:00","14:00","15:00","16:00","17:00",
                            "18:00","19:00","20:00","21:00","22:00","23:00"};
    
    private ArrayList <String> selectedHours= new ArrayList <String>();
    
    public Playground(){
         status = Status.pending;
         System.out.println("please enter playground name: ");
         Scanner input = new Scanner(System.in);
         name=input.nextLine();
//         System.out.println("please enter playground size : ");
//         size=input.nextLine();
//         System.out.println("please enter playground location : ");
//         location=input.nextLine();
//         System.out.println("please enter playground type: ");
//         type=input.nextLine();
         System.out.println("please enter start hour : ");
         startHour=input.nextInt();
         System.out.println("please enter end hour : ");
         endHour=input.nextInt();
//         System.out.println("please enter price per hour : ");
//         priceHour=input.nextInt();
//         System.out.println("please enter cancellation period : ");
//         cancellationPeriod=input.nextInt();
         
         for(int i=startHour ; i<(endHour+1) ;i++){
             selectedHours.add(hours[i]);
         } 
    }
    
    public void display()
   {
       System.out.println("playground name:"+name);
       System.out.println("price per hour"+priceHour);
       System.out.println("playground size"+size);
       
   }
    
   public void displayHours(){
      System.out.println("Aavilable hours");
       for(int i=0 ; i<selectedHours.size() ;i++){
         System.out.println(selectedHours.get(i)); 
       }
   }
   public void filterHours(String from,String to)
   {
       int i,j;
        System.out.println(selectedHours.size());
       for(i=0 ; i<selectedHours.size() ;i++){
           if(selectedHours.get(i).equalsIgnoreCase(from) ){
                f=i;
                break;
           }
       } 
       for(j=i+1; j<selectedHours.size() ;j++){
           if(selectedHours.get(j).equalsIgnoreCase(to)){
                t=j;
                break;
           }
           
         //selectedHours.remove(i); 
       }
       int k=0;
       while(k<=(t-f)){
           selectedHours.remove(k);
       }
       displayHours();
   }
     

}
