package com.nie.leagueofsplashart.enums

import com.nie.leagueofsplashart.model.Champion

enum class ChampionsFerroBronzeEnum(var nomeExibicao: String, var resposta: String, var opcoes: String, var imagePath: String) {

    AATROX( "AATROX", "AATROX","TQXUHJCLEOVGADRA", "aatrox.jpg"),
    AHRI( "AHRI", "AHRI","LRWBTYDANMHKOIXZ", "ahri.jpg"),
    AKALI( "AKALI", "AKALI","YIPGBALARDMQXTFK", "akali.jpg"),
    ALISTAR( "ALISTAR", "ALISTAR","EUOARISYHXKJATLF", "alistar.jpg"),
    AMUMU( "AMUMU", "AMUMU","KMWQRUMYNFAUZEGV", "amumu.jpg"),
    ANIVIA( "ANIVIA", "ANIVIA","SFCGITNIPDAXMAVR", "anivia.jpg"),
    ANNIE( "ANNIE", "ANNIE","WUNBYCLOTGIZEAKN", "annie.jpg"),
    ASHE( "ASHE", "ASHE","ERDLQTPHSANYOJCV", "ashe.jpg"),
    AURELION_SOL( "AURELION SOL", "AURELIONSOL","BOHZWUONESRAILPL", "aurelionsol.jpg"),
    AZIR( "AZIR", "AZIR","ZAJOPGQVBUMYIRKS", "azir.jpg"),
    BLITZCRANK( "BLITZCRANK", "BLITZCRANK","IQVTAKFBLNDSCZRJ", "blitzcrank.jpg"),
    BRAND( "BRAND", "BRAND","DXLMIRAKENGBVFCT", "brand.jpg"),
    BRAUM( "BRAUM", "BRAUM","ZQLKRJFCMANPXSBU", "braum.jpg"),
    CAITLYN( "CAITLYN", "CAITLYN","KNDXIPTACLGQYFBJ", "caitlyn.jpg"),
    CAMILLE( "CAMILLE", "CAMILLE","IFGLLDXPVYWAMERC", "camille.jpg"),
    CASSIOPEIA( "CASSIOPEIA", "CASSIOPEIA","SHECBPIANJSAYIRO", "cassiopeia.jpg"),
    CHOGATH( "CHO'GATH", "CHO'GATH","WACJBEOMIHG'TNQH", "chogath.jpg"),
    CORKI( "CORKI", "CORKI","AKMZCQVYPXLROWID", "corki.jpg"),
    DARIUS( "DARIUS", "DARIUS","VOAGWJXSCDUMREIF", "darius.jpg"),
    DIANA( "DIANA", "DIANA","ATLIASRDZCNJFGEU", "diana.jpg"),
    DRAVEN( "DRAVEN", "DRAVEN","WURMEKHDAPNVXGBT", "draven.jpg"),
    DRMUNDO( "DR MUNDO", "DRMUNDO","JCYSUBRDGAFNMVOD", "drmundo.jpg"),
    EKKO( "EKKO", "EKKO","KYIUGEWONDKCMASR", "ekko.jpg"),
    ELISE( "ELISE", "ELISE","LINTGZEESDJPWRMH", "elise.jpg"),
    EVELYNN( "EVELYNN", "EVELYNN","WEEUZNOVLXYQANHJ", "evelynn.jpg"),
    EZREAL( "EZREAL", "EZREAL","TGARWCLMHQDEUEZJ", "ezreal.jpg"),
    FIDDLESTICKS( "FIDDLESTICKS", "FIDDLESTICKS","YDIXTSLEQOCIKFSD", "fiddlesticks.jpg"),
    FIORA( "FIORA", "FIORA","XCATPLEOJQIFRGWZ", "fiora.jpg"),
    FIZZ( "FIZZ", "FIZZ","YPULJZKFIATWZVRH", "fizz.jpg"),
    GALIO( "GALIO", "GALIO","LEIOUXFMYSAZNRGB", "galio.jpg"),
    GANGPLANK( "GANGPLANK", "GANGPLANK","ANHRXGKLFWAVGNPO", "gangplank.jpg"),
    GAREN( "GAREN", "GAREN","FXBRNGCIATEMUSQZ", "garen.jpg"),
    GNAR( "GNAR", "GNAR","AYCLNJRPBWGDHIOZ", "gnar.jpg"),
    GRAGAS( "GRAGAS", "GRAGAS","TIRAGLACEBKSOXMG", "gragas.jpg"),
    GRAVES( "GRAVES", "GRAVES","VEHTWCIOGSFUNRAP", "graves.jpg"),
    HECARIM( "HECARIM", "HECARIM","MRDCIHNSFEVPTABW", "hecarim.jpg"),
    HEIMERDINGER( "HEIMERDINGER", "HEIMERDINGER","EMDIAUWEPNGHEIRR", "heimerdinger.jpg"),
    ILLAOI( "ILLAOI", "ILLAOI","IXMFLDIAWJKSLHOC", "illaoi.jpg"),
    IRELIA( "IRELIA", "IRELIA","UTFMSLCAWIVEBRIO", "irelia.jpg");

//    TWISTED_FATE("TWISTED FATE", "TWISTEDFATE", "TWISTEDFATEOPSJD", "twistedfate.png"),
//    NUNU_E_WILLUMP("NUNU E WILLUMP", "NUNUEWILLUMP", "NUNUEWILLUMPPOIU", "twistedfate.png");


    companion object {
        fun getRandomChampion(jogados: MutableSet<String>): Champion {
            var campeoes = values().toMutableList()
            for(i in jogados){
                getByName(i).let {
                    campeoes.remove(it)
                }
            }

            if(campeoes.isEmpty()){
                throw Exception("Não possuem mais campeões")
            }

            val random = (0 until campeoes.size).shuffled().first()

            return Champion(
                campeoes[random].nomeExibicao,
                campeoes[random].resposta,
                campeoes[random].opcoes,
                campeoes[random].imagePath,
                getPontuacaoRandom(),
                getByName(campeoes[random].nomeExibicao)!!.ordinal)
        }

        fun getPontuacaoRandom(): Int {
            return (20 .. 25).shuffled().first();
        }

        fun getCampeaoAtual(posicao: Int): Champion {
            return Champion(
                values()[posicao].nomeExibicao,
                values()[posicao].resposta,
                values()[posicao].opcoes,
                values()[posicao].imagePath,
                getPontuacaoRandom(),
                posicao)
        }

        fun getByName(name: String): ChampionsFerroBronzeEnum? {
            values().forEach {
                if (it.nomeExibicao == name){
                    return it
                }
            }

            return null
        }

//        fun shuffleAll() {
//            val charPool : List<Char> = ('A'..'Z').toList()
//            values().forEach {
//
//                var final = it.resposta;
//
//                do{
//
//                    val randomString = (1..1)
//                        .map { i -> kotlin.random.Random.nextInt(0, charPool.size) }
//                        .map(charPool::get)
//                        .joinToString("");
//
//                    if(!final.contains(randomString)){
//                        final += randomString
//                    }
//
//                } while (final.length < 16)
//
//
//                val shuffled =final.split("").shuffled()
//                val joinToString = shuffled.joinToString("")
//                System.out.println(joinToString)
//            }
//        }
    }
}