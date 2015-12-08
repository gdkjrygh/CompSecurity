// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.location.Location;
import android.os.Handler;
import android.os.Message;
import com.gtp.a.a.a.a;

// Referenced classes of package com.jiubang.goweather.c:
//            b, s

class c extends Handler
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            com.jiubang.goweather.c.b.a(a);
            break;
        }
        message = (Location)message.obj;
        com.gtp.a.a.a.a.a().a("GPS\u5B9A\u4F4D\u6210\u529F", "location.txt");
        a.b.a(message);
    }
}
