package com.tutorial;
import java.util.*;

class peminjam{
    String nama, noHP, jenisKelamin, umur;

    peminjam(String nama, String noHP, String jenisKelamin){
        this.nama = nama;
        this.noHP = noHP;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;

    }

    public peminjam(String nama, String noHP, String umur, String jenisKelamin) {
    }

    void dataPeminjam() {
        System.out.println("Data peminjam");
        System.out.println("Nama            : " + this.nama);
        System.out.println("No HP           : " + this.noHP);
        System.out.println("Jenis Kelamin   : " + this.jenisKelamin);
        System.out.println("Umur   : " + this.umur);

    }
}

class buku{
    String namaBuku, noSeri, namaPengarang, namaPenerbit;
    buku(String namaBuku, String noSeri, String namaPengarang, String namaPenerbit){
        this.namaBuku = namaBuku;
        this. noSeri = noSeri;
        this.namaPengarang = namaPengarang;
        this.namaPenerbit = namaPenerbit;
    }
    void databuku(){
        System.out.println("------Data Buku-----");
        System.out.println("Nama Buku       : " + this.namaBuku);
        System.out.println("No Seri         : " + this.noSeri);
        System.out.println("Nama Pengarang  : " + this.namaPengarang);
        System.out.println("Nama Penerbit   : " + this.namaPenerbit);
    }
}

public class Main {

    public static void main(String[] args) {

        int pilihan, x = 0, noUrut = 0;
        char alternatif;
        String nama, noHP, jenisKelamin, umur;
        String namaBuku, noSeri, namaPengarang, namaPenerbit;
        Scanner masukkan = new Scanner(System.in);
        peminjam[] dataPengunjung = new peminjam[1024];
        buku[] dataBuku = new buku[1024];

        do{
            System.out.println("====== Perpustakaan Unila ======");
            System.out.println("1. Input Data Pemninjam");
            System.out.println("2. Cetak Data Pinjaman");
            System.out.println("3. Keluar ");
            System.out.print("Masukkan pilihan : ");
            pilihan = masukkan.nextInt();
            if (pilihan == 1) {
                x++;
                System.out.println("======= Data Peminjam =====");
                System.out.print("Nama            : ");
                nama = masukkan.next();
                System.out.print("No HP           : ");
                noHP = masukkan.next();
                System.out.print("Umur            : ");
                umur = masukkan.next();
                System.out.print("Jenis Kelamin   : ");
                jenisKelamin = masukkan.next();
                dataPengunjung[x] = new peminjam(nama, noHP, umur, jenisKelamin);

                System.out.println("======= Data Buku ======");
                System.out.print("Nama Buku       : ");
                namaBuku = masukkan.next();
                System.out.print("No Seri         : ");
                noSeri = masukkan.next();
                System.out.print("Nama Pengarang  : ");
                namaPengarang =  masukkan.next();
                System.out.print("Nama Penerbit   : ");
                namaPenerbit = masukkan.next();
                dataBuku[x] = new buku(namaBuku, noSeri, namaPengarang, namaPenerbit);

            }else if (pilihan == 2) {
                if (x < 1) {
                    System.out.println("Data Pinjaman Masih Kosong !!!");
                } else {
                    while (noUrut < x) {
                        noUrut++;
                        System.out.println("------Nomor Urut Ke-" + noUrut + "------");
                        dataPengunjung[noUrut].dataPeminjam();
                        dataBuku[noUrut].databuku();
                    }
                }
            }else {
                return;
            }
            System.out.print(" ? (y/n) ");
            alternatif = masukkan.next().charAt(0);
        } while (alternatif == 'y' || alternatif == 'Y');
        System.out.print("Terima Kasih Telah Meminjam !!!");
    }
}
