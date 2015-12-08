// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.os.Handler;
import android.os.Message;
import com.gtp.a.a.a.a;
import com.gtp.a.a.b.c;

// Referenced classes of package com.jiubang.goweather.c:
//            p, w, s

class q extends Handler
{

    final p a;

    q(p p1)
    {
        a = p1;
        super();
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 2: // '\002'
            com.gtp.a.a.a.a.a().a("\u6B63\u5728\u8FDB\u884C\u7684\u5B9A\u4F4D\u8D85\u65F6", "location.txt");
            break;
        }
        c.a("Location", "\u6B63\u5728\u8FDB\u884C\u7684\u5B9A\u4F4D\u8D85\u65F6");
        com.jiubang.goweather.c.p.a(a).a();
        p.b(a).a(((Integer)message.obj).intValue());
    }
}
