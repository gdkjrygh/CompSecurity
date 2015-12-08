// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import java.lang.ref.WeakReference;

// Referenced classes of package com.go.weatherex.g:
//            a, d

class c extends Handler
{

    WeakReference a;

    c(a a1)
    {
        a = new WeakReference(a1);
    }

    public void handleMessage(Message message)
    {
        a a1 = (a)a.get();
        if (a1 == null)
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            a1.a(2);
            return;

        case 2: // '\002'
            com.go.weatherex.g.a.d(a1);
            a1.a((CityBean)message.obj);
            return;

        case 4: // '\004'
            com.go.weatherex.g.a.d(a1);
            message = (CityBean)message.obj;
            com.go.weatherex.g.a.e(a1).a(message);
            return;

        case 3: // '\003'
            com.go.weatherex.g.a.d(a1);
            return;
        }
    }
}
