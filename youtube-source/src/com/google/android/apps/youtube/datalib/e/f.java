// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.e;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.e:
//            d

public final class f
{

    private String a;
    private Uri b;
    private boolean c;
    private long d;
    private int e;
    private d f;

    private f(String s, int i)
    {
        c = false;
        f = d.b;
        a = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
        e = i;
    }

    f(String s, int i, byte byte0)
    {
        this(s, i);
    }

    public final Uri a()
    {
        return b;
    }

    public final f a(long l)
    {
        d = l;
        return this;
    }

    public final f a(Uri uri)
    {
        b = (Uri)com.google.android.apps.youtube.common.fromguava.c.a(uri);
        return this;
    }

    public final f a(boolean flag)
    {
        c = flag;
        return this;
    }

    public final void a(d d1)
    {
        f = d1;
    }

    public final String b()
    {
        return a;
    }

    public final long c()
    {
        return d;
    }

    public final int d()
    {
        return e;
    }

    public final String e()
    {
        return b.toString();
    }

    public final boolean f()
    {
        return c;
    }

    public final d g()
    {
        return f;
    }
}
