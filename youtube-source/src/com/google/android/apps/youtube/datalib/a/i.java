// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.a;

import com.android.volley.VolleyError;
import com.android.volley.j;
import com.android.volley.n;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.config.a;
import java.util.Locale;

public final class i
    implements n
{

    private final n a;
    private final a b;

    public i(n n1, a a1)
    {
        a = (n)c.a(n1);
        b = (a)c.a(a1);
    }

    public final void a(VolleyError volleyerror)
    {
        if (b.a() && volleyerror.networkResponse != null)
        {
            j j1 = volleyerror.networkResponse;
            L.d(String.format(Locale.US, "Full response from error: %s", new Object[] {
                new String(j1.b)
            }));
        }
        a.a(volleyerror);
    }
}
