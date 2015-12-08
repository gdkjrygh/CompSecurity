// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher

static final class t> extends t>
{

    public final CharMatcher precomputed()
    {
        return this;
    }

    CharMatcher withToString(String s)
    {
        return new <init>(s, original);
    }

    (CharMatcher charmatcher)
    {
        super(charmatcher);
    }

    t>(String s, CharMatcher charmatcher)
    {
        super(s, charmatcher);
    }
}
