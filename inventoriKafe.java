import java.util.Scanner;

public class inventoriKafe {
    static String[][] inventori = new String[10][2];
    static int[] stok = new int[10]; 
    static int jumlahItem = 3; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inventori[0][0] = "Kopi Latte";
        inventori[0][1] = "Minuman";
        stok[0] = 20;

        inventori[1][0] = "Kue Brownies";
        inventori[1][1] = "Makanan";
        stok[1] = 15;

        inventori[2][0] = "Teh Tarik";
        inventori[2][1] = "Minuman";
        stok[2] = 30;
        menu(sc);
    }

}