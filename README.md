# TP6_MiniProject_Brandon - Agenda Tugas Siswa

## Latar Belakang dan Masalah
Siswa sering kesulitan mencatat daftar tugas sekolah secara rapi dan memantau status penyelesaian tugas. Proyek ini menyediakan aplikasi konsol berbasis Kotlin untuk mengelola agenda tugas sekaligus melatih alur kerja Git dan GitHub.

## Pengguna dan Tujuan
- **Pengguna Utama:** Siswa.
- **Tujuan:** Mencatat, menampilkan, mencari, mengubah status, menghapus, melihat statistik, dan menyimpan data tugas melalui antarmuka konsol serta menerapkan commit bertahap dan branching di Git.

## Fitur Utama
1. Tambah tugas baru (validasi ID tidak kosong/duplikat dan judul tidak kosong).
2. Tampilkan seluruh daftar tugas beserta nomor, ID, judul, dan status (`Belum` / `Selesai`).
3. Cari tugas berdasarkan ID.
4. Ubah status penyelesaian tugas (`Belum` <-> `Selesai`).
5. Simpan dan muat otomatis data tugas ke berkas `agenda_tugas_tp6.txt`.
6. Hapus tugas berdasarkan ID (fitur branch `fitur-hapus-tugas`).
7. Tampilkan statistik jumlah total, selesai, dan belum selesai (fitur branch `fitur-statistik`).

## Teknologi dan Struktur Berkas
- **Bahasa & IDE:** Kotlin, IntelliJ IDEA, Git, GitHub.
- **Struktur Berkas:**
    - `src/Model.kt`: `data class Tugas(val id, val judul, var selesai)`.
    - `src/TugasService.kt`: logika CRUD/kelola daftar tugas (`tambah`, `tampilkan`, `cari`, `ubahStatus`, `hapus`, `tampilkanStatistik`).
    - `src/Penyimpanan.kt`: baca/tulis data (`muat`, `simpan`) ke berkas teks.
    - `src/Main.kt`: menu utama interaktif konsol.
    - `README.md` & `.gitignore`: dokumentasi proyek dan aturan pengabaian berkas build/IDE.

## Cara Menjalankan
1. Buka proyek `TP6_MiniProject_Brandon` di IntelliJ IDEA.
2. Jalankan fungsi `main()` pada `src/Main.kt` (klik ikon Run atau tekan `Shift + F10`).
3. Pilih menu sesuai angka yang tersedia di konsol.

## Contoh Penggunaan atau Output
```text
=== AGENDA TUGAS ===
1. Tambah tugas
2. Tampilkan tugas
3. Cari tugas
4. Ubah status
5. Simpan data
6. Hapus tugas
7. Statistik tugas
0. Keluar
Pilihan: 1
ID tugas: T01
Judul tugas: Latihan Git Kotlin
Tugas ditambahkan