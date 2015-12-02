// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            x7, co

class adn
    implements x7
{

    final co a;

    adn(co co1)
    {
        a = co1;
        super();
    }

    public void a(long l, long l1, int i, int j)
    {
        j = (int)((float)j * ((float)l / (float)l1));
        co.a(a, new Integer[] {
            Integer.valueOf(j + i)
        });
    }
}
