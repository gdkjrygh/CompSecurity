// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, k, x8, vz, 
//            qk

class aw
    implements Runnable
{

    final String a;
    final x8 b;

    aw(x8 x8_1, String s)
    {
        b = x8_1;
        a = s;
        super();
    }

    public void run()
    {
        qk.b(App.az.e(a), b.j.a);
    }
}
