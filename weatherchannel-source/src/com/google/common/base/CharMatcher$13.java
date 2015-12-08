// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.BitSet;

// Referenced classes of package com.google.common.base:
//            CharMatcher

static final class tMatcher extends tMatcher
{

    final char val$endInclusive;
    final char val$startInclusive;

    public boolean matches(char c)
    {
        return val$startInclusive <= c && c <= val$endInclusive;
    }

    void setBits(BitSet bitset)
    {
        bitset.set(val$startInclusive, val$endInclusive + 1);
    }

    tMatcher(String s, char c, char c1)
    {
        val$startInclusive = c;
        val$endInclusive = c1;
        super(s);
    }
}
