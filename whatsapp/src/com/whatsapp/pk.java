// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            App, a1e

class pk
    implements Runnable
{

    final String a;
    final a1e b;

    pk(a1e a1e, String s)
    {
        b = a1e;
        a = s;
        super();
    }

    public void run()
    {
        App.B(a);
    }
}
