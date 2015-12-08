// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;


// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bb, RemoteControl

final class bc
    implements android.media.RemoteControlClient.OnGetPlaybackPositionListener
{

    final bb a;

    bc(bb bb1)
    {
        a = bb1;
        super();
    }

    public final long onGetPlaybackPosition()
    {
        if (bb.a(a) != null)
        {
            return (long)bb.a(a).t();
        } else
        {
            return 0L;
        }
    }
}
