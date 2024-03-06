import java.util.Scanner; 
public class mainbarang18 {
    public static void main(String[] args) {
     barang18[] daftarBarang = {
        new barang18 ("K01", "Sampo", 10000, 5),
        new barang18("K02", "sabun",  5000, 10),
        new barang18("K03", "Pasta gigi", 8000, 12),
        new barang18( "K04", "sikat gigi", 4000, 12),
        new barang18("K05", "Biore", 7000, 4)
    
     } ;
     TransaksiBarang18 transaksi = new TransaksiBarang18(daftarBarang.length);
        Scanner scanner = new Scanner(System.in);
     while (true) {
        System.out.println("\nMenu");
        System.out.println(" 1. Tampilkan barang");
        System.out.println(" 2. tampilkan pembelian");
        System.out.println(" 3. Melakukan pembelian");
        System.out.println(" 4. Keluar");

        System.out.print("pilih menu:");
        int pilihmenu = scanner.nextInt();
        scanner.nextLine();

        switch (pilihmenu) {
            case 1:
                transaksi.tampilkanbarang();
                
                break;

            case 2:
                transaksi.TampilkanBarangpembelian();
            break;

            case 3:
            System.out.print("masukkan Kode barang:");
            String kode = scanner.nextLine();
            transaksi.pembelian(daftarBarang, kode);
            break;

            case 4:
            System.out.println("Terimakasih telah melakukan pembelian ini");
            break;
    
            default:
            System.out.println(" Kode barang tidak ditemukan");
                break;
        }

        
     }
    }
}
