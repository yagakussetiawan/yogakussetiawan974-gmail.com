public class Student {
    private String nama;
    private int kredit;
    private double ipk;
    private char poinKualitas;

    public Student(String nama, int kredit) {
        this.nama = nama;
        this.kredit = kredit;
        this.poinKualitas = konversiKreditKeKualitas(kredit);
        calculateIPK();
    }

    public double hitungRataRataPoinNilai() {
        if (kredit == 0) {
            return 0.0;
        }
        return (double) poinKualitas / kredit;
    }

    public void tambahKredit(int kreditBaru, char poinNilaiBaru) {
        int totalKredit = kredit + kreditBaru;
        double totalPoinKualitas = (double) (poinKualitas * kredit + poinNilaiBaru * kreditBaru);

        if (totalKredit != 0) {
            ipk = totalPoinKualitas / totalKredit;
        } else {
            ipk = 0.0;
        }

        kredit = totalKredit;
        poinKualitas = poinNilaiBaru;
    }

    public static char konversiKreditKeKualitas(int kredit) {
        char kualitasKredit;

        if (kredit > 75) {
            kualitasKredit = 'A';
        } else if (kredit >= 65) {
            kualitasKredit = 'B';
        } else if (kredit >= 55) {
            kualitasKredit = 'C';
        } else if (kredit >= 45) {
            kualitasKredit = 'D';
        } else {
            kualitasKredit = 'E';
        }

        return kualitasKredit;
    }

    private void calculateIPK() {
        ipk = hitungRataRataPoinNilai();
    }

    public String getNama() {
        return nama;
    }

    public int getKredit() {
        return kredit;
    }

    public double getIpk() {
        return ipk;
    }

    public char getPoinKualitas() {
        return poinKualitas;
    }
}
