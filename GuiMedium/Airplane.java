/* Nama : Farid Rahman F */
/* NIM  : 24060122140142 */
/* Praktikum    : Tugas Praktikum 10 */

public abstract class Airplane extends Vehicle {
    private double maxLoad;

    public Airplane(double maxLoad) {
        this.maxLoad = maxLoad;
    }


    public abstract double calcFuelEfficiency();
    
    
    public abstract double calcTripDistance();

  
    public abstract String toString();
}
