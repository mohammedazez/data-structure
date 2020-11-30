/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array.LinkedList;

/**
 *
 * @author azezmuhamed
 */
import java.util.*;
public class LinkedList {
     public static void main(String args[])
   {    
// membuat objek array list
        java.util.LinkedList tokoh = new java.util.LinkedList();
        tokoh.add("Elon Musk");
        tokoh.add("Mark Zuckerberg");
        tokoh.add("Jeff Bezos");
        tokoh.add("Bill gates");
        tokoh.add("Ma Huateng");
        // Menaruh array di terakhir
        tokoh.addLast("William tanuwijaya");
        // Menaruh array di awal
        tokoh.addFirst("Jack Ma");
        // Menghapus array
        tokoh.remove("tikus");
        // Menampilakan semua array
        System.out.println(tokoh);
        // menampilkan banyak isi kantong ajaib
        System.out.println("Tokoh yang telah disebutkan  "+ tokoh.size() + "Orang");
 
   }
}
