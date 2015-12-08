// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.BitSet;

// Referenced classes of package com.google.common.base:
//            CharMatcher

static final class stMatcher extends stMatcher
{

    final char val$match;

    public CharMatcher and(CharMatcher charmatcher)
    {
        if (charmatcher.matches(val$match))
        {
            return this;
        } else
        {
            return NONE;
        }
    }

    public boolean matches(char c)
    {
        return c == val$match;
    }

    public CharMatcher negate()
    {
        return isNot(val$match);
    }

    public CharMatcher or(CharMatcher charmatcher)
    {
        if (charmatcher.matches(val$match))
        {
            return charmatcher;
        } else
        {
            return super.or(charmatcher);
        }
    }

    public String replaceFrom(CharSequence charsequence, char c)
    {
        return charsequence.toString().replace(val$match, c);
    }

    void setBits(BitSet bitset)
    {
        bitset.set(val$match);
    }

    stMatcher(String s, char c)
    {
        val$match = c;
        super(s);
    }
}
