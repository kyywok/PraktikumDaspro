import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---Cetak KRS SIAKAD---");
        System.out.println("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        String pembayaran = (uktLunas) ? "Silahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";
        System.out.println(pembayaran);

        // if (uktLunas) {
        //     System.out.println("Pembayaran UKT Terverifikasi");
        //     System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        // } else {
        //     System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");
        // }

    }
}