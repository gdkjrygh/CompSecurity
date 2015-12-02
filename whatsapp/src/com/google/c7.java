// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            fc

final class c7
{

    private final fc a;
    private final int b;

    c7(fc fc, int i)
    {
        a = fc;
        b = i;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof c7)
        {
            if (a == ((c7) (obj = (c7)obj)).a && b == ((c7) (obj)).b)
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
