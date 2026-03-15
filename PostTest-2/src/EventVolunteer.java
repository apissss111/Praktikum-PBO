import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<EventVolunteer> dataEvent = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int pilihan;

        do {
            System.out.println("\n=== SISTEM EVENT VOLUNTEER ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Exit");
            System.out.print("Pilih Menu : ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    tambahData();
                    break;

                case 2:
                    lihatData();
                    break;

                case 3:
                    updateData();
                    break;

                case 4:
                    hapusData();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak ada");
            }

        } while (pilihan != 5);
    }

    static void tambahData() {

        System.out.print("Nama Event : ");
        String event = input.nextLine();

        System.out.print("Nama Volunteer : ");
        String volunteer = input.nextLine();

        System.out.print("Tugas : ");
        String tugas = input.nextLine();

        System.out.print("Tanggal : ");
        String tanggal = input.nextLine();

        EventVolunteer ev = new EventVolunteer(event, volunteer, tugas, tanggal);

        dataEvent.add(ev);

        System.out.println("Data berhasil ditambahkan");
    }

    static void lihatData() {

        if (dataEvent.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {

            for (int i = 0; i < dataEvent.size(); i++) {

                System.out.println("\nData ke-" + (i + 1));

                System.out.println("Nama Event : " + dataEvent.get(i).getNamaEvent());
                System.out.println("Volunteer  : " + dataEvent.get(i).getNamaVolunteer());
                System.out.println("Tugas      : " + dataEvent.get(i).getTugas());
                System.out.println("Tanggal    : " + dataEvent.get(i).getTanggal());

            }

        }
    }

    static void updateData() {

        lihatData();

        System.out.print("Pilih nomor data yang diupdate : ");
        int index = input.nextInt();
        input.nextLine();

        System.out.print("Nama Event baru : ");
        dataEvent.get(index - 1).setNamaEvent(input.nextLine());

        System.out.print("Nama Volunteer baru : ");
        dataEvent.get(index - 1).setNamaVolunteer(input.nextLine());

        System.out.print("Tugas baru : ");
        dataEvent.get(index - 1).setTugas(input.nextLine());

        System.out.print("Tanggal baru : ");
        dataEvent.get(index - 1).setTanggal(input.nextLine());

        System.out.println("Data berhasil diupdate");
    }

    static void hapusData() {

        lihatData();

        System.out.print("Pilih nomor data yang dihapus : ");
        int index = input.nextInt();

        dataEvent.remove(index - 1);

        System.out.println("Data berhasil dihapus");
    }
}