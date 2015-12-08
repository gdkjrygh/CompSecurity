// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;
import com.walmart.android.app.main.AppState;
import com.walmart.android.ui.CustomProgressDialog;

public class QRMediaPlayer extends Activity
    implements android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.view.SurfaceHolder.Callback
{

    public static final String MEDIA_URL = "media";
    private static final String TAG = "MediaPlayerDemo";
    private Bundle extras;
    private SurfaceHolder holder;
    private boolean mIsVideoReadyToBePlayed;
    private boolean mIsVideoSizeKnown;
    private ProgressDialog mLoadingDialog;
    private MediaPlayer mMediaPlayer;
    private VideoView mPreview;
    private int mVideoHeight;
    private int mVideoWidth;
    private String path;
    private android.widget.MediaController.MediaPlayerControl playerInterface;

    public QRMediaPlayer()
    {
        mIsVideoSizeKnown = false;
        mIsVideoReadyToBePlayed = false;
        playerInterface = new android.widget.MediaController.MediaPlayerControl() {

            final QRMediaPlayer this$0;

            public boolean canPause()
            {
                return true;
            }

            public boolean canSeekBackward()
            {
                return mPreview.canSeekBackward();
            }

            public boolean canSeekForward()
            {
                return mPreview.canSeekForward();
            }

            public int getAudioSessionId()
            {
                return mMediaPlayer.getAudioSessionId();
            }

            public int getBufferPercentage()
            {
                return mPreview.getBufferPercentage();
            }

            public int getCurrentPosition()
            {
                return mMediaPlayer.getCurrentPosition();
            }

            public int getDuration()
            {
                return mMediaPlayer.getDuration();
            }

            public boolean isPlaying()
            {
                return mMediaPlayer.isPlaying();
            }

            public void pause()
            {
                mMediaPlayer.pause();
            }

            public void seekTo(int i)
            {
                mMediaPlayer.seekTo(i);
            }

            public void start()
            {
                mMediaPlayer.start();
            }

            
            {
                this$0 = QRMediaPlayer.this;
                super();
            }
        };
    }

    private void continueAfterPrepare()
    {
        mMediaPlayer.setOnBufferingUpdateListener(this);
        mMediaPlayer.setOnCompletionListener(this);
        mMediaPlayer.setOnPreparedListener(this);
        mMediaPlayer.setOnVideoSizeChangedListener(this);
        mMediaPlayer.setAudioStreamType(3);
        final MediaController controller = new MediaController(this);
        controller.setMediaPlayer(playerInterface);
        controller.setAnchorView(mPreview);
        controller.setEnabled(true);
        mPreview.setMediaController(controller);
        mPreview.setOnTouchListener(new android.view.View.OnTouchListener() {

            final QRMediaPlayer this$0;
            final MediaController val$controller;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                controller.show(4000);
                return false;
            }

            
            {
                this$0 = QRMediaPlayer.this;
                controller = mediacontroller;
                super();
            }
        });
    }

    private void doCleanUp()
    {
        mVideoWidth = 0;
        mVideoHeight = 0;
        mIsVideoReadyToBePlayed = false;
        mIsVideoSizeKnown = false;
    }

    private void playVideo()
    {
        doCleanUp();
        try
        {
            path = extras.getString("media");
            mMediaPlayer = new MediaPlayer();
            mMediaPlayer.setDataSource(path);
            mMediaPlayer.setDisplay(holder);
            mMediaPlayer.prepareAsync();
            continueAfterPrepare();
            return;
        }
        catch (Exception exception)
        {
            Log.e("MediaPlayerDemo", (new StringBuilder()).append("error: ").append(exception.getMessage()).toString(), exception);
        }
    }

    private void releaseMediaPlayer()
    {
        if (mMediaPlayer != null)
        {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

    private void startVideoPlayback()
    {
        holder.setFixedSize(mVideoWidth, mVideoHeight);
        mMediaPlayer.start();
    }

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (AppState.rerouteOnAppStart(this))
        {
            return;
        } else
        {
            setContentView(0x7f040099);
            mPreview = (VideoView)findViewById(0x7f10020b);
            holder = mPreview.getHolder();
            holder.addCallback(this);
            holder.setType(3);
            extras = getIntent().getExtras();
            mLoadingDialog = CustomProgressDialog.create(this);
            mLoadingDialog.setMessage("Loading...");
            mLoadingDialog.setIndeterminate(true);
            mLoadingDialog.setCancelable(true);
            mLoadingDialog.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

                final QRMediaPlayer this$0;

                public void onCancel(DialogInterface dialoginterface)
                {
                    mLoadingDialog.dismiss();
                }

            
            {
                this$0 = QRMediaPlayer.this;
                super();
            }
            });
            mLoadingDialog.show();
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        releaseMediaPlayer();
        doCleanUp();
    }

    protected void onPause()
    {
        super.onPause();
        releaseMediaPlayer();
        doCleanUp();
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        mIsVideoReadyToBePlayed = true;
        if (mIsVideoReadyToBePlayed && mIsVideoSizeKnown)
        {
            startVideoPlayback();
        }
        mLoadingDialog.dismiss();
    }

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        if (i == 0 || j == 0)
        {
            Log.e("MediaPlayerDemo", (new StringBuilder()).append("invalid video width(").append(i).append(") or height(").append(j).append(")").toString());
        } else
        {
            mIsVideoSizeKnown = true;
            mVideoWidth = i;
            mVideoHeight = j;
            if (mIsVideoReadyToBePlayed && mIsVideoSizeKnown)
            {
                startVideoPlayback();
                return;
            }
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        playVideo();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
    }



}
