// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.a;

// Referenced classes of package com.whatsapp:
//            App, tt

class a9a
    implements Runnable
{

    final App a;
    final a b;

    a9a(App app, a a1)
    {
        a = app;
        b = a1;
        super();
    }

    public void run()
    {
        a.aq.c(b);
    }
}
