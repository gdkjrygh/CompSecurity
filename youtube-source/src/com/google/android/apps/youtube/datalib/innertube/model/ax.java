// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.kz;
import com.google.a.a.a.a.vw;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.a.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            ap

public final class ax
{

    private vw a;
    private CharSequence b;
    private ap c;

    public ax(vw vw1)
    {
        a = (vw)com.google.android.apps.youtube.common.fromguava.c.a(vw1);
    }

    public final CharSequence a()
    {
        if (b == null)
        {
            b = com.google.android.apps.youtube.datalib.innertube.a.b.a(a.b);
        }
        return b;
    }

    public final ap b()
    {
        if (c == null)
        {
            c = new ap(a.c);
        }
        return c;
    }

    public final kz c()
    {
        return a.d;
    }
}
