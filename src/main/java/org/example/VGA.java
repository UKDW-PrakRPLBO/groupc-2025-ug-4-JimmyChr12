package org.example;

public class VGA extends Colokan{
    public VGA(int harga, double promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    public void getRealBandwidth() {
        int harga = getHarga();
        double promisedBandwidth = getPromisedBandwidth();

        double rasio = (double) harga / 30000;
        if(rasio < 1) {
            promisedBandwidth = promisedBandwidth * rasio;
            super.setPromisedBandwidth(promisedBandwidth);
        }
    }
//    @Override
//    public void getRealBandwidth() {
//        int harga = 30000;
//        double promisedBandwidth = getPromisedBandwidth();
//
//        double rasio = harga/promisedBandwidth;
//
//        if(rasio < 1){
//            promisedBandwidth = promisedBandwidth * rasio;
//            super.setPromisedBandwidth(promisedBandwidth);
//        }
//    }
}
