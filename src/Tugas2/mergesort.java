package Tugas2;
/*
 * Nama : Muhamad Aziz
 * NIM : 04121406
 * Prodi : Sistem Informasi
 * Job : Software Engineer, Entrepreneur, and Student.
 * Upbjj : Yogyakarta
 */
class MergeSort {

    void merge(int angka[], int awal, int tengah, int akhir) {
        int rangkaianDataSatu = tengah - awal + 1;
        int rangkaianDataDua = akhir - tengah;

        int arraySementaraSatu[] = new int[rangkaianDataSatu];
        int arraySementaraDua[] = new int[rangkaianDataDua];

        for (int i = 0; i < rangkaianDataSatu; ++i) {
            arraySementaraSatu[i] = angka[awal + i];
        }
        for (int j = 0; j < rangkaianDataDua; ++j) {
            arraySementaraDua[j] = angka[tengah + 1 + j];
        }

        int i = 0, j = 0;

        int k = awal;
        while (i < rangkaianDataSatu && j < rangkaianDataDua) {
            if (arraySementaraSatu[i] <= arraySementaraDua[j]) {
                angka[k] = arraySementaraSatu[i];
                i++;
            } else {
                angka[k] = arraySementaraDua[j];
                j++;
            }
            k++;
        }

        while (i < rangkaianDataSatu) {
            angka[k] = arraySementaraSatu[i];
            i++;
            k++;
        }

        while (j < rangkaianDataDua) {
            angka[k] = arraySementaraDua[j];
            j++;
            k++;
        }
    }

    void sort(int angka[], int l, int r) {
        if (l < r) {

            int tengah = (l + r) / 2;

            sort(angka, l, tengah);
            sort(angka, tengah + 1, r);

            merge(angka, l, tengah, r);
        }
    }

    static void tampilkanangka(int angka[]) {
        int n = angka.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int angka[] = {30, 40, 10, 5, 60, 1};

        System.out.println("Ini adalah angka yang belum di sorting dengan merge sort");
        tampilkanangka(angka);

        MergeSort semuaMethoddiClass = new MergeSort();
        semuaMethoddiClass.sort(angka, 0, angka.length - 1);

        System.out.println("\nIni adalah angka yang sudah di sorting dengan merge sort");
        tampilkanangka(angka);
    }
}
