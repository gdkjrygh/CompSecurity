// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.innertube;

import com.google.a.a.a.a.dq;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.innertube.i;
import com.google.android.apps.youtube.datalib.innertube.model.o;
import com.google.android.apps.youtube.uilib.a.h;

// Referenced classes of package com.google.android.apps.youtube.uilib.innertube:
//            e

public final class k extends e
{

    public k(i i, h h, a a1, aw aw)
    {
        super(i, h, a1, aw);
    }

    private void b(o o1)
    {
        if (o1 == null)
        {
            return;
        } else
        {
            a(o1.b());
            a(o1.a());
            return;
        }
    }

    protected final void a(dq dq1, ContinuableController.ContinuationType continuationtype)
    {
        super.a(dq1, continuationtype);
        if (dq1 == null || dq1.c == null)
        {
            return;
        }
        dq1 = new o(dq1.c);
        if (continuationtype == ContinuableController.ContinuationType.RELOAD)
        {
            a(((o) (dq1)));
            return;
        } else
        {
            b(dq1);
            return;
        }
    }

    public final void a(o o1)
    {
        a();
        b(o1);
    }
}
