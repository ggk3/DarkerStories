package com.nie.leagueofsplashart.utils

import android.content.Context

class SharedPreferencesUtils {
    companion object {

        fun getPontuacao(context : Context): Int {
            val sharedPreferences = context.getSharedPreferences("rank", 0)

            return sharedPreferences.getInt("pontuacao", 0)
        }

        fun setPontuacao(context : Context, pontuacao: Int) {
            val sharedPreferences = context.getSharedPreferences("rank", 0)

            sharedPreferences.edit().putInt("pontuacao", pontuacao).apply()
        }

        fun getElo(context : Context): Int {
            val sharedPreferences = context.getSharedPreferences("rank", 0)

            return sharedPreferences.getInt("elo", 1)
        }

        fun setElo(context : Context, elo: Int) {
            val sharedPreferences = context.getSharedPreferences("rank", 0)

            sharedPreferences.edit().putInt("elo", elo).apply()
        }

        fun getCampeaoAtual(context : Context): Int {
            val sharedPreferences = context.getSharedPreferences("campeoes", 0)

            return sharedPreferences.getInt("atual", 0)
        }

        fun setCampeaoAtual(context : Context, atual: Int) {
            val sharedPreferences = context.getSharedPreferences("campeoes", 0)

            sharedPreferences.edit().putInt("atual", atual).apply()
        }

        fun getCampeoesJogadosByElo(context : Context, elo: Int): MutableSet<String> {
            val sharedPreferences = context.getSharedPreferences("campeoesJogados", 0)

            return sharedPreferences.getStringSet(elo.toString(), HashSet())!!
        }

        fun setCampeoesJogadosByElo(context : Context, elo: Int, jogados: MutableSet<String>) {
            val sharedPreferences = context.getSharedPreferences("campeoesJogados", 0)

            sharedPreferences.edit().putStringSet(elo.toString(), jogados).apply()
        }

        fun getWards(context : Context): Int {
            val sharedPreferences = context.getSharedPreferences("wards", 0)

            return sharedPreferences.getInt("wards", 0)
        }

        fun setWards(context : Context, wards: Int) {
            val sharedPreferences = context.getSharedPreferences("wards", 0)

            sharedPreferences.edit().putInt("wards", wards).apply()
        }

        fun getAjudas(context : Context): Int {
            val sharedPreferences = context.getSharedPreferences("ajudas", 0)

            return sharedPreferences.getInt("ajudas", 0)
        }

        fun setAjudas(context : Context, ajudas: Int) {
            val sharedPreferences = context.getSharedPreferences("ajudas", 0)

            sharedPreferences.edit().putInt("ajudas", ajudas).apply()
        }


    }
}