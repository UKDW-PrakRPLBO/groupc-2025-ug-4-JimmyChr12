package org.example;

public class HDMI extends Colokan{
    public HDMI(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public void getRealBandwidth() {
        int harga = super.getHarga();
        double promisedBandwidth = super.getPromisedBandwidth();

        double rasio = (double) harga /50000;

        if(rasio < 1) {
            promisedBandwidth = promisedBandwidth * rasio;
            super.setPromisedBandwidth(promisedBandwidth);
        }
    }
}
