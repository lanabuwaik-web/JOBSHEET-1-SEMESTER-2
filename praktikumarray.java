import java.util.Scanner;
public class praktikumarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah matkul;: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] namaMK = new String[jumlah];
        int[] sks = new int[jumlah];
        String[] nilaiHuruf = new String[jumlah];
        double[] nilaiSetara = new double[jumlah];

        double totalNilai = 0;
        int totalSKS = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            namaMK[i] = input.nextLine();
            System.out.print("SKS              : ");
            sks[i] = input.nextInt();
            input.nextLine();
            System.out.print("Nilai Huruf      : ");
            nilaiHuruf[i] = input.nextLine();
     switch (nilaiHuruf[i]) {
         case "A":
           nilaiSetara[i] = 4.0;
        break;
         case "B+":
           nilaiSetara[i] = 3.5;
        break;
         case "B":
           nilaiSetara[i] = 3.0;
        break;
         case "C+":
           nilaiSetara[i] = 2.5;
        break;
         case "C":
           nilaiSetara[i] = 2.0;
        break;
         case "D":
           nilaiSetara[i] = 1.0;
        break;
         case "E":
           nilaiSetara[i] = 0.0;
        break;
          default:
    System.out.println("Nilai huruf tidak valid!");
     nilaiSetara[i] = 0.0;
 }
            totalNilai += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }
        double ipSemester = totalNilai / totalSKS;
        System.out.println("\n==== DAFTAR NILAI ====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println(
                namaMK[i] + " | SKS: " + sks[i] + " | Nilai: " + nilaiHuruf[i]
            );
        }
        System.out.println("\nTotal SKS   : " + totalSKS);
        System.out.println("IP Semester : " + ipSemester);
        input.close();
    }
}
