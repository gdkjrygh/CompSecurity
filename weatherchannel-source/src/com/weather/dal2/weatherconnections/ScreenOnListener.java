// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.weatherconnections;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.dal2.weatherconnections:
//            RequestManager

public class ScreenOnListener extends BroadcastReceiver
{

    private static final String TAG = "ScreenOnListener";

    public ScreenOnListener()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        LogUtil.method("ScreenOnListener", LoggingMetaTags.TWC_DAL_WXD, "onReceive", new Object[0]);
        context = (new SavedLocationsSnapshot()).getFixedLocations().iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            if (!((SavedLocation)context.next()).hasNotifications())
            {
                continue;
            }
            RequestManager.getInstance().doRefresh();
            break;
        } while (true);
    }
}
