package com.ujujzk.tryexoplayer

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.devbrackets.android.exomedia.listener.OnPreparedListener
import com.devbrackets.android.exomedia.ui.widget.VideoView
//import com.google.android.exoplayer2.DefaultLoadControl
//import com.google.android.exoplayer2.DefaultRenderersFactory
//import com.google.android.exoplayer2.ExoPlayerFactory
//import com.google.android.exoplayer2.source.ExtractorMediaSource
//import com.google.android.exoplayer2.source.dash.DashMediaSource
//import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
//import com.google.android.exoplayer2.ui.PlayerView
//import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory
//import com.google.android.exoplayer2.source.dash.DefaultDashChunkSource
//import com.google.android.exoplayer2.source.dash.DashChunkSource
//import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val playerView = findViewById<PlayerView>(R.id.video_view)
//
//        val player = ExoPlayerFactory.newSimpleInstance(
//            DefaultRenderersFactory(this),
//            DefaultTrackSelector(), DefaultLoadControl()
//        )
//
//        playerView.player = player
//        player.playWhenReady = true
//        //currentWindow (initialize with 0 to start with the first item in the Timeline) and
//        //playbackPosition (initialize with 0 to start from the beginning of the window)
//        player.seekTo(0, 0)
//
//        val uri = Uri.parse("https://bitmovin-a.akamaihd.net/content/playhouse-vr/m3u8s/105560.m3u8")
////            Uri.parse("https://s3-us-west-2.amazonaws.com/hls-playground/hls.m3u8")
//
//
////        val mediaSource = ExtractorMediaSource.Factory(DefaultHttpDataSourceFactory("exoplayer")).createMediaSource(uri)
//
////        player.prepare(mediaSource, true, false)
//
//        val manifestDataSourceFactory = DefaultHttpDataSourceFactory("ua")
//        val dashChunkSourceFactory = DefaultDashChunkSource.Factory(
//            DefaultHttpDataSourceFactory("ua", DefaultBandwidthMeter())
//        )
//        val ms = DashMediaSource.Factory(dashChunkSourceFactory, manifestDataSourceFactory)
//            .createMediaSource(uri)
//
//        player.prepare(ms, true, false)




        val videoView = findViewById<VideoView>(R.id.video_view)
        videoView.setOnPreparedListener { videoView.start() }

        videoView.setVideoURI(Uri.parse("https://bitmovin-a.akamaihd.net/content/playhouse-vr/m3u8s/105560.m3u8"))

    }


}
