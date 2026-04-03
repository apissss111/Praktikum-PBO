public class Event {
    public String namaEvent;
    public String tanggal;

    public Event(String namaEvent, String tanggal) {
        this.namaEvent = namaEvent;
        this.tanggal = tanggal;
    }

    public void tampilData() {
        System.out.println("Nama Event : " + namaEvent);
        System.out.println("Tanggal    : " + tanggal);
    }
}