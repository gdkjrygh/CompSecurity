// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, d5, aoz

class a_b
    implements Runnable
{

    final d5 a;

    a_b(d5 d5_1)
    {
        a = d5_1;
        super();
    }

    public void run()
    {
        App.ah.a(a.c, false, -1);
    }
}
