// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.model.q;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            v

final class w
    implements l
{

    final l a;
    final v b;

    w(v v, l l1)
    {
        b = v;
        a = l1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        a.a(volleyerror);
    }

    public final void a(Object obj)
    {
        a.a(new q());
    }
}
