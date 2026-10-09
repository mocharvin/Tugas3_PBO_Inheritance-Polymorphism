# Tugas 3 PBO Inheritance & Polymorphism
Membuat sistem yang memanfaatkan sistem pewarisan/inheritance dan polimorpisme

### 1. Encapsulation (Enkapsulasi)
Penyembunyian data internal class menggunakan modifier akses `private` atau `protected`, serta menyediakan metode akses (*accessor* `get...`) dan mutator (*mutator* `set...`).
* **`Bentuk.java`**: Variabel `warna` menggunakan akses `protected` serta dilengkapi metode `getWarna()` dan `setWarna()`.
<div align="center">
<img width="200" height="65" alt="image" src="https://github.com/user-attachments/assets/faab6522-446b-410a-9346-24c7fd7bfd3c" />
<img width="270" height="183" alt="image" src="https://github.com/user-attachments/assets/08cdd0a4-7758-4cac-ad26-0ee45e468cca" />
</div>

* **`Lingkaran.java`**: Variabel `radius` bersifat `private` dan diakses melalui metode `getRadius()` serta `setRadius()`.
<div align="center">
<img width="306" height="69" alt="image" src="https://github.com/user-attachments/assets/64953dbb-24fe-4441-8046-8d495ba63c5b" />
<img width="243" height="187" alt="image" src="https://github.com/user-attachments/assets/4e74edaf-83ad-496f-b02a-ce3e8620a41a" />
</div>

* **`Silinder.java`**: Variabel `tinggi` bersifat `private` dan dikelola melalui metode `getTinggi()` serta `setTinggi()`.
<div align="center">
<img width="288" height="55" alt="image" src="https://github.com/user-attachments/assets/f20e9e46-0f28-45cd-b40f-be4c4ad1ca47" />
<img width="249" height="176" alt="image" src="https://github.com/user-attachments/assets/f1c557ca-5a90-47cb-a8fb-a57ecde431ca" />
</div>


### 2. Inheritance (Pewarisan)
Mekanisme di mana sebuah class dapat mewarisi atribut dan metode dari class lain menggunakan kata kunci `extends` dan `super`:
* **`Lingkaran` mewarisi `Bentuk`**: `public class Lingkaran extends Bentuk`
<div align="center">
<img width="358" height="29" alt="image" src="https://github.com/user-attachments/assets/1e0b9799-d0a0-491f-b8c6-adb5c2f7a696" />
</div>

* **`Silinder` mewarisi `Lingkaran`**: `public class Silinder extends Lingkaran`
<div align="center">
<img width="353" height="23" alt="image" src="https://github.com/user-attachments/assets/20ec42c9-1f2d-4895-9b2f-5dc000514969" />
</div>

* Pemanggilan konstruktor induk menggunakan `super()` dilakukan di class `Lingkaran` dan `Silinder`.
<div align="center">
<img width="475" height="83" alt="image" src="https://github.com/user-attachments/assets/69d30665-94fa-4c87-8d74-4952e77313cb" />
<img width="536" height="80" alt="image" src="https://github.com/user-attachments/assets/8df12a9e-6607-45c4-9f75-288522bb4216" />
</div>

### 3. Polymorphism (Polimorfisme)
Kemampuan suatu objek untuk mengambil banyak bentuk, diimplementasikan melalui *Method Overriding* pada fungsi `printInfo()`:
* Method `printInfo()` didefinisikan di `Bentuk`, lalu di-*override* secara spesifik di class `Lingkaran` dan `Silinder` untuk menampilkan informasi beserta hasil perhitungan luas dan volume masing-masing.
<div align="center">
<img width="537" height="102" alt="image" src="https://github.com/user-attachments/assets/9b18879e-2ed2-48e7-8260-aa7a9b30f663" />
<img width="588" height="103" alt="image" src="https://github.com/user-attachments/assets/1c1bd2a2-5a46-4f94-be16-dc9680c494b4" />
</div>

---

## 📂 Struktur File
* **`Bentuk.java`**: Superclass dasar yang merepresentasikan bentuk dengan properti warna.
* **`Lingkaran.java`**: Subclass dari `Bentuk` yang menambahkan properti radius serta rumus perhitungan luas.
* **`Silinder.java`**: Subclass dari `Lingkaran` yang menambahkan properti tinggi serta rumus perhitungan volume.
* **`BentukMain.java`**: Kelas utama (*entry point*) yang menjalankan program interaktif menggunakan `Scanner`.
