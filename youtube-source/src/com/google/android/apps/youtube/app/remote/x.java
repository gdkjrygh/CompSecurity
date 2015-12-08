// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.util.Pair;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.backend.logic.a;
import com.google.android.apps.ytremote.model.ScreenId;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            t, YouTubeTvScreen

final class x
    implements Runnable
{

    final b a;
    final ScreenId b;
    final String c;
    final t d;

    x(t t1, b b1, ScreenId screenid, String s)
    {
        d = t1;
        a = b1;
        b = screenid;
        c = s;
        super();
    }

    public final void run()
    {
        Object obj = com.google.android.apps.youtube.app.remote.t.b(d);
        if (obj == com.google.android.apps.youtube.app.remote.t.a())
        {
            a.a(b, new Exception("Authentication failed."));
            return;
        } else
        {
            obj = t.c(d).a((String)((Pair) (obj)).first, (String)((Pair) (obj)).second, b, c);
            a.a(b, new YouTubeTvScreen(((com.google.android.apps.ytremote.model.CloudScreen) (obj))));
            return;
        }
    }
}
