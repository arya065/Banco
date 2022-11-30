package cafetera;

public class CoffeeMachine {

    private double volumeMax;
    private double volumeNow;

    public CoffeeMachine() {
        this.volumeMax = 1000;
        this.volumeNow = 0;
    }

    public CoffeeMachine(double volumeMax) {
        this.volumeMax = volumeMax;
        this.volumeNow = volumeMax;
    }
    public CoffeeMachine(double volumeMax, double volumeNow){
        if (volumeNow > volumeMax){
            setVolumeNow(volumeMax);
        }
    }
    public void llenarCafetera() {
        setVolumeNow(this.volumeMax);
    }

    public void servirTaza(double volumeServe) {
        if (this.volumeNow < volumeServe) {
            setVolumeNow(0);
            System.out.println("Cantidad a servir" + this.volumeNow);
        } else {
            setVolumeNow(this.volumeNow - volumeServe);
            System.out.println("Cantidad a servir" + volumeServe);
        }
    }

    public void vaciarTaza() {
        setVolumeNow(0);
    }

    public void agregarCafe(double volumeAdd) {
        if ((this.volumeNow + volumeAdd) > this.volumeMax) {
            setVolumeNow(this.volumeMax);
        } else {
            setVolumeNow(this.volumeNow + volumeAdd);
        }
    }

    public double getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeMax(double volumeMax) {
        this.volumeMax = volumeMax;
    }

    public double getVolumeNow() {
        return volumeNow;
    }

    public void setVolumeNow(double volumeNow) {
        this.volumeNow = volumeNow;
    }

}
