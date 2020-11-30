package Array;
/*
 * Nama : Muhamad Aziz
 * NIM : 04121406
 * Prodi : Sistem Informasi
 * Job : Software Engineer, Entrepreneur, and Student.
 * Upbjj : Yogyakarta
 */


//Array 1 Dimensi
//public class Array {
//public static void main(String[] args)
//    {
//        //declare and initialize one dimension array
//        String[] str = new String[]{"one", "two", "three", "four"};
//        System.out.println("These are elements of one Dimensional array.");
//        for (int i = 0; i < str.length; i++) 
//	{
//            System.err.println(str[i] + "   ");
//        }
//   }
//}


//Array 1 dimensi dengan carai lain
//public class Array {
//     public static void main(String[] args)
//    {
//      String [] tampilkan;
//      tampilkan = new String[7];
//      tampilkan[0] = "Elon Musk";
//      tampilkan[1] = "Mark Zuckerberg";
//      tampilkan[2] = "Jeff Bezos";
//      tampilkan[3] = "Bill Gates";
//      tampilkan[4] = "Ma Huateng";
//      tampilkan[5] = "William Tanuwijaya";
//      tampilkan[6] = "Jack Ma";
//      System.out.println("Tokoh dari Indonesia yang change world with solve problme dengan coding:");
//      System.out.println(tampilkan[5] + " "+ "Pendiri Tokopedia");
//      
//// Ini menggunakan Looping untuk menampilkan semua string
//for (int i=0; i<7; i++){
//    System.out.println("This people change world with solve problem"+ " " + tampilkan[i]);
//}
//   }
//}


// 2. codingan untuk contoh array 1 dimensi dimana kita bisa memasukkan string/huruf dengan perintah input.
//import java.util.Scanner;
//public class Array {
//     public static void main(String[] args)
//    {
//      Scanner input =  new Scanner(System.in);
//      String[] kota = new String[5];
//      System.out.println("Masukkan nama kota terbesar di Indonesia!");
//      for (int i=0; i<5; i++){
//          System.out.print("Jawaban Anda" + (i+1) + ":");
//          kota[i] = input.nextLine();
//      }
//      System.out.println("Menampilkan nama kota yang telah di input ke keyboard");
//      for (int i=0; i<5; i++){
//          System.out.println("Nama kota ke-" + i + ":" + kota[i]);
//      }
//   }
//}



// 3. codingan contoh array 2 dimensi atau lebih
//public class Array {
//     public static void main(String[] args)
//   {
//        {
//        String[][] tokoh = new String[][]{{"Elon Musk", "Mark Zuckerberg"}, {"Jeff Bezos", "Bill Gates"},{"Ma Huateng","William Tanuwijaya"}};
//        System.out.println("Menampilkan para pendiri perusahaan teknologi di Indonesia :\n");  
//        System.out.println(tokoh[2][0] + " Adalah pendiri tencent.");
//        System.out.println("*********************************************************");
//        
////        Menggunakan looping untuk menampilkan semua data array
//	for (int i = 0; i < 3; i++) 
//	{
//            for (int j = 0; j < 2; j++) 
//	    {
//                System.out.println("tokoh["+i+"]["+j+"]:"+tokoh[i][j]);
//            }
//	}        
//   }
//   }
//}


//4. codingan contoh array 2 dimensi atau lebih dengan inputan atau scanner
//import java.util.*;
//public class Array {
//   public static void main(String args[])
//   {    
//	
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Masukkan panjang baris dari sebuah Array: ");
//	int row=sc.nextInt();
//	System.out.println("Masukkan panjang kolom dari sebuah Array: ");
//	int column=sc.nextInt();
//        
////        Ini adalah deklarasinya
//	int a[][]=new int[row][column];	 
//	System.out.print("Enter " + row*column + " Elemen untuk Menyimpan di Array:\n");
//        
////        Menggunakan looping untuk menampilkan array yang telah diinput
//        for (int i = 0; i < row; i++)
//	{
//	    for(int j = 0; j < column; j++)
//	    {
//           	a[i][j] = sc.nextInt();
//	    }
//	}   
//        System.out.print("Elemen dalam Array adalah :\n");
//        for (int i = 0; i < row; i++)
//	{
//	    for(int j = 0; j < column; j++)
//	    {
//	       System.out.println("Baris ["+i+"]:  Kolom ["+j+"] :"+a[i][j]);
// 	    }
//	}  
//   }
//}