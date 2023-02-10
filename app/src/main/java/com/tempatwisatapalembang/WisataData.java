package com.tempatwisatapalembang;

import java.util.ArrayList;

public class WisataData
{
    private static String[] nameWisata =
            {
      "Air Batu", "Air Terjun Bedegung", "Kebun Teh Pagaralam", "Danau Ranau", "Al-Qur'an Al-Akbar",
      "Danau Opi Jakabaring", "Pulau Maspari", "Goa Putri Padang Bindu Baturaja", "Tangga 2001", "Air Terjun Bidadari"
    };

    private static int[] imageWisata = {
        R.drawable.danau_air_batu, R.drawable.air_terjun_bedegung, R.drawable.kebun_teh_pagaralam, R.drawable. danau_ranau, R.drawable. al_quran_al_akbar, R.drawable.danau_opi, R.drawable.pulau_maspari, R.drawable.goa_putri, R.drawable.tangga_2001, R.drawable.air_terjun_bidadari
    };

    private static String[] alamatWisata =
            {
                    "Jalan Sungai Rengit Desa Air Batu Kecamatan Talang Kelapa Kabupaten Musi Banyuasin", "Air Terjun Curup Tenang, Tj. Agung, Bedegung, Kec. Tj. Agung, Kabupaten Muara Enim, Sumatera Selatan 32157",
                    "Jl. Amat Ramui, Gn. Dempo, Kec. Pagar Alam Sel., Kota Pagar Alam, Sumatera Selatan 31581", "Danau Ranau, Jepara, Kec. Buay Pematang Ribu Ranau Tenga, Kabupaten Ogan Komering Ulu Selatan, Sumatera Selatan",
                    "Jl. Moh. Amin, Gandus, Kec. Gandus, Kota Palembang, Sumatera Selatan 30149", "OPI Water Fun Jakabaring, Sungai Kedukan, Kec. Rambutan, Kab. Banyuasin, Sumatera Selatan 30967",
                    "Pulau maspari, Simpang Tiga Jaya, Sumatera Selatan", "Padang Bindu, Semidang Aji, Suka Merindu, Kec. Semidang Aji, Kabupaten Ogan Komering Ulu, Sumatera Selatan 32155",
                    "Gn. Dempo, Kec. Pagar Alam Sel., Kota Pagar Alam, Sumatera Selatan 31581", "Jl. Letnan Alamsyah, Karang Dalam, Kec. Pulau Pinang, Kabupaten Lahat, Sumatera Selatan 31461"
            };

    private static String[] tarif =
            {
                    "Rp. 5000/orang", "Rp. 5000 (Hari Biasa) / Rp. 10000 - Rp. 25000 (Hari Libur)", "Rp. 5000 (Hari Biasa) / Rp. 10000 (Hari Libur)",
                    "Rp. 10000/orang", "Rp. 15000 (Anak - Anak) / Rp. 20000 (Dewasa)", "Rp. 5000 (Motor) / Rp. 10000 (Mobil) / Rp. 1000 (Orang)",
                    "Sungai Musi – Pulau Maspari (+- 6 jam) = Rp 2.500.000 (sekali jalan) / *Palembang – OKI (+-2 Jam)* <--> *OKI - Pulau Maspari (+- 4 jam)* = unknown",
                    "Rp. 5000 (Orang) / Rp. 10000 (Kendaraan)", "Free", "Free"
            };

    private static String[] jamOperasional = {
            "24 Jam", "06.00 - 18.00", "24 Jam", "08.00 – 17.00", "09.00 – 17.00", "05.30 – 23.00", "24 Jam", "08.00 – 16.00",
            "24 Jam", "08.00 – 16.00"
    };

    private static String[] rating = {
            "4.3/5", "4.5/5", "4.8/5", "4.5/5", "4.6/5", "4.2/5", "4.5/5", "4.5/5", "4.5/5", "4.9/5"
    };


