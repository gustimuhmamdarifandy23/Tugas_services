package com.uty.services_105

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button facebook jika diklik akan menampilkan halaman facebook.com
        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http : //www.facebook.com/ langitinspirasi"))
            startActivity(i)
        })

            //button instagram jika diklik akan menampilkan halaman instagram.com
            btn_instagram.setOnClickListener({
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("htttp://www.instagram.com/ langitinspirasi.co.id"))
                startActivity(i)
            })

                val MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.musik1)

                //button yang berfungdi untuk memutar mp3
                btn_play.setOnClickListener {
                    MediaPlayer?.start()
                }
                //button yang berfungsi untuk melakukan pause mp3
                btn_pause.setOnClickListener {
                    MediaPlayer?.pause()
                }
                //button yang berfungsi untuk melakukan stop mp3
                btn_stop.setOnClickListener {
                    MediaPlayer?.pause()
                    MediaPlayer?.seekTo(0)
                }

            }
    }

