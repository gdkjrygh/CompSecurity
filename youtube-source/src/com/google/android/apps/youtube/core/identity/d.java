// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.android.volley.q;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            b

public final class d
    implements q
{

    private b a;
    private int b;

    public d(b b1)
    {
        b = 0;
        a = (b)c.a(b1);
    }

    public final int a()
    {
        return 0;
    }

    public final void a(VolleyError volleyerror)
    {
        if (volleyerror instanceof AuthFailureError)
        {
            int i = b;
            b = i + 1;
            if (i == 0)
            {
                a.a();
                return;
            }
        }
        throw volleyerror;
    }

    public final int b()
    {
        return b;
    }
}
