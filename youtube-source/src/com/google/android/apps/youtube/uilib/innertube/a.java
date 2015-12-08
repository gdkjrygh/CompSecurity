// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.innertube;

import com.android.volley.VolleyError;
import com.google.a.a.a.a.dq;
import com.google.android.apps.youtube.datalib.a.l;

// Referenced classes of package com.google.android.apps.youtube.uilib.innertube:
//            ContinuableController

final class a
    implements l
{

    final ContinuableController.ContinuationType a;
    final ContinuableController b;

    a(ContinuableController continuablecontroller, ContinuableController.ContinuationType continuationtype)
    {
        b = continuablecontroller;
        a = continuationtype;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        ContinuableController continuablecontroller = b;
        ContinuableController.ContinuationType continuationtype = a;
        continuablecontroller.a(volleyerror);
    }

    public final volatile void a(Object obj)
    {
        obj = (dq)obj;
        b.a(((dq) (obj)), a);
    }
}
