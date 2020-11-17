public class Patient {

    String sName;
    String sDoc;
    String sDisease;

    public Patient(String name, String disease) {
        this.sName = name;
        this.sDisease = disease;
    }

    public Patient(String doctor) {
        this.sDoc = doctor;
    }

    //Metod 1. Testa patient om den har sjukdom
    static void CheckPatient(Patient d, Patient p) {
        if (p.sDisease != null) {
            System.out.println("Dr. " + d.sDoc + " tested patient " + p.sName + " positive for " + p.sDisease + ".");
        } else {
            System.out.println("Dr. " + d.sDoc + " tested patient " + p.sName + ", patient is healthy.");
        }
    }

    //Metod 2. Hämta medicin för sjukdom
    static void GetMedicine(Patient d, String disease) {
        System.out.println("Dr. " + d.sDoc + " fetched medication for " + disease + ".");
    }

    //Metod 3. Behandla sjukdom
    static void TreatPatient(Patient d, Patient p, String TreatDisease) {
        System.out.println("Dr. " + d.sDoc + " treated patient " + p.sName + " for " + TreatDisease);
        if (TreatDisease == p.sDisease)
            p.sDisease = null;
    }

    //Metod 4. Patient botad om Disease = null
    static void CurePatient(Patient p) {
        if (p.sDisease == null) {
            System.out.println(p.sName + " is now healthy.");
        } else {
            System.out.println(p.sName + " is still sick.");
        }
    }
}