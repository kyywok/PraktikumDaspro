import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        String pengguna ;
        int sks;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan pengguna = ");
        pengguna = sc.nextLine();
        System.out.println("Masukkan sks = ");
        sks = sc.nextInt();

        if (pengguna == "dosen" ) {
            System.out.println("akses wifi diberikan (dosen)");
        } else if (pengguna == "mahasiswa") {
            if (sks >= 12) {
                System.out.println("akses wifi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("akses ditolak, sks kurang dari 12");
            }
        } else {
            System.out.println("akases ditolak");
        }
    }
}
