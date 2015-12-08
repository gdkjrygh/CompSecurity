// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.e;

import android.net.Uri;
import com.android.volley.l;
import com.android.volley.n;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.DeviceAuthorizerForV2Apis;
import com.google.android.apps.youtube.core.au;
import com.google.android.apps.youtube.datalib.offline.j;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.datalib.e:
//            f, c, a

public final class b
{

    private final List a;
    private final DeviceAuthorizerForV2Apis b;
    private final l c;
    private final j d;
    private final com.google.android.apps.youtube.common.e.b e;
    private final au f;
    private final com.google.android.apps.youtube.datalib.config.c g;
    private final Executor h;

    public b(List list, DeviceAuthorizerForV2Apis deviceauthorizerforv2apis, l l1, j j1, com.google.android.apps.youtube.common.e.b b1, au au1, com.google.android.apps.youtube.datalib.config.c c1, 
            Executor executor)
    {
        a = (List)com.google.android.apps.youtube.common.fromguava.c.a(list);
        b = (DeviceAuthorizerForV2Apis)com.google.android.apps.youtube.common.fromguava.c.a(deviceauthorizerforv2apis);
        c = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        d = (j)com.google.android.apps.youtube.common.fromguava.c.a(j1);
        e = (com.google.android.apps.youtube.common.e.b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        f = (au)com.google.android.apps.youtube.common.fromguava.c.a(au1);
        g = (com.google.android.apps.youtube.datalib.config.c)com.google.android.apps.youtube.common.fromguava.c.a(c1);
        h = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
    }

    public static f a(String s, int i)
    {
        return new f(s, i, (byte)0);
    }

    public final void a(f f1, n n)
    {
        Uri uri = f1.a();
        boolean flag;
        if (uri != null && uri.getScheme() != null && uri.getHost() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            h.execute(new com.google.android.apps.youtube.datalib.e.c(this, n, uri));
            return;
        }
        n = new a(f1.e(), f1.f(), f1.b(), f1.d(), f1.c(), f1.g(), n, a, b, e, g);
        L.e("Sending from HTTP204 service");
        if (!f.P() || !f1.f())
        {
            c.a(n);
            return;
        } else
        {
            d.a(n);
            return;
        }
    }
}
