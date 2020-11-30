package diskusi4;

/*
 * Nama : Muhamad Aziz
 * NIM : 04121406
 * Prodi : Sistem Informasi
 * Upbjj : Yogyakarta
 */

class LinkedListQueue {

    private Node front, rear;
    private int queueSize; // ukuran queue 

    //linked list node
    private class Node {

        int data;
        Node next;
    }

    //konstruktor default - awalnya depan & belakang adalah null; size = 0; antrian kosong
    public LinkedListQueue() {
        front = null;
        rear = null;
        queueSize = 0;
    }

    //Function jika queue itu kosong 
    public boolean isEmpty() {
        return (queueSize == 0);
    }

    //Hapus item dari depan antrian.
    public int dequeue() {
        int data = front.data;
        front = front.next;
        if (isEmpty()) {
            rear = null;
        }
        queueSize--;
        System.out.println("Element " + data + " dihapus dari antrian");
        return data;
    }

    //Tambahkan data di bagian belakang antrian.
    public void enqueue(int data) {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        queueSize++;
        System.out.println("Element " + data + " ditambahkan ke antrian");
    }
    //print depan dan belakang antrian

    public void print_frontRear() {
        System.out.println("Depan antrian:" + front.data
                + " Belakang antrian:" + rear.data);
    }
}

class Main {
    public static void main(String a[]) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(6);
        queue.enqueue(3);
        queue.print_frontRear();
        queue.enqueue(12);
        queue.enqueue(24);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(9);
        queue.print_frontRear();
    }
}




////Sama seperti ADT disini saya menggunakan Class java util Stack dengan menggunakan LinkedList
//import java.util.LinkedList;
//public class StackUsingLinkedList {
//    private LinkedList<Object> data = new LinkedList<Object>();
//     //    Method Java Size 
//    public int size() {
//        return data.size();
//    } 
//    // Method java isEmpty
//    public boolean isEmpty() {
//        return data.isEmpty();
//    }
//    //    Method Java push
//    public void push(Object item) {
//        data.addFirst(item);
//        System.out.println("Stacked: " + item);
//    }
//    //    Method Java Pop
//    public Object pop() {
//        System.out.println("Destacked: " + data.getFirst());
//        return data.removeFirst();
//    }
//    //    Method Java Peek 
//    public Object peek() {
//        return data.getFirst();
//    }
//     // Menguji tumpukan. Objek yang ditambahkan harus dikembalikan dalam urutan terbalik
//    public static void main (String args[]) {
//        StackUsingLinkedList nama = new StackUsingLinkedList();
//        System.out.println("Ini adalah stack push :");
//        nama.push("Elon Musk");
//        nama.push("Jeff Bezos");
//        nama.push("Mark Zuckerberg");
//        nama.push("Bill Gates");
//        nama.push("William tanuwijaya");
//        nama.push("Ferry Unardi");
//        
//         
//        System.out.println("\nIni adalah stack pop :");
//        while (!nama.isEmpty()) {
//           nama.pop();
//        }
//    }
//}
//
//import java.util.Stack;
//public class contohSatu {
//    public static void main(String a[]){
//        Stack<Integer> data = new Stack<>();
//        //        menggunakan ADT isEmpty() jika data dalam tidak ada isinya 
//        System.out.println("Data kosong : "  + data);
//        System.out.println("Menampilakan hasil data jika kosong: "  + data.isEmpty());
//  
//        //        Menggunakan ADT push()
//        data.push(10);
//        data.push(11);
//        data.push(12);
//        data.push(13);
//        data.push(14);
//        data.push(15);
//        System.out.println("saya tambahkan data menggunakan push: "  + data);
//        
//        //        menggunakan ADT pop()
//        System.out.println("menghapus data teratas : "  + data.pop());
//        System.out.println("setelah menghapus data teratas maka akan tampil : "  + data);
//        
//        //        menggunakan search() untuk mencari spesifik data contohnya 12
//        System.out.println("Mencari data secara spesifik : "  + data.search(12));
//        
//        //        menggunakan ADT isEmpty() jika data dalam ada isinya 
//        System.out.println("Menampilkan hasil data ada isinya  : "  + data.isEmpty());
//    }
//}
