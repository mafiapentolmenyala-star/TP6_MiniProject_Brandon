fun tampilkanTugas(tugas: List<String>) {
    if (tugas.isEmpty()) {
        println("Belum ada tugas.")
    } else {
        for ((i, item) in tugas.withIndex()) {
            println("${i + 1}. $item")
        }
    }
}

fun main() {
    val tugas = mutableListOf("Setup Git & commit awal", "Push ke GitHub")

    while (true) {
        println("\n=== TP6_MiniProject_Brandon (Total: ${tugas.size}) ===")
        println("1. Lihat Tugas")
        println("2. Tambah Tugas")
        println("3. Selesaikan / Hapus Tugas")
        println("0. Keluar")
        print("Pilih (angka): ")

        when (readLine()?.trim()?.toIntOrNull()) {
            1 -> tampilkanTugas(tugas)
            2 -> {
                print("Judul tugas: ")
                val judul = readLine()?.trim().orEmpty()
                if (judul.isNotEmpty()) {
                    tugas.add(judul)
                    println("Ditambahkan.")
                } else {
                    println("Judul tidak boleh kosong.")
                }
            }
            3 -> {
                tampilkanTugas(tugas)
                print("Nomor tugas yang selesai: ")
                val idx = readLine()?.trim()?.toIntOrNull()?.minus(1)
                if (idx != null && idx in tugas.indices) {
                    val dihapus = tugas.removeAt(idx)
                    println("Selesai: $dihapus")
                } else {
                    println("Nomor tidak valid.")
                }
            }
            0 -> return
            else -> println("Masukkan angka 1, 2, 3, atau 0.")
        }
    }
}