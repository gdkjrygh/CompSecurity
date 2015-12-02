// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            uj, p5, asw, App, 
//            qa

class sb
    implements Runnable
{

    final uj a;

    sb(uj uj1)
    {
        a = uj1;
        super();
    }

    public void run()
    {
label0:
        {
            if (!a.c.isCancelled())
            {
                asw.a(a.c, new Void[0]);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a.c.a(qa.CANCEL);
        }
    }
}
