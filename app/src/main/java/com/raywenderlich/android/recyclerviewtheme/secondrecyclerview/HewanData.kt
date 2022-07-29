package com.raywenderlich.android.recyclerviewtheme.secondrecyclerview

object HewanData {
    private val hewan = arrayOf(
        "Kadal",
        "Anjing",
        "Kucing",
        "Kuda",
        "Kelinci",
        "Kura-Kura",
        "Ikan Koi",
    )

    private val photo = arrayOf(
        "https://www.kelaspintar.id/blog/wp-content/uploads/2021/08/organ-gerak-kadal.jpg",
        "https://cdn1-production-images-kly.akamaized.net/0er64o6xK6AUw3vjihjKnP2wWi4=/1200x900/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2750780/original/017120500_1552534602-FOTO_HL_ANJING.jpg",
        "https://cdn0-production-images-kly.akamaized.net/5-XoEVod_kt0xPYm8J3LRlvEF_o=/1200x1200/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/4010304/original/021811300_1651156271-alena-ganzhela-_OLiar50J-A-unsplash.jpg",
        "https://cdn1-production-images-kly.akamaized.net/Exc3l4koQyd5Pp5xHFNh5L4y0Jc=/1200x675/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/3393817/original/037871600_1614928316-kuda2021.jpg",
        "https://gdmagri.com/wp-content/uploads/2021/11/harga-kelinci-hias.jpg",
        "https://cdn0-production-images-kly.akamaized.net/O-kmDT_wrPq0hF7kMmnK3qYz7zc=/1200x900/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2754838/original/025831800_1552967445-kura-kura.jpg",
        "https://asset.kompas.com/crops/TfsdoUGpyku92wF_KVR9qzxxZ7s=/192x128:1728x1152/750x500/data/photo/2021/09/19/6146d38a84f98.jpg",
    )

    val listData:ArrayList<Hewan>
        get() {
            val list = arrayListOf<Hewan>()
            for (position in hewan.indices){
                val experience = Hewan(
                    name = hewan[position],
                    photo = photo[position]
                )
                list.add(experience)
            }
            return list
        }

}