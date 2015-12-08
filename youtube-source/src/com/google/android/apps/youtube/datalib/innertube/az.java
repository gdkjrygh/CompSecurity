// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.VolleyError;
import com.google.a.a.a.a.wg;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.model.WatchNextResponse;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            ay

final class az
    implements l
{

    final l a;
    final ay b;

    az(ay ay, l l1)
    {
        b = ay;
        a = l1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        a.a(volleyerror);
    }

    public final void a(Object obj)
    {
        obj = (wg)obj;
        a.a(new WatchNextResponse(((wg) (obj))));
    }
}
