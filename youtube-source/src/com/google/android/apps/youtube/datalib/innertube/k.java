// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.VolleyError;
import com.google.a.a.a.a.gh;
import com.google.android.apps.youtube.datalib.a.l;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            j

final class k
    implements l
{

    final l a;
    final j b;

    k(j j, l l1)
    {
        b = j;
        a = l1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        a.a(volleyerror);
    }

    public final void a(Object obj)
    {
        obj = (gh)obj;
        a.a(new com.google.android.apps.youtube.datalib.innertube.model.l(((gh) (obj))));
    }
}
