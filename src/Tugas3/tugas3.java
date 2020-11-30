package Tugas3;
/*
 * Nama : Muhamad Aziz
 * NIM : 04121406
 * Prodi : Sistem Informasi
 * Job : Software Engineer, Entrepreneur, and Student.
 * Upbjj : Yogyakarta
 */

public class AlgoritmaBinarySearch {
    
    
    // Ini semua datanya   
    private final int[] data = {20, 30, 40, 50, 60};

    // Ini method untuk menampilkan semua data   
    private void ShowAllData() {
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Ini method untuk mencari data dan menampilkan data pada urutan keberapa   
    public String SearchforBinary(int key) {
        int bottom = 0;
        int top = data.length - 1;
        
        
    
    // ketika top sama dengan bottom maka eksekusi yang telah dibuat variabel center yaitu bottom ditambah top lalu dibagi dua 
    // kemudian variabel center diekseskusi menggunakan conditional jika key kurang dari data variabel tangah maka eksekusi center dikuragi satu
    // jika tidak maka selanjutanya jika key sama dengan data maka ekseskusi nomor key pada urutan keberapa
    // jika tidak ada data yang ditemukan maka return data tidak ditemukan
        while (top >= bottom) {
            int center = (bottom + top) / 2;
            if (key < data[center]) {
                top = center - 1;
            } else if (key == data[center]) {
                return "Data " + key + " is Found on the " + (center + 1) + " list";
            } else {
                bottom = center + 1;
            }
        }
        return "Data is not showing";
    }

    // Ini main untuk memanggiul semua method sebelumnya yaitu classs, tampil data, dan pencarian binary   
    public static void main(String args[]) {
        AlgoritmaBinarySearch semuaObjek = new AlgoritmaBinarySearch();
        semuaObjek.ShowAllData();
        System.out.println(semuaObjek.SearchforBinary(30));
    }

}
