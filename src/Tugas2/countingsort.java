package Tugas2;
/*
 * Nama : Muhamad Aziz
 * NIM : 04121406
 * Prodi : Sistem Informasi
 * Job : Software Engineer, Entrepreneur, and Student.
 * Upbjj : Yogyakarta
 */
class CountingSort {
    void sort(int angka[]) {
        int nilai = angka.length;
        int nampungDataSorting[] = new int[nilai];
        int nampungHasilJumlah[] = new int[256];
        
        
        for (int i = 0; i < 256; ++i) {
            nampungHasilJumlah[i] = 0;
        }

        for (int i = 0; i < nilai; ++i) {
            ++nampungHasilJumlah[angka[i]];
        }

        for (int i = 1; i <= 255; ++i) {
            nampungHasilJumlah[i] += nampungHasilJumlah[i - 1];
        }

        for (int i = nilai - 1; i >= 0; i--) {
            nampungDataSorting[nampungHasilJumlah[angka[i]] - 1] = angka[i];
            --nampungHasilJumlah[angka[i]];
        }

        for (int i = 0; i < nilai; ++i) {
            angka[i] = nampungDataSorting[i];
        }
    }

    public static void main(String args[]) {
        int daftarData[] = {30, 40, 10, 5, 60, 1};
        System.out.println("Ini adalah angka yang belum di sorting dengan counting sort");
         for (int i = 0; i < daftarData.length; ++i) {
            System.out.print(daftarData[i] + ", " );
        }
        
        
        CountingSort semuaMethoddiClass = new CountingSort();
        semuaMethoddiClass.sort(daftarData);

        System.out.print("\nini adalah angka yang sudah di sorting dengan counting sort\n");
        for (int i = 0; i < daftarData.length; ++i) {
            System.out.print(daftarData[i] + ", ");
        }
    }
}
