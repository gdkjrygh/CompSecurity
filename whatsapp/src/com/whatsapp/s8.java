// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.media.MediaPlayer;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            VideoPreviewActivity

class s8
    implements android.media.MediaPlayer.OnPreparedListener
{

    final VideoPreviewActivity a;

    s8(VideoPreviewActivity videopreviewactivity)
    {
        a = videopreviewactivity;
        super();
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        a.findViewById(0x7f0b02c2).setVisibility(8);
    }
}
