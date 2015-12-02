// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            em, og, App

class wq
    implements Runnable
{

    final em a;

    wq(em em1)
    {
        a = em1;
        super();
    }

    public void run()
    {
label0:
        {
            boolean flag;
            if (a.c.n() && a.c.q != a.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a.c.t();
            if (flag)
            {
                App.a(a.c.a, a.c.q, 2);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            App.b(a.c.a);
        }
    }
}
