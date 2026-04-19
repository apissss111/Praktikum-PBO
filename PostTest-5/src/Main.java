import java.util.ArrayList;
import java.util.Scanner;

// Class utama untuk menjalankan program
public class Main {

    static ArrayList<Event> dataEvent = new ArrayList<>();

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {

            System.out.println("\n=== SISTEM EVENT ===");
            System.out.println("1. Tambah Volunteer");
            System.out.println("2. Tambah Sponsor");
            System.out.println("3. Lihat Data");
            System.out.println("4. Exit");
            System.out.print("Pilih menu : ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahVolunteer();
                    break;

                case 2:
                    tambahSponsor();
                    break;

                case 3:
                    tampilData();
                    break;

                case 4:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilihan != 4);
    }

    // Method menambah volunteer
    static void tambahVolunteer() {

        System.out.print("Nama Event : ");
        String event = input.nextLine();

        System.out.print("Tanggal : ");
        String tanggal = input.nextLine();

        System.out.print("Nama Volunteer : ");
        String volunteer = input.nextLine();

        System.out.print("Tugas : ");
        String tugas = input.nextLine();

        dataEvent.add(new EventVolunteer(event, volunteer, tugas, tanggal));

        System.out.println("Data volunteer berhasil ditambahkan!");
    }

    // Method menambah sponsor
    static void tambahSponsor() {

        System.out.print("Nama Event : ");
        String event = input.nextLine();

        System.out.print("Tanggal : ");
        String tanggal = input.nextLine();

        System.out.print("Nama Sponsor : ");
        String sponsor = input.nextLine();

        System.out.print("Jumlah Dana : ");
        String dana = input.nextLine();

        dataEvent.add(new EventSponsor(event, sponsor, dana, tanggal));

        System.out.println("Data sponsor berhasil ditambahkan!");
    }

    // Method menampilkan semua data
    static void tampilData() {

        if (dataEvent.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {

            for (int i = 0; i < dataEvent.size(); i++) {

                System.out.println("\nData ke-" + (i + 1));

                // Polymorphism: memanggil method sesuai object
                dataEvent.get(i).tampilData();

                // Override dari abstract method
                System.out.println("Jenis Event : " + dataEvent.get(i).getInfo());

                // Interface digunakan di sini
                if (dataEvent.get(i) instanceof EventAksi) {
                    ((EventAksi) dataEvent.get(i)).tampilAksi();
                }
            }
        }
    }
}