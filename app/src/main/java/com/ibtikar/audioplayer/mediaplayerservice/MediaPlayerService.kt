package com.ibtikar.audioplayer.mediaplayerservice

import android.app.Service
import android.content.Intent
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Binder
import android.os.IBinder

class MediaPlayerService : Service(), MediaPlayer.OnCompletionListener,
        MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener,
        MediaPlayer.OnInfoListener, MediaPlayer.OnBufferingUpdateListener, AudioManager.OnAudioFocusChangeListener {

    // Binder given to clients
    private val iBinder = LocalBinder()

    override fun onBind(intent: Intent): IBinder {
        return iBinder
    }

    //Invoked when playback of a media source has completed.
    override fun onCompletion(p0: MediaPlayer?) {
        //pass
    }

    //Invoked when the media source is ready for playback.
    override fun onPrepared(p0: MediaPlayer?) {
        //pass
    }

    //Invoked when there has been an error during an asynchronous operation.
    override fun onError(p0: MediaPlayer?, p1: Int, p2: Int): Boolean {
        //pass
        return false
    }

    //Invoked indicating the completion of a seek operation.
    override fun onSeekComplete(p0: MediaPlayer?) {
        //pass
    }

    //Invoked to communicate some info
    override fun onInfo(p0: MediaPlayer?, p1: Int, p2: Int): Boolean {
        //pass
        return false
    }

    //Invoked indicating buffering status of
    //a media resource being streamed over the network.
    override fun onBufferingUpdate(p0: MediaPlayer?, p1: Int) {
        //pass
    }

    //Invoked when the audio focus of the system is updated.
    override fun onAudioFocusChange(p0: Int) {
        //pass
    }

    /**
     * Class used for the client Binder.  Because we know this service always
     * runs in the same process as its clients, we don't need to deal with IPC.
     */
    inner class LocalBinder : Binder() {
        fun getService(): MediaPlayerService {
            return this@MediaPlayerService
        }
    }
}
