// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.goweather.livewallpaper;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.gowidget.scriptengine.parser.ae;

// Referenced classes of package com.gau.go.launcherex.goweather.livewallpaper:
//            a

class c
    implements Runnable
{

    final a a;
    private final Context b;
    private final String c;
    private final boolean d;
    private final boolean e;

    public c(a a1, Context context, String s, boolean flag, boolean flag1)
    {
        a = a1;
        super();
        b = context;
        c = s;
        d = flag;
        e = flag1;
    }

    public void run()
    {
        if (b != null)
        {
            Object obj = new ae(b);
            com.gau.go.launcherex.gowidget.scriptengine.parser.z z = ((ae) (obj)).a(c, com.gau.go.launcherex.goweather.livewallpaper.a.g(a));
            boolean flag = ((ae) (obj)).a();
            obj = com.gau.go.launcherex.goweather.livewallpaper.a.i(a).obtainMessage();
            if (d)
            {
                if (!e)
                {
                    obj.what = 1;
                } else
                {
                    obj.what = 4;
                }
            } else
            {
                obj.what = 2;
            }
            obj.obj = ((Object) (new Object[] {
                c, z, Boolean.valueOf(flag)
            }));
            com.gau.go.launcherex.goweather.livewallpaper.a.i(a).sendMessage(((Message) (obj)));
        }
    }
}
