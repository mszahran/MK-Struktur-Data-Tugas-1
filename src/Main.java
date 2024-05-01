//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // No 01
        int jumlahBaris;

        // No 02
        String kalimatBaru = "Deklarasi tipe data String";
        System.out.println(kalimatBaru);

        // No 03
        int[] empatAngka = {7, 10, 20, 23};

        // Menampilkan isi array empatAngka
        System.out.println("Isi dari array empatAngka:");
        for (int i = 0; i < empatAngka.length; i++) {
            System.out.println(empatAngka[i]);
        }

        // No 04
        String[][] alfabet = {
                {"p", "s", "n"},
                {"w", "l", "b"},
                {"f", "r", "e"}
        };

        // Menampilkan isi array alfabet
        System.out.println("Isi dari array alfabet:");
        for (int i = 0; i < alfabet.length; i++) {
            for (int j = 0; j < alfabet[i].length; j++) {
                System.out.print(alfabet[i][j] + " ");
            }
            System.out.println(); // Mencetak baris baru setelah satu baris selesai ditampilkan
        }

        // No 05
        // Membuat linked list dengan nama 'listAngka'
        LinkedList<Integer> listAngka = new LinkedList<>();

        // Menambahkan elemen ke linked list
        listAngka.add(26);
        listAngka.add(8);
        listAngka.add(23);
        listAngka.add(24);
        listAngka.add(16);

        // Menampilkan isi linked list
        System.out.println("Isi dari linked list listAngka:");
        for (Integer angka : listAngka) {
            System.out.println(angka);
        }
    }
}