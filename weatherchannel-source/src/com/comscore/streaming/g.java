// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import android.media.MediaPlayer;

// Referenced classes of package com.comscore.streaming:
//            StreamSenseMediaPlayer

class g
    implements android.media.MediaPlayer.OnCompletionListener
{

    final StreamSenseMediaPlayer a;

    g(StreamSenseMediaPlayer streamsensemediaplayer)
    {
        a = streamsensemediaplayer;
        super();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        StreamSenseMediaPlayer.a(a, mediaplayer);
        if (StreamSenseMediaPlayer.a(a) != null)
        {
            StreamSenseMediaPlayer.a(a).onCompletion(mediaplayer);
        }
    }
}
