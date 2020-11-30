package diskusi5;
/*
 * Nama : Muhamad Aziz
 * NIM : 04121406
 * Prodi : Sistem Informasi
 * Upbjj : Yogyakarta
 */
import java.util.Arrays;
class CountingSort {
  void countSort(int angka[], int ukuran) {
    int[] keluaran = new int[ukuran + 1];
    
    // Temukan elemen terbesar dari array
    int maksimal = angka[0];
    for (int i = 1; i < ukuran; i++) {
      if (angka[i] > maksimal)
        maksimal = angka[i];
    }
    int[] hitungan = new int[maksimal + 1];

    // Inisialisasi hitungan array dengan semua nol.
    for (int i = 0; i < maksimal; ++i) {
      hitungan[i] = 0;
    }

    // Simpan hitungan setiap elemen
    for (int i = 0; i < ukuran; i++) {
      hitungan[angka[i]]++;
    }

    // Simpan jumlah kumulatif setiap Array
    for (int i = 1; i <= maksimal; i++) {
      hitungan[i] += hitungan[i - 1];
    }

    // Temukan indeks setiap elemen dari array asli dalam hitungan array, dan
    // tempatkan elemen dalam hasil keluaran array.
    for (int i = ukuran - 1; i >= 0; i--) {
      keluaran[hitungan[angka[i]] - 1] = angka[i];
      hitungan[angka[i]]--;
    }

    // Salin elemen yang diurutkan ke dalam array asli
    for (int i = 0; i < ukuran; i++) {
      angka[i] = keluaran[i];
    }
  }

  // Isi data array dan jalankan fungsi countingsort
  public static void main(String args[]) {
    int[] daftarAngka = { 10, 2, 6, 3, 9, 1, 5, 8, 4, 7 };
    int ukuran = daftarAngka.length;
    System.out.println("Angka ini belum di sorting dengan counting sort: ");
    System.out.println(Arrays.toString(daftarAngka));
    System.out.println("----------------------------------------------- ");
    
    CountingSort fungsiUrutkan = new CountingSort();
    fungsiUrutkan.countSort(daftarAngka, ukuran);
    System.out.println("Amgka ini sudah di sorting dengan counting sort: ");
    System.out.println(Arrays.toString(daftarAngka));
  }
}