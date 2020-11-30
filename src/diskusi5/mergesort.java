package diskusi5;
/*
 * Nama : Muhamad Aziz
 * NIM : 04121406
 * Prodi : Sistem Informasi
 * Upbjj : Yogyakarta
 */
import java.util.Arrays;
class Main {
    // Merge two sub arrays L and M into array
    void merge(int array[], int awal, int tengah, int akhir) {
        int n1 = tengah - awal + 1;
        int n2 = akhir - tengah;

        int L[] = new int[n1];
        int M[] = new int[n2];

        // Isi array kiri dan kanan
        for (int i = 0; i < n1; i++) {
            L[i] = array[awal + i];
        }
        for (int j = 0; j < n2; j++) {
            M[j] = array[tengah + 1 + j];
        }

        // Pertahankan indeks sub-array dan array utama saat ini
        int i, j, k;
        i = 0;
        j = 0;
        k = awal;

        // Sampai kita mencapai salah satu ujung L atau M, pilih yang lebih besar
        // elemen L dan M dan letakkan pada posisi yang benar di A [p..r]
        // untuk mengurutkan secara menurun
        // gunakan jika (L [i]> = <[j])
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }

        // Ketika kita kehabisan elemen di L atau M,
        // ambil elemen yang tersisa dan masukkan A [p..r]
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }

    // Bagi Array menjadi dua sub Array, urutkan dan gabungkan
    void mergeSort(int array[], int kiri, int kanan) {
        if (kiri < kanan) {

            // m adalah titik di mana array dibagi menjadi dua sub array
            int tengah = (kiri + kanan) / 2;
 
            // panggilan rekursif ke setiap sub array
            mergeSort(array, kiri, tengah);
            mergeSort(array, tengah + 1, kanan);

            // Gabungkan sub array yang diurutkan
            merge(array, kiri, tengah, kanan);
        }
    }

    public static void main(String args[]) {

        // membuat array yang tidak disortir
        int[] array = {6, 5, 12, 10, 9, 1, 8, 7, 2, 3, 11, 4};
          System.out.println("Angka Ini Belum di sorting:");
          System.out.println(Arrays.toString(array));
          System.out.println("-----------------------------------------------------")

        Main ob = new Main();
        // panggil metode mergeSort ()
        // berikan argumen: array, indeks pertama dan indeks terakhir
        ob.mergeSort(array, 0, array.length - 1);
        System.out.println("Angka ini sudah di sorting:");
        System.out.println(Arrays.toString(array));
    }
}
