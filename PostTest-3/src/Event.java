// Parent Class
// Class dasar untuk semua jenis event

public class Event {

    // Encapsulation: atribut dibuat private
    private String namaEvent;
    private String tanggal;

    // Constructor
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

    // Method untuk menampilkan data event
    public void tampilData() {
        System.out.println("Nama Event : " + namaEvent);
        System.out.println("Tanggal    : " + tanggal);
    }
}