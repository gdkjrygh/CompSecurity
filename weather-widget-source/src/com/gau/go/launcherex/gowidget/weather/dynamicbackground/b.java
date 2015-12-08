// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.dynamicbackground;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.dynamicbackground:
//            DynamicBackgroundView

class b extends Handler
{

    private WeakReference a;

    public b(DynamicBackgroundView dynamicbackgroundview)
    {
        a = new WeakReference(dynamicbackgroundview);
    }

    public void handleMessage(Message message)
    {
        DynamicBackgroundView dynamicbackgroundview;
        for (dynamicbackgroundview = (DynamicBackgroundView)a.get(); dynamicbackgroundview == null || message.what != 1;)
        {
            return;
        }

        DynamicBackgroundView.a(dynamicbackgroundview);
    }
}
