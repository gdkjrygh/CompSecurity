// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import java.lang.ref.WeakReference;

// Referenced classes of package com.go.weatherex.g:
//            s, d

class v extends Handler
{

    WeakReference a;

    v(s s1)
    {
        a = new WeakReference(s1);
    }

    public void handleMessage(Message message)
    {
        s s1 = (s)a.get();
        if (s1 == null)
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            s.a(s1, 2);
            return;

        case 2: // '\002'
            s.h(s1);
            s.a(s1, (CityBean)message.obj);
            return;

        case 4: // '\004'
            s.h(s1);
            message = (CityBean)message.obj;
            s.i(s1).a(message);
            return;

        case 3: // '\003'
            s.h(s1);
            return;
        }
    }
}
