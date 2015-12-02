// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            n2, og, App

class abu
    implements Runnable
{

    final n2 a;

    abu(n2 n2_1)
    {
        a = n2_1;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(300L);
            App.a(a.b.a, null);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
