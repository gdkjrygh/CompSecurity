// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.q;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.fromguava.e;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.c.f;
import com.google.android.apps.youtube.datalib.config.a;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            q, s

public final class r
{

    private final f a;
    private final e b;
    private final List c;
    private final List d;
    private final a e;
    private final String f;
    private final String g;

    public r(f f1, e e1, List list, List list1, a a1, String s, String s1)
    {
        a = (f)com.google.android.apps.youtube.common.fromguava.c.a(f1);
        b = e1;
        c = (List)com.google.android.apps.youtube.common.fromguava.c.a(list);
        d = (List)com.google.android.apps.youtube.common.fromguava.c.a(list1);
        e = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        f = s;
        g = s1;
    }

    public final com.google.android.apps.youtube.datalib.innertube.q a(s s, Class class1, l l)
    {
        s = new com.google.android.apps.youtube.datalib.innertube.q(s, class1, l, a, c, d, e, f, g, (byte)0);
        if (b != null)
        {
            s.a((q)b.b());
        }
        return s;
    }
}
