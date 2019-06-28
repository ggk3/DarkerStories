package com.nie.leagueofsplashart.activity

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.paris.Paris
import com.nie.leagueofsplashart.R
import com.nie.leagueofsplashart.model.Champion
import com.nie.leagueofsplashart.service.EloService
import com.nie.leagueofsplashart.utils.SharedPreferencesUtils


class GameActivity : AppCompatActivity() {

    private var tentativa : String = ""
    private lateinit var resposta : String;

    private var listLetterAnswer = ArrayList<TextView>()
    private var buttonsClicked = ArrayList<View>()

    private lateinit var pontuacaoTextView: TextView;
    private lateinit var wardsTextView: TextView;

    private lateinit var splashArtImageView : ImageView;

    private lateinit var answerLayout : LinearLayout;

    private var answerLayoutAtivo = 1;
    private var ajudas = 0;

    private lateinit var optionsLayout : GridLayout;

    private lateinit var eloService : EloService;

    private lateinit var campeao: Champion;

    private var espaco = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        answerLayout = findViewById(R.id.answerLayout)

        optionsLayout = findViewById(R.id.optionsLayout)

        splashArtImageView = findViewById(R.id.splashArtImageView)

        pontuacaoTextView = findViewById(R.id.pontuacaoTextView)
        wardsTextView = findViewById(R.id.wardsTestView)

        val eloAtual = SharedPreferencesUtils.getElo(applicationContext)
        eloService = EloService(eloAtual, applicationContext)

        campeao = eloService.getCampeaoAtual(SharedPreferencesUtils.getCampeaoAtual(applicationContext))

        preencheCampeao(campeao)

