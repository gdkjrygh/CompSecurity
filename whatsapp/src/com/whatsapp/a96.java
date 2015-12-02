// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;

// Referenced classes of package com.whatsapp:
//            VideoView

class a96
    implements android.media.MediaPlayer.OnVideoSizeChangedListener
{

    final VideoView a;

    a96(VideoView videoview)
    {
        a = videoview;
        super();
    }

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        VideoView.e(a, mediaplayer.getVideoWidth());
        VideoView.a(a, mediaplayer.getVideoHeight());
        if (VideoView.k(a) != 0 && VideoView.j(a) != 0)
        {
            a.getHolder().setFixedSize(VideoView.k(a), VideoView.j(a));
            a.requestLayout();
        }
    }
}
