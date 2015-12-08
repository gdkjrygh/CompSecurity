// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.ytremote.model.PairingCode;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            au, ae, YouTubeTvScreen

final class ai
    implements au
{

    final ae a;

    private ai(ae ae1)
    {
        a = ae1;
        super();
    }

    ai(ae ae1, byte byte0)
    {
        this(ae1);
    }

    public final void a(YouTubeTvScreen youtubetvscreen)
    {
        if (youtubetvscreen.equals(ae.b(a)))
        {
            youtubetvscreen = new Intent("com.google.android.youtube.action.mrp_screen_disconnected");
            youtubetvscreen.putExtra("pairingCode", ae.c(a).toString());
            ae.e(a).sendBroadcast(youtubetvscreen);
        }
    }
}
