// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.util.Arrays;

class u
{

    private final Object a[];
    private int b;

    public transient u(Object aobj[])
    {
        a = aobj;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof u))
        {
            return false;
        } else
        {
            return Arrays.equals(a, ((u)obj).a);
        }
    }

    public int hashCode()
    {
        int j = 0;
        if (b == 0)
        {
            Object aobj[] = a;
            int l = aobj.length;
            for (int i = 0; i < l;)
            {
                Object obj = aobj[i];
                int k = j;
                if (obj != null)
                {
                    k = j * 7 + obj.hashCode();
                }
                i++;
                j = k;
            }

            b = j;
        }
        return b;
    }
}
