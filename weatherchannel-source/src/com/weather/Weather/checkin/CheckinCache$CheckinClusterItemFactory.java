// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import com.weather.dal2.checkin.Checkin;
import com.weather.dal2.checkin.CheckinFactory;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinCache, CheckinClusterItem

public static class 
    implements CheckinFactory
{

    public CheckinClusterItem create(double d, double d1, byte byte0, String s)
    {
        boolean flag;
        if (s != null && s.equals(CheckinCache.access$000().get()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new CheckinClusterItem(d, d1, byte0, flag);
    }

    public volatile Checkin create(double d, double d1, byte byte0, String s)
    {
        return create(d, d1, byte0, s);
    }

    public ()
    {
    }
}
