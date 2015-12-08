// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.e;

import android.net.Uri;
import com.android.volley.VolleyError;
import com.android.volley.d;
import com.android.volley.j;
import com.android.volley.m;
import com.android.volley.n;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.core.async.DeviceAuthorizerForV2Apis;
import com.google.android.apps.youtube.datalib.a.e;
import com.google.android.apps.youtube.datalib.a.r;
import com.google.android.apps.youtube.datalib.config.c;
import com.google.android.apps.youtube.datalib.offline.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.datalib.e:
//            d

public final class a extends r
    implements l
{

    private final List a;
    private final DeviceAuthorizerForV2Apis b;
    private final String c;
    private final b d;
    private final boolean e;
    private final String f;
    private final int g;
    private final long h;
    private final com.google.android.apps.youtube.datalib.e.d i;

    public a(String s, boolean flag, String s1, int j, long l1, com.google.android.apps.youtube.datalib.e.d d1, 
            n n, List list, DeviceAuthorizerForV2Apis deviceauthorizerforv2apis, b b1, c c1)
    {
        super(0, s, n);
        a(new d((int)TimeUnit.SECONDS.toMillis(c1.e()), 0, 0.0F));
        a(false);
        c = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        f = (String)com.google.android.apps.youtube.common.fromguava.c.a(s1);
        g = j;
        h = l1;
        i = (com.google.android.apps.youtube.datalib.e.d)com.google.android.apps.youtube.common.fromguava.c.a(d1);
        a = (List)com.google.android.apps.youtube.common.fromguava.c.a(list);
        b = (DeviceAuthorizerForV2Apis)com.google.android.apps.youtube.common.fromguava.c.a(deviceauthorizerforv2apis);
        d = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        e = flag;
    }

    protected final m a(j j)
    {
        return m.a(null, null);
    }

    public final com.google.android.apps.youtube.a.a.c a()
    {
        com.google.android.apps.youtube.a.a.c c1 = new com.google.android.apps.youtube.a.a.c();
        c1.a(UUID.randomUUID().toString());
        c1.c(f);
        c1.b(h);
        c1.a(d.a());
        c1.a(g);
        c1.b(c());
        c1.b(0);
        java.util.Map.Entry entry;
        for (Iterator iterator = h().entrySet().iterator(); iterator.hasNext(); c1.a((new com.google.android.apps.youtube.a.a.b()).a((String)entry.getKey()).b((String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        c1.b(t_());
        return c1;
    }

    protected final volatile void a(Object obj)
    {
        i.a();
    }

    public final void b(VolleyError volleyerror)
    {
        com.google.android.apps.youtube.datalib.e.d d1 = i;
        com.google.android.apps.youtube.datalib.a.b.a(volleyerror);
        d1.b();
    }

    public final Map h()
    {
        HashMap hashmap = new HashMap();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((e)iterator.next()).a(hashmap)) { }
        try
        {
            hashmap.put("X-GData-Device", b.a(Uri.parse(c)));
        }
        catch (com.google.android.apps.youtube.core.async.DeviceAuthorizerForV2Apis.DeviceRegistrationException deviceregistrationexception)
        {
            return hashmap;
        }
        return hashmap;
    }
}
