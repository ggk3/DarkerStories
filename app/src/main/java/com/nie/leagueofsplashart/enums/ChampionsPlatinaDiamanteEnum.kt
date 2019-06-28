package com.nie.leagueofsplashart.enums

import com.nie.leagueofsplashart.model.Champion

enum class ChampionsPlatinaDiamanteEnum(var nomeExibicao: String, var resposta: String, var opcoes: String, var imagePath: String) {

    OLAF( "OLAF", "OLAF","AXKWHDTFGSOMLZRE", "olaf.jpg"),
    ORIANNA( "ORIANNA", "ORIANNA","KIUOAZPMNAVLYRHN", "orianna.jpg"),
    ORNN( "ORNN", "ORNN","NJCZLXPTBEOUHRGN", "ornn.jpg"),
    PANTHEON( "PANTHEON", "PANTHEON","NNRZSAYBOTGEWPHV", "pantheon.jpg"),
    POPPY( "POPPY", "POPPY","BPPYMKCZLTOQAVPE", "poppy.jpg"),
    PYKE( "PYKE", "PYKE","JVBQWXAURKSFEMPY", "pyke.jpg"),
    QUINN( "QUINN", "QUINN","CRMQEHBDNFNIJUGT", "quinn.jpg"),
    RAKAN( "RAKAN", "RAKAN","UOLBREIHDXNZKFAA", "rakan.jpg"),
    RAMMUS( "RAMMUS", "RAMMUS","MDPSORBCAVMKNWXU", "rammus.jpg"),
    REKSAI( "REK'SAI", "REK'SAI","UCAMWYKIDT'OEJSR", "reksai.jpg"),
    RENEKTON( "RENEKTON", "RENEKTON","INTOXYERHQCNBGKE", "renekton.jpg"),
    RENGAR( "RENGAR", "RENGAR","LUDGFJXNSACRYVER", "rengar.jpg"),
    RIVEN( "RIVEN", "RIVEN","YIRZVQTDNOSHEPWG", "riven.jpg"),
    RUMBLE( "RUMBLE", "RUMBLE","AULESOFBDRZCGMVT", "rumble.jpg"),
    RYZE( "RYZE", "RYZE","MOQIVKENRSAGLUYZ", "ryze.jpg"),
    SEJUANI( "SEJUANI", "SEJUANI","IDSWUEAYZVNCJMXP", "sejuani.jpg"),
    SHACO( "SHACO", "SHACO","AXQPBOTUJHRSGCKE", "shaco.jpg"),
    SHEN( "SHEN", "SHEN","QNKSUEJXARFVIPYH", "shen.jpg"),
    SHYVANA( "SHYVANA", "SHYVANA","FVTAZUXODNAYHCSB", "shyvana.jpg"),
    SINGED( "SINGED", "SINGED","TSECWBDUQGOJYIMN", "singed.jpg"),
    SION( "SION", "SION","WJDHSBYXCUOZPITN", "sion.jpg"),
    SIVIR( "SIVIR", "SIVIR","IMDWRNVSIPCXFGKL", "sivir.jpg"),
    SKARNER( "SKARNER", "SKARNER","WNXIMSREKAJCVBDR", "skarner.jpg"),
    SONA( "SONA", "SONA","CZPLTQOMNXIYSHEA", "sona.jpg"),
    SORAKA( "SORAKA", "SORAKA","AARUSOFCGBKQDZWI", "soraka.jpg"),
    SWAIN( "SWAIN", "SWAIN","IWTDZSOUBXLKFANP", "swain.jpg"),
    SYLAS( "SYLAS", "SYLAS","UMYATCFXKHSGOILS", "sylas.jpg"),
    SYNDRA( "SYNDRA", "SYNDRA","LSAXWDIEYBRZKJCN", "syndra.jpg"),
    TAHMKENCH( "TAHM KENCH", "TAHMKENCH","QXEFHLSKRGMAHCNT", "tahmkench.jpg"),
    TALIYAH( "TALIYAH", "TALIYAH","YBVEIANTZWLAGHUP", "taliyah.jpg"),
    TALON( "TALON", "TALON","KFZSANMPGHIWUOLT", "talon.jpg"),
    TARIC( "TARIC", "TARIC","GJPRKYCFZDWAQTOI", "taric.jpg"),
    TEEMO( "TEEMO", "TEEMO","GOFEQETBXNHCWAML", "teemo.jpg"),
    THRESH( "THRESH", "THRESH","KHOMRHSEPFXBTIGA", "thresh.jpg"),
    TRISTANA( "TRISTANA", "TRISTANA","AVJYPSBTRITFALNX", "tristana.jpg"),
    TRUNDLE( "TRUNDLE", "TRUNDLE","ANZLOUIXCTEDRBWG", "trundle.jpg"),
    TRYNDAMERE( "TRYNDAMERE", "TRYNDAMERE","ARRSFNTEKEOIPDYM", "tryndamere.jpg"),
    TWISTEDFATE( "TWISTED FATE", "TWISTEDFATE","TNEETAQXSIUFTWDR", "twistedfate.jpg"),
    TWITCH( "TWITCH", "TWITCH","TJYOZEWITUHRDMLC", "twitch.jpg"),
    UDYR( "UDYR", "UDYR","WBYSNFUDKIQHPJER", "udyr.jpg");

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

        fun getByName(name: String): ChampionsPlatinaDiamanteEnum? {
            values().forEach {
                if (it.nomeExibicao == name){
                    return it
                }
            }

            return null
        }

    }
}