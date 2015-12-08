// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


// Referenced classes of package com.google.android.apps.youtube.core.player:
//            TvWidevineMediaPlayer

final class aq
    implements Runnable
{

    final TvWidevineMediaPlayer a;

    aq(TvWidevineMediaPlayer tvwidevinemediaplayer)
    {
        a = tvwidevinemediaplayer;
        super();
    }

    public final void run()
    {
        TvWidevineMediaPlayer.a(a, -1);
    }
}
