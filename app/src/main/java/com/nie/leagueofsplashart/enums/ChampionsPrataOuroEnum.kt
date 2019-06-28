package com.nie.leagueofsplashart.enums

import com.nie.leagueofsplashart.model.Champion

enum class ChampionsPrataOuroEnum(var nomeExibicao: String, var resposta: String, var opcoes: String, var imagePath: String) {

    IVERN( "IVERN", "IVERN","FREYNDWQIXTAVMOJ", "ivern.jpg"),
    JANNA( "JANNA", "JANNA","EUKNAWAGNZJIMDBY", "janna.jpg"),
    JARVAN_IV( "JARVAN IV", "JARVANIV","ZVVSJYANXQIAHDRK", "jarvaniv.jpg"),
    JAX( "JAX", "JAX","JSZTOYAQBWXENUMF", "jax.jpg"),
    JAYCE( "JAYCE", "JAYCE","GNVDASJEIFCXQLYT", "jayce.jpg"),
    JHIN( "JHIN", "JHIN","JVAOFHUMKNIGECPD", "jhin.jpg"),
    JINX( "JINX", "JINX","FWQVAJXEZNHMDIYL", "jinx.jpg"),
    KAISA( "KAI'SA", "KAI'SA","FYAKC'JHTMGINASU", "kaisa.jpg"),
    KALISTA( "KALISTA", "KALISTA","JWMAEYRSXTKLIAZG", "kalista.jpg"),
    KARMA( "KARMA", "KARMA","AZMVTRJKUSBQGCAY", "karma.jpg"),
    KARTHUS( "KARTHUS", "KARTHUS","RDHSGATWQKMVYUNZ", "karthus.jpg"),
    KATARINA( "KATARINA", "KATARINA","IOFXNTAKABRPEAHZ", "katarina.jpg"),
    KASSADIN( "KASSADIN", "KASSADIN","AUEDNASPKWZHSXCI", "kassadin.jpg"),
    KAYLE( "KAYLE", "KAYLE","NXJUGAZIRYLDEPKO", "kayle.jpg"),
    KAYN( "KAYN", "KAYN","HLKJDNYQBTGMSAXP", "kayn.jpg"),
    KENNEN( "KENNEN", "KENNEN","UIWAVYZENGFKJNNE", "kennen.jpg"),
    KHAZIX( "KHA'ZIX", "KHA'ZIX","IW'EQNRZHYAUOKXV", "khazix.jpg"),
    KINDRED( "KINDRED", "KINDRED","QRHNIWXOTMBDKDEU", "kindred.jpg"),
    KLED( "KLED", "KLED","XOPMKTNHSBLZEUDJ", "kled.jpg"),
    KOGMAW( "KOG'MAW", "KOG'MAW","OSGWC'QZEARKHFIM", "kogmaw.jpg"),
    LEBLANC( "LEBLANC", "LEBLANC","CJELQTAFBSNKZUWL", "leblanc.jpg"),
    LEESIN( "LEE SIN", "LEESIN","EONWLIZQKMBEARPS", "leesin.jpg"),
    LEONA( "LEONA", "LEONA","AYVLHEBNRKFOJGXU", "leona.jpg"),
    LISSANDRA( "LISSANDRA", "LISSANDRA","LXSUBWNIPTSAOADR", "lissandra.jpg"),
    LUCIAN( "LUCIAN", "LUCIAN","LWIQUPBDSZKCYMNA", "lucian.jpg"),
    LULU( "LULU", "LULU","AIOSYRXULMTQULFJ", "lulu.jpg"),
    LUX( "LUX", "LUX","KWLMVCEUYRQSIPXO", "lux.jpg"),
    MALPHITE( "MALPHITE", "MALPHITE","IMHTASYEPVCWLRZX", "malphite.jpg"),
    MALZAHAR( "MALZAHAR", "MALZAHAR","MBHKGIADZSPRALJA", "malzahar.jpg"),
    MAOKAI( "MAOKAI", "MAOKAI","GTIUBMAQLJXOFAKC", "maokai.jpg"),
    MASTERYI( "MASTER YI", "MASTERYI","HIVRAKFUMWESTBCY", "masteryi.jpg"),
    MISSFORTUNE( "MISS FORTUNE", "MISSFORTUNE","STYMRSQWCIONXUFE", "missfortune.jpg"),
    MORDEKAISER( "MORDEKAISER", "MORDEKAISER","ARQDYULKXIREESOM", "mordekaiser.jpg"),
    MORGANA( "MORGANA", "MORGANA","GQTBXJVADARFNMSO", "morgana.jpg"),
    NAMI( "NAMI", "NAMI","MOITVEKFXASURNPQ", "nami.jpg"),
    NASUS( "NASUS", "NASUS","SQUALYHMBZPFNOSC", "nasus.jpg"),
    NAUTILUS( "NAUTILUS", "NAUTILUS","HDSVNOATIRELYUFU", "nautilus.jpg"),
    NEEKO( "NEEKO", "NEEKO","NEVKWHJEYTOLRZXF", "neeko.jpg"),
    NIDALEE( "NIDALEE", "NIDALEE","FWGSQUPNADVEOLIE", "nidalee.jpg"),
    NOCTURNE( "NOCTURNE", "NOCTURNE","PVJTBEUSCMKNORNG", "nocturne.jpg"),
    NUNUEWILLUMP( "NUNU E WILLUMP", "NUNUEWILLUMP","NPENUUYMRULBLIKW", "nunuewillump.jpg");


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

        fun getByName(name: String): ChampionsPrataOuroEnum? {
            values().forEach {
                if (it.nomeExibicao == name){
                    return it
                }
            }

            return null
        }

    }


}