package com.ujujzk.tryexoplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import org.videolan.libvlc.IVLCVout
import org.videolan.libvlc.LibVLC
import org.videolan.libvlc.MediaPlayer


class VlcActivity : AppCompatActivity() , IVLCVout.OnNewVideoLayoutListener{


    lateinit var mLibVLC: LibVLC
    lateinit var mMediaPlayer: MediaPlayer
    lateinit var mVideoSurfaceFrame: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val args = ArrayList<String>()
        args.add("-vvv")
        mLibVLC = LibVLC(this, args)
        mMediaPlayer = MediaPlayer(mLibVLC)

        mVideoSurfaceFrame = findViewById(R.id.video_surface_frame)
    }


    override fun onNewVideoLayout(
        vlcVout: IVLCVout?,
        width: Int,
        height: Int,
        visibleWidth: Int,
        visibleHeight: Int,
        sarNum: Int,
        sarDen: Int
    ) {




    }
}
