// Child Class
// Inheritance: EventSponsor juga mewarisi class Event

public class EventSponsor extends Event {

    // Encapsulation
    private String namaSponsor;
    private String jumlahDana;

    // Constructor
    public EventSponsor(String namaEvent, String namaSponsor, String jumlahDana, String tanggal) {

        // Inheritance: memanggil constructor parent class
        super(namaEvent, tanggal);

        this.namaSponsor = namaSponsor;
        this.jumlahDana = jumlahDana;
    }

    // Getter
    public String getNamaSponsor() {
        return namaSponsor;
    }

    public String getJumlahDana() {
        return jumlahDana;
    }

    // Setter
    public void setNamaSponsor(String namaSponsor) {
        this.namaSponsor = namaSponsor;
    }

    public void setJumlahDana(String jumlahDana) {
        this.jumlahDana = jumlahDana;
    }

    // Method menampilkan data sponsor
    public void tampilData() {

        // Inheritance: memanggil method parent class
        super.tampilData();

        System.out.println("Sponsor    : " + namaSponsor);
        System.out.println("Dana       : " + jumlahDana);
    }
}