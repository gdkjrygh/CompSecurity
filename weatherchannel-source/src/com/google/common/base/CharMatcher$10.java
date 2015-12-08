// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.BitSet;

// Referenced classes of package com.google.common.base:
//            CharMatcher

static final class tMatcher extends tMatcher
{

    final char val$match;

    public CharMatcher and(CharMatcher charmatcher)
    {
        CharMatcher charmatcher1 = charmatcher;
        if (charmatcher.matches(val$match))
        {
            charmatcher1 = super.and(charmatcher);
        }
        return charmatcher1;
    }

    public boolean matches(char c)
    {
        return c != val$match;
    }

    public CharMatcher negate()
    {
        return is(val$match);
    }

    public CharMatcher or(CharMatcher charmatcher)
    {
        Object obj = this;
        if (charmatcher.matches(val$match))
        {
            obj = ANY;
        }
        return ((CharMatcher) (obj));
    }

    void setBits(BitSet bitset)
    {
        bitset.set(0, val$match);
        bitset.set(val$match + 1, 0x10000);
    }

    tMatcher(String s, char c)
    {
        val$match = c;
        super(s);
    }
}
