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
       
    }

    static void tambahStok(Scanner sc) {
      
    }

    static void tambahItemBaru(Scanner sc) {
      
    }
}