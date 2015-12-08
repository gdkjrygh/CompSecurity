// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.c;

import android.view.View;
import com.a.a.a;
import com.a.a.an;
import com.a.a.au;
import com.a.a.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.a.c:
//            d, h, g, e

class f
    implements au, b
{

    final d a;

    private f(d d1)
    {
        a = d1;
        super();
    }

    f(d d1, e e)
    {
        this(d1);
    }

    public void a(a a1)
    {
        if (com.a.c.d.b(a) != null)
        {
            com.a.c.d.b(a).a(a1);
        }
    }

    public void a(an an1)
    {
        float f1 = an1.m();
        an1 = (h)com.a.c.d.c(a).get(an1);
        if ((((h) (an1)).a & 0x1ff) != 0)
        {
            View view = (View)com.a.c.d.d(a).get();
            if (view != null)
            {
                view.invalidate();
            }
        }
        an1 = ((h) (an1)).b;
        if (an1 != null)
        {
            int j = an1.size();
            for (int i = 0; i < j; i++)
            {
                g g1 = (g)an1.get(i);
                float f2 = g1.b;
                float f3 = g1.c;
                com.a.c.d.a(a, g1.a, f2 + f3 * f1);
            }

        }
        an1 = (View)com.a.c.d.d(a).get();
        if (an1 != null)
        {
            an1.invalidate();
        }
    }

    public void b(a a1)
    {
        if (com.a.c.d.b(a) != null)
        {
            com.a.c.d.b(a).b(a1);
        }
    }

    public void c(a a1)
    {
        if (com.a.c.d.b(a) != null)
        {
            com.a.c.d.b(a).c(a1);
        }
        com.a.c.d.c(a).remove(a1);
        if (com.a.c.d.c(a).isEmpty())
        {
            com.a.c.d.a(a, null);
        }
    }

    public void d(a a1)
    {
        if (com.a.c.d.b(a) != null)
        {
            com.a.c.d.b(a).d(a1);
        }
    }
}
