// Class Barang sebagai superclass
    class Barang {
        protected static String namaBarang;
        protected double hargaBarang;
        protected int jumlahBarang;
    
        public Barang(String namaBarang, double hargaBarang, int jumlahBarang) {
            this.namaBarang = namaBarang;
            this.hargaBarang = hargaBarang;
            this.jumlahBarang = jumlahBarang;
        }
    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHarga() {
        return hargaBarang;
    }

    public int getJumlah() {
        return jumlahBarang;
    }

    public void tampilaninfo(){
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Harga Barang\t: " + hargaBarang);
        System.out.println("Jumlah Barang\t: " + jumlahBarang);
    }
}


