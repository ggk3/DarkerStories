package com.nie.leagueofsplashart.enums

import com.nie.leagueofsplashart.model.Champion


enum class ChampionsMestreGraomestreEnum(var nomeExibicao: String, var resposta: String, var opcoes: String, var imagePath: String) {

    URGOT( "URGOT", "URGOT","SZTLAKIYQFJURGOH", "urgot.jpg"),
    VARUS( "VARUS", "VARUS","LEIDGRFPYQHOAUVS", "varus.jpg"),
    VAYNE( "VAYNE", "VAYNE","OIYZFGABEHNVPTCU", "vayne.jpg"),
    VEIGAR( "VEIGAR", "VEIGAR","JXVEIBSHWGRKYMAQ", "veigar.jpg"),
    VELKOZ( "VEL'KOZ", "VEL'KOZ","OKZT'HFXQMBLYVIE", "velkoz.jpg"),
    VI( "VI", "VI","VJXKPTOGYIBRDWMH", "vi.jpg"),
    VIKTOR( "VIKTOR", "VIKTOR","OHSWARMZQIKTYJEV", "viktor.jpg"),
    VLADIMIR( "VLADIMIR", "VLADIMIR","AZUYODJRQVIPMNIL", "vladimir.jpg"),
    VOLIBEAR( "VOLIBEAR", "VOLIBEAR","VOPATKBENWRQLISM", "volibear.jpg"),
    WARWICK( "WARWICK", "WARWICK","FYRXMEIWWGKQCABP", "warwick.jpg"),
    WUKONG( "WUKONG", "WUKONG","YMSOKCZUABNGITXW", "wukong.jpg"),
    XAYAH( "XAYAH", "XAYAH","TAGJDMHRAXLQYPKE", "xayah.jpg"),
    XERATH( "XERATH", "XERATH","NWGOHAMXVEJTIKSR", "xerath.jpg"),
    XINZHAO( "XIN ZHAO", "XINZHAO","UZLXSKOECWHGIANM", "xinzhao.jpg"),
    YASUO( "YASUO", "YASUO","ISMBEYWXJAFPVNUO", "yasuo.jpg"),
    YORICK( "YORICK", "YORICK","IUGHVCAOMRXWBKEY", "yorick.jpg"),
    YUUMI( "YUUMI", "YUUMI","ZWOHUBMYTLISEUJF", "yuumi.jpg"),
    ZAC( "ZAC", "ZAC","TJEDUVROZPKCWYAL", "zac.jpg"),
    ZED( "ZED", "ZED","ZDARSQIBUFLWVECP", "zed.jpg"),
    ZIGGS( "ZIGGS", "ZIGGS","UZAGHCLBYSVONMIG", "ziggs.jpg"),
    ZILEAN( "ZILEAN", "ZILEAN","VRGNCBWZIUEYATLO", "zilean.jpg"),
    ZOE( "ZOE", "ZOE","QWIOAGDBTYZMHELF", "zoe.jpg"),
    ZYRA( "ZYRA", "ZYRA","LSCYTPABKNZRDWEJ", "zyra.jpg"),
    QIYANA( "QIYANA", "QIYANA","ANWYDVKPQIAMTHSE", "qiyana.jpg"),
    AATROX_BLOODMOON( "AATROX", "AATROX","GBMRUXAOISDWQTAV", "aatroxbloodmoon.jpg"),
    AHRI_CHALLENGER( "AHRI", "AHRI","VKYQUTDRISAGHFWX", "ahrichallenger.jpg"),
    AKALI_NURSE( "AKALI", "AKALI","INAHMFOVKPWRELAU", "akalinurse.jpg"),
    ALISTAR_HEXTECH( "ALISTAR", "ALISTAR","TUHSAPQAICBLJYXR", "alistarhextech.jpg"),
    AMUMU_QUASE_REI_DO_BAILE( "AMUMU", "AMUMU","KMWQRUMYNFAUZEGV", "amumualmostpromking.jpg"),
    ANIVIA_BLACKFROST( "ANIVIA", "ANIVIA","HGXIBNMERKVPAIAZ", "aniviablackfrost.jpg"),
    ANNIE_SUPER_GALAXY( "ANNIE", "ANNIE","NOGIKMFELTRAHPNQ", "anniesupergalaxy.jpg"),
    ASHE_CHAMPIONSHIP( "ASHE", "ASHE","SBOQFZUEXANITMHY", "ashechampionship.jpg"),
    AURELION_SOL_MECHA( "AURELION SOL", "USLOKERONFMIDQLA","AURELIU", "aurelionsolmecha.jpg"),
    AZIR_GRAVELORDE( "AZIR", "AZIR","XBYCRLSFKIUZPAWJ", "azirgravelord.jpg"),
    IBLITZCRANK( "BLITZCRANK", "BLITZCRANK","NFMZQITCHRKWBLOA", "blitzcrankiblitzcrank.jpg"),
    BRAND_FINAL_BOSS( "BRAND", "BRAND","ENXBZVQRFHKTIYDA", "brandfinalboss.jpg"),
    BRAUM_DRAGON_HUNTER( "BRAUM", "BRAUM","ZPBVQDAGKRXWMHSU", "braumdragonhunter.jpg"),
    CAITLYN_PULSEFIRE( "CAITLYN", "CAITLYN","ULHKQTJYAFCINXDO", "caitlynpulsefire.jpg"),
    CAMILLE_COVEN( "CAMILLE", "CAMILLE","KFVLSEPMOHCWIAGL", "camillecoven.jpg"),
    CASSIOPEIA_ETERNUM( "CASSIOPEIA", "CASSIOPEIA","IACAPREBTIMSSOKN", "cassiopeiaeternum.jpg"),
    CHOGATH_DARKSTAR( "CHO'GATH", "CHO'GATH","SRGDI'TYWHCVHJOA", "chogathdarkstar.jpg"),
    CORKI_ICE_TOBOGAN( "CORKI", "CORKI","LGVDOXATUKRWICPQ", "corkiicetobogan.jpg"),
    DARIUS_GOD_KING( "DARIUS", "DARIUS","EYDUNTFAWRISBQOX", "dariusgodking.jpg"),
    DIANA_INFERNAL( "DIANA", "DIANA","SLNIDXWRGHAZAYQC", "dianainfernal.jpg"),
    DRAVEN_PRIMETIVE( "DRAVEN", "DRAVEN","IQFEVROGLHATNDBM", "dravenprimetive.jpg"),
    DRMUNDO_RAGEBRON( "DR MUNDO", "DRMUNDO","DNIGHYUZOVMQXRPD", "drmundorageborn.jpg"),
    EKKO_DOCES_OU_TRAVESSURAS( "EKKO", "EKKO","YAKPMXZVFELKQROS", "ekkotrickortreat.jpg"),
    ELISE_BLOODMOON( "ELISE", "ELISE","EBPWNECASMQFKLGI", "elisebloodmoon.jpg"),
    EVELYNN_SHADOW( "EVELYNN", "EVELYNN","SKFCDLRGVEEZNPNY", "evelynnshadow.jpg"),
    EZREAL_BONAIR( "EZREAL", "EZREAL","BUVGIERZJLEXTAHO", "ezrealdebonair.jpg"),
    FIDDLESTICKS_DARK_ACNDY( "FIDDLESTICKS", "FIDDLESTICKS","XSECSHPIATKDIDFL", "fiddlesticksdarkcandy.jpg");


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

        fun getByName(name: String): ChampionsMestreGraomestreEnum? {
            values().forEach {
                if (it.nomeExibicao == name){
                    return it
                }
            }

            return null
        }
    }
}