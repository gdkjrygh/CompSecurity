// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.widget.dynamicicon:
//            GoWidgetDynamicIconView, f

class e extends Handler
{

    private WeakReference a;
    private boolean b;

    public e(WeakReference weakreference)
    {
        a = weakreference;
        b = false;
    }

    public void a()
    {
        b();
        b = true;
        sendEmptyMessage(34);
    }

    public void b()
    {
        b = false;
        removeMessages(34);
        removeMessages(35);
    }

    public void handleMessage(Message message)
    {
        GoWidgetDynamicIconView gowidgetdynamiciconview = (GoWidgetDynamicIconView)a.get();
        if (gowidgetdynamiciconview == null) goto _L2; else goto _L1
_L1:
        gowidgetdynamiciconview.invalidate();
        message.what;
        JVM INSTR tableswitch 34 34: default 40
    //                   34 41;
           goto _L2 _L3
_L2:
        return;
_L3:
        if (b && GoWidgetDynamicIconView.a(gowidgetdynamiciconview) != null && !GoWidgetDynamicIconView.a(gowidgetdynamiciconview).a())
        {
            sendEmptyMessageDelayed(34, 30L);
            return;
        } else
        {
            sendEmptyMessageDelayed(35, 30L);
            return;
        }
    }
}
