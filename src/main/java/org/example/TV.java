package org.example;

public class TV {
    private int maxResolusi;
    private Colokan colokan;

    public TV(int maxResolusi) {
        this.maxResolusi = maxResolusi;
    }

    public TV(int maxResolusi , Colokan colokan) {
        this.maxResolusi = maxResolusi;
        this.colokan = colokan;
    }

    public void connect(Colokan colokan) {
        this.colokan = colokan;
        System.out.println("Berhasil Connect ke - " + colokan.getMerk());
    }

    public String getResolution(){
        int restemp;
//        VGA a = new VGA(colokan.getHarga(), colokan.getPromisedBandwidth(), colokan.getMerk());
//        a.getRealBandwidth();
//        System.out.println(a.getPromisedBandwidth());
        colokan.getRealBandwidth();

        double bandwidth = colokan.getPromisedBandwidth();
        if(bandwidth >= 10 && bandwidth <= 35){
            restemp = 480;
            if(this.maxResolusi > restemp){
                this.maxResolusi = restemp;
            }
        }
        else if (bandwidth > 35 && bandwidth <= 100) {
            restemp = 720;
            if(this.maxResolusi > restemp){
                this.maxResolusi = restemp;
            }
        }
        else {
            restemp = 1080;
            if(this.maxResolusi > restemp){
                this.maxResolusi = restemp;
            }
        }
        return maxResolusi + "";
    }
}
