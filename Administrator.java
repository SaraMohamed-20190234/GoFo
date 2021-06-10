/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw40;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author smart
 */
public class Administrator {
// List<List<String>> ls2d = new ArrayList<List<String>>();
//List<String> x = new ArrayList<String>();
//x.add("Hello");
//x.add("world!");
//ls2d.add(x);
//
//System.out.println(Arrays.deepToString(ls2d.toArray()));
//
//    
//
//List<List<String>> array = new ArrayList<List<String>>();
//array.add(new ArrayList<String>())
//array.get(0).add("qqq");
    
    
    public ArrayList <Playground> playgrounds= new ArrayList <Playground>();
    private ArrayList <Owner> owners= new ArrayList <Owner>();
    private ArrayList <Player> players= new ArrayList <Player>();
    
    public void addPlayground(Playground p){
        playgrounds.add(p);
    }
    
    public void addPlayer(Player player){
        players.add(player);
    }
    
    public void addOwner(Owner owner){
        owners.add(owner);
    }
    
    public void displayAllPlaygrounds()
    { 
        for(int  i=0; i<playgrounds.size();i++){
           System.out.println("playground "+(i+1)+" information ");
           playgrounds.get(i).display();
       }
    }
    

}
