import java.util.Scanner;
public class nestedUjianSkripsiNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.println("Apakah mahasiswa sudah bisa kompen? (ya/tidak)");
        String bebasKompen = sc.nextLine().trim();

        System.out.println("Masukkan jumlah log bimbingan pembingbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.println("Masukkan jumlah log bimbingan pembingbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4 ) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! log bimbinganP1 kurang dari 8 dan bimbinganP2 kurang dari 4";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! log bimbingan p1 belum mencapai 8";
            } else {
                pesan = "Gagal! log bimbingan p2 belum mencapai 4";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih meliliki tanggungan kompen";
        }

        System.out.println(pesan);
    }
    
}