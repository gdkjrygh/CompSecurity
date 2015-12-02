// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;

// Referenced classes of package com.whatsapp:
//            VideoView, App

class o5
    implements android.media.MediaPlayer.OnPreparedListener
{

    final VideoView a;

    o5(VideoView videoview)
    {
        a = videoview;
        super();
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        int i;
        VideoView.d(a, 2);
        VideoView.d(a, VideoView.c(a, VideoView.b(a, true)));
        if (VideoView.b(a) != null)
        {
            VideoView.b(a).onPrepared(VideoView.d(a));
        }
        VideoView.e(a, mediaplayer.getVideoWidth());
        VideoView.a(a, mediaplayer.getVideoHeight());
        i = VideoView.f(a);
        if (i != 0)
        {
            a.seekTo(i);
        }
        if (VideoView.k(a) == 0 || VideoView.j(a) == 0) goto _L2; else goto _L1
_L1:
label0:
        {
            a.getHolder().setFixedSize(VideoView.k(a), VideoView.j(a));
            if (VideoView.a(a) != VideoView.k(a) || VideoView.g(a) != VideoView.j(a))
            {
                break label0;
            }
            if (VideoView.e(a) == 3)
            {
                a.start();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (!a.isPlaying() && i == 0)
            {
                if (a.getCurrentPosition() <= 0);
            }
        }
_L4:
        return;
_L2:
        if (VideoView.e(a) == 3)
        {
            a.start();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
