// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, a1e

class d_
    implements Runnable
{

    final a1e a;
    final String b;

    d_(a1e a1e, String s)
    {
        a = a1e;
        b = s;
        super();
    }

    public void run()
    {
        App.B(b);
    }
}
