// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.l;
import com.google.a.a.a.a.ar;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            a, i, g, e, 
//            r, f, p

public final class d extends a
    implements i
{

    public d(r r1, p p, l l1)
    {
        super(r1, p, l1);
    }

    public static String a(String s)
    {
        return (new StringBuilder("VL")).append(s).toString();
    }

    public final g a()
    {
        return new g(b, (byte)0);
    }

    public final void a(g g1, com.google.android.apps.youtube.datalib.a.l l1)
    {
        l1 = new e(this, l1);
        c.a(a.a(g1, com/google/a/a/a/a/ar, l1));
    }

    public final void a(String s, com.google.android.apps.youtube.datalib.a.l l1)
    {
        g g1 = a();
        g1.a(g.a);
        g1.b(s);
        a(g1, ((com.google.android.apps.youtube.datalib.a.l) (new f(this, l1))));
    }
}
