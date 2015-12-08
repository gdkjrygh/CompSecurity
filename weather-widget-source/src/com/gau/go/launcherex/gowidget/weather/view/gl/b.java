// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view.gl:
//            GLWeatherLouverView

class b extends Handler
{

    private WeakReference a;

    public b(WeakReference weakreference)
    {
        a = weakreference;
    }

    public void handleMessage(Message message)
    {
        message = (GLWeatherLouverView)a.get();
        if (message != null)
        {
            GLWeatherLouverView.access$000(message);
            if (GLWeatherLouverView.access$100(message))
            {
                GLWeatherLouverView.access$200(message);
            } else
            {
                sendEmptyMessageDelayed(0, 30L);
            }
            message.invalidate();
        }
    }
}
