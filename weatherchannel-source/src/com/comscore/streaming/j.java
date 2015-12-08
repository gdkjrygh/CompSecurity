// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import android.media.MediaPlayer;

// Referenced classes of package com.comscore.streaming:
//            StreamSenseMediaPlayer

class j
    implements android.media.MediaPlayer.OnPreparedListener
{

    final StreamSenseMediaPlayer a;

    j(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        a = streamsensemediaplayer;
        super();
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        StreamSenseMediaPlayer.a(a, String.valueOf(a.getCurrentPosition()));
        if (StreamSenseMediaPlayer.h(a) != null)
        {
            StreamSenseMediaPlayer.h(a).onPrepared(mediaplayer);
        }
    }
}
