// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.a;

import java.util.ArrayList;

// Referenced classes of package com.jiubang.goweather.a:
//            g

public class f
{

    public long a;
    public float b;
    public ArrayList c;

    public f(long l, float f1, ArrayList arraylist)
    {
        a = l;
        b = f1;
        c = arraylist;
    }

    public int a()
    {
        if (c == null)
        {
            return 0;
        } else
        {
            return c.size();
        }
    }

    public g a(int i)
    {
        if (c == null || i < 0 || i >= c.size())
        {
            return null;
        } else
        {
            return (g)c.get(i);
        }
    }
}
