// Child Class
// Inheritance + Interface

public class EventVolunteer extends Event implements EventAksi {

    private String namaVolunteer;
    private String tugas;
    private String catatan;

    public EventVolunteer(String namaEvent, String namaVolunteer, String tugas, String tanggal) {
        super(namaEvent, tanggal);
        this.namaVolunteer = namaVolunteer;
        this.tugas = tugas;
        this.catatan = "-";
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

    // Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Volunteer  : " + namaVolunteer);
        System.out.println("Tugas      : " + tugas);
    }

    // Override abstract method
    public String getInfo() {
        return "Event Volunteer";
    }

    // Overloading
    public void tampilData(String tambahan) {
        tampilData();
        System.out.println("Catatan    : " + tambahan);
    }

    // Implement interface
    public void tambahCatatan(String catatan) {
        this.catatan = catatan;
    }

    public void tampilAksi() {
        System.out.println("Catatan Volunteer : " + catatan);
    }
}