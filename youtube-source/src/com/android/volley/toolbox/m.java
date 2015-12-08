// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            g, k, n

public final class m
{

    final g a;
    private Bitmap b;
    private final n c;
    private final String d;
    private final String e;

    public m(g g1, Bitmap bitmap, String s, String s1, n n)
    {
        a = g1;
        super();
        b = bitmap;
        e = s;
        d = s1;
        c = n;
    }

    static Bitmap a(m m1, Bitmap bitmap)
    {
        m1.b = bitmap;
        return bitmap;
    }

    static n a(m m1)
    {
        return m1.c;
    }

    public final void a()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        k k1 = (k)g.a(a).get(d);
        if (k1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k1.b(this))
        {
            g.a(a).remove(d);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        k k2 = (k)g.b(a).get(d);
        if (k2 != null)
        {
            k2.b(this);
            if (k.a(k2).size() == 0)
            {
                g.b(a).remove(d);
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final Bitmap b()
    {
        return b;
    }

    public final String c()
    {
        return e;
    }
}
