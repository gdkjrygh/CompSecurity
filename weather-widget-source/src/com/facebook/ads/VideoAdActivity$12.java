// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.media.MediaPlayer;

// Referenced classes of package com.facebook.ads:
//            VideoAdActivity

class a
    implements android.media.etionListener
{

    final VideoAdActivity a;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        VideoAdActivity.access$1100(a, );
        VideoAdActivity.access$300(a);
    }

    onListener(VideoAdActivity videoadactivity)
    {
        a = videoadactivity;
        super();
    }
}
