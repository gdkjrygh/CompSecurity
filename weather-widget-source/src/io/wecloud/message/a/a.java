// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.a;

import java.util.Comparator;

public class a
    implements Comparator
{

    public a()
    {
    }

    public int a(io.wecloud.message.bean.a a1, io.wecloud.message.bean.a a2)
    {
        if (a1.c <= a2.c)
        {
            if (a1.c < a2.c)
            {
                return 1;
            }
            if (!a1.equals("com.gau.go.launcherex"))
            {
                if (a2.equals("com.gau.go.launcherex"))
                {
                    return 1;
                } else
                {
                    return a1.a.compareTo(a2.a);
                }
            }
        }
        return -1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((io.wecloud.message.bean.a)obj, (io.wecloud.message.bean.a)obj1);
    }
}
