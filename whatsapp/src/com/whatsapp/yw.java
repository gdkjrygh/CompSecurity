// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, HomeActivity

class yw
    implements Runnable
{

    final HomeActivity a;
    final String b;

    yw(HomeActivity homeactivity, String s)
    {
        a = homeactivity;
        b = s;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(300L);
            App.v(b);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
