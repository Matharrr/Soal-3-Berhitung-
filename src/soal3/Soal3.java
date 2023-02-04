package soal3;
import java.util.Scanner;

/**
 *
 * @author Muhamad Mathar Rizqi
 */
public class Soal3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); //membuat objek bernama scan untuk membaca masukan dari user
    String input = scan.nextLine(); //deklarasi dan pengisian string input dengan input dari user
    
    input = input.replace(" ", ""); //menghilangkan spasi pada string
    String[] tokens = input.split("(?<=[-+*/%])|(?=[-+*/%])"); //melakukan pemisahan string sesuai dengan operator mtk
    int hasil = Integer.parseInt(tokens[0]); //mengubah string menjadi integer
    
    for (int i = 1; i < tokens.length; i += 2) { //Looping sebanyak jumlah elemen-2 dari "tokens"
        String operator = tokens[i]; //Menyimpan elemen ke-i+1 dari "tokens" sebagai operator
        int nilai = Integer.parseInt(tokens[i + 1]); //Menyimpan elemen ke-i+2 dari "tokens" sebagai nilai
        switch (operator) {
        //menggunakan switch statement untuk melakukan operasi matematika sesuai dengan operator
            case "+" -> hasil += nilai;
            case "-" -> hasil -= nilai;
            case "*" -> hasil *= nilai;
            case "/" -> hasil /= nilai;
            case "%" -> hasil %= nilai;
            default -> {
                System.out.println("Operator tidak valid.");
            return;
            }
        }
    }
    System.out.println("Hasil: " + hasil); //mencetak hasil akhir dari operasi matematika.
  }
}