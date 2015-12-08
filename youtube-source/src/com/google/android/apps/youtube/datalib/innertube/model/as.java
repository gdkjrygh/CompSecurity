// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.ff;
import com.google.a.a.a.a.fg;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            i, au, u

public class as extends i
{

    private au b;

    as(ff ff1)
    {
        super(ff1);
        c.a(a.j.b);
    }

    public final u d()
    {
        return f();
    }

    public final au f()
    {
        if (b == null)
        {
            b = new au(a.j.b);
        }
        return b;
    }
}
