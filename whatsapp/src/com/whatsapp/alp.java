// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;

// Referenced classes of package com.whatsapp:
//            a9q, App

class alp
    implements Runnable
{

    final a9q a;

    alp(a9q a9q1)
    {
        a = a9q1;
        super();
    }

    public void run()
    {
        a.c.removeDialog(107);
        if (!a.c.isFinishing())
        {
            App app = App.au;
            int i;
            if (a.f)
            {
                i = 0x7f0e0060;
            } else
            {
                i = 0x7f0e0455;
            }
            App.a(null, app.getString(i));
        }
    }
}
