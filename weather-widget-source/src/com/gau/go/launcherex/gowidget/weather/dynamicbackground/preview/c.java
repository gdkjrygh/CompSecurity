// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.gowidget.scriptengine.parser.ae;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview:
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
            com.gau.go.launcherex.gowidget.scriptengine.parser.z z = (new ae(b)).a(c, com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.a.f(a));
            Message message = com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.a.g(a).obtainMessage();
            if (d)
            {
                if (!e)
                {
                    message.what = 1;
                } else
                {
                    message.what = 4;
                }
            } else
            {
                message.what = 2;
            }
            message.obj = ((Object) (new Object[] {
                c, z
            }));
            com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.a.g(a).sendMessage(message);
        }
    }
}
