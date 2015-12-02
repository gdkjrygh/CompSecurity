// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.media.MediaPlayer;

// Referenced classes of package com.whatsapp.util:
//            s

class t extends s
{

    MediaPlayer a;

    public t(String s1)
    {
        a = new MediaPlayer();
        a.setDataSource(s1);
    }

    public int a()
    {
        return a.getDuration();
    }

    public void a(int j)
    {
        a.setAudioStreamType(j);
    }

    public void a(android.media.MediaPlayer.OnErrorListener onerrorlistener)
    {
        a.setOnErrorListener(onerrorlistener);
    }

    public void a(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
    {
        a.setOnPreparedListener(onpreparedlistener);
    }

    public int b()
    {
        return a.getCurrentPosition();
    }

    public void b(int j)
    {
        a.seekTo(j);
    }

    public void c()
    {
        a.prepare();
    }

    public void d()
    {
        a.release();
    }

    public int e()
    {
        return a.getAudioSessionId();
    }

    public boolean f()
    {
        return a.isPlaying();
    }

    public void g()
    {
        a.stop();
    }

    public void h()
    {
        a.pause();
    }

    public void i()
    {
        a.start();
    }
}
