

package com.mycompany.belajar_oop;

public class player {

    String name;
    int armor;
    int health;
    
    void run(){
        System.out.println(name + " ");
        System.out.println("Armor : "+armor);
    }
    
    boolean isdead(){
        return health <= 50;
    }
}
