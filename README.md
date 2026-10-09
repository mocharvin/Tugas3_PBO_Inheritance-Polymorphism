# Tugas3_PBO_Inheritance-Polymorphism
Membuat sistem yang memanfaatkan sistem pewarisan/inheritance dan polimorpisme

### 1. Encapsulation (Enkapsulasi)
Penyembunyian data internal class menggunakan modifier akses `private` atau `protected`, serta menyediakan metode akses (*accessor* `get...`) dan mutator (*mutator* `set...`).
* **`Bentuk.java`**: Variabel `warna` menggunakan akses `protected` serta dilengkapi metode `getWarna()` dan `setWarna()`.
* **`Lingkaran.java`**: Variabel `radius` bersifat `private` dan diakses melalui metode `getRadius()` serta `setRadius()`.
* **`Silinder.java`**: Variabel `tinggi` bersifat `private` dan dikelola melalui metode `getTinggi()` serta `setTinggi()`.

### 2. Inheritance (Pewarisan)
Mekanisme di mana sebuah class dapat mewarisi atribut dan metode dari class lain menggunakan kata kunci `extends` dan `super`:
* **`Lingkaran` mewarisi `Bentuk`**: `public class Lingkaran extends Bentuk`
* **`Silinder` mewarisi `Lingkaran`**: `public class Silinder extends Lingkaran`
* Pemanggilan konstruktor induk menggunakan `super()` dilakukan di class `Lingkaran` dan `Silinder`.

### 3. Polymorphism (Polimorfisme)
Kemampuan suatu objek untuk mengambil banyak bentuk, diimplementasikan melalui *Method Overriding* pada fungsi `printInfo()`:
* Method `printInfo()` didefinisikan di `Bentuk`, lalu di-*override* secara spesifik di class `Lingkaran` dan `Silinder` untuk menampilkan informasi beserta hasil perhitungan luas dan volume masing-masing.

---

## 📂 Struktur File
* **`Bentuk.java`**: Superclass dasar yang merepresentasikan bentuk dengan properti warna.
* **`Lingkaran.java`**: Subclass dari `Bentuk` yang menambahkan properti radius serta rumus perhitungan luas.
* **`Silinder.java`**: Subclass dari `Lingkaran` yang menambahkan properti tinggi serta rumus perhitungan volume.
* **`BentukMain.java`**: Kelas utama (*entry point*) yang menjalankan program interaktif menggunakan `Scanner`.
