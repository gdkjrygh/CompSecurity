// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Arrays;

// Referenced classes of package com.google.common.base:
//            CharMatcher, Preconditions

private static class t extends CharMatcher
{

    private final char rangeEnds[];
    private final char rangeStarts[];

    public volatile boolean apply(Object obj)
    {
        return super.apply((Character)obj);
    }

    public boolean matches(char c)
    {
        int i = Arrays.binarySearch(rangeStarts, c);
        if (i < 0)
        {
            if ((i = ~i - 1) < 0 || c > rangeEnds[i])
            {
                return false;
            }
        }
        return true;
    }

    (String s, char ac[], char ac1[])
    {
        super(s);
        rangeStarts = ac;
        rangeEnds = ac1;
        int i;
        boolean flag;
        if (ac.length == ac1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        i = 0;
        while (i < ac.length) 
        {
            if (ac[i] <= ac1[i])
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            if (i + 1 < ac.length)
            {
                if (ac1[i] < ac[i + 1])
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag);
            }
            i++;
        }
    }
}
