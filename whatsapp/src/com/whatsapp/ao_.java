// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import de.greenrobot.event.g;

// Referenced classes of package com.whatsapp:
//            a9n, App

class ao_ extends Handler
{

    ao_()
    {
    }

    public void handleMessage(Message message)
    {
        if (!((a9n)g.a().a(com/whatsapp/a9n)).a())
        {
            App.aP();
        }
    }
}
