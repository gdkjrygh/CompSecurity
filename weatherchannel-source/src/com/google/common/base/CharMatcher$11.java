// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Arrays;
import java.util.BitSet;

// Referenced classes of package com.google.common.base:
//            CharMatcher

static final class it> extends CharMatcher
{

    final char val$chars[];

    public volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public boolean matches(char c)
    {
        return Arrays.binarySearch(val$chars, c) >= 0;
    }

    void setBits(BitSet bitset)
    {
        char ac[] = val$chars;
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            bitset.set(ac[i]);
        }

    }

    (String s, char ac[])
    {
        val$chars = ac;
        super(s);
    }
}
