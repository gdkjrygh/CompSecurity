// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.media.MediaPlayer;

// Referenced classes of package com.whatsapp:
//            VideoView

class afg
    implements android.media.MediaPlayer.OnBufferingUpdateListener
{

    final VideoView a;

    afg(VideoView videoview)
    {
        a = videoview;
        super();
    }

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        VideoView.f(a, i);
    }
}
