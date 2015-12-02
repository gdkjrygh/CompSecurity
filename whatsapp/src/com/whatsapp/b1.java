// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, k, og, adq

class b1
    implements Runnable
{

    final og a;
    final adq b;

    b1(adq adq, og og)
    {
        b = adq;
        a = og;
        super();
    }

    public void run()
    {
        App.az.k(a);
    }
}
