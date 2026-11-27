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
        println("\n=== TP6_MiniProject_Brandon ===")
        println("1. Lihat Tugas")
        println("2. Tambah Tugas")
        println("0. Keluar")
        print("Pilih: ")

        when (readLine()?.trim()) {
            "1" -> tampilkanTugas(tugas)
            "2" -> {
                print("Judul tugas: ")
                val judul = readLine()?.trim().orEmpty()
                if (judul.isNotEmpty()) {
                    tugas.add(judul)
                    println("Ditambahkan.")
                } else {
                    println("Judul tidak boleh kosong.")
                }
            }
            "0" -> return
            else -> println("Pilihan tidak valid.")
        }
    }
}