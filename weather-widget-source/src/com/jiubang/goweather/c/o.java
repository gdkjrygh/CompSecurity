// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.c;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.jiubang.goweather.c:
//            m, p

class o
    implements LocationListener
{

    final m a;

    o(m m1)
    {
        a = m1;
        super();
    }

    public void onLocationChanged(Location location)
    {
        if (location != null)
        {
            a.c.a();
            Message message = new Message();
            message.what = 1;
            message.obj = location;
            m.b(a).sendMessage(message);
        }
    }

    public void onProviderDisabled(String s)
    {
        if ("network".equals(s))
        {
            m.a(a);
        }
    }

    public void onProviderEnabled(String s)
    {
    }

    public void onStatusChanged(String s, int i, Bundle bundle)
    {
        if (i == 0)
        {
            m.a(a);
        }
    }
}
