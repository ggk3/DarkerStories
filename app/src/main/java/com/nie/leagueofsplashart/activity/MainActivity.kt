package com.nie.leagueofsplashart.activity

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.reward.RewardItem
import com.google.android.gms.ads.reward.RewardedVideoAd
import com.google.android.gms.ads.reward.RewardedVideoAdListener
import com.nie.leagueofsplashart.R
import com.nie.leagueofsplashart.utils.SharedPreferencesUtils


class MainActivity : AppCompatActivity(), RewardedVideoAdListener {

    private lateinit var eloImageView : ImageView;

    private lateinit var mRewardedVideoAd: RewardedVideoAd;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eloImageView = findViewById(R.id.eloImageView);

        MobileAds.initialize(this, "ca-app-pub-3851259313289325~6258652055")


        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this)
        mRewardedVideoAd.rewardedVideoAdListener = this


        loadRewardedVideoAd()

    }

    override fun onResume() {
        super.onResume()

        val elo = SharedPreferencesUtils.getElo(applicationContext)
        eloImageView.setImageDrawable(Drawable.createFromStream(assets.open("elos/elo$elo.png"), null))
    }

    fun jogar(view: View) {
        val intent = Intent(applicationContext, GameActivity::class.java)
        startActivity(intent)
    }

    private fun loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd("ca-app-pub-3851259313289325/9400477258",
            AdRequest.Builder().build())
    }

    fun assistirVideo(view: View) {
        if (mRewardedVideoAd.isLoaded) {
            mRewardedVideoAd.show()
        } else {
            Toast.makeText(applicationContext, R.string.video_nao_carregado, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRewardedVideoAdClosed() {
        loadRewardedVideoAd()
    }

    override fun onRewardedVideoAdLeftApplication() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onRewardedVideoAdLoaded() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onRewardedVideoAdOpened() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onRewardedVideoCompleted() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onRewarded(p0: RewardItem?) {

        var wards = SharedPreferencesUtils.getWards(applicationContext)
        wards += 1

        SharedPreferencesUtils.setWards(applicationContext, wards)

        Toast.makeText(applicationContext, "+1 Ward", Toast.LENGTH_SHORT).show()
    }

    override fun onRewardedVideoStarted() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onRewardedVideoAdFailedToLoad(p0: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
