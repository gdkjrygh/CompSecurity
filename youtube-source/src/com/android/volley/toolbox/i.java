// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.VolleyError;
import com.android.volley.n;

// Referenced classes of package com.android.volley.toolbox:
//            g

final class i
    implements n
{

    final String a;
    final g b;

    i(g g1, String s)
    {
        b = g1;
        a = s;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        g.a(b, a, volleyerror);
    }
}
