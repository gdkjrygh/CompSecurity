// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a.b;

import android.util.Log;
import com.gau.a.a.d.a;
import com.gau.a.a.e;
import com.gau.a.a.e.b;

// Referenced classes of package com.gau.a.a.b:
//            d, k

class f
    implements e
{

    final d a;

    f(d d1)
    {
        a = d1;
        super();
    }

    public void a(a a1, int i)
    {
        Log.i("ABEN", (new StringBuilder()).append("HttpConnectorAlive initHeartListener onException reason = ").append(i).toString());
        a.g();
        if (com.gau.a.a.b.d.a(a) != null)
        {
            com.gau.a.a.b.d.a(a).a(a);
        }
    }

    public void a(a a1, b b1)
    {
    }

    public void b(a a1)
    {
    }
}
