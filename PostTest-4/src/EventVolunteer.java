// Child Class
// Inheritance: EventVolunteer mewarisi class Event

public class EventVolunteer extends Event {

    private String namaVolunteer;
    private String tugas;

    // Constructor
    public EventVolunteer(String namaEvent, String namaVolunteer, String tugas, String tanggal) {
        super(namaEvent, tanggal);
        this.namaVolunteer = namaVolunteer;
        this.tugas = tugas;
    }

    // Getter
    public String getNamaVolunteer() {
        return namaVolunteer;
    }

    public String getTugas() {
        return tugas;
    }

    // Setter
    public void setNamaVolunteer(String namaVolunteer) {
        this.namaVolunteer = namaVolunteer;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    // Override method tampilData
    public void tampilData() {
        super.tampilData();
        System.out.println("Volunteer  : " + namaVolunteer);
        System.out.println("Tugas      : " + tugas);
    }

    // Override method getInfo
    public String getInfo() {
        return "Event Volunteer";
    }

    // Overloading method tampilData
    public void tampilData(String catatan) {
        tampilData();
        System.out.println("Catatan    : " + catatan);
    }
}