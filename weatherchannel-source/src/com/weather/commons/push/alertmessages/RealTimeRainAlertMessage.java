// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.alertmessages;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import com.weather.ads2.targeting.AdTargetingParam;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.locations.LocationManager;
import com.weather.commons.push.ProductType;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.config.ConfigException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.weather.commons.push.alertmessages:
//            AlertMessage

public class RealTimeRainAlertMessage extends AlertMessage
{

    private static final String TAG = "RealTimeRainAlertMessage";
    private String description;
    private String product;

    public RealTimeRainAlertMessage(String s, String s1)
    {
        product = s;
        description = s1;
    }

    public Map getAdTargeting()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(AdTargetingParam.ALERT.getParameterKey(), "rtrain");
        return hashmap;
    }

    public int getColor(Context context)
    {
        return context.getResources().getColor(com.weather.commons.R.color.realtime_rain_notification_color);
    }

    public String getDescription()
    {
        return AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.notification_realtime_rain_title);
    }

    public Bitmap getLargeIcon(Context context)
    {
        return ((BitmapDrawable)context.getResources().getDrawable(com.weather.commons.R.drawable.realtime_rain_notification)).getBitmap();
    }

    public String getPresentationName()
    {
        return description;
    }

    public String getProduct()
    {
        return product;
    }

    public String getProductCode()
    {
        return ProductType.PRODUCT_REAL_TIME_RAIN.getProductName();
    }

    public String getSharedUrl(LocationManager locationmanager, ConfigurationManagers configurationmanagers)
    {
        locationmanager = locationmanager.getFollowMeLocation();
        if (locationmanager != null)
        {
            return String.format(Locale.US, getUrlTemplate(configurationmanagers), new Object[] {
                locationmanager.getKeyTypeCountry()
            });
        } else
        {
            return "http://www.weather.com";
        }
    }

    public int getSmallIcon()
    {
        return com.weather.commons.R.drawable.realtime_rain_icon_leveled;
    }

    protected String getUrlTemplate(ConfigurationManagers configurationmanagers)
    {
        try
        {
            configurationmanagers = configurationmanagers.getFlagshipConfig().realTimeAlertShareUrl;
        }
        // Misplaced declaration of an exception variable
        catch (ConfigurationManagers configurationmanagers)
        {
            Log.e("RealTimeRainAlertMessage", "Unable to lookup real time rain share URL", configurationmanagers);
            return "http://www.weather.com";
        }
        return configurationmanagers;
    }

    public void setProduct(String s)
    {
        product = s;
    }
}
