// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.BitSet;

// Referenced classes of package com.google.common.base:
//            CharMatcher, Preconditions

private static class heckNotNull extends CharMatcher
{

    final CharMatcher first;
    final CharMatcher second;

    public volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public boolean matches(char c)
    {
        return first.matches(c) || second.matches(c);
    }

    void setBits(BitSet bitset)
    {
        first.setBits(bitset);
        second.setBits(bitset);
    }

    CharMatcher withToString(String s)
    {
        return new <init>(first, second, s);
    }

    (CharMatcher charmatcher, CharMatcher charmatcher1)
    {
        String s = String.valueOf(String.valueOf(charmatcher));
        String s1 = String.valueOf(String.valueOf(charmatcher1));
        this(charmatcher, charmatcher1, (new StringBuilder(s.length() + 18 + s1.length())).append("CharMatcher.or(").append(s).append(", ").append(s1).append(")").toString());
    }

    <init>(CharMatcher charmatcher, CharMatcher charmatcher1, String s)
    {
        super(s);
        first = (CharMatcher)Preconditions.checkNotNull(charmatcher);
        second = (CharMatcher)Preconditions.checkNotNull(charmatcher1);
    }
}
