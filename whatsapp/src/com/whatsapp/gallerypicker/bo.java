// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;


// Referenced classes of package com.whatsapp.gallerypicker:
//            ai, t

class bo
{

    t a;
    int b;
    private int c;
    private final ai d;
    long e;

    public bo(ai ai1, int i)
    {
        c = -1;
        d = ai1;
        b = i;
    }

    public boolean a()
    {
        if (c >= d.d() - 1)
        {
            return false;
        } else
        {
            ai ai1 = d;
            int i = c + 1;
            c = i;
            a = ai1.a(i);
            e = a.d();
            return true;
        }
    }
}
