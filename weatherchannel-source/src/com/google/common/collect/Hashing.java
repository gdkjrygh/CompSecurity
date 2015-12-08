// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


final class Hashing
{

    private static final int C1 = 0xcc9e2d51;
    private static final int C2 = 0x1b873593;
    private static int MAX_TABLE_SIZE = 0x40000000;

    private Hashing()
    {
    }

    static int closedTableSize(int i, double d)
    {
        i = Math.max(i, 2);
        int j = Integer.highestOneBit(i);
        if (i > (int)((double)j * d))
        {
            i = j << 1;
            if (i > 0)
            {
                return i;
            } else
            {
                return MAX_TABLE_SIZE;
            }
        } else
        {
            return j;
        }
    }

    static boolean needsResizing(int i, int j, double d)
    {
        return (double)i > (double)j * d && j < MAX_TABLE_SIZE;
    }

    static int smear(int i)
    {
        return 0x1b873593 * Integer.rotateLeft(0xcc9e2d51 * i, 15);
    }

    static int smearedHash(Object obj)
    {
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        return smear(i);
    }

}
