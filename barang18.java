class barang18{
    public String kode;
    public String nama;
    public int harga;
    public int stok;

    public barang18 ( String kode, String nama, int harga, int stok){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    public String dapatkanKode(){
        return kode;

    }
    public String dapatkanNama(){
        return nama;
    }

    public int dapatHarga(){
        return harga;
    }

    public int dapatStok(){
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}