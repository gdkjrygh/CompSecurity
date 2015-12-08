// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a.a;

import java.util.Locale;
import java.util.TimeZone;

class j
{

    private final TimeZone a;
    private final int b;
    private final Locale c;

    j(TimeZone timezone, boolean flag, int i, Locale locale)
    {
        a = timezone;
        int k = i;
        if (flag)
        {
            k = i | 0x80000000;
        }
        b = k;
        c = locale;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof j)
            {
                if (!a.equals(((j) (obj = (j)obj)).a) || b != ((j) (obj)).b || !c.equals(((j) (obj)).c))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (b * 31 + c.hashCode()) * 31 + a.hashCode();
    }
}
