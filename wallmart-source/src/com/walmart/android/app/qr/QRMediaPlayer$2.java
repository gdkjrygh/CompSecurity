// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.qr;

import android.media.MediaPlayer;
import android.widget.VideoView;

// Referenced classes of package com.walmart.android.app.qr:
//            QRMediaPlayer

class this._cls0
    implements android.widget.MediaPlayerControl
{

    final QRMediaPlayer this$0;

    public boolean canPause()
    {
        return true;
    }

    public boolean canSeekBackward()
    {
        return QRMediaPlayer.access$100(QRMediaPlayer.this).canSeekBackward();
    }

    public boolean canSeekForward()
    {
        return QRMediaPlayer.access$100(QRMediaPlayer.this).canSeekForward();
    }

    public int getAudioSessionId()
    {
        return QRMediaPlayer.access$200(QRMediaPlayer.this).getAudioSessionId();
    }

    public int getBufferPercentage()
    {
        return QRMediaPlayer.access$100(QRMediaPlayer.this).getBufferPercentage();
    }

    public int getCurrentPosition()
    {
        return QRMediaPlayer.access$200(QRMediaPlayer.this).getCurrentPosition();
    }

    public int getDuration()
    {
        return QRMediaPlayer.access$200(QRMediaPlayer.this).getDuration();
    }

    public boolean isPlaying()
    {
        return QRMediaPlayer.access$200(QRMediaPlayer.this).isPlaying();
    }

    public void pause()
    {
        QRMediaPlayer.access$200(QRMediaPlayer.this).pause();
    }

    public void seekTo(int i)
    {
        QRMediaPlayer.access$200(QRMediaPlayer.this).seekTo(i);
    }

    public void start()
    {
        QRMediaPlayer.access$200(QRMediaPlayer.this).start();
    }

    ontrol()
    {
        this$0 = QRMediaPlayer.this;
        super();
    }
}
