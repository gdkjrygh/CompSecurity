// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.push;

import com.weather.commons.push.AlertServiceManager;
import com.weather.commons.ups.backend.AbnormalHttpResponseException;
import com.weather.commons.ups.backend.UpsConstants;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import org.json.JSONException;

// Referenced classes of package com.weather.Weather.push:
//            FollowMeLocationChangeReceiver

class this._cls0 extends Thread
{

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

    ion(String s)
    {
        this$0 = FollowMeLocationChangeReceiver.this;
        super(s);
    }
}
