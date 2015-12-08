// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.urbanairship.push.PushPreferences;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

// Referenced classes of package com.urbanairship.analytics:
//            Environment, Analytics

public class DefaultEnvironment extends Environment
{

    String conversionPushId;
    String lastSendId;
    String sessionId;

    public DefaultEnvironment()
    {
        conversionPushId = UAirship.shared().getAnalytics().getConversionPushId();
        sessionId = UAirship.shared().getAnalytics().getSessionId();
        if (UAirship.shared().getAirshipConfigOptions().pushServiceEnabled)
        {
            lastSendId = PushManager.shared().getPreferences().getLastReceivedSendId();
        }
    }

    public String getApid()
    {
        PushPreferences pushpreferences = PushManager.shared().getPreferences();
        if (pushpreferences != null)
        {
            return pushpreferences.getPushId();
        } else
        {
            return null;
        }
    }

    public String getCarrier()
    {
        return ((TelephonyManager)UAirship.shared().getApplicationContext().getSystemService("phone")).getNetworkOperatorName();
    }

    public String getConnectionSubType()
    {
        Object obj = (ConnectivityManager)UAirship.shared().getApplicationContext().getSystemService("connectivity");
        if (obj != null)
        {
            obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
            if (obj != null)
            {
                return ((NetworkInfo) (obj)).getSubtypeName();
            }
        }
        return "";
    }

    public String getConnectionType()
    {
        byte byte0 = -1;
        Object obj = (ConnectivityManager)UAirship.shared().getApplicationContext().getSystemService("connectivity");
        int i = byte0;
        if (obj != null)
        {
            obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
            i = byte0;
            if (obj != null)
            {
                i = ((NetworkInfo) (obj)).getType();
            }
        }
        switch (i)
        {
        default:
            return "none";

        case 0: // '\0'
            return "cell";

        case 1: // '\001'
            return "wifi";

        case 6: // '\006'
            return "wimax";
        }
    }

    public String getConversionPushId()
    {
        return conversionPushId;
    }

    public String getLastSendId()
    {
        return lastSendId;
    }

    public String getLibVersion()
    {
        return UAirship.getVersion();
    }

    public ArrayList getNotificationTypes()
    {
        ArrayList arraylist = new ArrayList();
        PushPreferences pushpreferences = PushManager.shared().getPreferences();
        if (pushpreferences != null && pushpreferences.isPushEnabled())
        {
            if (pushpreferences.isSoundEnabled())
            {
                arraylist.add("sound");
            }
            if (pushpreferences.isVibrateEnabled())
            {
                arraylist.add("vibrate");
            }
        }
        return arraylist;
    }

    public String getOsVersion()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public String getPackageVersion()
    {
        return UAirship.getPackageInfo().versionName;
    }

    public String getPushTransport()
    {
        return UAirship.shared().getAirshipConfigOptions().getTransport().toString();
    }

    public Date[] getQuietTimeInterval()
    {
        PushPreferences pushpreferences = PushManager.shared().getPreferences();
        if (pushpreferences != null)
        {
            return pushpreferences.getQuietTimeInterval();
        } else
        {
            return null;
        }
    }

    public String getSessionId()
    {
        return sessionId;
    }

    public long getTimeMillis()
    {
        return System.currentTimeMillis();
    }

    public long getTimezone()
    {
        return (long)(Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / 1000);
    }

    public boolean isAppInForeground()
    {
        return UAirship.shared().getAnalytics().isAppInForeground();
    }

    public boolean isDaylightSavingsTime()
    {
        return Calendar.getInstance().getTimeZone().inDaylightTime(new Date());
    }

    public boolean isPushEnabled()
    {
        PushPreferences pushpreferences = PushManager.shared().getPreferences();
        if (pushpreferences != null)
        {
            return pushpreferences.isPushEnabled();
        } else
        {
            return false;
        }
    }

    public boolean isQuietTimeEnabled()
    {
        PushPreferences pushpreferences = PushManager.shared().getPreferences();
        if (pushpreferences != null)
        {
            return pushpreferences.isPushEnabled();
        } else
        {
            return false;
        }
    }
}
