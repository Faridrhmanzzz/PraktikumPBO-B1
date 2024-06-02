/* Nama : Farid Rahman F */
/* NIM  : 24060122140142 */
/* Praktikum    : Tugas Praktikum 10 */

import java.util.ArrayList;
import java.util.Collection;
public class ArmadaKendaraan {
    private Collection<Vehicle> allArmada = new ArrayList<>();

    public void tambahUnitKendaraan(Collection<? extends Vehicle> armada) {
        allArmada.addAll(armada);
    }

    public Collection<Vehicle> getAllArmada() {
        return allArmada;
    }
}