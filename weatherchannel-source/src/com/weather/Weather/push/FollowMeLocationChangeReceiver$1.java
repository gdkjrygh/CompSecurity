// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.push;

import com.weather.commons.push.AlertServiceManager;
import com.weather.commons.ups.backend.AbnormalHttpResponseException;
import com.weather.commons.ups.backend.AccountManager;
import com.weather.commons.ups.facade.Profile;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;
import org.json.JSONException;

// Referenced classes of package com.weather.Weather.push:
//            FollowMeLocationChangeReceiver

class val.followMe
    implements Runnable
{

    boolean hasFollowMeService;
    final FollowMeLocationChangeReceiver this$0;
    final SavedLocation val$followMe;

    private void createAlertService(Profile profile, com.weather.dal2.locations.l.followMe followme, com.weather.commons.push.val.followMe followme1)
        throws AbnormalHttpResponseException, JSONException, com.weather.util.net.ception
    {
        if (val$followMe.hasAlert(followme))
        {
            hasFollowMeService = true;
            if (profile.getServiceId(val$followMe, followme1) == null)
            {
                AlertServiceManager.getInstance().createAlertService(null, null, followme1, null, true);
            }
        }
    }

    public void run()
    {
        boolean flag;
        Profile profile = AccountManager.getInstance().getUserProfile();
        createAlertService(profile, com.weather.dal2.locations.eateAlertService, com.weather.commons.push.SEVERE);
        createAlertService(profile, com.weather.dal2.locations.ain, com.weather.commons.push._RAIN);
        createAlertService(profile, com.weather.dal2.locations., com.weather.commons.push.LIGHTNING);
        flag = hasFollowMeService;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        AlertServiceManager.getInstance().updateFollowMeLocation(val$followMe);
        TwcPrefs.getInstance().putLong(com.weather.util.prefs.UPDATE_TIME, System.currentTimeMillis());
        return;
        Exception exception;
        exception;
        try
        {
            AlertServiceManager.getInstance().updateFollowMeLocation(val$followMe);
            TwcPrefs.getInstance().putLong(com.weather.util.prefs.UPDATE_TIME, System.currentTimeMillis());
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

    ion()
    {
        this$0 = final_followmelocationchangereceiver;
        val$followMe = SavedLocation.this;
        super();
    }
}
