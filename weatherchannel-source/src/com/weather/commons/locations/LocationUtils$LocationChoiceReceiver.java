// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.locations;

import com.weather.dal2.locations.Fetcher;
import com.weather.dal2.net.Receiver;
import com.weather.util.ExceptionUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.List;

// Referenced classes of package com.weather.commons.locations:
//            LocationUtils, LocationReceiver

private static class <init>
    implements Receiver
{

    private static final String TAG = "LocationUtils.LocationChoiceReceiver";

    public volatile void onCompletion(Object obj, Object obj1)
    {
        onCompletion((List)obj, (onCompletion)obj1);
    }

    public void onCompletion(List list, onCompletion oncompletion)
    {
        if (!list.isEmpty())
        {
            list = (Fetcher)list.get(0);
            LogUtil.d("LocationUtils.LocationChoiceReceiver", LoggingMetaTags.TWC_DEEPLINK, "onCompletion: userData=%s, fetcher=%s", new Object[] {
                oncompletion, list
            });
            list.fetch(new LocationReceiver(com.weather.dal2.locations.K_THRU), oncompletion);
            return;
        } else
        {
            LogUtil.d("LocationUtils.LocationChoiceReceiver", LoggingMetaTags.TWC_DEEPLINK, "onCompletion: userData=%s, no result.", new Object[] {
                oncompletion
            });
            return;
        }
    }

    public void onError(Throwable throwable, HRU hru)
    {
        ExceptionUtil.logExceptionWarning("LocationUtils.LocationChoiceReceiver", (new StringBuilder()).append("onError: location=").append(hru).toString(), throwable);
    }

    public volatile void onError(Throwable throwable, Object obj)
    {
        onError(throwable, (onError)obj);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
