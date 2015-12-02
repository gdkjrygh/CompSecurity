// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;

// Referenced classes of package com.whatsapp:
//            b, App, SettingsChat, cb

class r7
    implements Runnable
{

    final b a;

    r7(b b1)
    {
        a = b1;
        super();
    }

    public void run()
    {
        App.a(a.a);
        SettingsChat.a(a.a).post(new cb(this));
    }
}
