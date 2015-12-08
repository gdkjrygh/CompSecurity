// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher

static abstract class atcher extends CharMatcher
{

    public volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public CharMatcher negate()
    {
        return new atcher(this);
    }

    public final CharMatcher precomputed()
    {
        return this;
    }

    atcher()
    {
    }

    atcher(String s)
    {
        super(s);
    }
}
