// Parent Class (Abstract)
// Class dasar untuk semua jenis event

public abstract class Event {

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

    // Method biasa
    public void tampilData() {
        System.out.println("Nama Event : " + namaEvent);
        System.out.println("Tanggal    : " + tanggal);
    }

    // Overloading (tetap ada)
    public void tampilData(boolean singkat) {
        if (singkat) {
            System.out.println(namaEvent + " - " + tanggal);
        } else {
            tampilData();
        }
    }

    // Abstract method (WAJIB dioverride)
    public abstract String getInfo();
}