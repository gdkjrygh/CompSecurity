// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.imageload;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.LinkedList;

// Referenced classes of package com.jiubang.playsdk.imageload:
//            d, h, k

public class j
{

    final d a;
    private Bitmap b;
    private final k c;
    private final String d;
    private final String e;

    public j(d d1, Bitmap bitmap, String s, String s1, k k)
    {
        a = d1;
        super();
        b = bitmap;
        e = s;
        d = s1;
        c = k;
    }

    static Bitmap a(j j1, Bitmap bitmap)
    {
        j1.b = bitmap;
        return bitmap;
    }

    static k a(j j1)
    {
        return j1.c;
    }

    public void a()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        h h1 = (h)com.jiubang.playsdk.imageload.d.a(a).get(d);
        if (h1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (h1.b(this))
        {
            com.jiubang.playsdk.imageload.d.a(a).remove(d);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        h h2 = (h)com.jiubang.playsdk.imageload.d.b(a).get(d);
        if (h2 != null)
        {
            h2.b(this);
            if (h.a(h2).size() == 0)
            {
                com.jiubang.playsdk.imageload.d.b(a).remove(d);
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public Bitmap b()
    {
        return b;
    }

    public String c()
    {
        return e;
    }
}
