// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            ab4, AccountInfoActivity

class akm
    implements Runnable
{

    final ab4 a;

    akm(ab4 ab4_1)
    {
        a = ab4_1;
        super();
    }

    public void run()
    {
        AccountInfoActivity.o(a.a);
    }
}
