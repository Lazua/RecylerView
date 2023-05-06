package com.praktek.recylerview

class HeroesData {
    public val data = arrayOf(
        arrayOf(
            "Ahmad Dahlan",
            """
    Salah seorang ulama dan khatib terkemuka di Masjid
    Besar Kasultanan Yogyakarta pada masa itu, dan ibu dari K.H.
    Ahmad Dahlan adalah puteri dari H. Ibrahim yang juga menjabat
    penghulu Kesultanan Ngayogyakarta Hadiningrat pada masa itu. KH.
    Ahmad Dahlan telah mempelopori kebangkitan ummat Islam untuk
    menyadari nasibnya sebagai bangsa terjajah yang masih harus
    belajar dan berbuat,
            """.trimIndent(),
            R.drawable.dahlan
        ),
        arrayOf(
            "Ahmad Yani",
            """
                Jenderal TNI Anumerta Ahmad Yani (juga dieja
                Achmad Yani; lahir di Purworejo, Jawa Tengah, 19 Juni 1922 –
                meninggal di Lubang Buaya, Jakarta, 1 Oktober 1965 pada umur 43
                tahun) adalah komandan Tentara Nasional Indonesia Angkatan
                Darat, dan dibunuh oleh anggota Gerakan 30 September saat
                mencoba untuk menculik dia dari rumahnya.
                """.trimIndent(),
            R.drawable.ahmad
        ),
        arrayOf(
          "Sutomo",
            """
                Sutomo (lahir di Surabaya, Jawa Timur, 3 Oktober
                1920 – meninggal di Padang Arafah, Arab Saudi, 7 Oktober 1981
                pada umur 61 tahun) lebih dikenal dengan sapaan akrab oleh
                rakyat sebagai Bung Tomo, adalah pahlawan yang terkenal karena
                peranannya dalam membangkitkan semangat rakyat untuk melawan
                kembalinya penjajah Belanda melalui tentara NICA, yang berakhir
                dengan pertempuran 10 November 1945 yang hingga kini diperingati
                sebagai Hari Pahlawan.
            """.trimIndent(),
            R.drawable.bungtomo
        ),
    )
        val listData: ArrayList<Hero>
            get(){
                val list = arrayListOf<Hero>()
                for (aData in data){
                    val hero = Hero()
                    hero.name = aData[0] as String
                    hero.from = aData[1] as String
                    hero.photo = aData[2] as Int

                    list.add(hero)
                }
                return list
            }
}