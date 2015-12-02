// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.appwidget.WidgetProvider;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            a36, App, og, aoz

final class cx
    implements Runnable
{

    final c4 a;
    final og b;

    cx(og og1, c4 c4)
    {
        b = og1;
        a = c4;
        super();
    }

    public void run()
    {
        App.b(new a36(this));
        App.ah.a(b.a, a);
        App.B(b.a);
        WidgetProvider.a(App.au);
        App.z();
    }
}
