// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.common.base.Preconditions;
import com.weather.commons.analytics.KahunaEvents;
import com.weather.commons.push.AlertServiceManager;
import com.weather.commons.ups.backend.AbnormalHttpResponseException;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.backend.UpsConstants;
import com.weather.commons.ups.facade.Profile;
import com.weather.dal2.locations.LocationChange;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import java.util.EnumSet;
import org.json.JSONException;

public class FollowMeLocationChangeReceiver extends BroadcastReceiver
{

    private static final String TAG = "FolMeLocChangeReceiver";

    public FollowMeLocationChangeReceiver()
    {
    }

    public void onReceive(Context context, final Intent followMe)
    {
        context = followMe.getAction();
        if (!"com.weather.Weather.LOCATION_CHANGE".equals(context))
        {
            break MISSING_BLOCK_LABEL_169;
        }
        if (!followMe.hasExtra("com.weather.Weather.LOCATION_CHANGE_EXTRA"))
        {
            return;
        }
        followMe = (LocationChange)Preconditions.checkNotNull((LocationChange)followMe.getSerializableExtra("com.weather.Weather.LOCATION_CHANGE_EXTRA"));
        context = followMe.getFlags();
        followMe = followMe.getSnapshot().getFollowMeLocation();
        if (context.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_CHANGE) || context.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_ACTIVATED))
        {
            if (followMe != null)
            {
                try
                {
                    if (context.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_CHANGE_ON_LAST_LOCATION))
                    {
                        if (context.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_ACTIVATED))
                        {
                            KahunaEvents.getInstance().toggleFollowMe(followMe, true);
                        }
                        (new Thread(new Runnable() {

                            boolean hasFollowMeService;
                            final FollowMeLocationChangeReceiver this$0;
                            final SavedLocation val$followMe;

                            private void createAlertService(Profile profile, com.weather.dal2.locations.SavedLocation.AlertType alerttype, com.weather.commons.push.PushService.ServiceType servicetype)
                                throws AbnormalHttpResponseException, JSONException, com.weather.util.net.HttpRequest.HttpRequestException
                            {
                                if (followMe.hasAlert(alerttype))
                                {
                                    hasFollowMeService = true;
                                    if (profile.getServiceId(followMe, servicetype) == null)
                                    {
                                        AlertServiceManager.getInstance().createAlertService(null, null, servicetype, null, true);
                                    }
                                }
                            }

                            public void run()
                            {
                                boolean flag;
                                Profile profile = AccountManager.getInstance().getUserProfile();
                                createAlertService(profile, com.weather.dal2.locations.SavedLocation.AlertType.severe, com.weather.commons.push.PushService.ServiceType.FOLLOWME_SEVERE);
                                createAlertService(profile, com.weather.dal2.locations.SavedLocation.AlertType.realTimeRain, com.weather.commons.push.PushService.ServiceType.REAL_TIME_RAIN);
                                createAlertService(profile, com.weather.dal2.locations.SavedLocation.AlertType.lightning, com.weather.commons.push.PushService.ServiceType.FOLLOWME_LIGHTNING);
                                flag = hasFollowMeService;
                                if (!flag)
                                {
                                    break MISSING_BLOCK_LABEL_71;
                                }
                                AlertServiceManager.getInstance().updateFollowMeLocation(followMe);
                                TwcPrefs.getInstance().putLong(com.weather.util.prefs.TwcPrefs.Keys.UPS_LAST_FOLLOW_ME_UPDATE_TIME, System.currentTimeMillis());
                                return;
                                Exception exception;
                                exception;
                                try
                                {
                                    AlertServiceManager.getInstance().updateFollowMeLocation(followMe);
                                    TwcPrefs.getInstance().putLong(com.weather.util.prefs.TwcPrefs.Keys.UPS_LAST_FOLLOW_ME_UPDATE_TIME, System.currentTimeMillis());
                                    return;
                                }
                                catch (Exception exception1)
                                {
                                    LogUtil.e("FolMeLocChangeReceiver", LoggingMetaTags.TWC_UPS, exception1.getMessage(), new Object[] {
                                        exception1
                                    });
                                }
                                return;
                            }

            
            {
                this$0 = FollowMeLocationChangeReceiver.this;
                followMe = savedlocation;
                super();
            }
                        })).start();
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    Log.e("FolMeLocChangeReceiver", context.getMessage(), context);
                    return;
                }
            }
            break MISSING_BLOCK_LABEL_169;
        }
        if (context.contains(com.weather.dal2.locations.LocationChange.Flags.FOLLOW_ME_DEACTIVATED))
        {
            KahunaEvents.getInstance().toggleFollowMe(followMe, false);
            (new Thread("disable follow me severe service on dsx") {

                final FollowMeLocationChangeReceiver this$0;

                public void run()
                {
                    AlertServiceManager.getInstance().deleteAlertService(UpsConstants.getFollowMeSevereServiceId());
                    AlertServiceManager.getInstance().deleteAlertService(UpsConstants.getRealTimeRainServiceId());
                    AlertServiceManager.getInstance().deleteAlertService(UpsConstants.getFollowMeLightningServiceId());
                    return;
                    Object obj;
                    obj;
_L2:
                    LogUtil.e("FolMeLocChangeReceiver", LoggingMetaTags.TWC_UPS, ((Exception) (obj)).getMessage(), new Object[] {
                        obj
                    });
                    return;
                    obj;
                    continue; /* Loop/switch isn't completed */
                    obj;
                    if (true) goto _L2; else goto _L1
_L1:
                }

            
            {
                this$0 = FollowMeLocationChangeReceiver.this;
                super(s);
            }
            }).start();
        }
    }
}
