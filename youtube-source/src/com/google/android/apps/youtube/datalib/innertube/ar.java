// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.google.a.a.a.a.du;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            b, p

public final class ar extends b
{

    private String c;

    protected ar(p p)
    {
        super(p);
    }

    public final ar a(String s)
    {
        c = s;
        return this;
    }

    protected final void c()
    {
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
    }

    public final String e()
    {
        return "playlist/delete";
    }

    public final com.google.protobuf.nano.c f()
    {
        b();
        du du1 = new du();
        du1.c = c;
        du1.b = d();
        return du1;
    }
}
