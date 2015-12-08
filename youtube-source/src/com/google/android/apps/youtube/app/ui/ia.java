// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hj, v

final class ia
    implements l
{

    final hj a;
    private final v b;

    public ia(hj hj1, v v1)
    {
        a = hj1;
        super();
        b = v1;
    }

    public final void a(VolleyError volleyerror)
    {
        L.a("Error deleting from playlist", volleyerror);
        hj.a(a).c(volleyerror);
        b.a(true);
    }

    public final volatile void a(Object obj)
    {
        ah.a(a.a, p.eY, 1);
        b.a(true);
    }
}
