
package com.mycompany.belajar_oop;
import java.util.Scanner;
public class Barang {
    public static void main(String[] args) {
      user us = new user();
      user ua = new user();
      

      us.username = "ucok";
      ua.username = "uok";
      us.piluser();
      ua.piluser();
//      us.tarang();
    us.pirang();
    }
       
}
class barangtok {
    String ID_barang,nama_barang,jenis;
    int harga,stok;
}
class user{
    String username;
        void piluser(){
        this.username=username;
            System.out.println(this.username);
        }
            Scanner input = new Scanner(System.in);
            barangtok var1 = new barangtok();
        void tarang(){
//            Math.random();
            var1.ID_barang = input.nextLine();
            var1.nama_barang = input.nextLine();
            var1.jenis = input.nextLine();
            var1.harga = input.nextInt();
            var1.stok = input.nextInt();   
        }
        void pirang(){
            
            System.out.println(var1.harga);
        }
}
