// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.BitSet;

// Referenced classes of package com.google.common.base:
//            CharMatcher

private static class <init> extends <init>
{

    private final BitSet table;

    public boolean matches(char c)
    {
        return table.get(c);
    }

    void setBits(BitSet bitset)
    {
        bitset.or(table);
    }

    private (BitSet bitset, String s)
    {
        super(s);
        s = bitset;
        if (bitset.length() + 64 < bitset.size())
        {
            s = (BitSet)bitset.clone();
        }
        table = s;
    }

    table(BitSet bitset, String s, table table1)
    {
        this(bitset, s);
    }
}
