package org.example;

public abstract class Colokan {
    private String merk;
    private double promisedBandwidth;
    private int harga;

//    public Colokan(int harga, double promisedBandwidth, String merk) {
//    }

    public Colokan(int harga, double promisedBandwidth, String merk) {
        this.harga = harga;
        this.promisedBandwidth = promisedBandwidth;
        this.merk = merk;
    }
//
//    public void Colokan(int harga, int promisedBandwidth, String merk) {
//        this.harga = harga;
//        this.promisedBandwidth = promisedBandwidth;
//        this.merk = merk;
//    }

    public abstract void getRealBandwidth();

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getPromisedBandwidth() {
        return promisedBandwidth;
    }

    public void setPromisedBandwidth(double promisedBandwidth) {
        this.promisedBandwidth = promisedBandwidth;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
