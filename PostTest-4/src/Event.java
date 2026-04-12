// Parent Class
// Class dasar untuk semua jenis event

public class Event {

    // Encapsulation
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

    // Method menampilkan data
    public void tampilData() {
        System.out.println("Nama Event : " + namaEvent);
        System.out.println("Tanggal    : " + tanggal);
    }

    // Overloading method tampilData
    public void tampilData(boolean singkat) {
        if (singkat) {
            System.out.println(namaEvent + " - " + tanggal);
        } else {
            tampilData();
        }
    }

    // Method untuk override
    public String getInfo() {
        return "Event umum";
    }
}