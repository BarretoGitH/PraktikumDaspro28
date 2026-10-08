import java.util.Scanner;

public class StudiKasus228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa \t: ");
        String namaMahasiswa = sc.nextLine();

        System.out.print("jenis kegiatan (BELMAWA/BAKORMA/PKM/LAINNYA)\t: ");
        String jenisKegiatan = sc.nextLine();

        System.out.print("Jumlah dokumen yang diupload \t: ");
        int jmlDokumen = sc.nextInt();

        int peringkatJuara = 0;
        int statusPKM = 0;

        if (jenisKegiatan.equalsIgnoreCase("Belmawa") ||
                jenisKegiatan.equalsIgnoreCase("bakorma") ||
                jenisKegiatan.equalsIgnoreCase("Mandiri")) {
            System.out.print("Peringkat juara \t\t: ");
            peringkatJuara = sc.nextInt();
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Status pendanaan PKM (1= lolos, 0= Tidak lolos): ");
        }
        System.out.print("Masukkan status PKM \t\t: ");
        statusPKM = sc.nextInt();

        // nested if kelengkapan dokumen
        if (jmlDokumen < 4) {
            int dokKurang = 4 -jmlDokumen;
            System.out.print("Dokumen tidak lengkap(kurang "+dokKurang+" dokumen). Dana penghargaan tidak diberikan. ");
        } else {

            if (jenisKegiatan.equalsIgnoreCase("Belmawa") ||
                    jenisKegiatan.equalsIgnoreCase("bakorma") ||
                    jenisKegiatan.equalsIgnoreCase("Mandiri")) {

                if (peringkatJuara >= 1 && peringkatJuara >= 3) {
                    System.out.println("Mendapat dana penghargaan");
                } else {
                    System.out.println("Tidak memenuhi syarat juara dana penghargaan tidak diberikan");
                }

            } else if (jenisKegiatan.equalsIgnoreCase("PKM"))
                if (statusPKM == 1) {
                    System.out.println("Tim lolos dana penghargaan diberikan");
                } else {
                    System.out.println("Tim tidak lolos pendanaan, dana penghargaan tidak diberikan");
                }
            else {
                System.out.println("Kegiatan ini tidak memeperoleh dana penghargaan");
            }

        }

        sc.close();

    }
}