package kyh.labs.lab3;

public class Patient {

    String sName;
    String sSickness;

    public Patient(String name) {
        this.sName = name;
    }

    public Patient(String name, String sickness) {
        this.sName = name;
        this.sSickness = sickness;
    }

    public String getName() {
        return this.sName;
    }

    public String getSickness() {
        return this.sSickness;
    }


    public boolean isSick(){
        if (this.sSickness != null)
            return true;
        else
            return false;
    }

    public void takeMedication(Medicine medicine) {
        if(medicine.getTreatmentName().equals(this.sSickness))
            this.sSickness = null;
    }
}
