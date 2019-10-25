package com.codetarian.myresepapp;

import java.util.ArrayList;

import javax.net.ssl.SSLContext;

public class ResepsData {
    private static String[] resepNames={
            "Rendang Paha Ayam Organik",
            "Indomie Seblak Macaroni",
            "Penyetan Sambal Terasi Udang",
            "Tumis Jamur Tiram",
            "Capcay Goreng",
            "Oseng Kacang Panjang",
            "Cumi Pendas Manis",
            "Pesmol Ikan Nila",
            "Cumi Sambal Hijau",
            "Ikan Bakar"
    };

    private static String[] resepBahan ={
                    "- 4 paha ayam organik\n" +
                    "- 2 buah kentang potong-potong\n" +
                    "- 2 butir telur rebus\n" +
                    "- 1 lembar daun kunyit iris\n" +
                    "- 4 lembar daun jeruk\n" +
                    "- 2 lembar daun salam\n" +
                    "- 1 bungkus kerisik (kelapa parut kering)\n" +
                    "- 200 ml santan + air\n" +
                    "- Garam, perasan dan gula malaka\n" +
                    "\n" +
                    "Bahan halus:\n" +
                    "- 8 butir bawang merah\n" +
                    "- 3 butir bawang putih\n" +
                    "- 1 cm kunyit\n" +
                    "- 1 cm jahe\n" +
                    "- 1 cm lengkuas\n" +
                    "- 2 batang serai\n" +
                    "- 3 buah cabai rawit\n" +
                    "- 3 buah cabai merah",

                    "- 1 bungkus Indomie (mi rasa ayam bawang) rebus.\n" +
                    "- 30 gram macaroni rebus tiriskan\n" +
                    "- sedikit kerupuk bawang mentah rendam air panas hingga empuk beri sedikit minyak supaya tidak lengket\n" +
                    "- secukupnya daun bawang iris\n" +
                    "- 1 buah sosis iris\n" +
                    "- 1buah telur kocok lepas\n" +
                    "- 2 gelas air\n" +
                    "- sedikit garam, gula dan bumbu indomi\n" +
                    "\n" +
                    "Bumbu halus:\n" +
                    "- 3 bawang merah\n" +
                    "- 2 bawang putih\n" +
                    "- 5 cabai merah keriting\n" +
                    "- 3 rawit atau sesuai selera\n" +
                    "- 1 cm kencur",

                    "- 25 buah cabai rawit merah\n" +
                    "- 15 buah cabai rawit ijo\n" +
                    "- 8 siung bawang merah\n" +
                    "- 4 siung bawang putih\n" +
                    "- 1 tomat sedang\n" +
                    "- 2 bungkus terasi",

                    "- 2 bungkus jamur tiram\n" +
                    "- 1/2 papan tempe\n" +
                    "- 4 siung bawang merah\n" +
                    "- 3 siung bawang putih\n" +
                    "- 5 buah cabai hijau\n" +
                    "- saus tiram\n" +
                    "- kaldu jamur\n" +
                    "- garam dan gula",

                    "- 10 udang\n" +
                    "- 1 wortel besar\n" +
                    "- 1 brokoli kecil\n" +
                    "- 1/2 kembang kol\n" +
                    "- Sedikit Jamur kuping\n" +
                    "- Sedikit Kapri\n" +
                    "- Sedikit jagung muda\n" +
                    "\n" +
                    "Bumbu:\n" +
                    "- 3 bawang putih, cincang\n" +
                    "- 1cm jahe, cincang\n" +
                    "- 2 sdm saos tiram\n" +
                    "- 1 sdm kecap asin\n" +
                    "- 1/2 sdm kecap ikan\n" +
                    "- 1 sdm kecap inggris\n" +
                    "- 1 sdm maizena (dilarutkan dengan 3 sdm air)\n" +
                    "- garam\n" +
                    "- air secukupnya",

                    "- 12 buah kacang panjang\n" +
                    "- 1 buah tempe\n" +
                    "- 2 papan pete dikupas kulit\n" +
                    "- 5 bawang putih diiris\n" +
                    "- 4 bawang merah diiris\n" +
                    "- 5 buah cabai merah diiris\n" +
                    "- 1 ruas lengkuas digeprek\n" +
                    "- 1 ruas jahe digeprek\n" +
                    "- 1 serai digeprek\n" +
                    "- 2 daun salam\n" +
                    "- 2 daun jeruk\n" +
                    "- 2 sdm kecap manis\n" +
                    "- 1 sdm saus tiram\n" +
                    "- 1 sdt gula pasir\n" +
                    "- 1/2 sdt garam\n" +
                    "- air putih\n" +
                    "- minyak goreng.",

                    "- 1 kg cumi ukuran besar cuci bersih kemudian beri sedikit cuka dan garam, potong sesuai selera. Lalu cuci lagi sampai bersih.\n" +
                    "- 2 papan petai\n" +
                    "\n" +
                    "Bumbu iris:\n" +
                    "- 10 butir bawang merah\n" +
                    "- 10 buah cabai keriting merah\n" +
                    "- 1 buah tomat\n" +
                    "- 50 gram daun bawang\n" +
                    "- dua ruas jahe\n" +
                    "\n" +
                    "Bumbu halus:\n" +
                    "- 5 siung bawang putih\n" +
                    "- 6 butir bawang merah\n" +
                    "\n" +
                    "Bumbu cemplung:\n" +
                    "- 5 sdm saus cabai\n" +
                    "- 1,5 sdm gula pasir\n" +
                    "- 2 sdm cabai rawit halus/uleg. kaldu bubuk secukupnya\n" +
                    "- 1/2 sdt lada hitam.",

                    "- 1 kg ikan nila (sesuai selera) cuci bersih, beri garam dan perasan jeruk nipis, diamkan 30 menit, lalu goreng kering, sisihkan\n" +
                    "\n" +
                    "Bumbu halus:\n" +
                    "- 10 butir bawmer\n" +
                    "- 8 siung bawput\n" +
                    "- 4 buah kemiri\n" +
                    "- 1/2 sdt ketumbar\n" +
                    "- 2 cm kunyit\n" +
                    "- Minyak goreng untuk menumis\n" +
                    "\n" +
                    "Bumbu lainnya:\n" +
                    "- 1 cm jahe\n" +
                    "- 1 cm lengkuas\n" +
                    "- 2 lembar daun salam\n" +
                    "- 1 batang serai\n" +
                    "- 200 ml santan\n" +
                    "- gula garam kaldu bubuk\n" +
                    "- 1 batang daun bawang, iris kasar\n" +
                    "- 2 buah cabai merah, iris kasar\n" +
                    "- 5 buah cabai rawit, biarkan utuh\n" +
                    "- cuka masak sedikit secukupnya.\n" +
                    "- gula pasir, garam, kaldu bubuk secukupnya",

                    "- cumi 500 gr\n" +
                    "- pokak secukupnya\n" +
                    "- garam/penyedap\n" +
                    "- bombai iris secukupnya\n" +
                    "- potongan tomat/dadu\n" +
                    "- air jeruk nipis\n" +
                    "- daun jeruk nipis\n" +
                    "\n" +
                    "Bumbu halus:\n" +
                    "- bamer 12-15 buah ukuran kecil\n" +
                    "- baput 1 siung\n" +
                    "- cabai hijau 1 ons",

                    "- Ikan nila hilangkan sisiknya cuci bersih lalu lumuri dengan jeruk nipis\n" +
                    "- Diamkan 15 menit lalu cuci bersih kembali\n" +
                    "- Goreng dalam teflon anti lengket jangan sampai kering atau tidak digoreng juga tidak masalah optional.\n" +
                    "\n" +
                    "Bumbu:\n" +
                    "- bawang merah\n" +
                    "- bawang putih\n" +
                    "- 1 sdt merica/merica bubuk\n" +
                    "- 3 butir kemiri\n" +
                    "- 1 ruas jahe\n" +
                    "- asam jawa larutkan dengan 5 sdm air panas\n" +
                    "- margarin/mentega\n" +
                    "- kecap manis\n" +
                    "- garam"
    };

