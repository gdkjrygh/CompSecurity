// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.VideoView;

public class VideoSplash extends Activity
    implements android.media.MediaPlayer.OnErrorListener, android.view.animation.Animation.AnimationListener
{

    private VideoView videoView;

    public VideoSplash()
    {
    }

    public void onAnimationEnd(Animation animation)
    {
        (new Handler()).post(new Runnable() {

            final VideoSplash this$0;

            public void run()
            {
                finish();
                overridePendingTransition(0x7f040003, 0x7f040004);
            }

            
            {
                this$0 = VideoSplash.this;
                super();
            }
        });
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    protected void onCreate(Bundle bundle)
    {
        setContentView(0x7f030016);
        videoView = (VideoView)findViewById(0x7f09005d);
        getWindow().setFormat(-3);
        if (getResources().getConfiguration().orientation == 1)
        {
            videoView.setVideoURI(Uri.parse((new StringBuilder("android.resource://")).append(getPackageName()).append("/").append(0x7f060001).toString()));
        }
        if (getResources().getConfiguration().orientation == 2)
        {
            videoView.setVideoURI(Uri.parse((new StringBuilder("android.resource://")).append(getPackageName()).append("/").append(0x7f060002).toString()));
        }
        videoView.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

            final VideoSplash this$0;

            public void onCompletion(MediaPlayer mediaplayer)
            {
            }

            
            {
                this$0 = VideoSplash.this;
                super();
            }
        });
        videoView.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() {

            final VideoSplash this$0;

            public void onPrepared(MediaPlayer mediaplayer)
            {
                int i = mediaplayer.getDuration();
                (new Handler()).postDelayed(new Runnable() {

                    final _cls3 this$1;

                    public void run()
                    {
                        finish();
                        overridePendingTransition(0x7f040003, 0x7f040004);
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                }, i - 500);
            }


            
            {
                this$0 = VideoSplash.this;
                super();
            }
        });
        videoView.setOnErrorListener(this);
        videoView.requestFocus();
        videoView.start();
        super.onCreate(bundle);
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        videoView.setVisibility(8);
        ((FrameLayout)findViewById(0x7f09005c)).setBackgroundResource(0x7f020076);
        mediaplayer = (ImageView)findViewById(0x7f09005e);
        mediaplayer.setVisibility(0);
        Animation animation = AnimationUtils.loadAnimation(this, 0x7f040006);
        animation.setAnimationListener(this);
        mediaplayer.startAnimation(animation);
        return true;
    }
}
