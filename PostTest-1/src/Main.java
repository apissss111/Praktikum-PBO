import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<EventVolunteer> dataEvent = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n=== SISTEM JASA PENGELOLAAN EVENT VOLUNTEER ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;

                case 2:
                    tampilData();
                    break;

                case 3:
                    updateData();
                    break;

                case 4:
                    hapusData();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilihan != 5);
    }

    static void tambahData() {
        System.out.print("Nama Event: ");
        String event = input.nextLine();

        System.out.print("Nama Volunteer: ");
        String volunteer = input.nextLine();

        System.out.print("Tugas: ");
        String tugas = input.nextLine();

        System.out.print("Tanggal: ");
        String tanggal = input.nextLine();

        dataEvent.add(new EventVolunteer(event, volunteer, tugas, tanggal));

        System.out.println("Data berhasil ditambahkan!");
    }

    static void tampilData() {

        if (dataEvent.isEmpty()) {
            System.out.println("Belum ada data.");
        } else {
            for (int i = 0; i < dataEvent.size(); i++) {
                System.out.println("Data ke-" + (i + 1));
                dataEvent.get(i).tampilData();
            }
        }
    }

    static void updateData() {

        tampilData();

        System.out.print("Pilih nomor data yang ingin diupdate: ");
        int index = input.nextInt();
        input.nextLine();

        System.out.print("Nama Event baru: ");
        dataEvent.get(index - 1).namaEvent = input.nextLine();

        System.out.print("Nama Volunteer baru: ");
        dataEvent.get(index - 1).namaVolunteer = input.nextLine();

        System.out.print("Tugas baru: ");
        dataEvent.get(index - 1).tugas = input.nextLine();

        System.out.print("Tanggal baru: ");
        dataEvent.get(index - 1).tanggal = input.nextLine();

        System.out.println("Data berhasil diupdate!");
    }

    static void hapusData() {

        tampilData();

        System.out.print("Pilih nomor data yang ingin dihapus: ");
        int index = input.nextInt();

        dataEvent.remove(index - 1);

        System.out.println("Data berhasil dihapus!");
    }
}