// Child Class
// Inheritance + Interface

public class EventSponsor extends Event implements EventAksi {

    private String namaSponsor;
    private String jumlahDana;
    private String catatan;

    public EventSponsor(String namaEvent, String namaSponsor, String jumlahDana, String tanggal) {
        super(namaEvent, tanggal);
        this.namaSponsor = namaSponsor;
        this.jumlahDana = jumlahDana;
        this.catatan = "-";
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

    // Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Sponsor    : " + namaSponsor);
        System.out.println("Dana       : " + jumlahDana);
    }

    // Override abstract method
    public String getInfo() {
        return "Event Sponsor";
    }

    // Overloading
    public void tampilData(int pajak) {
        tampilData();
        int sisa = Integer.parseInt(jumlahDana) - pajak;
        System.out.println("Dana setelah pajak : " + sisa);
    }

    // Implement interface
    public void tambahCatatan(String catatan) {
        this.catatan = catatan;
    }

    public void tampilAksi() {
        System.out.println("Catatan Sponsor : " + catatan);
    }
}