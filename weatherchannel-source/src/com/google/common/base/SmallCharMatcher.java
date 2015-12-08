// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.BitSet;

// Referenced classes of package com.google.common.base:
//            CharMatcher

final class SmallCharMatcher extends CharMatcher.FastMatcher
{

    private static final int C1 = 0xcc9e2d51;
    private static final int C2 = 0x1b873593;
    private static final double DESIRED_LOAD_FACTOR = 0.5D;
    static final int MAX_SIZE = 1023;
    private final boolean containsZero;
    private final long filter;
    private final char table[];

    private SmallCharMatcher(char ac[], long l, boolean flag, String s)
    {
        super(s);
        table = ac;
        filter = l;
        containsZero = flag;
    }

    private boolean checkFilter(int i)
    {
        return 1L == (filter >> i & 1L);
    }

    static int chooseTableSize(int i)
    {
        if (i != 1) goto _L2; else goto _L1
_L1:
        int k = 2;
_L4:
        return k;
_L2:
        int j = Integer.highestOneBit(i - 1) << 1;
        do
        {
            k = j;
            if ((double)j * 0.5D >= (double)i)
            {
                continue;
            }
            j <<= 1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static CharMatcher from(BitSet bitset, String s)
    {
        long l = 0L;
        int i = bitset.cardinality();
        boolean flag = bitset.get(0);
        char ac[] = new char[chooseTableSize(i)];
        int k = ac.length - 1;
        i = bitset.nextSetBit(0);
label0:
        do
        {
            if (i != -1)
            {
                l |= 1L << i;
                int j = smear(i) & k;
                do
                {
                    if (ac[j] == 0)
                    {
                        ac[j] = (char)i;
                        i = bitset.nextSetBit(i + 1);
                        continue label0;
                    }
                    j = j + 1 & k;
                } while (true);
            }
            return new SmallCharMatcher(ac, l, flag, s);
        } while (true);
    }

    static int smear(int i)
    {
        return 0x1b873593 * Integer.rotateLeft(0xcc9e2d51 * i, 15);
    }

    public boolean matches(char c)
    {
        boolean flag1 = false;
        if (c != 0) goto _L2; else goto _L1
_L1:
        boolean flag = containsZero;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!checkFilter(c))
        {
            continue; /* Loop/switch isn't completed */
        }
        int l = table.length - 1;
        int j = smear(c) & l;
        int i = j;
        do
        {
            flag = flag1;
            if (table[i] == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (table[i] == c)
            {
                return true;
            }
            int k = i + 1 & l;
            i = k;
            if (k == j)
            {
                return false;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    void setBits(BitSet bitset)
    {
        if (containsZero)
        {
            bitset.set(0);
        }
        char ac[] = table;
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            char c = ac[i];
            if (c != 0)
            {
                bitset.set(c);
            }
        }

    }
}
