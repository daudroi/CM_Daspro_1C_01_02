
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
        System.out.printf("%-3s %-20s %-15s %-5s", "No", "Nama Item", "Kategori", "Stok");
        System.out.println("");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < jumlahItem; i++) {
            System.out.printf("%-3d %-20s1 %-15s %-5d", (i + 1), inventori[i][0], inventori[i][1], stok[i]);
            System.out.println("");
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