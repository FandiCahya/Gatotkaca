package com.mycompany.belajar_oop;
public class game {
    public static void main(String[] args) {
        player kasir = new player();
        
      kasir.name = "Bambang";
      kasir.armor = 21;
      kasir.health = 40;
      
      kasir.run();
      
        if (kasir.isdead()) {
            System.out.println(kasir.name +" Berakhir");
        }
    }
    
}
