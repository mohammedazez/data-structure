package diskusi3;

/*
 * Nama : Muhamad Aziz
 * NIM : 04121406
 * Prodi : Sistem Informasi
 */
class arrayDuaDimensi {

    public static void main(String[] args) {
        int tampilkan[][] = new int[4][5];
        tampilkan[0][0] = 1;
        tampilkan[0][1] = 2;
        tampilkan[0][2] = 3;
        tampilkan[0][3] = 4;
        tampilkan[0][4] = 5;
        tampilkan[1][0] = 6;
        tampilkan[1][1] = 6;
        tampilkan[1][2] = 6;
        tampilkan[1][3] = 6;
        tampilkan[1][4] = 6;
        tampilkan[2][0] = 6;
        tampilkan[2][1] = 6;
        tampilkan[2][2] = 6;
        tampilkan[2][3] = 6;
        tampilkan[2][4] = 6;
        tampilkan[3][0] = 6;
        tampilkan[3][1] = 6;
        tampilkan[3][2] = 6;
        tampilkan[3][3] = 6;
        tampilkan[3][4] = 6;

// Ini menggunakan Looping untuk menampilkan semua string
        for (int i = 0; i < tampilkan.length; i++) {
            for (int j = 0; j < tampilkan[i].length; j++) {

                System.out.print("angka" + " " + tampilkan[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("---------------------------------------------------------");
    }
}

//        int[][] nomor = {{1, 2 }, {3, 4}};
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println("nomor[" + i + "][" + j + "] = "
//                        + nomor[i][j]);
//            }
//        }
