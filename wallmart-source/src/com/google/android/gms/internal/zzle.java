// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class zzle
{

    public static final int EMPTY_INTS[] = new int[0];
    public static final long EMPTY_LONGS[] = new long[0];
    public static final Object EMPTY_OBJECTS[] = new Object[0];

    public static int binarySearch(int ai[], int i, int j)
    {
        boolean flag = false;
        int l = i - 1;
        i = ((flag) ? 1 : 0);
        for (int k = l; i <= k;)
        {
            int i1 = i + k >>> 1;
            int j1 = ai[i1];
            if (j1 < j)
            {
                i = i1 + 1;
            } else
            if (j1 > j)
            {
                k = i1 - 1;
            } else
            {
                return i1;
            }
        }

        return ~i;
    }

    public static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

}
