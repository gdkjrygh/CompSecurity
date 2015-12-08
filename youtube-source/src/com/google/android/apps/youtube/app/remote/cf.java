// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.model.PairingCode;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            ce, YouTubeTvScreen

final class cf
    implements Runnable
{

    final PairingCode a;
    final YouTubeTvScreen b;
    final ce c;

    cf(ce ce1, PairingCode pairingcode, YouTubeTvScreen youtubetvscreen)
    {
        c = ce1;
        a = pairingcode;
        b = youtubetvscreen;
        super();
    }

    public final void run()
    {
        c.a.a(a, b);
    }
}
