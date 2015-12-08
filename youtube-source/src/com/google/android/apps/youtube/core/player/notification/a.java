// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.notification;


// Referenced classes of package com.google.android.apps.youtube.core.player.notification:
//            ExternalPlaybackControllerV14, j

final class a
    implements android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
{

    final ExternalPlaybackControllerV14 a;

    a(ExternalPlaybackControllerV14 externalplaybackcontrollerv14)
    {
        a = externalplaybackcontrollerv14;
        super();
    }

    public final void onPlaybackPositionUpdate(long l)
    {
        ExternalPlaybackControllerV14.a(a).a(l);
    }
}
