/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naim's
 */
import java.util.*;
public class warna_kegemaran_soalan_5 {
public static void main(String[]args){

    String ulasan = null;
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan nama anda:" );
    String nama=input.next();
    
    System.out.print("Taipkan warna kegemaran anda/merah/biru/kuning/hijau/hitam/putih: ");
    
    String warna=input.next();
    
    switch(warna) {
    case "merah" :{
    ulasan="membawa makna kekuatan,kemarahan dan semangat";
    break;
    }case "biru" :{
    ulasan=("membawa maksud ketenangan,keikhlasan dan harapan.");
    break;
    }case "kuning" :{
      ulasan=("melambangkan kegembiraan,penuh semngat dan riang");
    break;
    }case "hijau" :{
    ulasan=("menggambarkah kehidupan,kestabilan dan ketulenan");
    break;
    }case "hitam" :{
    ulasan=("dikaitkan dengan kejahatan dan penuh kerahsiaan.");
    break;
    }case "putih" :{
    ulasan=("adalah berani tetapi tidak suka tunjukkan keberanian.");
    break;
    
    }default :{
    
    System.out.println("Maaf pilihan salah");
        }
       }
        System.out.println(nama+", warna anda "+ulasan);
        

}
    
}
