package diskusi6;
/*
 * Nama : Muhamad Aziz
 * NIM : 04121406
 * Prodi : Sistem Informasi
 * Job : Software Engineer, Entrepreneur, and Student.
 * Upbjj : Yogyakarta
 * Moto : Change world with solve Problem
 */
class azizBuatBinarySearchTree {

    //Ini class yang bernama node mendefinisikan integer-integer dari node
    class Node {
        int kataKunci;
        Node kiri, kanan;
        public Node(int data) {
            kataKunci = data;
            kiri = kanan = null;
        }
    }
    // Ini adalah akar dari binary node
    Node akar;
    // Ini pembuat untuk BinarySearchTreenya =>Binary Search Treenya masih kosong
    azizBuatBinarySearchTree() {
        akar = null;
    }

    //Ini untuk menghapus node dari binarysearchtree
    void hapuskataKunci(int kataKunci) {
        akar = hapus_Recursive(akar, kataKunci);
    }

    //menghapus binary search tree dengan Java Function Recursive
    Node hapus_Recursive(Node akar, int kataKunci) {
        //akarnya masih kosong
        if (akar == null) {
            return akar;
        }

        //mengunjungi seluruh node dengan urutan tertentu 
        if (kataKunci < akar.kataKunci) //mengunjungi subtree di bagian kiri
        {
            akar.kiri = hapus_Recursive(akar.kiri, kataKunci);
        } else if (kataKunci > akar.kataKunci) //mengunjungi subtree di bagian kanan
        {
            akar.kanan = hapus_Recursive(akar.kanan, kataKunci);
        } else {
            // node hanya berisi satu children
            if (akar.kiri == null) {
                return akar.kanan;
            } else if (akar.kanan == null) {
                return akar.kiri;
            }

            // node mempunyai dua children
            //get inorder successor (min value in the kanan subtree) 
            akar.kataKunci = nilaiMinimal(akar.kanan);

            // hapus the inorder successor 
            akar.kanan = hapus_Recursive(akar.kanan, akar.kataKunci);
        }
        return akar;
    }

    int nilaiMinimal(Node akar) {
        //initially nilai minimalnya = akar
        int nilaiMinimalNya = akar.kataKunci;
        //Cari nilai minimalnya
        while (akar.kiri != null) {
            nilaiMinimalNya = akar.kiri.kataKunci;
            akar = akar.kiri;
        }
        return nilaiMinimalNya;
    }

    // masukkan sebuah node di binary serach treenya 
    void masukkan(int kataKunci) {
        akar = masukkan_Recursive(akar, kataKunci);
    }

    //Ini adalah fungsi masukkan menggunkan java recursive
    Node masukkan_Recursive(Node akar, int kataKunci) {
        //jika tree adalah kosong
        if (akar == null) {
            akar = new Node(kataKunci);
            return akar;
        }
        //mengunjungi treenya 
        if (kataKunci < akar.kataKunci) //masukkan node di bagian kiri subtree
        {
            akar.kiri = masukkan_Recursive(akar.kiri, kataKunci);
        } else if (kataKunci > akar.kataKunci) //masukkan node di bagian kanan subtree
        {
            akar.kanan = masukkan_Recursive(akar.kanan, kataKunci);
        }
        return akar;
    }

// metode untuk mengunjungi inorder Binary search tree
    void inorder() {
        inorder_Recursive(akar);
    }

    // recursively mengunjungi Binary Search Tree  
    void inorder_Recursive(Node akar) {
        if (akar != null) {
            inorder_Recursive(akar.kiri);
            System.out.print(akar.kataKunci + " ");
            inorder_Recursive(akar.kanan);
        }
    }

    boolean cari(int kataKunci) {
        akar = cari_Recursive(akar, kataKunci);
        if (akar != null) {
            return true;
        } else {
            return false;
        }
    }

    //recursive masukkan function
    Node cari_Recursive(Node akar, int kataKunci) {
        // Kasus Dasar: akar adalah nol atau kataKunci ada di akar
        if (akar == null || akar.kataKunci == kataKunci) {
            return akar;
        }
        // Nilai lebih besar dari kataKunci akar
        if (akar.kataKunci > kataKunci) {
            return cari_Recursive(akar.kiri, kataKunci);
        }
        // Nilai kurang dari kataKunci akar
        return cari_Recursive(akar.kanan, kataKunci);
    }
}

class Main {
    public static void main(String[] args) {
        azizBuatBinarySearchTree BinaryKu = new azizBuatBinarySearchTree(); 
        BinaryKu.masukkan(7);
        BinaryKu.masukkan(3);
        BinaryKu.masukkan(1);
        BinaryKu.masukkan(5);
        BinaryKu.masukkan(4);
        BinaryKu.masukkan(6);
        BinaryKu.masukkan(11);
        BinaryKu.masukkan(9);
        BinaryKu.masukkan(8);
        BinaryKu.masukkan(13);
        BinaryKu.masukkan(12);
        BinaryKu.masukkan(14);
        //print the BinaryKu
        System.out.println("Data Integer Binary Search Tree ini saya tampilkan dari kiri ke kanan");
        BinaryKu.inorder();
        System.out.println("\n-------------------------------------------------------------------------------------");

        //hapus node yaang tidak memiliki children
        System.out.println("\nData Integer Binary Search Tree saya hapus angka 1(Node yang tidak memiliki children) :");
        BinaryKu.hapuskataKunci(1);
        BinaryKu.inorder();
        System.out.println("\n-------------------------------------------------------------------------------------");
        
        //hapus node yang hanya memiliki satu children
        System.out.println("\nData Integer Binary Search Tree saya hapus angka 9(Node yang memiliki satu children) :");
        BinaryKu.hapuskataKunci(9);
        BinaryKu.inorder();
        System.out.println("\n-------------------------------------------------------------------------------------");

        //hapus node yang mempunyai dua children
        System.out.println("\nData Integer Binary Search Tree saya hapus angka 13(Node yang memiliki dua children) :");
        BinaryKu.hapuskataKunci(13);
        BinaryKu.inorder();
        System.out.println("\n-------------------------------------------------------------------------------------");
        
        //pencarian data angka 8
        boolean munculkan = BinaryKu.cari(8);
        System.out.println("\nApakah kataKunci 8 ditemukan di Binary Search Tree?" + " hasilnya adalah " +munculkan);
        munculkan = BinaryKu.cari(1);
        System.out.println("\nApakah kataKunci 12 ditemukan di Binary Search Tree?" + " hasilnya adalah " + munculkan);
    }
}

























