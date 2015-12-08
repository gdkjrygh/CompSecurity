// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player;


// Referenced classes of package com.google.android.apps.youtube.core.player:
//            BackgroundPlayerService

final class e
    implements android.media.RemoteControlClient.OnGetPlaybackPositionListener
{

    final BackgroundPlayerService a;

    e(BackgroundPlayerService backgroundplayerservice)
    {
        a = backgroundplayerservice;
        super();
    }

    public final long onGetPlaybackPosition()
    {
        return BackgroundPlayerService.a(a);
    }
}
