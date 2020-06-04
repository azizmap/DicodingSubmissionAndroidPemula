package com.digitalsoftware.topdestination

object DestinationsData {
    private val destiNames = arrayOf("Borobudur", "Pulau Komodo", "Raja Ampat", "Puncak", "Tana Toraja", "Taman Mini Indonesia", "Danau Toba", "Gunung Bromo", "Pulau Belitung", "Pantai Kuta")

    private val destiLocs = arrayOf("Jogjakarta", "Nusa Tenggara Timur", "Papua Barat", "Bogor", "Sulawesi Selatan", "Jakarta", "Medan", "Malang", "Bangka Belitung", "Bali")

    private val destiDetails = arrayOf("Candi Borobudur merupakan kompleks candi Buddha terbesar di dunia. Tempat wisata di Indonesia ini ditetapkan UNESCO sebagai salah satu situs warisan dunia pada tahun 1991. Candi Borobudur sempat terkubur abu vulkanik dari letusan Gunung Merapi, sampai kemudian ditemukan oleh Sir Thomas Stamford Raffles di tahun 1814.",
        "Pulau Komodo masuk dalam kawasan Taman Nasional Komodo bersama pulau-pulau lain di sekitar Kepulauan Nusa Tenggara. Pada tahun 1986, UNESCO menetapkan tempat wisata di Indonesia ini sebagai salah satu situs warisan dunia. Pulau ini dianggap sebagai habitat binatang komodo yang wajib dilindungi. Salah satu penghargaan tertinggi yang berhasil diraih adalah berhasil masuk dalam jajaran tujuh kejaiban alam di dunia atau yang lebih dikenal dengan New Seven Wonders of Nature pada tahun 2011. ",
        "Kekayaan alam bawah laut Raja Ampat tak perlu diragukan lagi. Perairan di tempat wisata ini dikenal sebagai salah satu lokasi menyelam dan snorkeling terbaik di dunia. Bahkan The Nature Conservancy menyebut bahwa sekitar 75% biota laut dunia dapat ditemukan di perairan Raja Ampat. Untuk membuktikannya, silakan siapkan perlengakapan menyelam Anda dan mulailah menjelajahi alam bawah lautnya. Bulan Oktober dan November disebut sebagai waktu yang terbaik untuk menyelam di sini karena cuaca dan kondisi perairan sangat ideal. ",
        "Daerah Puncak memiliki kontur alam yang unik. Hampir sebagian besar wilayah ini diselimuti perkebunan teh dengan latar belakang pegunungan. Keindahan alam daerah ini memukau Presiden Soekarno, sehingga ia membangun sebuah restoran untuk menikmati keindahan alam Puncak, yang kemudian diberi nama Restoran Riung Gunung. Selain itu, terdapat juga tempat-tempat rekreasi dan agrowisata yang indah, antara lain Perkebunan Teh Gunung Mas dan Gantole (Paralayang). Di daerah Puncak juga terdapat berbagai tempat wisata menarik di antaranya Taman Safari Indonesia, Taman Bunga Nusantara, Kebun Raya Cibodas, Telaga Warna, Taman Wisata Matahari dan terdapat sebuah masjid yang indah dengan arsitektur yang khas dan sederhana yaitu Masjid Atta'awun.",
        "Tana Toraja memiliki keindahan alam yang luar biasa mulai dari deretan pegunungan dan hijau perbukitannya. Selain kaya akan alamnya, tempat wisata d Indonesia ini juga kaya akan budaya leluhur yang masih dijaga sampai saat ini. Di sini, ada banyak tradisi kuno yang masih dipertahankan, salah satunya adalah Rambu Solo’.",
        "Jika biasanya Anda bisa mengunjungi sebuah museum untuk lebih mengenal kebudayaan suatu daerah, kali ini Anda bisa mengunjungi Taman Mini Indonesia Indah sebagai sebuah museum raksasa untuk mengenal kebudayaan Indonesia. Sesuai dengan namanya, tempat wisata di Indonesia yang digagas oleh Tien Soeharto ini menjadi tempat untuk melihat kebudayaan Indonesia dalam versi mini. ",
        "Danau Toba adalah danau alami berukuran besar di Indonesia yang berada di kaldera Gunung Supervulkan. Danau ini memiliki panjang 100 kilometer (62 mil), lebar 30 kilometer (19 mi), dan kedalaman 1600 meter (5200 ft). Danau ini terletak di tengah pulau Sumatra bagian utara dengan ketinggian permukaan sekitar 900 meter (2953 ft). Danau ini membentang dari 2.88°N 98.52°E sampai 2.35°N 99.1°E. Ini adalah danau terbesar di Indonesia dan danau vulkanik terbesar di dunia.",
        "Gunung Bromo selama ini memang menyimpan pemandangan alam yang sangat indah. Kamu akan temukan pesona bukit teletubbies yang menawan, hamparan lautan pasir yang sempurna, dan beberapa kawah yang ciamik. Di kawasan sekitar Gunung Bromo, kamu pun bisa berinteraksi dengan suku asli yang ada disana. Suku tersebut adalah Suku Tengger yang masih memiliki hubungan kerabat dengan kerajaan majapahit.",
        "Ciri khas pantai di Kepulauan Belitung adalah batu granit raksasa yang tersebar di segala penjuru. Air laut yang biru jernih, pasir putih, dan pepohonan kelapa di bibir pantai adalah kombinasi sempurna untuk ciptakan momen liburan tak terlupakan. Nama Belitung makin populer sejak munculnya novel “Laskar Pelangi” karya Andrea Hirata. Pulau yang terkenal sebagai penghasil timah ini menawarkan surga wisata yang dijamin akan membuatmu terpukau.",
        "Pantai Kuta adalah sebuah tempat pariwisata yang terletak kecamatan Kuta, sebelah selatan Kota Denpasar, Bali, Indonesia. Daerah ini merupakan sebuah tujuan wisata turis mancanegara dan telah menjadi objek wisata andalan Pulau Bali sejak awal tahun 1970-an. Pantai Kuta sering pula disebut sebagai pantai matahari terbenam (sunset beach) sebagai lawan dari pantai Sanur. Selain itu, Lapangan Udara I Gusti Ngurah Rai terletak tidak jauh dari Kuta."
    )
    private val destiImages = intArrayOf(R.drawable.borobudur,
        R.drawable.komodo,
        R.drawable.rajampat,
        R.drawable.puncak,
        R.drawable.toraja,
        R.drawable.tmii,
        R.drawable.toba,
        R.drawable.bromo,
        R.drawable.belitung,
        R.drawable.kuta)

    val listData: ArrayList<Destination>
        get() {
            val list = arrayListOf<Destination>()
            for (position in destiNames.indices){
                val destination = Destination()
                destination.name = destiNames[position]
                destination.loc = destiLocs[position]
                destination.detail = destiDetails[position]
                destination.photo = destiImages[position]
                list.add(destination)
            }
            return list
        }
}