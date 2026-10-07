import java.util.Scanner;

public class StudiKasus228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa anda ");
        String namaMahasiswa = sc.nextLine();

        System.out.print("jenis kegiatan (BELMAWA/BAKORMA/PKM/LAINNYA): ");
        String jenisKegiatan = sc.nextLine();

        System.out.println("Jumlah dokumen yang diupload :");
        int jmlDokumen = sc.nextInt();

        int peringkatJuara = 0;
        int statusPKM = 0;

        if (jenisKegiatan.equalsIgnoreCase("Belmawa") ||
                jenisKegiatan.equalsIgnoreCase("bakorma") ||
                jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            System.out.print("Peringkat juara");
            peringkatJuara = sc.nextInt();
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1= lolos, 0= Tidak lolos): ");
        }
        statusPKM = sc.nextInt();

    }
}