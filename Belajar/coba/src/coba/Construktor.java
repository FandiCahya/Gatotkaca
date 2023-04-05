/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coba;

//kelas
class anjaymabar{
    String kondisi, nama, kesehatan;
    
    //class constructor hanya bisa 1 tipe data
    anjaymabar (String inkondisi, String innama, String inkesehatan) {
        nama = innama;
        kondisi = inkondisi;
        kesehatan = inkesehatan;
        
        System.out.println(nama);
        System.out.println(kondisi);
        System.out.println(kesehatan);
    }
}

public class Construktor {
    public static void main(String[] args) {
        //object
        anjaymabar subakri = new anjaymabar("sehat","supalan","sehat"); 
    }    
}
