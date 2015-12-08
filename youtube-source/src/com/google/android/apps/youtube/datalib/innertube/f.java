// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.model.b;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            d

final class f
    implements l
{

    final l a;
    final d b;

    f(d d, l l1)
    {
        b = d;
        a = l1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        a.a(volleyerror);
    }

    public final volatile void a(Object obj)
    {
        obj = (b)obj;
        a.a(((b) (obj)).a());
    }
}
