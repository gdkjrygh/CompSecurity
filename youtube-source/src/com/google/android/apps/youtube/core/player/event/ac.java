// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.event;

import com.google.android.apps.youtube.core.client.a.g;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;

public class ac extends g
{

    private final com.google.android.apps.youtube.core.player.Director.VideoStage b;
    private final PlaybackPair c;
    private final String d;
    private final VastAd e;
    private final boolean f;

    public ac(com.google.android.apps.youtube.core.player.Director.VideoStage videostage, PlaybackPair playbackpair, String s, VastAd vastad, boolean flag)
    {
        b = videostage;
        c = playbackpair;
        d = s;
        e = vastad;
        f = flag;
    }

    public final void a(String s)
    {
        super.a(s);
    }

    public final com.google.android.apps.youtube.core.player.Director.VideoStage c()
    {
        return b;
    }

    public final PlaybackPair d()
    {
        return c;
    }

    public final VastAd e()
    {
        return e;
    }

    public final boolean f()
    {
        return f;
    }
}
