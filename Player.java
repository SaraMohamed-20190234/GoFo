/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

/**
 *this class inherits from class user
 * @author Sara Mohamed Ali
 */
 class Player extends User {
     private static int counter = 0;
/**
 * this a default constrictor to initialize the class elements
 */
    public Player() {
        this.id=counter;
        counter++;
    }

    
    
    
}
