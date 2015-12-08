// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.google.a.a.a.a.gg;
import com.google.protobuf.nano.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class l extends b
{

    private boolean c;

    private l(p p)
    {
        super(p);
        a(new byte[0]);
    }

    l(p p, byte byte0)
    {
        this(p);
    }

    public final l a(boolean flag)
    {
        c = flag;
        return this;
    }

    protected final void c()
    {
    }

    public final String e()
    {
        return "guide";
    }

    public final c f()
    {
        b();
        gg gg1 = new gg();
        gg1.b = d();
        gg1.c = c;
        return gg1;
    }
}
