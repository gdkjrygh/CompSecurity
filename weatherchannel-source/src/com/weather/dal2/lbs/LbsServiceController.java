// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.lbs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.weather.dal2.DataAccessLayer;
import com.weather.dal2.locations.FollowMe;
import com.weather.dal2.locations.FollowMeSnapshot;
import com.weather.dal2.locations.LatLongExtra;
import com.weather.dal2.system.AppEvent;
import com.weather.dal2.system.SystemEvent;
import com.weather.dal2.system.TwcBus;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.lbs.LbsUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;

// Referenced classes of package com.weather.dal2.lbs:
//            LbsSystem, LbsLocationUpdateUtil, LbsService, LbsConnectionSuccess

public final class LbsServiceController extends BroadcastReceiver
{

    private static final String TAG = "LbsServiceController";
    private static LbsServiceController instance = new LbsServiceController();
    private final LbsSystem activeRequester;
    private final Context context;
    private final LbsLocationUpdateUtil lbsLocationUpdateUtil;
    private final LbsUtil lbsUtil;

    public LbsServiceController()
    {
        this(LbsUtil.getInstance(), LbsSystem.create(TwcPrefs.getInstance().getBoolean(com.weather.util.prefs.TwcPrefs.Keys.TEST_MODE, false)), AbstractTwcApplication.getRootContext(), LbsLocationUpdateUtil.getInstance());
    }

    LbsServiceController(LbsUtil lbsutil, LbsSystem lbssystem, Context context1, LbsLocationUpdateUtil lbslocationupdateutil)
    {
        activeRequester = lbssystem;
        context = context1;
        lbsLocationUpdateUtil = lbslocationupdateutil;
        lbsUtil = lbsutil;
    }

    public static LbsServiceController getInstance()
    {
        return instance;
    }

    private void handleTransition(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!lbsUtil.isLbsEnabledForAppAndDevice())
        {
            break MISSING_BLOCK_LABEL_83;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        if (activeRequester.isScheduled()) goto _L3; else goto _L2
_L2:
        LogUtil.d("LbsServiceController", LoggingMetaTags.TWC_DAL_LBS, "handleTransition:connect()", new Object[0]);
        activeRequester.connect();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        sendBestLastLocation();
        LogUtil.d("LbsServiceController", LoggingMetaTags.TWC_DAL_LBS, "handleTransition:doSingleShotUpdate()", new Object[0]);
        activeRequester.doSingleShotUpdate();
          goto _L4
        Exception exception;
        exception;
        throw exception;
        lbsLocationUpdateUtil.resetUpdateTime();
        activeRequester.disable();
          goto _L4
    }

    private void sendBestLastLocation()
    {
        LogUtil.method("LbsServiceController", LoggingMetaTags.TWC_DAL_LBS, "sendBestLastLocation", new Object[0]);
        Location location = activeRequester.getLastLocation();
        if (location != null)
        {
            Intent intent = new Intent(context, com/weather/dal2/lbs/LbsService);
            intent.putExtra("com.weather.dal2.lbs.LAST_LOCATION_LAT_LNG", new LatLongExtra(location.getLatitude(), location.getLongitude()));
            context.startService(intent);
        }
    }

    public static void setTestingInstance(LbsServiceController lbsservicecontroller)
    {
        instance = lbsservicecontroller;
    }

    public void onAppEvent(AppEvent appevent)
    {
        if (appevent.getCause() == com.weather.dal2.system.AppEvent.Cause.APP_START)
        {
            LogUtil.method("LbsServiceController", LoggingMetaTags.TWC_DAL_LBS, "onAppEvent", new Object[] {
                appevent.getCause()
            });
            handleTransition(true);
        }
    }

    public void onDeactivateFollowMe()
    {
        LogUtil.method("LbsServiceController", LoggingMetaTags.TWC_DAL_LBS, "onDeactivateFollowMe", new Object[0]);
        handleTransition(true);
    }

    public void onLbsConnectionSuccess(LbsConnectionSuccess lbsconnectionsuccess)
    {
        LogUtil.method("LbsServiceController", LoggingMetaTags.TWC_DAL_LBS, "onLbsConnectionSucceeded", new Object[0]);
        FollowMe.getInstance().activateLbs(-100);
    }

    public void onManualRefresh()
    {
        LogUtil.method("LbsServiceController", LoggingMetaTags.TWC_DAL_LBS, "onManualRefresh", new Object[0]);
        lbsLocationUpdateUtil.resetUpdateTime();
        handleTransition(true);
    }

    public void onReceive(Context context1, Intent intent)
    {
        context1 = intent.getAction();
        if (context1 != null)
        {
            LogUtil.method("LbsServiceController", LoggingMetaTags.TWC_DAL_LBS, "onReceive", new Object[] {
                context1
            });
            if (context1.equals("android.intent.action.BOOT_COMPLETED") || context1.equals("android.location.PROVIDERS_CHANGED"))
            {
                handleTransition(false);
            }
        }
    }

    public void onRequestFirstFix()
    {
        LogUtil.method("LbsServiceController", LoggingMetaTags.TWC_DAL_LBS, "onRequestFirstFix", new Object[] {
            "(activateLbs)"
        });
        handleTransition(true);
    }

    public void onSystemEvent(SystemEvent systemevent)
    {
        onSystemEvent(systemevent, new FollowMeSnapshot());
    }

    void onSystemEvent(SystemEvent systemevent, FollowMeSnapshot followmesnapshot)
    {
        boolean flag;
        if (followmesnapshot.hasWidgets() || followmesnapshot.hasNotifications())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (systemevent.getCause() == com.weather.dal2.system.SystemEvent.Cause.USER_PRESENT && flag)
        {
            LogUtil.method("LbsServiceController", LoggingMetaTags.TWC_DAL_LBS, "onSystemEvent", new Object[] {
                systemevent.getCause()
            });
            handleTransition(false);
        } else
        if (systemevent.getCause() == com.weather.dal2.system.SystemEvent.Cause.NETWORK_UP)
        {
            handleTransition(false);
            return;
        }
    }

    public void register()
    {
        DataAccessLayer.BUS.register(this);
    }

}
