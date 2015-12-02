// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            a1, og, App

class yt
    implements Runnable
{

    final a1 a;
    final boolean b;

    yt(a1 a1_1, boolean flag)
    {
        a = a1_1;
        b = flag;
        super();
    }

    public void run()
    {
        if (!b)
        {
            a.a.t();
        }
        App.b(a.a.a);
    }
}
