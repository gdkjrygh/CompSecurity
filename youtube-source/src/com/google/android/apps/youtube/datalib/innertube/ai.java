// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import com.android.volley.VolleyError;
import com.google.a.a.a.a.nw;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;

// Referenced classes of package com.google.android.apps.youtube.datalib.innertube:
//            ah

final class ai
    implements l
{

    final l a;
    final long b;
    final ah c;

    ai(ah ah, l l1, long l2)
    {
        c = ah;
        a = l1;
        b = l2;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        a.a(volleyerror);
    }

    public final void a(Object obj)
    {
        obj = (nw)obj;
        a.a(new PlayerResponse(((nw) (obj)), b));
    }
}
