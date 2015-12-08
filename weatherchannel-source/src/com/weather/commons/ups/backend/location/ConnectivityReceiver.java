// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.ups.backend.location:
//            UserPresentIntentReceiver, LocationSyncScheduler

public class ConnectivityReceiver extends BroadcastReceiver
{

    private static final Context APP_CONTEXT = AbstractTwcApplication.getRootContext();
    private static final String TAG = "ConnectivityReceiver";

    public ConnectivityReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getBooleanExtra("noConnectivity", false))
        {
            LogUtil.d("ConnectivityReceiver", LoggingMetaTags.TWC_DAL_NET, "no connectivity", new Object[0]);
            UserPresentIntentReceiver.unregisterUserPresentReceiver(AbstractTwcApplication.getRootContext());
            return;
        } else
        {
            LogUtil.d("ConnectivityReceiver", LoggingMetaTags.TWC_DAL_NET, "connectivity", new Object[0]);
            UserPresentIntentReceiver.registerUserPresentReceiver(AbstractTwcApplication.getRootContext());
            LocationSyncScheduler.reScheduleSync(APP_CONTEXT, 1000L, true, true);
            return;
        }
    }

}
