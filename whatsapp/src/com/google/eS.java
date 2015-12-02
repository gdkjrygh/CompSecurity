// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            i, f4, gh, e9, 
//            bQ, c6

final class eS
{

    private static final int a[] = {
        1, 1, 2
    };
    private final i b = new i();
    private final f4 c = new f4();

    eS()
    {
    }

    c6 a(int j, bQ bq, int k)
    {
        int ai[] = e9.a(bq, k, false, a);
        c6 c6;
        try
        {
            c6 = c.a(j, bq, ai);
        }
        catch (gh gh1)
        {
            return b.a(j, bq, ai);
        }
        return c6;
    }

}
