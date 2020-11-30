package Tugas3;
/*
 * Nama : Muhamad Aziz
 * NIM : 04121406
 * Prodi : Sistem Informasi
 * Job : Software Engineer, Entrepreneur, and Student.
 * Upbjj : Yogyakarta
 */

public class AlgoritmaSequentialSearch{    
//    Method looping untuk melakukan pencarian data 
public static int PencarianData(int[] angka, int kuncinya){    
    
//  angka.length untuk memanggil semua data yang ada, kemudian jika angka sama dengan kuncinya maka return i
        for(int i=0;i<angka.length;i++){    
            if(angka[i] == kuncinya){    
                return i;    
            }    
        }    
        return -1;    
    }   

//  main untuk memanggil semua method
    public static void main(String a[]){    
        
//  ini semua datanya
        int[] data= {20,30,40,50,60}; 
        
// ini variabel untuk interger yang ingin dicari 
        int PencarianAngka = 30;    
        System.out.println(PencarianAngka+" data ditemukan pada urutan ke "+PencarianData(data, PencarianAngka));    
    }    
}   