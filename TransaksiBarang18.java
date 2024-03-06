class TransaksiBarang18 {
    public barang18[] barangs;
    public int jumlahBarang;

    public TransaksiBarang18(int jumlahBarang) {
        this.barangs = new barang18[jumlahBarang];
        this.jumlahBarang = 0;
    }

    public void tambahBarang(barang18 barang18) {
        barangs[jumlahBarang] = barang18;
        jumlahBarang++;
    }

    public void tampilkanbarang() {
        System.out.println("Daftar barang:");
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("Kode: " + barangs[i].dapatkanKode() + ", Nama: " + barangs[i].dapatkanNama() + ", Harga: " + barangs[i].dapatHarga() + ", Stok: " + barangs[i].dapatStok());
        }
    }

    public void TampilkanBarangpembelian() {
        System.out.println("Daftar barang:");
        for (int i = 0; i < jumlahBarang; i++) {
            String status = "Belum dibeli";
            for (int j = 0; j < jumlahBarang; j++) {
                if (barangs[i].dapatkanKode().equals(barangs[j].dapatkanKode()) && i != j) {
                    status = "Sudah dibeli";
                    break;
                }
            }
            
        }
    }

    public void pembelian(barang18[] daftarBarang, String kode) {
        for (int i = 0; i < daftarBarang.length; i++) {
            if (daftarBarang[i].dapatkanKode().equals(kode) && daftarBarang[i].dapatStok() > 0) {
                tambahBarang(new barang18(daftarBarang[i].dapatkanKode(), daftarBarang[i].dapatkanNama(), daftarBarang[i].dapatHarga(), 1));
                daftarBarang[i].dapatStok();
                System.out.println("Pembelian berhasil!");
                return;
            }
        }
        System.out.println("Barang tidak tersedia.");
    }
}
