public class Event {

    private String namaEvent;
    private String tanggal;

    public Event(String namaEvent, String tanggal) {
        this.namaEvent = namaEvent;
        this.tanggal = tanggal;
    }

    // Getter
    public String getNamaEvent() {
        return namaEvent;
    }

    public String getTanggal() {
        return tanggal;
    }

    // Setter
    public void setNamaEvent(String namaEvent) {
        this.namaEvent = namaEvent;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void tampilData() {
        System.out.println("Nama Event : " + namaEvent);
        System.out.println("Tanggal    : " + tanggal);
    }
}