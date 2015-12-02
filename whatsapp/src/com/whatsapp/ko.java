// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            auu, App, SettingsChat, m5

class ko
    implements Runnable
{

    final auu a;

    ko(auu auu1)
    {
        a = auu1;
        super();
    }

    public void run()
    {
        App.b(a.a);
        try
        {
            Thread.sleep(300L);
        }
        catch (InterruptedException interruptedexception) { }
        SettingsChat.a(a.b).post(new m5(this));
    }
}