    private static String[] desc = {
            /*1. Air Batu*/"Di Palembang Sumatera Selatan ada satu destinasi wisata yang layak untuk dikunjungi. Namanya adalah Danau Air Batu yang berada di Kecamatan Talang Kelapa Banyuasin Palembang. Tempat wisata ini dianggap bakal viral melihat jumlah pengunjung yang terus melonjak drastis. Apalagi dari segi destinasi, memang mengandung pesona yang artistik cocok dijadikan sebagai tempat untuk melepas penat.\n\n1. Warna Air Danau yang Eksotis\nKeistimewaan yang pertama adalah warna air Danau Air Batu sering berubah-ubah. Kadang berwarna hijau bahkan kadang berubah menjadi warna biru cerah. Hal ini disebabkan oleh pendaran cahaya matahari pada waktu-waktu tertentu yang di setiap waktu tersebut, bias cahayanya pasti berbeda.\nWarna air danau yang cerah, seakan kontras dengan batu karang hasil galian yang berwarna cokelat tua. Selain itu, warna hijau lumut dan tumbuhan di pinggir danau juga membuat pesona danau semakin eksotis.\n\n2. Guratan Relief Pada Batuan Dipinggir Danau\nKeistimewaan berikutnya adalah guratan batu yang memagari danau, juga terkesan eksotis. Sekalipun bukan alami tetapi hasil kerja manusia, tetapi rautannya yang halus dan desain yang kreatif, membuat tampilannya tidak kalah dengan batu karang yang alami.\nMaka dari itu, jika ada di sini seakan sedang di pinggir Pantai di Bali yang dipenuhi dengan karang-karang yang terjal. Tentunya wajar kalau Danau Air Batu disebut ikon wisata Palembang.\n\n3. Banyak Spot Foto Alami\nDanau Air Batu memang bukan wisata alami dan natural melainkan buatan manusia. Akan tetapi, seiring bertambahnya waktu, ternyata banyak ditemukan spot-spot lokasi yang terlihat eksotis sekalipun tidak dihasilkan dari kreativitas manusia.Spot-spot foto inilah yang juga menjadi pesona danau sehingga banyak kawula muda datang ke tempat ini. Bahkan ada beberapa perusahaan foto pre-wedding yang menjadikan spot tersebut sebagai satu latar ketika memotret calon pengantin.",
            /*2. Air Terjun Bedegung*/"Berbeda halnya dengan Air Terjun Bedegung yang berada di Muara Enim, Sumatera Selatan. Meskipun memiliki ketinggian 99 meter sebagai salah-satu air terjun tertinggi, namun mampu diolah menjadi sebuah destinasi wisata keluarga.\n\n1. Legenda di Air Terjun Bedegung atau Curup Tenang\nDibalik keindahan Air Terjun Bedegung Muara Enim, terdapat legenda seorang putri cantik yang enggan dinikahi oleh sang raja. Penolakan tersebut berujung pembunuhan terhadap sang putri cantik oleh sang raja. Nama Curup Tenang juga diambil dari nama lain putri tersebut.\n\n2. Ragam Aktivitas di Air Terjun Bedegung atau Curup Tenang\nTerdapat berbagai macam wisata atau ragam aktivitas yang bisa dilakukan oleh para pengunjung saat berada di lokasi wisata tersebut, diantaranya :\n\n-Bermain Air\nBagi anda yang tidak bisa berenang, cukup bermain air saja di titik aliran air yang tidak terlalu dalam diantara bebatuan.\n\n-Berenang\nTerdapat titik yang bisa dipakai untuk mereka yang sudah pandai berenang. Airnya dingin dan menyejukan.\n\n-Hunting Foto\nBukan hanya pemandangan alamnya saja yang sangat mempesona, namun spot yang ada dilokasi wisata Air Terjun Bedegung sangat instagramable.\n\n-Hunting Kuliner\nDi sepanjang jalur tracking terdapat para penjajal makanan. Sehingga setelah lelah melakukan aktivitas wisata, para pengunjung bisa menikmati jajanan sambil duduk di gazebo.\n\n3. Tips Wisata Menuju Air Terjun Bedegung Muara Enim\nBagi anda dan keluarga yang mempunyai rencana berwisata ke Air Terjun Bedegung Muara Enim, maka inilah tips wisatanya :\n\n-Jika anda ingin bermain air bersama anak – anak, cukup bermain di lokasi aliran air yang ada di pinggiran, dan tidak dalam.\n\n-Berlibur ke sana pastikan di saat cuacanya mendukung. Supaya anda bersama keluarga dapat menikmati seluruh spot yang ada di sana.\n\n-Jangan membiarkan anak – anak anda luput dari pengawasan anda ya…\n\n-Patuhi protokol keamanan dan protokol kesehatan yang sudah ditetapkan oleh pihak pengelola dan pemerintah.\n\n-Jangan membuang sampah sembarangan, apalgi membuang sampah plastik ke aliran sungai.\n\n-Jangan lupa untuk membawa baju ganti, serta kamera.",
            /*3. Kebun Teh Pagaralam*/"Kebun teh Gunung Dempo adalah kebun teh yang terhampar di lereng Gunung Dempo. Luasnya kebun teh ini sekitar 1.523 Hektar di tahun 2020. Sebagian hasil dari Kebun Teh Pagaralam ini untuk kebutuhan dalam negeri. Dan sebagiannya lagi diekspor ke beberapa negara. Selain terkenal dengan teh hitamnya, Pagaralam juga merupakan salah satu penghasil kopi robusta. Kebun-kebun kopi biasanya berada di atas perkebunan teh dan di bawah kawasan hutan lindung. Di sini kamu akan menyaksikan bentangan alam yang sangat indah. Lereng gunung yang diselimuti oleh hijaunya kebun teh. Sebuah suasana yang jauh berbeda dibanding suasana kota besar. Cocok banget menjadi destinasi untuk melepas penat. Kamu bisa memilih banyak spot untuk berhenti menikmati view perkebunan. Karena, dengan berkendara di sepanjang jalan ke atas, kamu sudah disuguhi banyak view indah.",
            /*4. Danau Ranau*/"Danau Ranau dikenal oleh masyarakat Sumatera Selatan sebagai salah satu danau yang menjadi destinasi wisata favorit. Danau ini merupakan danau terbesar kedua setelah Danau Toba. Mendatangi wisata alam seperti danau sebagai pilihan destinasi berlibur kerap kali dilakukan untuk melepaskan penat dan lelah. Pasalnya, wisata danau memberikan sensasi berlibur yang menenangkan pikiran. Saat kita melihat pemandangan alam yang indah, maka hati dan pikiran akan lebih senang. Ditambah lagi, udara yang ada di wisata danau sangat sejuk dan segar. Inilah yang bisa membuat tubuh menjadi lebih rileks.\n\n1. Legenda Danau Ranau\nSeperti halnya tempat-tempat wisata alam lainnya yang ada di Indonesia, wisata Danau Ranau juga menyimpan sebuah legenda rakyat yang hingga kini masih dipercaya oleh masyarakat setempat. Danau Ranau yang memiliki luas sekitar 125,9 kilometer persegi ini terbentuk dari dampak gempa besar dan semburan vulkanik dari gunung berapi yang berada di sekitarnya. Ada sebuah legenda tentang terbentuknya Danau Ranau. Legenda ini dikenal masyarakat setempat dengan nama Cerita Si Pahit Lidah dan Si Mata Empat. Jadi pada zaman dahulu ada dua pendekar yang bernama Si Mata Empat dan Si Pahit Lidah yang sama-sama ingin membuktikan kepada masyarakat kalau dirinya yang terhebat. Keduanya bertarung dan tewas di bawah pohon aren tersebut. Setelah meninggalnya Si Pahit Lidah dan Si Mata Empat, di bawah pohon aren muncul sumber mata air. Di masa itu, masyarakat setempat sedang kesulitan mendapatkan air bersih. Sumber mata air tersebut menjadi semakin besar. Akhirnya, airnya membentuk sebuah danau yang dikenal dengan nama Danau Ranau.\n\n2. Daya Tarik Danau Ranau\n- Menikmati Pemandangan Eksotisnya\nDaya tarik dari wisata Danau Ranau sudah pasti pemandangan alamnya yang terlihat sangat eksotis. Danau ini memiliki air yang sangat biru seperti warna air laut. Lalu, di sekeliling danau terdapat perbukitan hijau yang sangat indah sehingga bisa menyegarkan mata dan menenangkan hati serta pikiran. Perpaduan warna biru danau dan hijaunya bukit akan terlihat lebih indah saat berpadu dengan birunya langit serta putihnya awan. Oleh karena itu, sangat penting untuk Moms datang ketika cuaca sedang cerah. Sebagian besar pengunjung yang berwisata ke Danau Ranau ini bertujuan untuk menikmati pemandangan alamnya.\n\n- Bermain Wahana Air\nKegiatan yang sering dilakukan ketika berkunjung ke wisata Danau Ranau adalah bermain wahana air, bisa berenang di tepian danau hingga naik perahu untuk mengelilingi danau. Kedalaman air di danau ini bisa mencapai 228 meter sehingga tidak diperbolehkan untuk berenang ke area tengah danau. Cukup bermain air di sekitar pinggiran danau saja ya ! Selain berenang, juga bisa melakukan permainan air lainnya seperti arung jeram saat arus di danau sedang kencang.\n\n- Bersantai Di Pemandian Air Panas\nJika ingin bersantai sambil melepas penat dan pegal-pegal pada tubuh, Moms bisa mendatangi pemandian air panas yang ada di kawasan wisata Danau Ranau ini. Lokasi tepatnya berada di kaki Gunung Seminung. Di pemandian air panas ini, Moms bisa berendam sambil melepas rasa pegal setelah lelah beraktivitas.\n\n- Mengunjungi Pulai Di Tengah Danau\nAda satu keunikan yang menjadi daya tarik dari wisata Danau Ranau, yakni adanya pulau yang terletak di tengah-tengah danau. Nama pulau ini adalah Pulau Marisa dan ada sumber air panas. Ketika perahu mendekat ke arah Pulau Marisa, maka akan terasa hawa panas atau uap panasnya dari dalam pulau. Pulau ini memang ukurannya kecil. Namun, bisa datangi dengan menyebrangi danau menggunakan perahu.\n\n- Datang Ke Air Terjun\nDi kawasan wisata Danau Ranau ternyata juga ada air terjunnya. Lokasi air terjunnya ini tak jauh dari pemandian air panas sehingga Moms cukup berjalan kaki saja menuju ke sana. Air terjun yang ada di dekat Danau Ranau adalah Air Terjun Subik Tuha yang memiliki ketinggian sekitar 25 meter dari atas tanah. Lebar dari air terjun ini sekitar 3 meter dengan debit air yang cenderung deras.\n\n- Berfoto Selfie\nDaya tarik dari tempat wisata alam ini adalah pemandangan alamnya yang indah. Oleh karena itu sangat cocok untuk menjadi background berfoto bersama keluarga. Meski tidak banyak instalasi foto khusus, tapi semua pemandangan di Danau Ranau yang asri bisa memberikan hasil background yang instagramable.",
            /*5. Alquran Al-akbar*/"Salah satu objek wisata religi di Kota Palembang yang sedang marak diperbincangkan, menarik perhatian dan rasa keingintahuan saya.\nObjek wisata itu adalah Bayt Alquran Al-Akbar atau yang lebih di kenal dengan Museum Al Quran Raksasa yang terletak di Pondok Pesantren Al Ihsaniyah di Jalan Mohammad Amin Fauzi, Soak Bujang RT.03, RW 01, Kelurahan Gandus, Kecamatan Gandus, Palembang Sumatera Selatan.\nBerada di dalam museum ini tak henti-hentinya saya mengucapkan kekaguman yang luar biasa, Alquran Raksasa yang diukir di atas kayu tembusa, yang terkenal kuat, tahan lama dan tidak mudah dimakan rayap. Diukir dengan pahatan timbul, dengan ornamen khas Palembang yang membuat semakin indah.\nAlquran ini keseluruhannya berjumlah 30 Jus yang terdiri dari 630 halaman dan dipajang sampai 5 lantai dengan ketinggian mencapai 15 meter dan lebar 8 meter, pantas saja disebut Alquran raksasa dan terbesar di dunia.\nLembaran Alquran inipun dapat diputar sehingga bisa dibaca semua dengan 2 sisi. Alquran tersebut dipahat di permukaan kayu berukuran panjang 177 cm dan lebar 140 cm dan ketebalan 2,5 cm.\nMuseum Alquran Raksasa resmi menjadi destinasi wisata religi di Palembang, setelah di resmikan oleh Presiden Susilo Bambang Yudoyono pada tanggal 30 Januari 2012.\nSelain bisa melihat dan mengagumi museum Alquran, kita juga bisa berbelanja beragam cinderamata khas palembang, seperti kain songket, batik dan pernak pernik khas Palembang. Selain itu kita bisa juga menikmati makanan khas Palembang yang banyak di jual di sekitar museum, seperti mpekmpek, mie celor, dan kue-kue khas Palembang.\nNamun menurut saya, kekurangan dari museum ini adalah masih kurang tertata rapi, selain itu udara di dalam ruangan sangat panas, tersedia kipas angin tetapi mungkin dengan banyaknya pengunjung saat itu, sehingga sirkulasi udara berkurang dan tidak ada guide untuk membantu para pengunjung.",
            /*6. Danau Opi Jakabaring*/"Tak lengkap rasanya ke Palembang tanpa singgah dan menikmati wisata air di Danau OPI, Jakabaring. Pada awalnya, Danau OPI ini dibuat oleh pemerintah Kota Palembang untuk kegiatan PON dalam olah raga dayung. Panjangnya sekitar 517 meter dan lebarnya 200 meter.\nTrek layar yang dibangun di Danau OPI ini akan menjadi wisata tersendiri nantinya ketika event olah raga internasional tersebut digelar. Tetapi saat ini, pengunjung tetap dapat menikmati keindahan Danau OPI meskipun belum ada pertandingan atau kompetisi olah raga yang digelar.\nDanau OPI adalah danau buatan, dan pembangunannya saat ini tidak bergantung dari APBD melainkan datang dari para investor. Kondisinya lebih jernih dan teratur, dengan tawaran kegiatan yang lebih banyak bisa dilakukan di Danau OPI.\nAnda bisa naik perahu berkeliling danau, naik sepeda air, perahu layar dan karet, banan boat, hingga mencoba naik jet ski. Jika lelah bermain olah raga air, deretan warung yang menawarkan pempek, jagung bakar dan es kelapa siap melayani anda.",
            /*7. Pulau Maspari*/"Sumsel juga ternyata memiliki pantai yang indah dan memiliki pesona yang tidak kalah dengan pantai lainnya di Indonesia. Adalah Pulau Maspari, pulau terluar di Sumsel ini mungkin baru satu-satunya pantai yang memiliki pasir putih di Sumsel. \nPulau Maspari yang terletak di wilayah Kecamatan Tulung Selapan, Kabupaten Ogan Komering Ilir (OKI) ini, masih sangat terasa alami dan tidak kalah dengan destinasi lainnya. Berbagai biota hayati ada di pulau ini termasuk di antaranya keberadaan Penyu. Bila beruntung, para pengunjung pulau ini dapat melihat dari dekat bagaimana puluhan induk penyu bertelur dengan membuat lubang di bibir pantai yang berpasir putih.\nUntuk menuju ke Pulau Maspari, wisatawan akan menempuh perjalanan darat dari Kota Palembang selama tiga jam ke Dermaga Tulung Selapan, OKI. Kemudian dilanjutkan dengan perjalanan menggunakan speedboat sekitar dua jam.\n\"Di Pulau Maspari ini merupakan tempat berkembang biaknya Penyu Sisik dan Penyu Hijau yang diketahui sudah sangat langka. Selain itu, juga terdapat sejumlah sumur, di mana airnya tawar. Padahal pulau ini letaknya di tengah laut,\" ucap Syamsuri.",
            /*8. Goa Putri Baturaja*/"Goa Putri merupakan Goa yang terletak di Desa Padang Bindu, Kecamatan Semindang Aji, Kabupaten Ogan Komering Ulu, Baturaja, Sumatera Selatan. Goa ini terletak sekitar satu kilometer yang menghubungkan Baturaja dan Muara Enim. Goa Putri ini menjadi salah satu ikon objek wisata yang diminati oleh para wisatawan dari dalam maupun luar negeri.\nGoa Putri mampu menciptakan keindahan dan nilai sejarah yang tidak boleh untuk dilewati. Goa ini memiliki kedalaman yang diperkirakan mencapai sekitar 150 meter, ketinggian sekitar 20 meter dan lebar 20-30 meter. Di Goa ini juga mengalir Sungai Sumuhun yang menurut ceritanya apabila kita mandi atau mencuci muka di aliran sungai ini, semua keinginan dapat terwujud. Menurut Legenda, jaman dahulu kala hiduplah seorang putri yang bernama Dayang Merindu, selir dari Prabu Amir Rasyid, Penguasa Kerajaan Ogan. Suatu pagi, sang Putri mandi di muara sungai Sumuhun dan pada saat mandi, lewatlah seorang pengembara bernama Serunting Sakti ingin sekali menyapa putri yang berparas cantik itu, tapi kehadirannya tidak diperhatikan Putri Dayang Merindu. Serunting Sakti gusar, dia pun berujar, “Sombong nian putri ini, diam seperti batu.” Belum kering ludahnya, Putri Dayang Merindu menjadi batu. Serunting Sakti kemudian pergi ke desa tempat tinggal Putri Dayang Merindu dan keluarganya. Dilihatnya sepi, Serunting Sakti berujar, “Sepi desa ini seperti goa sepi.” Desa itu pun menjadi goa batu.\nDari pintu masuk, kita diharuskan mengetuk dinding Goa sebanyak 3x yang menandakan salam untuk para leluhur. Anda juga akan diingatkan oleh penjaga goa untuk menjaga sikap, perkataan dan perbuatan selama berada di dalam, agar penunggunya tidak marah. Goa Putri berukuran sangat besar. Bibir goanya saja dapat dilewati oleh rombongan pengunjung sekaligus. Namun begitu, Anda harus berhati-hati karena goa ini gelap. Oleh pengelola memang disediakan lampu-lampu yang dapat menyinari jalan. Namun tetap saja Anda harus berhati-hati.\nDi dalam Goa Anda akan disajikan dengan pemandangan stalaktit dan stalagmit. Stalaktit merupakan kalsium karbonat yang menggantung dan membeku di langit-langit Goa. Sedangkan Stalagmit adalah bebatuan yang berbentuk kerucut es yang menghadap keatas dapat ditemukan di lantai Goa. Stalaktit dan stalagmit ini disajikan begitu indah karena pantulan beberapa lampu berwarni-warni. Gemercik aliran sungai Sumuhun pun ikut mengiri perjalanan Anda selama berjelajah di Goa Putri ini. Sungai tersebut lebarnya 20 meter lebar dan panjangnya 160 meter. Di beberapa bagian gua terdapat  batu lebar di mana Anda bisa duduk dan tidur.\nAnda dapat berjalan melalui jalan yang curam dan licin sekitar 200 meter. Sebagian besar daerah ini masih tertutup bagi pengunjung karena jalurnya yang berbahaya, gelap dan biasanya dihuni oleh kelelawar yang dapat Anda temui ketika memasuki gua ini. Jangan lupa untuk mencuci muka di kolam Pangeran Dayang Merindu. Penduduk setempat percaya bahwa mereka yang mencuci muka di kolam ini sambil berdoa, doa-doa mereka akan menjadi menjadi kenyataan. Pepohonan besar melindungi pengunjung dari terik sinar matahari. Di sini juga terdapat beberapa gazebo yang dapat digunakan secara gratis jika pengunjung kebetulan membawa bekal dari rumah. Jika tiba waktu sholat, tersedia juga mushola di sana.\nUniknya goa ini, pengunjung tidak akan masuk dan keluar di jalan yang sama. Begitu berada di dalam, pengunjung akan menuju sebuah lubang lagi yang berada di sebuah undakan. Tersedia tangga kayu di sana. Begitu keluar, ternyata sudah berada di sisi samping goa namun letaknya di atas ketinggian. Nah untuk keluar menuju area parkir, Anda tinggal menyusuri saja jalan setapak yang ada di samping goa. Jalanan ini ditutupi oleh pepohonan dan tumbuhan rambat sehingga tidak terlihat dari bawah.",
            /*9. Tangga 2001*/"Dari namanya pasti banyak yang mengira kalau tangga ini memiliki ribuan anak tangga. Jika anda berpikir begitu, anda salah.  Jumlah anak tangga ini hanya berkisar ratusan. Diberi nama tangga seribu hanya sebagai sebutan saja dari masyarakat sekitar untuk icon Kota Pagaralam ini saat pertama kali dibangun.\nTangga 2001 memang didesain khusus untuk objek wisata dan sekaligus tempat olahraga terapi pengobatan telapak kaki. Hal itu karena tangga terbuat dari beton dan batu kerikil yang dapat digunakan sebagai pijat refleksi kaki. Selain itu, wisatawan dapat menikmati panorama Gunung Dempo sambil berjalan. Bentuk tangganya pun sangatlah unik. Memiliki lebar sekitar lima meter dan anak tangga yang berundak-undak memanjang dari tempat rendah menuju ke tempat yang lebih tinggi, dimana pada setiap anak tangganya terdapat sebuah lampu yang akan menyala berkedip-kedip saat anda melewatinya.\nPemandangan alam dan hamparan kebun teh yang terbentang luas dijamin tidak akan membuat anda lelah saat mencoba menapaki anak tangga ini satu persatu. Jika anda naik, maka pesona gunung dempo akan menyapa di hadapan anda, sebaliknya jika anda turun, maka pesona pemandangan gunung gare. Selain itu dari atas anak tangga ini, anda dapat pula melihat kota Pagaralam secara lebih luas. Sungguh pemandangan alam yang cantik dan tidak akan bisa dilupakan.\nDi sebelah tangga seribu ini terdapat pula tanah lapang yang terbuka. Tanah ini merupakan tempat pendaratan olah raga paralayang, dimana lokasi awal terbangnya yang berada di daerah tugu rimau. Tempat paling tinggi yang bisa dilalui dengan mobil.\n\nTIPS\n- Sebaiknya datanglah kesini pada pagi hari, karena cuaca akan lebih cerah tidak tertutup kabut. Sehingga pemandangan dapat di lihat lebih luas.\n\n- Bawalah barang keperluan anda secukupnya, jangan sampai memberatkan perjalanan.\n\n- Sebaiknya bawalah pula jaket dan penutup kepala seperti topi atau payung, karena di kota ini cuaca sering kali susah ditebak, kadang hujan, kadang pula tiba-tiba panas.\n\n- Bawalah uang secukupnya.",
            /*10. Air Terjun Bidadari*/"Air Terjun Bidadari berada di Desa Karang Dalam, Kecamatan Pulau Pinang, Kabupaten Lahat, Sumatera Selatan. Kira-kira berjarak 231 km dari kota Palembang.\nAir terjun ini juga memiliki nama lain Air Terjun Ayek Asam yang sering disebut oleh masyarakat setempat. Air yang mengalir di air terjun ini bermuara ke Sungai Lematang. Air terjun ini adalah air terjun tertinggi di aliran Sungai Asam, ketinggiannya adalah sekitar 30 meter dan lebar atasnya sekitar 10 meter serta lebar bawahnya sekitar 15 meter. Dinamakan Air Terjun Bidadari karena konon katanya air terjun ini tempat mandi para bidadari. Terlepas dari sejarah nama itu, air terjun ini cukup indah dan menarik.\nDi sekitar air terjun ini terdapat tiga air terjun yang dapat dinikmati sambil menyusuri pesona Air Terjun Bidadari. Air terjun tersebut diantaranya Air Terjun Bujang Gadis dengan ketinggian 4 meter, berjarak sekitar 30 meter di bawah Air Terjun Bidadari ini, kemudian di bawah air terjun Bujang Gadis terdapat Air terjun Sumbing sekitar 80 meter dari air terjun Bujang Gadis dengan ketinggian sekitar 35 meter. Lalu di bawah air terjun Sumbing terdapat pula air terjun Naga. Bagian air terjun paling bawah ini memiliki ketinggian sekitar 10 meter dengan jarak sekitar 50 meter dari air terjun Sumbing.\nAir Terjun Bidadari ini memiliki daya tarik tersendiri untuk menarik pengunjung. Selain dapat menikmati pemandangan alam yang indah, Anda juga dapat menyegarkan badan dengan berenang di danau yang ada di bawah air terjun. Di sekitar danau terdapat batu koral yang berjejer secara alami yang terlihat sangat indah.  Suara air terjun yang mengalir akan memberikan suasana yang menyejukkan hati. Apalagi suara tersebut diiringi dengan suara alam yang masih asri sehingga tempat ini menjadi pilihan yang ideal untuk menenangkan diri dan melepaskan pikiran yang penat setelah lelah beraktivitas.\nKarena pesonanya yang indah, Air Terjun Bidadari sering disebut bidadari-nya Sumatera Selatan, dan pernah dibuat menjadi tempat syuting film. Anda bisa melakukan foto selfie sepuasnya dan tentunya akan menjadi satu kenangan indah berfoto di salah satu destinasi wisata kebanggaan Sumatera Selatan ini. Untuk waktu terbaik mengunjungi Air Terjun Bidadari ini adalah pada saat musim panas, dikarenakan bila saat musim hujan keindahan air terjun bisa tertutupi kabut dan debit air akan semakin deras. Satu hal yang perlu diperhatikan oleh pengunjung yakni tidak adanya warung makan, sehingga harus membawa persediaan makanan sebelumnya dan jangan membuang sampah sembarangan."
    };

