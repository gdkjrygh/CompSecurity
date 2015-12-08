// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.BitSet;

// Referenced classes of package com.google.common.base:
//            CharMatcher

private static class original extends CharMatcher
{

    final CharMatcher original;

    public volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public int countIn(CharSequence charsequence)
    {
        return charsequence.length() - original.countIn(charsequence);
    }

    public boolean matches(char c)
    {
        return !original.matches(c);
    }

    public boolean matchesAllOf(CharSequence charsequence)
    {
        return original.matchesNoneOf(charsequence);
    }

    public boolean matchesNoneOf(CharSequence charsequence)
    {
        return original.matchesAllOf(charsequence);
    }

    public CharMatcher negate()
    {
        return original;
    }

    void setBits(BitSet bitset)
    {
        BitSet bitset1 = new BitSet();
        original.setBits(bitset1);
        bitset1.flip(0, 0x10000);
        bitset.or(bitset1);
    }

    CharMatcher withToString(String s)
    {
        return new <init>(s, original);
    }

    (CharMatcher charmatcher)
    {
        String s = String.valueOf(String.valueOf(charmatcher));
        this((new StringBuilder(s.length() + 9)).append(s).append(".negate()").toString(), charmatcher);
    }

    <init>(String s, CharMatcher charmatcher)
    {
        super(s);
        original = charmatcher;
    }
}
