import java.util.Scanner;

public class mainstudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Masukkan kredit : ");
        int kredit = input.nextInt();

        Student mahasiswa = new Student(nama, kredit);

        System.out.println("Data Mahasiswa:");
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Kredit: " + mahasiswa.getKredit());
        System.out.println("IPK: " + mahasiswa.getIpk());
        System.out.println("Poin Kualitas: " + mahasiswa.getPoinKualitas());

        input.close();
    }
}
