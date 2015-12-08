// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.ff;
import com.google.a.a.a.a.fg;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            i, ae, u

public class aa extends i
{

    private ae b;

    aa(ff ff1)
    {
        super(ff1);
        c.a(a.j.d);
    }

    public final u d()
    {
        return f();
    }

    public final ae f()
    {
        if (b == null)
        {
            b = new ae(a.j.d);
        }
        return b;
    }
}