    private static String[] lokasi = {
      "https://www.google.com/maps/place/Danau+Buatan+Air+Batu/@-2.9028504,104.6181002,17z/data=!4m5!3m4!1s0x2e3b0c8c806f844b:0xb13fe606fcca0d5!8m2!3d-2.9030701!4d104.6181109",
            "https://www.google.com/maps/place/Air+Terjun+Bedegung/@-4.0590201,103.766906,17z/data=!4m5!3m4!1s0x2e39c4f108a54b6d:0xe1b35d0cc53ea2da!8m2!3d-4.0592127!4d103.7668845",
            "https://www.google.com/maps/place/Perkebunan+Teh+Pagar+Alam/@-4.0360612,103.1868258,18.08z/data=!4m5!3m4!1s0x0:0x6e436bae956678e5!8m2!3d-4.0363476!4d103.1873083",
            "https://www.google.com/maps/place/Danau+Ranau/@-4.8491735,103.9352358,17z/data=!4m5!3m4!1s0x2e38759a2b2e034d:0xb4d33eb48ef16c97!8m2!3d-4.8510271!4d103.9376021",
            "https://www.google.com/maps/place/Al-Qur'an+Al-akbar/@-3.0101421,104.703453,17.81z/data=!4m13!1m7!3m6!1s0x0:0x1458f03adfd524bf!2zM8KwMDAnMzUuNyJTIDEwNMKwNDInMTQuNSJF!3b1!8m2!3d-3.0099109!4d104.7040297!3m4!1s0x2e3b9fcdb814b867:0x593219792e75b507!8m2!3d-3.0111216!4d104.7040297",
            "https://www.google.com/maps/place/Danau+OPI+Jakabaring/@-3.0482463,104.786901,17.81z/data=!4m13!1m7!3m6!1s0x0:0xe3c30525be8f20b9!2zM8KwMDInNTMuNCJTIDEwNMKwNDcnMTguMyJF!3b1!8m2!3d-3.0481624!4d104.7884221!3m4!1s0x2e3b9c5b5e6ab81b:0xbea87b46050754d6!8m2!3d-3.0483981!4d104.788465",
            "https://www.google.com/maps/place/Pulau+Maspari,+Ogan+Komering+Ilir,+Sumatera+Selatan/@-3.2167474,106.2166394,21z/data=!4m5!3m4!1s0x2e3d943008915fdb:0x46b8e4550c9a6fc8!8m2!3d-3.2166667!4d106.2166667",
            "https://www.google.com/maps/place/Goa+Putri+Padang+Bindu+Baturaja/@-4.0680774,103.9187769,15.92z/data=!4m5!3m4!1s0x2e39b84100000001:0x1cfa51de8f4df532!8m2!3d-4.0686286!4d103.9250656",
            "https://www.google.com/maps/place/4%C2%B002'15.6%22S+103%C2%B011'24.2%22E/@-4.0376787,103.1878724,17z/data=!3m1!4b1!4m5!3m4!1s0x0:0x39b674ec5b8b108f!8m2!3d-4.0376787!4d103.1900611",
            "https://www.google.com/maps/place/Objek+Wisata+Air+Terjun+Bidadari+Karang+Dalam/@-3.8541829,103.5180492,17z/data=!4m5!3m4!1s0x2e3759f6dd80d9b7:0xa01bd038dcdad60f!8m2!3d-3.8539552!4d103.5212731"
    };

    static ArrayList<GetterAndSetterWisataData> getListData()
    {
        ArrayList<GetterAndSetterWisataData> list = new ArrayList<>();
        for (int i = 0; i < nameWisata.length; i++)
        {
            GetterAndSetterWisataData wisata = new GetterAndSetterWisataData();
            wisata.setNameWisata(nameWisata[i]);
            wisata.setFotoWisata(imageWisata[i]);
            wisata.setAlamatWisata(alamatWisata[i]);
            wisata.setTarif(tarif[i]);
            wisata.setJamOperasional(jamOperasional[i]);
            wisata.setRating(rating[i]);
            wisata.setDescWisata(desc[i]);
            wisata.setLokasi(lokasi[i]);
            list.add(wisata);
        }
        return list;
    }
}