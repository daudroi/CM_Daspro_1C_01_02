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

}