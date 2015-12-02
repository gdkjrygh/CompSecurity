// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            cP

final class f1
{

    private final cP a;
    private final int b;

    f1(cP cp, int i)
    {
        a = cp;
        b = i;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof f1)
        {
            if (a == ((f1) (obj = (f1)obj)).a && b == ((f1) (obj)).b)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return a.hashCode() * 65535 + b;
    }
}