    private static String[] resepCara={
                    "- Goreng kentang sisihkan.\n" +
                    "- Panaskan minyak tumis bahan halus sampai kering dan pecah minyak.\n" +
                    "- Masukkan ayam tumis sebentar kemudian masukkan santan dengan air aduk rata.\n" +
                    "- Masukkan kerisik, daun jeruk, daun salam, dan daun kunyit.\n" +
                    "- Kemudian masukkan kentang dan telur rebus tambahkan garam, gula malaka dan perasa.\n" +
                    "- Masak dengan api kecil sampai air kering, jika ingin berkuah jangan masak sampai kering.",

                    "- Tumis bumbu halus dengan sedikit minyak\n" +
                    "- masukkan air, setelah mendidih masukkan kocokan telur diaduk\n" +
                    "- masukkan macaroni, lalu sosis kerupuk dan mi, beri gula garam bumbu indomi\n" +
                    "- aduk rata test rasa angkat sajikan taburi dengan daun bawang.",

                    "- Bahan di atas goreng semua sampai agak layu\n" +
                    "- Uleg jangan halus-halus beri garam dan gula sesuai rasa yang diinginkan\n" +
                    "- Tinggal siapkan lauk bisa tempe goreng, telur rebus, ayam, udang, dan lain-lain.",

                    "- Cuci bersih jamur, siangi, sisihkan.\n" +
                    "- Goreng tempe setengah kering. Sisihkan.\n" +
                    "- Tumis dua bawang dan cabai sampai harum, masukkan jamur, aduk rata, tambahkan saus tiram, kaldu jamur, gula dan garam. Aduk rata.\n" +
                    "- Masukkan tempe, beri sedikit air, masak sampai bumbu meresap. Angkat dan sajikan.",

                    "- Cuci sayur dan potong-potong\n" +
                    "- Tumis bawang putih sampai wangi, masukkan jahe cincang dan udang sampai berubah warna\n" +
                    "- Masukkan wortel dan air secukupnya, lalu semua bumbu lainnya, cek rasa\n" +
                    "- Masukkan semua sayuran lainnya kecuali brokoli. Jangan masak terlalu lama, kira-kira sayur sudah setengah matang.\n" +
                    "- Terakhir masukkan brokoli aduk sebentar lalu larutan maizena. Aduk sampai air berubah agak kental, matikan api.",

                    "- Potong-potong kacang panjang cuci bersih dan sisihkan. Potong kecil-kecil tempe dan digoreng sebentar. Angkat dan tiriskan.\n" +
                    "- Siapkan wajan beri minyak goreng secukupnya. Tumis bawang merah dan putih sampai layu lalu masukkan lengkuas, jahe ,serai, daun salam dan daun jeruk, cabai merah. Aduk rata. Masukkan kacang panjang dan pete oseng-oseng lalu beri kecap manis, saus tiram, gula dan garam aduk rata beri sedikit air.\n" +
                    "- Koreksi rasa dan terakhir masukkan tempe goreng oseng-oseng sebentar sampai semua bahan tercampur rata. Lalu matikan api dan sajikan.",

                    "- Tumis bumbu halus sampai matang lalu masukkan cumi. aduk rata.\n" +
                    "- Beri sedikit air (100 ml) kalau sudah mendidih masukkan semua bumbu.\n" +
                    "- Masukkan saat kuah mulai sedikit surut dan mengental masukkan semua bumbu iris plus petai.\n" +
                    "- Aduk-aduk biarkan sebentar lalu angkat dan sajikan.",

                    "- Tumis bumbu halus dan bumbu lainnya sampai harum, lalu masukkan santan, masak sampai mendidih.\n" +
                    "- Masukkan ikan, beri gula, garam, kaldu bubuk, dan sedikit cuka masak lalu koreksi rasa.\n" +
                    "- Masuk daun bawang, cabai merah, cabai rawit, masak hingga air surut.",

                    "- Bersihkan cuci, potong-potong.\n" +
                    "- Sirami dengan air jeruk nipis dan garam diamkan 5 menit kemudian bilas, goreng cumi sebentar dan tiriskan\n" +
                    "- Cuci pokak, goreng sebentar, sisihkan\n" +
                    "- Ulek kasar cabai, garam/penyedap\n" +
                    "- Panaskan minyak, masukkan bombai, potongan tomat sampai layu, masukkan cabai ulek dan daun jeruk\n" +
                    "- Masukkan cumi dan pokak aduk-aduk sampai tercampur rata sajikan.\n" +
                    "\n",

                    "- haluskan semua bumbu campur jadi satu\n" +
                    "- olesi ikan dengan bumbu\n" +
                    "- bakar ikan dengan api kecil bolak balik ikan sembari diolesi bumbu agar meresap sempurna\n" +
                    "- cek rasa dan sajikan."
    };

    private static int[] resepPhotos = {
            R.drawable.ayam,
            R.drawable.seblak,
            R.drawable.penyetan,
            R.drawable.tumis_jamur,
            R.drawable.capcay_goreng,
            R.drawable.oseng_kacang,
            R.drawable.cumi_pedas_manis,
            R.drawable.pesmol_ikan_nila,
            R.drawable.cumi_sambal_hijau,
            R.drawable.ikan_bakar
    };

    static ArrayList<Resep> getListData(){
        ArrayList<Resep> list = new ArrayList<>();
        for (int position = 0; position < resepNames.length; position++){
            Resep resep = new Resep();
            resep.setName(resepNames[position]);
            resep.setBahan(resepBahan[position]);
            resep.setCara((resepCara[position]));
            resep.setPhoto(resepPhotos[position]);
            list.add(resep);
        }
        return list;
    }
}
