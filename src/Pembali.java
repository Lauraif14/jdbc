class Pembelian extends Barang implements HitungTotalBayar {
    private String noFaktur;
    private String namaPelanggan;
    private String nomorHP;
    private String alamatPelanggan;
    

    public Pembelian(String noFaktur, String namaPelanggan, String nomorHP, String alamatpelanggan, String namaBarang, double hargaBarang, int jumlahBarang) {
        super(namaBarang, hargaBarang, jumlahBarang);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.nomorHP = nomorHP;
        this.alamatPelanggan = alamatPelanggan; 
    }

    @Override
    public double hitungTotalBayar() {
        return hargaBarang * jumlahBarang;
    }

    @Override
    public void tampilaninfo(){
        System.out.println("No Faktur\t: " + noFaktur);
        System.out.println("Nama\t\t: " + namaPelanggan);
        System.out.println("No HP\t: " + nomorHP);
        System.out.println("Alamat\t: " + alamatPelanggan);
        super.tampilaninfo();
        
    }

}
