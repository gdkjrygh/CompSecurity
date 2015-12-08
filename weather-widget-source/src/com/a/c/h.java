// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.c;

import java.util.ArrayList;

// Referenced classes of package com.a.c:
//            g

class h
{

    int a;
    ArrayList b;

    h(int i, ArrayList arraylist)
    {
        a = i;
        b = arraylist;
    }

    boolean a(int i)
    {
        if ((a & i) != 0 && b != null)
        {
            int k = b.size();
            for (int j = 0; j < k; j++)
            {
                if (((g)b.get(j)).a == i)
                {
                    b.remove(j);
                    a = a & ~i;
                    return true;
                }
            }

        }
        return false;
    }
}
