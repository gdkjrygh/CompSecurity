// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            aod, App, SettingsChat, kb

class rm
    implements Runnable
{

    final aod a;

    rm(aod aod1)
    {
        a = aod1;
        super();
    }

    public void run()
    {
        App.b(a.a);
        SettingsChat.a(a.a).post(new kb(this));
    }
}
