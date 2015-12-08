// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.d.a;

import java.util.ArrayList;

// Referenced classes of package com.google.android.exoplayer.d.a:
//            a, c

public final class b extends a
{

    public final ArrayList b = new ArrayList();

    public b(int i)
    {
        super(i);
    }

    public final c a(int i)
    {
        for (int j = 0; j < b.size(); j++)
        {
            a a1 = (a)b.get(j);
            if (a1.a == i)
            {
                return (c)a1;
            }
        }

        return null;
    }

    public final void a(a a1)
    {
        b.add(a1);
    }

    public final b b(int i)
    {
        for (int j = 0; j < b.size(); j++)
        {
            a a1 = (a)b.get(j);
            if (a1.a == i)
            {
                return (b)a1;
            }
        }

        return null;
    }
}