        atualizaAjudas()
        atualizaViewPontuacao()
        atualizaViewWards()

    }

    fun atualizaAjudas() {
        ajudas = SharedPreferencesUtils.getAjudas(applicationContext)

        when(ajudas){
            0 ->         splashArtImageView.setPadding(-300, -300, -300 ,-300 )
            1 ->         splashArtImageView.setPadding(-150, -150, -150 ,-150 )
            2 ->         splashArtImageView.setPadding(0, 0, 0 ,0 )
        }
    }

    fun pular(view: View) {
        atualizaPontuacaoErro()
        escolheCampeao()

        atualizaViewWards()
    }

    fun ajuda(view: View) {

        if(ajudas == 2) {
            Toast.makeText(applicationContext, getString(R.string.sem_mais_ajuda), Toast.LENGTH_SHORT).show()
            return
        }

        var wards = SharedPreferencesUtils.getWards(applicationContext)
        if(wards == 0) {
            Toast.makeText(applicationContext, getString(R.string.voce_nao_possui_ward), Toast.LENGTH_SHORT).show()
            return
        }

        when(ajudas) {
            0 -> {
                splashArtImageView.setPadding(-150, -150, -150 ,-150 )
                ajudas++
            }
            1 -> {
                splashArtImageView.setPadding(0, 0, 0 ,0 )
                ajudas++
            }
        }

        SharedPreferencesUtils.setWards(applicationContext, --wards)
        SharedPreferencesUtils.setAjudas(applicationContext, ajudas)

        atualizaViewWards()
    }

    fun adicionarLetra(view: View){

        val letra = view.tag.toString()

        tentativa = tentativa.plus(letra)

        colocaLetraNoSlot(letra);

        if(resposta == tentativa){
            atualizaPontuacaoAcerto();
            eloService.salvaCampeaoAtual(campeao.nomeExibicao)
            escolheCampeao()
            return
        }

        if(resposta.length == tentativa.length) {
            limpaCampos();
            return
        }

        view.isEnabled = false
        buttonsClicked.add(view);
    }



    private fun atualizaPontuacaoAcerto() {

        var pontuacao = SharedPreferencesUtils.getPontuacao(applicationContext)
        var elo = SharedPreferencesUtils.getElo(applicationContext)

        if(elo != 36){
            if(pontuacao == 100) {
                pontuacao = 0
                SharedPreferencesUtils.setElo(applicationContext, ++elo)
            } else {
                pontuacao += campeao.pontuacao
            }

            if(pontuacao > 100)
                pontuacao = 100
        } else {
            pontuacao += campeao.pontuacao;
        }

        eloService.elo = elo

        SharedPreferencesUtils.setPontuacao(applicationContext, pontuacao)
        atualizaViewPontuacao()
    }

    private fun atualizaPontuacaoErro() {

        var pontuacao = SharedPreferencesUtils.getPontuacao(applicationContext)
        var elo = SharedPreferencesUtils.getElo(applicationContext)

        if(elo != 1){
            if(pontuacao == 0) {
                pontuacao = 100 - campeao.pontuacao;
                SharedPreferencesUtils.setElo(applicationContext, --elo)
            } else {
                pontuacao -= campeao.pontuacao;
            }

            if(pontuacao < 0)
                pontuacao = 0
        } else {
            if(pontuacao > 0) {
                pontuacao -= campeao.pontuacao;
            }

            if(pontuacao < 0)
                pontuacao = 0
        }

        eloService.elo = elo

        SharedPreferencesUtils.setPontuacao(applicationContext, pontuacao)
        atualizaViewPontuacao()
    }

    private fun colocaLetraNoSlot(letra: String) {
        listLetterAnswer.forEach {
            if (it.text.isNullOrEmpty()) {
                it.text = letra
                return
            }
        }
    }

    private fun limpaCampos() {
        listLetterAnswer.forEach {
            it.text = ""
        }

        tentativa = "";

        for(i in 0 until optionsLayout.childCount) {

            val textView = optionsLayout.getChildAt(i) as TextView
            textView.isEnabled = true

        }
    }

    private fun escolheCampeao() {

        campeao = eloService.getRandomChampion()
        SharedPreferencesUtils.setCampeaoAtual(applicationContext, campeao.posicaoEnum);
        SharedPreferencesUtils.setAjudas(applicationContext, 0)

        buttonsClicked.clear();

        preencheCampeao(campeao)
    }

    private fun preencheCampeao(campeao: Champion) {
        resposta = campeao.resposta;

        limpaCampos()

        preencheOpcoes(campeao.opcoes);

        answerLayoutAtivo = 1;

        answerLayout.removeAllViews();
        listLetterAnswer.clear();

        var textView: TextView;
        for(a in campeao.nomeExibicao){
            textView = TextView(this);

            Paris.styleBuilder(textView)
                .add(R.style.ChoiceButton)
                .apply();

            adicionaTextViewResposta(textView, a);

        }

        splashArtImageView.setPadding(-300, -300, -300 ,-300 )
        ajudas = 0

        alteraImagem(campeao.imagePath)


    }

    private fun alteraImagem(imagem: String){
        println(imagem)
        splashArtImageView.setImageDrawable(Drawable.createFromStream(assets.open("splasharts/$imagem"), null))
    }

    private fun adicionaTextViewResposta(textView : TextView, letra : Char) {
        if(letra.toString() == " "){
            espaco = true
            return
        }

        if(espaco) {
            Paris.styleBuilder(textView)
                .add(R.style.ChoiceButtonAfterSpace)
                .apply();
            espaco = false
        }

        answerLayout.addView(textView)

        listLetterAnswer.add(textView)
    }

    private fun preencheOpcoes(opcoes: String) {
        for(i in 0 until optionsLayout.childCount) {

            val textView = optionsLayout.getChildAt(i) as TextView
            textView.text = opcoes[i].toString()
            textView.tag = opcoes[i]

        }
    }

    private fun atualizaViewPontuacao() {
        val pontuacao = SharedPreferencesUtils.getPontuacao(applicationContext)

        pontuacaoTextView.text = "$pontuacao PDL"
    }

    private fun atualizaViewWards() {
        val wards = SharedPreferencesUtils.getWards(applicationContext)

        wardsTextView.text = "$wards Wards"
    }

    fun apagaLetra(view : View) {

        if(buttonsClicked.isEmpty()){
            return;
        }

        tentativa = tentativa.subSequence(0, tentativa.length -1).toString()

        buttonsClicked.last().isEnabled = true
        buttonsClicked.removeAt(buttonsClicked.lastIndex)

        listLetterAnswer.reversed().forEach {
                if (!it.text.isNullOrEmpty()) {
                    it.text = ""
                    return
                }
            }
    }
}
