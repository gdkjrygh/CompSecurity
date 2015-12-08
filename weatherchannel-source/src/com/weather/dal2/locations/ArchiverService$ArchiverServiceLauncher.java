// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.locations;

import android.content.Context;
import android.content.Intent;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.system.AppEvent;
import com.weather.dal2.system.TwcBus;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.dal2.locations:
//            ArchiverService, LocationChange

public static class 
{

    public static final startService instance = new <init>();

    public static  getInstance()
    {
        return instance;
    }

    private void startService()
    {
        Context context;
        context = AbstractTwcApplication.getRootContext();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        context.startService(new Intent(context, com/weather/dal2/locations/ArchiverService));
        return;
        Throwable throwable;
        throwable;
        LogUtil.d("ArchiverService", LoggingMetaTags.TWC_DAL_LOCATIONS, "Could not start ArchiveService: %s", new Object[] {
            throwable.toString()
        });
        return;
    }

    public void onAppPause(AppEvent appevent)
    {
        if (appevent.getCause() == com.weather.dal2.system.er)
        {
            LogUtil.method("ArchiverService", LoggingMetaTags.TWC_DAL_LOCATIONS, "onAppPause", new Object[0]);
            startService();
        }
    }

    public void onLocationChange(LocationChange locationchange)
    {
        LogUtil.method("ArchiverService", LoggingMetaTags.TWC_DAL_LOCATIONS, "onLocationChange", new Object[0]);
        startService();
    }

    public void register()
    {
        DataAccessLayer.BUS.register(this);
    }


    public ()
    {
    }
}
