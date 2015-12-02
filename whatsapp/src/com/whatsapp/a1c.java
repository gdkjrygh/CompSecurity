// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            xb, App

class a1c
    implements Runnable
{

    final xb a;

    a1c(xb xb1)
    {
        a = xb1;
        super();
    }

    public void run()
    {
        App.o(a.b);
    }
}
