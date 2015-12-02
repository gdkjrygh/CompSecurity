// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            E, ch

final class M extends E
{

    private M()
    {
        super(null);
    }

    M(ch ch)
    {
        this();
    }

    boolean a(int i, int j)
    {
        i *= j;
        return (i % 3 + (i & 1) & 1) == 0;
    }
}
