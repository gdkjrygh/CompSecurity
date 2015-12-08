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
//            j, n, m, k

class l
    implements au, b
{

    final j a;

    private l(j j1)
    {
        a = j1;
        super();
    }

    l(j j1, k k)
    {
        this(j1);
    }

    public void a(a a1)
    {
        if (com.a.c.j.b(a) != null)
        {
            com.a.c.j.b(a).a(a1);
        }
    }

    public void a(an an1)
    {
        float f = an1.m();
        an1 = (n)j.c(a).get(an1);
        if ((((n) (an1)).a & 0x1ff) != 0)
        {
            View view = (View)j.d(a).get();
            if (view != null)
            {
                view.invalidate();
            }
        }
        an1 = ((n) (an1)).b;
        if (an1 != null)
        {
            int k = an1.size();
            for (int i = 0; i < k; i++)
            {
                m m1 = (m)an1.get(i);
                float f1 = m1.b;
                float f2 = m1.c;
                com.a.c.j.a(a, m1.a, f1 + f2 * f);
            }

        }
        an1 = (View)j.d(a).get();
        if (an1 != null)
        {
            an1.invalidate();
        }
    }

    public void b(a a1)
    {
        if (com.a.c.j.b(a) != null)
        {
            com.a.c.j.b(a).b(a1);
        }
    }

    public void c(a a1)
    {
        if (com.a.c.j.b(a) != null)
        {
            com.a.c.j.b(a).c(a1);
        }
        j.c(a).remove(a1);
        if (j.c(a).isEmpty())
        {
            com.a.c.j.a(a, null);
        }
    }

    public void d(a a1)
    {
        if (com.a.c.j.b(a) != null)
        {
            com.a.c.j.b(a).d(a1);
        }
    }
}
