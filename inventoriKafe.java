import java.util.Scanner;

public class inventoriKafe {
    static String[][] inventori = new String[10][2];
    static int[] stok = new int[10]; 
    static int jumlahItem = 3; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inventori[0][0] = "Kopi Hitam";
        inventori[0][1] = "Minuman";
        stok[0] = 10;

        inventori[1][0] = "Cappucino";
        inventori[1][1] = "Minuman";
        stok[1] = 7;

        inventori[2][0] = "Teh Tarik";
        inventori[2][1] = "Minuman";
        stok[2] = 8;
        menu(sc);
    }


    static void menu(Scanner sc) {
        int pilihan;

        do {
            System.out.println("===== MENU INVENTORI KAFE =====");
            System.out.println("1. Tampilkan Inventori");
            System.out.println("2. Tambah Stok untuk Item yang Ada");
            System.out.println("3. Tambah Item Baru");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanInventori();
                    break;
                case 2:
                    tambahStok(sc);
                    break;
                case 3:
                    tambahItemBaru(sc);
                    break;
                case 4:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
    }

    static void tampilkanInventori() {
        System.out.println("===== DATA INVENTORI =====");
        if (jumlahItem == 0) {
            System.out.println("Inventori kosong. Tambahkan item baru terlebih dahulu.");
        } else {
            // Menampilkan header
            System.out.printf("%-3s %-20s %-15s %-5s%n", "No", "Nama Item", "Kategori", "Stok");
            System.out.println("---------------------------------------------------");
    
            
            for (int i = 0; i < jumlahItem; i++) {
                System.out.printf("%-3d", (i + 1));  
    
                
                for (int j = 0; j < jumlahItem; j++) {
                    if (j == 0) {
                        System.out.printf(" %-20s", inventori[i][j]);  
                    } else if (j == 1) {
                        System.out.printf(" %-15s", inventori[i][j]);  
                    } else {
                        System.out.printf(" %-5d", stok[i]);  
                        break;
                    }
                }
                System.out.println();  
            }
        }
    }
    

    static void tambahStok(Scanner sc) {
        if (jumlahItem == 0) {
            System.out.println("Inventori kosong. Tambahkan item baru terlebih dahulu.");
            return;
        }
        System.out.println("===== TAMBAH STOK =====");
        
        System.out.print("Masukkan nomor item: ");
        int nomorItem = sc.nextInt();
        sc.nextLine();

        if (nomorItem < 1 || nomorItem > jumlahItem) {
            System.out.println("Nomor item tidak valid.");
            return;
        }

        System.out.print("Masukkan jumlah stok yang akan ditambahkan: ");
        int tambahanStok = sc.nextInt();
        sc.nextLine();

        if (tambahanStok > 0) {
            stok[nomorItem - 1] += tambahanStok;    
            System.out.println("Stok " + inventori[nomorItem - 1][0] + " berhasil ditambahkan! Stok sekarang: " + stok[nomorItem - 1]);
        } else {
            System.out.println("Jumlah stok harus lebih dari 0.");
        }
        tampilkanInventori();
    }

    static void tambahItemBaru(Scanner sc) {
        if (jumlahItem >= inventori.length) {
            System.out.println("Inventori penuh! Tidak dapat menambah item baru.");
            return;
        }

        System.out.println("===== TAMBAH ITEM BARU =====");
        System.out.print("Masukkan nama item baru: ");
        String namaBaru = sc.nextLine();

        System.out.print("Masukkan kategori item baru: ");
        String kategoriBaru = sc.nextLine();

        System.out.print("Masukkan jumlah stok awal: ");
        int stokBaru = sc.nextInt();
        sc.nextLine();

        if (stokBaru > 0) {
            inventori[jumlahItem][0] = namaBaru;
            inventori[jumlahItem][1] = kategoriBaru;
            stok[jumlahItem] = stokBaru;
            jumlahItem++;
            System.out.println("Item baru berhasil ditambahkan: " + namaBaru + " (" + kategoriBaru + ") - Stok: " + stokBaru);
        } else {
            System.out.println("Stok awal harus lebih dari 0. Item tidak berhasil ditambahkan.");
        }
    }
}