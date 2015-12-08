// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.backend.a.l;
import com.google.android.apps.ytremote.backend.logic.a;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.PairingCode;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            t, YouTubeTvScreen

final class u
    implements Runnable
{

    final PairingCode a;
    final b b;
    final String c;
    final t d;

    u(t t1, PairingCode pairingcode, b b1, String s)
    {
        d = t1;
        a = pairingcode;
        b = b1;
        c = s;
        super();
    }

    public final void run()
    {
        CloudScreen cloudscreen = com.google.android.apps.youtube.app.remote.t.a(d).a(a);
        if (cloudscreen == null)
        {
            b.a(a, new Exception("Screen is null."));
            return;
        }
        Pair pair = com.google.android.apps.youtube.app.remote.t.b(d);
        if (pair == com.google.android.apps.youtube.app.remote.t.a())
        {
            b.a(a, new Exception("Authentication failed."));
            return;
        }
        if (!TextUtils.isEmpty(c))
        {
            cloudscreen = cloudscreen.withName(c);
        } else
        {
            java.util.List list = t.c(d).a((String)pair.first, (String)pair.second);
            cloudscreen = cloudscreen.withName(com.google.android.apps.youtube.app.remote.t.a(d, list, cloudscreen));
        }
        t.c(d).a((String)pair.first, (String)pair.second, cloudscreen);
        b.a(a, new YouTubeTvScreen(cloudscreen));
    }
}
