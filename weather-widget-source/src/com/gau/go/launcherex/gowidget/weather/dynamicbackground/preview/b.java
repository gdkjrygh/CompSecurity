// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.gowidget.scriptengine.parser.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview:
//            a, c

class b extends Handler
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        if (message.what == 1)
        {
            Object aobj[] = (Object[])(Object[])message.obj;
            message = (String)aobj[0];
            z z1 = (z)aobj[1];
            a.a.put(message, z1);
            if (com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.a.a(a) == a.a.size())
            {
                message = com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.a.b(a);
                Intent intent = new Intent("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_SCREEN_BACKGROUND_PREVIEW_DONE");
                intent.putParcelableArrayListExtra("extra_dynamicbackground_preview", message);
                com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.a.c(a).sendBroadcast(intent);
            }
        } else
        if (message.what == 0)
        {
            message = com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.a.d(a);
            com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.a.a(a, message.size());
            String s;
            for (Iterator iterator = message.iterator(); iterator.hasNext(); com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.a.e(a).execute(new c(a, com.gau.go.launcherex.gowidget.weather.dynamicbackground.preview.a.c(a), s, true, false)))
            {
                s = (String)iterator.next();
            }

            message.clear();
            return;
        }
    }
}
