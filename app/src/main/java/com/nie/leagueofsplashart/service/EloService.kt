package com.nie.leagueofsplashart.service

import android.content.Context
import com.nie.leagueofsplashart.enums.*
import com.nie.leagueofsplashart.model.Champion
import com.nie.leagueofsplashart.utils.SharedPreferencesUtils

class EloService(var elo: Int, var context: Context) {

    fun getRandomChampion() : Champion {
        val campeoesJogados = getCampeoesJogadosByEnumElo()

        try{
            when(elo){
                in 1 .. 8 -> return ChampionsFerroBronzeEnum.getRandomChampion(campeoesJogados)
                in 9 .. 16 -> return ChampionsPrataOuroEnum.getRandomChampion(campeoesJogados)
                in 17 .. 24 -> return ChampionsPlatinaDiamanteEnum.getRandomChampion(campeoesJogados)
                in 25 .. 32 -> return ChampionsMestreGraomestreEnum.getRandomChampion(campeoesJogados)
                in 33 .. 36 -> return ChampionsChallengerEnum.getRandomChampion(campeoesJogados)
            }
        } catch (e : Exception) {
            SharedPreferencesUtils.setCampeoesJogadosByElo(context, getEnumElo(), HashSet())
            return getRandomChampion()
        }

        return ChampionsFerroBronzeEnum.getRandomChampion(campeoesJogados);
    }

    fun getCampeoesJogadosByEnumElo(): MutableSet<String> {
       return SharedPreferencesUtils.getCampeoesJogadosByElo(context, getEnumElo())
    }

    fun salvaCampeaoAtual(nomeExibicao: String) {
        val campeoesJogadosByElo = SharedPreferencesUtils.getCampeoesJogadosByElo(context, getEnumElo())
        campeoesJogadosByElo.add(nomeExibicao)
        SharedPreferencesUtils.setCampeoesJogadosByElo(context, getEnumElo(), campeoesJogadosByElo);
    }

    private fun getEnumElo(): Int {
        when (elo) {
            in 1..8 -> return 1
            in 9..16 -> return 2
            in 17..24 -> return 3
            in 25..32 -> return 4
            in 33..36 -> return 5
        }
        return 1
    }

    fun getCampeaoAtual(campeaoAtual: Int): Champion {
        when(elo){
            in 1 .. 8 -> return ChampionsFerroBronzeEnum.getCampeaoAtual(campeaoAtual)
            in 9 .. 16 -> return ChampionsPrataOuroEnum.getCampeaoAtual(campeaoAtual)
            in 17 .. 24 -> return ChampionsPlatinaDiamanteEnum.getCampeaoAtual(campeaoAtual)
            in 25 .. 32 -> return ChampionsMestreGraomestreEnum.getCampeaoAtual(campeaoAtual)
            in 33 .. 36 -> return ChampionsChallengerEnum.getCampeaoAtual(campeaoAtual)
        }

        return ChampionsFerroBronzeEnum.getRandomChampion(HashSet())
    }


}