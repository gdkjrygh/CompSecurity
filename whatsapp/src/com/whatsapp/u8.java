// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            aty, og, App

class u8
    implements Runnable
{

    final aty a;

    u8(aty aty1)
    {
        a = aty1;
        super();
    }

    public void run()
    {
label0:
        {
            boolean flag = a.b.n();
            a.b.t();
            if (flag)
            {
                App.a(a.b.a, a.b.q, 2);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.b(a.b.a);
        }
    }
}
