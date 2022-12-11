    
package tugas.pkg1;
import java.util.Scanner;
public class Tugas1 {

    
    public static void main(String[] args) {
       
        String nama_barang;
        int jumlah_barang;
        double harga_barang;
        double total;
        
        Scanner input = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("Kasir Sederhana");
        System.out.println("==============");
        
        System.out.print("Nama barang: ");
        nama_barang = input.nextLine();
        
        System.out.print("Jumlah Barang: ");
        jumlah_barang = input.nextInt();
        
        System.out.print("Harga Barang : ");
        harga_barang = input.nextDouble();
        
        total = jumlah_barang * harga_barang;
        
        System.out.print("Total :" +total);
          
    }
    
}
