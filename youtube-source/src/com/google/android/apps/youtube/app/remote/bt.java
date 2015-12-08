// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.net.Uri;
import com.google.android.apps.ytremote.logic.e;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.YouTubeDevice;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bs, bk, YouTubeTvScreen, bp

final class bt
    implements e
{

    final YouTubeDevice a;
    final bp b;
    final bs c;

    bt(bs bs1, YouTubeDevice youtubedevice, bp bp)
    {
        c = bs1;
        a = youtubedevice;
        b = bp;
        super();
    }

    public final void a(int i)
    {
        as as = bk.a(c.a, i);
        bk.a(c.a, (new StringBuilder("Could not find cloud screen corresponding to DIAL device  ")).append(a).append(" ").append(as).toString());
        YouTubeTvScreen youtubetvscreen = c.a.x();
        if (youtubetvscreen == null || !youtubetvscreen.hasDevice() || !youtubetvscreen.getDevice().equals(a))
        {
            bk.a(c.a, (new StringBuilder("Connection to DIAL device ")).append(a).append(" was canceled in the meantime. Will not move to error state.").toString());
            return;
        } else
        {
            bk.c(c.a, false);
            c.a.a(as);
            return;
        }
    }

    public final void a(Uri uri)
    {
        bk.a(c.a, (new StringBuilder("Successfully launched YouTube TV on DIAL device ")).append(a).toString());
        if (uri != null)
        {
            bk.f(c.a).put(a.getSsdpId(), uri);
        }
    }

    public final void a(CloudScreen cloudscreen)
    {
        bk.a(c.a, (new StringBuilder("Found corresponding cloud screen ")).append(cloudscreen).append(" for DIAL device ").append(a).toString());
        bs.a(c, a, cloudscreen);
        YouTubeTvScreen youtubetvscreen = c.a.x();
        if (youtubetvscreen == null || !youtubetvscreen.hasDevice() || !youtubetvscreen.getDevice().equals(a))
        {
            bk.a(c.a, (new StringBuilder("Connection to DIAL device ")).append(a).append(" was canceled. Will not connect to the cloud").toString());
        } else
        {
            bk.c(c.a, false);
            RemoteControl.State state = c.a.b();
            if (!cloudscreen.equals(bk.c(c.a)) || state != RemoteControl.State.CONNECTED && state != RemoteControl.State.CONNECTING)
            {
                bs.a(c, cloudscreen, b);
                return;
            }
        }
    }
}
