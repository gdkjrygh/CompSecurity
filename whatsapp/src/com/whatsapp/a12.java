// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.contact.b;
import com.whatsapp.contact.j;

// Referenced classes of package com.whatsapp:
//            App

class a12
    implements Runnable
{

    final App a;
    final j b;

    a12(App app, j j)
    {
        a = app;
        b = j;
        super();
    }

    public void run()
    {
        com.whatsapp.contact.b.b(App.au, b);
    }
}
