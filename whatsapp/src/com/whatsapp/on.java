// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, k, adq, og

class on
    implements Runnable
{

    final adq a;
    final og b;

    on(adq adq, og og)
    {
        a = adq;
        b = og;
        super();
    }

    public void run()
    {
        App.az.e(b);
    }
}
