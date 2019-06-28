package com.nie.leagueofsplashart.enums

import com.nie.leagueofsplashart.model.Champion

enum class ChampionsChallengerEnum(var nomeExibicao: String, var resposta: String, var opcoes: String, var imagePath: String) {

    FIORA_NIGHT_RAVEN( "FIORA", "FIORA","XCATPLEOJQIFRGWZ", "fioranightraven.jpg"),
    FIZZ_PELO_BRANQUINHO( "FIZZ", "FIZZ","YPULJZKFIATWZVRH", "fizzcottontail.jpg"),
    GALIO_ENCHANTED( "GALIO", "GALIO","LEIOUXFMYSAZNRGB", "galioenchanted.jpg"),
    GANGPLANK_DREAD_NOVA( "GANGPLANK", "GANGPLANK","ANHRXGKLFWAVGNPO", "gangplankdreadnova.jpg"),
    GAREN_GOD_KING( "GAREN", "GAREN","FXBRNGCIATEMUSQZ", "garengodking.jpg"),
    GNAR_GNAROSSAURO( "GNAR", "GNAR","AYCLNJRPBWGDHIOZ", "gnardinognar.jpg"),
    GRAGAS_ARTIC_OPS( "GRAGAS", "GRAGAS","TIRAGLACEBKSOXMG", "gragasarticopsgragas.jpg"),
    GRAVES_SNOW_DAY( "GRAVES", "GRAVES","VEHTWCIOGSFUNRAP", "gravessnowday.jpg"),
    HECARIM_ARCADE( "HECARIM", "HECARIM","MRDCIHNSFEVPTABW", "hecarimarcadehecarim.jpg"),
    HEIMERDINGER_DRAGON_TRAINER( "HEIMERDINGER", "HEIMERDINGER","EMDIAUWEPNGHEIRR", "heimerdingerdragontrainer.jpg"),
    ILLAOI_RESISATANCE( "ILLAOI", "ILLAOI","IXMFLDIAWJKSLHOC", "illaoiresistance.jpg"),
    IRELIA_DIVINE_SWORD( "IRELIA", "IRELIA","UTFMSLCAWIVEBRIO", "ireliadivinesword.jpg"),
    IVERN_DUNKMASTER( "IVERN", "IVERN","FREYNDWQIXTAVMOJ", "iverndunkmaster.jpg"),
    JANNA_FORECAST( "JANNA", "JANNA","EUKNAWAGNZJIMDBY", "jannaforecast.jpg"),
    JARVAN_IV_REINOS_COMBATENTES( "JARVAN IV", "JARVANIV","ZVVSJYANXQIAHDRK", "jarvanivwarriorkingdom.jpg"),
    JAX_GOD_STAFF( "JAX", "JAX","JSZTOYAQBWXENUMF", "jaxgodstaff.jpg"),
    JAYCE_FORSAKEN( "JAYCE", "JAYCE","GNVDASJEIFCXQLYT", "jayceforsaken.jpg"),
    JHIN_HIGH_NOON( "JHIN", "JHIN","JVAOFHUMKNIGECPD", "jhinhighnoon.jpg"),
    JINX_MAFIA( "JINX", "JINX","FWQVAJXEZNHMDIYL", "jinxmafia.jpg"),
    KAISA_KDA( "KAI'SA", "KAI'SA","FYAKC'JHTMGINASU", "kaisakda.jpg"),
    KALISTA_CHAMPIONSHIP( "KALISTA", "KALISTA","JWMAEYRSXTKLIAZG", "kalistachampionship.jpg"),
    KARMA_CONQUEROR( "KARMA", "KARMA","AZMVTRJKUSBQGCAY", "karmaconqueror.jpg"),
    KARTHUS_LIGHTSBANE( "KARTHUS", "KARTHUS","RDHSGATWQKMVYUNZ", "karthuslightsbane.jpg"),
    KASSADIN_COSMIC_REAVER( "KASSADIN", "KASSADIN","AUEDNASPKWZHSXCI", "kassadincosmicreaver.jpg"),
    KATARINA_PROJECT( "KATARINA", "KATARINA","IOFXNTAKABRPEAHZ", "katarinaprojectkatarina.jpg"),
    KAYLE_ASAS_ETEREAS( "KAYLE", "KAYLE","NXJUGAZIRYLDEPKO", "kayleaetherking.jpg"),
    KAYN_ODYSSEY( "KAYN", "KAYN","HLKJDNYQBTGMSAXP", "kaynodyssey.jpg"),
    KENNEN_ARTIC_OPS( "KENNEN", "KENNEN","UIWAVYZENGFKJNNE", "kennenarticopskennen.jpg"),
    KHAZIX_CHAMPIONSHIP( "KHA'ZIX", "KHA'ZIX","IW'EQNRZHYAUOKXV", "khazixchampionship.jpg"),
    KINDRED_SUPERAGLAXY( "KINDRED", "KINDRED","QRHNIWXOTMBDKDEU", "kindredsupergalaxy.jpg"),
    KLED_DOCES_OU_TRAVESSURAS( "KLED", "KLED","XOPMKTNHSBLZEUDJ", "kleddoceoutravessura.jpg"),
    KOGMAW_HEXTEK( "KOG'MAW", "KOG'MAW","OSGWC'QZEARKHFIM", "kogmawhextek.jpg"),
    LEBLANC_PROGRAM( "LEBLANC", "LEBLANC","CJELQTAFBSNKZUWL", "leblancprogram.jpg"),
    LEESIN_GOD_FIST( "LEE SIN", "LEESIN","EONWLIZQKMBEARPS", "leesingodfist.jpg"),
    LEONA_ECLIPSE( "LEONA", "LEONA","AYVLHEBNRKFOJGXU", "leonaeclipse.jpg"),
    LISSANDRA_COVEN( "LISSANDRA", "LISSANDRA","LXSUBWNIPTSAOADR", "lissandracoven.jpg"),
    LUCIAN_HIGH_NOON( "LUCIAN", "LUCIAN","LWIQUPBDSZKCYMNA", "lucianhighnoon.jpg"),
    LULU_DRAGON_TRAINER( "LULU", "LULU","AIOSYRXULMTQULFJ", "luludragontrainer.jpg"),
    LUX_LUNAR_EPRESS( "LUX", "LUX","KWLMVCEUYRQSIPXO", "luxlunarempress.jpg"),
    MALPHITE_GLACIAL( "MALPHITE", "MALPHITE","IMHTASYEPVCWLRZX", "malphiteglacial.jpg"),
    MALZAHAR_SHADOW_PRINCE( "MALZAHAR", "MALZAHAR","MBHKGIADZSPRALJA", "malzaharshadowprince.jpg"),
    MAOKAI_TOTEMIC( "MAOKAI", "MAOKAI","GTIUBMAQLJXOFAKC", "maokaitotemic.jpg"),
    MASTERYI_ASSASSIN( "MASTER YI", "MASTERYI","HIVRAKFUMWESTBCY", "masteryiassassin.jpg"),
    MISSFORTUNE_GUNGODESS( "MISS FORTUNE", "MISSFORTUNE","STYMRSQWCIONXUFE", "missfortunegungoddess.jpg"),
//    MORDEKAISER( "MORDEKAISER", "MORDEKAISER","ARQDYULKXIREESOM", "mordekaiser.jpg"),
    MORGANA_BEWITCHING( "MORGANA", "MORGANA","GQTBXJVADARFNMSO", "morganabewitching.jpg"),
    NAMI_KOI( "NAMI", "NAMI","MOITVEKFXASURNPQ", "namikoi.jpg"),
    NASUS_PHARAOH( "NASUS", "NASUS","SQUALYHMBZPFNOSC", "nasuspharaoh.jpg"),
    NAUTILUS_ABYSSAL( "NAUTILUS", "NAUTILUS","HDSVNOATIRELYUFU", "nautilusabyssal.jpg"),
    NEEKO_WINTER_WONDER( "NEEKO", "NEEKO","NEVKWHJEYTOLRZXF", "neekowinterwonder.jpg"),
    NIDALEE_SUPER_GALAXY( "NIDALEE", "NIDALEE","FWGSQUPNADVEOLIE", "nidaleesupergalaxy.jpg"),
    NOCTURNE_HAUNTING( "NOCTURNE", "NOCTURNE","PVJTBEUSCMKNORNG", "nocturnehaunting.jpg"),
    NUNUEWILLUMP_RUNGRY( "NUNU E WILLUMP", "NUNUEWILLUMP","NPENUUYMRULBLIKW", "nunuewillumpgrungy.jpg"),
    OLAF_BROLAF( "OLAF", "OLAF","AXKWHDTFGSOMLZRE", "olafbrolaf.jpg"),
    ORIANNA_WINTER_WONDER( "ORIANNA", "ORIANNA","KIUOAZPMNAVLYRHN", "oriannawinterwonder.jpg"),
    ORNN_THUNDERLORD( "ORNN", "ORNN","NJCZLXPTBEOUHRGN", "ornnthunderlord.jpg"),
    PANTHEON_DRAGON_SLAYER( "PANTHEON", "PANTHEON","NNRZSAYBOTGEWPHV", "pantheondragonslayer.jpg"),
    POPPY_NOXUS( "POPPY", "POPPY","BPPYMKCZLTOQAVPE", "poppynoxus.jpg"),
    PYKE_BLOODMOON( "PYKE", "PYKE","JVBQWXAURKSFEMPY", "pykebloodmoon.jpg"),
    QUINN_WOADSCOUT( "QUINN", "QUINN","CRMQEHBDNFNIJUGT", "quinnwoadscout.jpg"),
    RAKAN_IG( "RAKAN", "RAKAN","UOLBREIHDXNZKFAA", "rakanig.jpg"),
    RAMMUS_CHROME( "RAMMUS", "RAMMUS","MDPSORBCAVMKNWXU", "rammuschrome.jpg"),
    REKSAI_ETERNUM( "REK'SAI", "REK'SAI","UCAMWYKIDT'OEJSR", "reksaieternum.jpg"),
    RENEKTON_GALACTIC( "RENEKTON", "RENEKTON","INTOXYERHQCNBGKE", "renektongalactic.jpg"),
    RENGAR_MECHA( "RENGAR", "RENGAR","LUDGFJXNSACRYVER", "rengarmecha.jpg"),
    RIVEN_DAWNBRINGER( "RIVEN", "RIVEN","YIRZVQTDNOSHEPWG", "rivendawnbringer.jpg"),
    RUMBLE_SUPERGALAXY( "RUMBLE", "RUMBLE","AULESOFBDRZCGMVT", "rumblesupergalaxy.jpg"),
    RYZE_ZOMBIE( "RYZE", "RYZE","MOQIVKENRSAGLUYZ", "ryzezombie.jpg"),
    SEJUANI_BEAR_CAVALARY( "SEJUANI", "SEJUANI","IDSWUEAYZVNCJMXP", "sejuanibearcavalary.jpg"),
    SHACO_WORKSHOP( "SHACO", "SHACO","AXQPBOTUJHRSGCKE", "shacoworkshop.jpg"),
    SHEN_PULSIFIRE( "SHEN", "SHEN","QNKSUEJXARFVIPYH", "shenpulsefire.jpg"),
    SHYVANA_CHMPIONSHIP( "SHYVANA", "SHYVANA","FVTAZUXODNAYHCSB", "shyvanachampionship.jpg"),
    SINGED_SNOWDAY( "SINGED", "SINGED","TSECWBDUQGOJYIMN", "singedsnowday.jpg"),
    SION_LUMBERJACK( "SION", "SION","WJDHSBYXCUOZPITN", "sionlumberjack.jpg"),
    SIVIR_BADIT( "SIVIR", "SIVIR","IMDWRNVSIPCXFGKL", "sivirbandit.jpg"),
    SKARNER_EARTH_RUNE( "SKARNER", "SKARNER","WNXIMSREKAJCVBDR", "skarnerearthrune.jpg"),
    SONA_SILENT_NIGHT( "SONA", "SONA","CZPLTQOMNXIYSHEA", "sonasilentnight.jpg"),
    SORAKA_DRYAD( "SORAKA", "SORAKA","AARUSOFCGBKQDZWI", "sorakadryad.jpg"),
    SWAIN_NORTHERNFRONT( "SWAIN", "SWAIN","IWTDZSOUBXLKFANP", "swainnorthernfront.jpg"),
    SYLAS_LUNAS_WRAITH( "SYLAS", "SYLAS","UMYATCFXKHSGOILS", "sylaslunarwraith.jpg"),
    SYNDRA_ATLANTEAN( "SYNDRA", "SYNDRA","LSAXWDIEYBRZKJCN", "syndraatlantean.jpg"),
    TAHMKENCH_MASTER_CHEF( "TAHM KENCH", "TAHMKENCH","QXEFHLSKRGMAHCNT", "tahmkenchmasterchef.jpg"),
    TALIYAH_FRELJORD( "TALIYAH", "TALIYAH","YBVEIANTZWLAGHUP", "taliyahfreljord.jpg"),
    TALON_BLOOD_MOON( "TALON", "TALON","KFZSANMPGHIWUOLT", "talonbloodmoon.jpg"),
    TARIC_BLOODSTONE( "TARIC", "TARIC","GJPRKYCFZDWAQTOI", "taricbloodstone.jpg"),
    TEEMO_BEEMO( "TEEMO", "TEEMO","GOFEQETBXNHCWAML", "teemobeemo.jpg"),
    THRESH_DARKSTAR( "THRESH", "THRESH","KHOMRHSEPFXBTIGA", "threshdarkstar.jpg"),
    TRISTANA_BOMBEIRO( "TRISTANA", "TRISTANA","AVJYPSBTRITFALNX", "tristanafirefighter.jpg"),
    TRUNDLE_JUNKYARD( "TRUNDLE", "TRUNDLE","ANZLOUIXCTEDRBWG", "trundlejunkyard.jpg"),
    TRYNDAMERE_REINOS_COMBATENTES( "TRYNDAMERE", "TRYNDAMERE","ARRSFNTEKEOIPDYM", "tryndamerewarringkingdoms.jpg"),
    TWISTEDFATE_PULSEFIRE( "TWISTED FATE", "TWISTEDFATE","TNEETAQXSIUFTWDR", "twistedfatepulsefire.jpg"),
    TWITCH_VANDAL( "TWITCH", "TWITCH","TJYOZEWITUHRDMLC", "twitchvandal.jpg"),
    UDYR_SPIRITGUARD( "UDYR", "UDYR","WBYSNFUDKIQHPJER", "udyrspiritguard.jpg"),
    URGOT_BATTLECAST( "URGOT", "URGOT","SZTLAKIYQFJURGOH", "urgotbattlecast.jpg"),
    VARUS_CONQUEROR( "VARUS", "VARUS","LEIDGRFPYQHOAUVS", "varusconqueror.jpg"),
    VAYNE_PROJECT( "VAYNE", "VAYNE","OIYZFGABEHNVPTCU", "vayneproject.jpg"),
    VEIGAR_LEPRACHAUN( "VEIGAR", "VEIGAR","JXVEIBSHWGRKYMAQ", "veigarleprechaun.jpg"),
    VELKOZ_ARC_LIGHT( "VEL'KOZ", "VEL'KOZ","OKZT'HFXQMBLYVIE", "velkozarclight.jpg"),
    VI_PROJECT( "VI", "VI","VJXKPTOGYIBRDWMH", "viproject.jpg"),
    VIKTOR_CREATOR( "VIKTOR", "VIKTOR","OHSWARMZQIKTYJEV", "viktorcreator.jpg"),
    VLADIMIR_MARQUIS( "VLADIMIR", "VLADIMIR","AZUYODJRQVIPMNIL", "vladimirmarquis.jpg"),
    VOLIBEAR_RUNEGUARD( "VOLIBEAR", "VOLIBEAR","VOPATKBENWRQLISM", "volibearruneguard.jpg"),
    WARWICK_BIG_BAD( "WARWICK", "WARWICK","FYRXMEIWWGKQCABP", "warwickbigbad.jpg"),
    WUKONG_LANCERSTRTUS( "WUKONG", "WUKONG","YMSOKCZUABNGITXW", "wukonglancerstratus.jpg"),
    XAYAH_COSMICDUSK( "XAYAH", "XAYAH","TAGJDMHRAXLQYPKE", "xayahcosmicdusk.jpg"),
    XERATH_RUNEBORN( "XERATH", "XERATH","NWGOHAMXVEJTIKSR", "xerathuneborn.jpg"),
    XINZHAO_COSMIC_DEFENDER( "XIN ZHAO", "XINZHAO","UZLXSKOECWHGIANM", "xinzhaocosmicdefender.jpg"),
    YASUO_ODYSSEY( "YASUO", "YASUO","ISMBEYWXJAFPVNUO", "yasuoodyssey.jpg"),
    YORICK_ARCLIGHT( "YORICK", "YORICK","IUGHVCAOMRXWBKEY", "yorickarclight.jpg"),
    YUUMI_BATTLEACADEMY( "YUUMI", "YUUMI","ZWOHUBMYTLISEUJF", "yuumibattleacademy.jpg"),
    ZAC_SPECIAL_WEAPON( "ZAC", "ZAC","TJEDUVROZPKCWYAL", "zacspecialweapon.jpg"),
    ZED_SHOCKBLADE( "ZED", "ZED","ZDARSQIBUFLWVECP", "zedsshockblade.jpg"),
    ZIGGS_SNOWDAY( "ZIGGS", "ZIGGS","UZAGHCLBYSVONMIG", "ziggssnowday.jpg"),
    ZILEAN_BLOODMOON( "ZILEAN", "ZILEAN","VRGNCBWZIUEYATLO", "zileanbloodmoon.jpg"),
    ZOE_CYBERPOP( "ZOE", "ZOE","QWIOAGDBTYZMHELF", "zoecyberpop.jpg"),
    ZYRA_DRAGON_SORCERESS( "ZYRA", "ZYRA","LSCYTPABKNZRDWEJ", "zyradragonsorceress.jpg");

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

        fun getByName(name: String): ChampionsChallengerEnum? {
            values().forEach {
                if (it.nomeExibicao == name){
                    return it
                }
            }

            return null
        }
    }
}