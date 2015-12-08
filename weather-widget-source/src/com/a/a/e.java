// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.util.ArrayList;

// Referenced classes of package com.a.a:
//            c, j, a, d

class e extends c
{

    boolean a;
    final ArrayList b;
    final d c;

    e(d d1, ArrayList arraylist)
    {
        c = d1;
        b = arraylist;
        super();
        a = false;
    }

    public void c(a a1)
    {
        if (!a)
        {
            int k = b.size();
            for (int i = 0; i < k; i++)
            {
                a1 = (j)b.get(i);
                ((j) (a1)).a.a();
                com.a.a.d.a(c).add(((j) (a1)).a);
            }

        }
    }

    public void d(a a1)
    {
        a = true;
    }
}
