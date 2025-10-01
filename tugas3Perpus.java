import java.util.Scanner;
public class tugas3Perpus {
    public static void main(String[] args) {
        boolean registrasi, kartuMahasiswa;
        Scanner sc = new Scanner(System.in);

        System.out.println("apakah sudah memasukkan registrasi? ");
        registrasi = sc.nextBoolean();
        System.out.println("apakah sudah memasukkan karu mahasiswa? ");
        kartuMahasiswa = sc.nextBoolean();

        if (registrasi == true || kartuMahasiswa == true ) {
            System.out.println("boleh masuk");
        } else {
            System.out.println("ditolak masuk");
        }
    }

    
}