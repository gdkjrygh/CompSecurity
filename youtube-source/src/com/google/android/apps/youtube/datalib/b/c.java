// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.b;

import android.net.Uri;
import com.android.volley.l;
import com.google.android.apps.common.csi.lib.Sender;
import com.google.android.apps.common.csi.lib.k;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.o;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.DeviceClassification;
import com.google.android.apps.youtube.datalib.a.b;
import com.google.android.apps.youtube.datalib.a.e;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.datalib.b:
//            d, b

public final class c
    implements Sender
{

    final e a;
    private final l b;
    private final h c;
    private final DeviceClassification d;

    public c(String s, String s1, l l1, h h1, DeviceClassification deviceclassification)
    {
        b = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        c = (h)com.google.android.apps.youtube.common.fromguava.c.a(h1);
        d = (DeviceClassification)com.google.android.apps.youtube.common.fromguava.c.a(deviceclassification);
        h1 = k.a();
        l1 = h1;
        if (!k.a(s))
        {
            l1 = h1;
            if (!k.a(s1))
            {
                l1 = String.format("%s %s/%s", new Object[] {
                    h1, s, s1
                });
            }
        }
        a = new d(l1);
    }

    public final void a(String s, Map map)
    {
        s = o.a(Uri.parse(k.a(s, map)));
        s = new com.google.android.apps.youtube.datalib.b.b(d.a(s).a().toString(), a, b.a);
        if (c.a())
        {
            L.e((new StringBuilder("Pinging ")).append(s.c()).toString());
            b.a(s);
        }
    }
}
