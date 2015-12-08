// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util;


// Referenced classes of package com.vladium.util:
//            WCMatcher

private static final class <init> extends WCMatcher
{

    public final boolean matches(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: s");
        } else
        {
            return false;
        }
    }

    public final boolean matches(char ac[])
    {
        if (ac == null)
        {
            throw new IllegalArgumentException("null input: chars");
        }
        return ac.length == 0;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
