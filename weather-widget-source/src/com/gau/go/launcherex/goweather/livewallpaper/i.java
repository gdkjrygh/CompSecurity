// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.goweather.livewallpaper.b.a;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            h, a

class i extends Handler
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        if (!com.gau.go.launcherex.goweather.livewallpaper.h.a(a))
        {
            h.e(a).a((com.jiubang.core.a.i)message.obj, h.b(a), h.c(a), h.d(a).a());
        } else
        {
            message = (com.jiubang.core.a.i)message.obj;
            if (message != null)
            {
                message.j();
                return;
            }
        }
    }
}
