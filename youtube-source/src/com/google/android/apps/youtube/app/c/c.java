// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.c;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.model.ba;

// Referenced classes of package com.google.android.apps.youtube.app.c:
//            a

final class c
    implements l
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        com.google.android.apps.youtube.app.c.a.a(a, volleyerror);
    }

    public final volatile void a(Object obj)
    {
        obj = (ba)obj;
        com.google.android.apps.youtube.app.c.a.a(a, ((ba) (obj)));
    }
}
