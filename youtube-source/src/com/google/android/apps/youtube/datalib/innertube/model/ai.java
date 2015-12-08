// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube.model;

import com.google.a.a.a.a.dq;
import com.google.a.a.a.a.qm;
import com.google.a.a.a.a.qn;
import com.google.a.a.a.a.qq;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube.model:
//            aj

public final class ai
{

    private final qm a;
    private aj b;

    public ai(qm qm1)
    {
        a = qm1;
    }

    public final aj a()
    {
        qn qn1 = a.e;
        if (b == null && qn1 != null && qn1.b != null)
        {
            b = new aj(qn1.b);
        }
        return b;
    }

    public final dq b()
    {
        return a.g;
    }

    public final boolean c()
    {
        for (qn qn1 = a.e; qn1 == null || qn1.b == null || qn1.b.b.length > 0;)
        {
            return false;
        }

        return true;
    }
}
