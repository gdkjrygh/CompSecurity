// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.util.Pair;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.backend.logic.a;
import com.google.android.apps.ytremote.model.ScreenId;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            t, YouTubeTvScreen

final class y
    implements Runnable
{

    final b a;
    final ScreenId b;
    final t c;

    y(t t1, b b1, ScreenId screenid)
    {
        c = t1;
        a = b1;
        b = screenid;
        super();
    }

    public final void run()
    {
        Object obj = com.google.android.apps.youtube.app.remote.t.b(c);
        if (obj == com.google.android.apps.youtube.app.remote.t.a())
        {
            a.a(b, new Exception("Authentication failed."));
            return;
        }
        obj = t.c(c).a((String)((Pair) (obj)).first, (String)((Pair) (obj)).second, b);
        if (obj != null)
        {
            a.a(b, new YouTubeTvScreen(((com.google.android.apps.ytremote.model.CloudScreen) (obj))));
            return;
        } else
        {
            L.c("A screen which did not exist in the combined screen storage was removed!");
            a.a(b, null);
            return;
        }
    }
}
