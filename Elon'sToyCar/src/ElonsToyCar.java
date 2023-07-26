public class ElonsToyCar {
    private int batery;
    private int driven;

    public ElonsToyCar(){
        this.batery = 100;
        this.driven = 0;
    }
    
    public static ElonsToyCar buy() {
        ElonsToyCar toyCar = new ElonsToyCar();
        return toyCar;
    }

    public String distanceDisplay() {
        return "Driven " + this.driven + " meters";
    }

    public String batteryDisplay() {
        if(this.batery > 0)
            return "Battery at " + this.batery + "%";
        else
            return "Battery empty";
    }

    public void drive() {
        if(this.batery > 0){
            this.driven += 20;
            this.batery -= 1;
        }
        else{
            this.distanceDisplay();
        }
    }
}