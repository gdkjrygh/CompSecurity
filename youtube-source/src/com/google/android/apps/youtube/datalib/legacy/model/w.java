// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.datalib.innertube.model.v;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            r, v

public final class w
    implements r
{

    private String a;
    private v b;
    private long c;
    private long d;

    public w()
    {
    }

    public final com.google.android.apps.youtube.datalib.legacy.model.v a()
    {
        return new com.google.android.apps.youtube.datalib.legacy.model.v(a, b, c, d);
    }

    public final w a(long l)
    {
        c = l;
        return this;
    }

    public final w a(v v1)
    {
        b = v1;
        return this;
    }

    public final w a(String s)
    {
        a = s;
        return this;
    }

    public final w b(long l)
    {
        d = l;
        return this;
    }

    public final Object build()
    {
        return a();
    }
}
