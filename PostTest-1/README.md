# Sistem Jasa Pengelolaan Event Volunteer

## Deskripsi Program
Program ini dibuat menggunakan bahasa Java untuk mengelola data volunteer pada sebuah event.
Program menggunakan konsep CRUD (Create, Read, Update, Delete) dengan struktur data ArrayList.

## Fitur Program
Program memiliki beberapa fitur utama yaitu:

1. Create (Tambah Data)
   Menambahkan data event dan volunteer.

2. Read (Lihat Data)
   Menampilkan semua data volunteer yang tersimpan.

3. Update (Ubah Data)
   Mengubah data volunteer yang sudah ada.

4. Delete (Hapus Data)
   Menghapus data volunteer dari daftar.

5. Exit
   Keluar dari program.

## Struktur Program
Program terdiri dari dua class:

- EventVolunteer.java  
  Class yang menyimpan atribut data event.

- Main.java  
  Class utama yang menjalankan program dan menu.

## Struktur Data
Program menggunakan ArrayList untuk menyimpan data volunteer.

Contoh deklarasi:

```java
ArrayList<EventVolunteer> dataEvent = new ArrayList<>();
