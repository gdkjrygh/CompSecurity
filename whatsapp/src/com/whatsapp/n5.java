// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.media.MediaPlayer;

// Referenced classes of package com.whatsapp:
//            VideoView

class n5
    implements android.media.MediaPlayer.OnCompletionListener
{

    final VideoView a;

    n5(VideoView videoview)
    {
        a = videoview;
        super();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        VideoView.d(a, 5);
        VideoView.g(a, 5);
        if (VideoView.c(a) != null)
        {
            VideoView.c(a).onCompletion(VideoView.d(a));
        }
    }
}
