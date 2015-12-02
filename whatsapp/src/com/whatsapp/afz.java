// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, HomeActivity

class afz
    implements Runnable
{

    final String a;
    final HomeActivity b;

    afz(HomeActivity homeactivity, String s)
    {
        b = homeactivity;
        a = s;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(300L);
            App.a(a, null);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
