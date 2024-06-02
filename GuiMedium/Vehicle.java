/* Nama : Farid Rahman F */
/* NIM  : 24060122140142 */
/* Praktikum    : Tugas Praktikum 10 */

public abstract class Vehicle {
    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();

    
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
