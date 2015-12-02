// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.bl;
import com.whatsapp.protocol.c3;

// Referenced classes of package com.whatsapp:
//            xs, App, tn

class qi
    implements Runnable
{

    final c3 a;
    final tn b;
    final String c;
    final bl d;

    qi(tn tn, String s, bl bl1, c3 c3)
    {
        b = tn;
        c = s;
        d = bl1;
        a = c3;
        super();
    }

    public void run()
    {
        try
        {
            Thread.sleep(300L);
            App.g(new xs(this, c, d.a, d.f, 12, a));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}
