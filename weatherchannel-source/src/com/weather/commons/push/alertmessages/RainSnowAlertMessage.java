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
import com.weather.commons.push.ProductType;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.config.ConfigException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.commons.push.alertmessages:
//            AlertMessage

public class RainSnowAlertMessage extends AlertMessage
{

    private static final String TAG = "RainSnowAlertMessage";
    private String localizedHeader;
    private String locationCode;
    private String product;

    public RainSnowAlertMessage(String s, String s1, String s2)
    {
        product = s2;
        localizedHeader = s;
        locationCode = s1;
    }

    public Map getAdTargeting()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(AdTargetingParam.ALERT.getParameterKey(), "rain");
        return hashmap;
    }

    public int getColor(Context context)
    {
        return context.getResources().getColor(com.weather.commons.R.color.rainsnow_notification_color);
    }

    public String getDescription()
    {
        return AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.settings_rain_snow_subscreen_title);
    }

    public Bitmap getLargeIcon(Context context)
    {
        return ((BitmapDrawable)context.getResources().getDrawable(com.weather.commons.R.drawable.rain_icon)).getBitmap();
    }

    public String getLocalizedHeader()
    {
        return localizedHeader;
    }

    public String getLocationCode()
    {
        return locationCode;
    }

    public String getPresentationName()
    {
        return localizedHeader;
    }

    public String getProduct()
    {
        return product;
    }

    public String getProductCode()
    {
        return ProductType.PRODUCT_RAINSNOW.getProductName();
    }

    public int getSmallIcon()
    {
        return com.weather.commons.R.drawable.rain_snow_icon_leveled;
    }

    protected String getUrlTemplate(ConfigurationManagers configurationmanagers)
    {
        try
        {
            configurationmanagers = configurationmanagers.getFlagshipConfig().rainsnowShareUrl;
        }
        // Misplaced declaration of an exception variable
        catch (ConfigurationManagers configurationmanagers)
        {
            Log.e("RainSnowAlertMessage", "Unable to lookup rain/snow share URL", configurationmanagers);
            return "http://www.weather.com";
        }
        return configurationmanagers;
    }

    public String getZip()
    {
        return locationCode;
    }

    public void setLocalizedHeader(String s)
    {
        localizedHeader = s;
    }

    public void setProduct(String s)
    {
        product = s;
    }

    public void setZip(String s)
    {
        locationCode = s;
    }
}
