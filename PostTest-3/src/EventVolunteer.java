// Child Class
// Inheritance: EventVolunteer mewarisi class Event

public class EventVolunteer extends Event {

    // Encapsulation
    private String namaVolunteer;
    private String tugas;

    // Constructor
    public EventVolunteer(String namaEvent, String namaVolunteer, String tugas, String tanggal) {

        // Inheritance: memanggil constructor parent class (Event)
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

    // Method menampilkan data volunteer
    public void tampilData() {

        // Inheritance: menggunakan method dari parent class
        super.tampilData();

        System.out.println("Volunteer  : " + namaVolunteer);
        System.out.println("Tugas      : " + tugas);
    }
}