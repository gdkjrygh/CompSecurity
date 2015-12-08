// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.a;

import com.android.volley.Request;
import com.android.volley.j;
import com.android.volley.toolbox.a;
import com.android.volley.toolbox.f;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.config.e;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.google.android.apps.youtube.datalib.a:
//            r

public final class h extends a
{

    private final e d;
    private final b e;

    public h(f f, e e1, b b1)
    {
        super(f);
        d = (e)c.a(e1);
        e = (b)c.a(b1);
    }

    public final j a(Request request)
    {
        if (request instanceof r)
        {
            Object obj = (r)request;
            if (d.a())
            {
                L.d(((r) (obj)).s());
            }
            long l = e.b();
            request = super.a(request);
            long l1 = e.b();
            if (d.a())
            {
                L.d(String.format(Locale.US, "Response for %s took %d ms and had status code %d", new Object[] {
                    ((r) (obj)).c(), Long.valueOf(l1 - l), Integer.valueOf(((j) (request)).a)
                }));
            }
            if (d.b())
            {
                L.d("Logging response for YouTube API call.");
                for (obj = ((r) (obj)).b(request).iterator(); ((Iterator) (obj)).hasNext(); L.d((String)((Iterator) (obj)).next())) { }
            }
            return request;
        } else
        {
            return super.a(request);
        }
    }
}
