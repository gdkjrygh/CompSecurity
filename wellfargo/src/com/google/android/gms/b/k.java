// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;


public class k
{

    public static final int a[] = new int[0];
    public static final long b[] = new long[0];
    public static final Object c[] = new Object[0];

    public static int a(int ai[], int i, int j)
    {
        boolean flag = false;
        int i1 = i - 1;
        i = ((flag) ? 1 : 0);
        for (int l = i1; i <= l;)
        {
            int j1 = i + l >>> 1;
            int k1 = ai[j1];
            if (k1 < j)
            {
                i = j1 + 1;
            } else
            if (k1 > j)
            {
                l = j1 - 1;
            } else
            {
                return j1;
            }
        }

        return ~i;
    }

    public static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

}
