// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.util.Pair;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.backend.a.j;
import com.google.android.apps.ytremote.backend.logic.a;
import com.google.android.apps.ytremote.model.CloudScreen;
import java.util.Collections;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            t

final class ab
    implements Runnable
{

    final b a;
    final CloudScreen b;
    final t c;

    ab(t t1, b b1, CloudScreen cloudscreen)
    {
        c = t1;
        a = b1;
        b = cloudscreen;
        super();
    }

    public final void run()
    {
        Pair pair = com.google.android.apps.youtube.app.remote.t.b(c);
        if (pair == com.google.android.apps.youtube.app.remote.t.a())
        {
            a.a(b, new Exception("Authentication failed."));
            return;
        }
        List list = t.c(c).a((String)pair.first, (String)pair.second);
        Map map = t.g(c).a(Collections.singletonList(b));
        if (!list.contains(b))
        {
            t.c(c).a((String)pair.first, (String)pair.second, b);
        }
        if (map == null || !map.containsKey(b) || !((Boolean)map.get(b)).booleanValue())
        {
            a.a(b, new Exception("The screen is no longer available"));
            return;
        } else
        {
            a.a(b, b);
            return;
        }
    }
}
