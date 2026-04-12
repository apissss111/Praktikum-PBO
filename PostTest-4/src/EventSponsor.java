// Child Class
// Inheritance: EventSponsor juga mewarisi class Event

public class EventSponsor extends Event {

    private String namaSponsor;
    private String jumlahDana;

    // Constructor
    public EventSponsor(String namaEvent, String namaSponsor, String jumlahDana, String tanggal) {
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

    // Override method tampilData
    public void tampilData() {
        super.tampilData();
        System.out.println("Sponsor    : " + namaSponsor);
        System.out.println("Dana       : " + jumlahDana);
    }

    // Override method getInfo
    public String getInfo() {
        return "Event Sponsor";
    }

    // Overloading method tampilData
    public void tampilData(int pajak) {
        tampilData();
        int sisa = Integer.parseInt(jumlahDana) - pajak;
        System.out.println("Dana setelah pajak : " + sisa);
    }
}