// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;


// Referenced classes of package com.google.c.b:
//            k

public static abstract class Error
{

    static int a(int i, int j)
    {
        if (j < 0)
        {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int l = (i >> 1) + i + 1;
        i = l;
        if (l < j)
        {
            i = Integer.highestOneBit(j - 1) << 1;
        }
        j = i;
        if (i < 0)
        {
            j = 0x7fffffff;
        }
        return j;
    }
}
