// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.fromguava.d;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            af, r

public class m
    implements af
{

    private final d a;
    private final a b;
    private final af c;

    protected m(a a1, af af1)
    {
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
        a = null;
    }

    public m(d d1, a a1, af af1)
    {
        a = (d)com.google.android.apps.youtube.common.fromguava.c.a(d1);
        b = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        c = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
    }

    static a a(m m1)
    {
        return m1.b;
    }

    protected d a(Object obj, Object obj1)
    {
        return a;
    }

    public final void a(Object obj, b b1)
    {
        c.a(obj, new r(this, b1));
    }
}
