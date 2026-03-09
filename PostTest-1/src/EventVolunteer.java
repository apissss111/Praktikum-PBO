public class EventVolunteer {
    String namaEvent;
    String namaVolunteer;
    String tugas;
    String tanggal;

    public EventVolunteer(String namaEvent, String namaVolunteer, String tugas, String tanggal) {
        this.namaEvent = namaEvent;
        this.namaVolunteer = namaVolunteer;
        this.tugas = tugas;
        this.tanggal = tanggal;
    }

    public void tampilData() {
        System.out.println("Nama Event      : " + namaEvent);
        System.out.println("Nama Volunteer  : " + namaVolunteer);
        System.out.println("Tugas           : " + tugas);
        System.out.println("Tanggal         : " + tanggal);
        System.out.println("------------------------------");
    }
}