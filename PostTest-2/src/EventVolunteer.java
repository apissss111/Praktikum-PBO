public class EventVolunteer extends Event {

    public String namaVolunteer;
    public String tugas;

    public EventVolunteer(String namaEvent, String namaVolunteer, String tugas, String tanggal) {
        super(namaEvent, tanggal);
        this.namaVolunteer = namaVolunteer;
        this.tugas = tugas;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Volunteer  : " + namaVolunteer);
        System.out.println("Tugas      : " + tugas);
    }
}