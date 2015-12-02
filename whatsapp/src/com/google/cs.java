// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            cf, af, a8, b9, 
//            bi

final class cs extends cf
{

    cs(String s, int i)
    {
        super(s, i, null);
    }

    boolean a(bi bi, String s, af af1)
    {
        if (!af1.b(bi) || !a8.a(bi, s, af1) || a8.a(s) || !a8.a(bi, af1))
        {
            return false;
        } else
        {
            return a8.a(bi, s, af1, new b9(this));
        }
    }
}
