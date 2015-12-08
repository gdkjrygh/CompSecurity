// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.util.DisplayMetrics;
import com.gau.go.launcherex.gowidget.scriptengine.parser.z;
import com.gtp.a.a.c.c;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            h

class j
    implements Runnable
{

    final h a;
    private volatile boolean b;
    private final String c;
    private final z d;

    public j(h h1, z z, String s)
    {
        a = h1;
        super();
        c = s;
        d = z;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public void run()
    {
        Object obj;
        if (com.gtp.a.a.c.c.b(h.f(a)))
        {
            int i = h.f(a).getResources().getDisplayMetrics().widthPixels;
            int k = com.gtp.a.a.c.c.a(h.f(a));
            obj = new com.gau.go.launcherex.gowidget.scriptengine.parser.c(h.f(a), d, i, k, false);
        } else
        {
            obj = new com.gau.go.launcherex.gowidget.scriptengine.parser.c(h.f(a), d, false);
        }
        obj = ((com.gau.go.launcherex.gowidget.scriptengine.parser.c) (obj)).a(c);
        if (!b)
        {
            Message message = h.g(a).obtainMessage(1);
            message.obj = obj;
            h.g(a).sendMessage(message);
        }
    }
}
