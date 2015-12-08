// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.innertube;

import com.google.a.a.a.a.dq;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.innertube.ap;
import com.google.android.apps.youtube.datalib.innertube.i;
import com.google.android.apps.youtube.datalib.innertube.model.ag;
import com.google.android.apps.youtube.uilib.a.h;

// Referenced classes of package com.google.android.apps.youtube.uilib.innertube:
//            e, s

public final class r extends e
{

    private final h a;

    public r(i i, h h1, a a1, aw aw)
    {
        super(i, h1, a1, aw);
        a = h1;
        a1.a(this);
    }

    private void b(ag ag1)
    {
        if (ag1 == null)
        {
            return;
        } else
        {
            a(ag1.b());
            a(ag1.a());
            return;
        }
    }

    private void handleVideoRemovedFromPlaylistEvent(ap ap)
    {
        a.a(new s(this, ap));
    }

    protected final void a(dq dq1, ContinuableController.ContinuationType continuationtype)
    {
        super.a(dq1, continuationtype);
        if (dq1 == null || dq1.g == null)
        {
            return;
        }
        dq1 = new ag(dq1.g);
        if (continuationtype == ContinuableController.ContinuationType.RELOAD)
        {
            a(((ag) (dq1)));
            return;
        } else
        {
            b(dq1);
            return;
        }
    }

    public final void a(ag ag1)
    {
        a();
        b(ag1);
    }
}
