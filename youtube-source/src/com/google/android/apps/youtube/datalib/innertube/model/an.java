// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.so;
import com.google.a.a.a.a.sp;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            u, aj

public final class an
    implements u
{

    private final sp a;
    private aj b;

    public an(sp sp1)
    {
        a = (sp)com.google.android.apps.youtube.common.fromguava.c.a(sp1);
    }

    public final String a()
    {
        return a.c;
    }

    public final boolean b()
    {
        return a.d;
    }

    public final aj c()
    {
        so so1 = a.e;
        if (b == null && so1 != null && so1.b != null)
        {
            b = new aj(so1.b);
        }
        return b;
    }

    public final kz e()
    {
        return a.b;
    }
}
