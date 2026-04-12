# Posttest OOP - Polymorphism

## Deskripsi
Pada posttest ini, program dari posttest sebelumnya tidak diubah strukturnya, tetapi dikembangkan dengan menambahkan konsep polymorphism.

Semua konsep sebelumnya seperti encapsulation dan inheritance tetap dipertahankan, lalu ditambahkan beberapa method baru untuk memenuhi kebutuhan polymorphism.

---

## Penerapan Polymorphism

### 1. Method Overriding
Overriding dilakukan pada method yang sudah ada di class induk, lalu diubah implementasinya di class turunan.

Method yang dioverride:
- tampilData()
- getInfo()

Setiap class turunan memiliki output yang berbeda sesuai dengan jenis event, sehingga lebih spesifik.

---

### 2. Method Overloading
Overloading dilakukan dengan membuat beberapa method dengan nama yang sama tetapi parameter berbeda.

Contoh yang digunakan:
- tampilData(boolean singkat) → untuk tampilan ringkas
- tampilData(String catatan) → tambahan informasi pada volunteer
- tampilData(int pajak) → perhitungan dana sponsor

Penggunaan overloading ini dibuat menyesuaikan kebutuhan masing-masing data, jadi tidak sekadar ditambahkan tanpa fungsi.

---

## Hasil
Dengan adanya polymorphism:
- Program menjadi lebih fleksibel
- Method yang sama bisa digunakan dengan cara yang berbeda
- Output menyesuaikan jenis object yang digunakan

---

## Catatan
Perubahan pada posttest ini hanya berfokus pada penambahan polymorphism tanpa mengubah alur utama program yang sudah dibuat sebelumnya.