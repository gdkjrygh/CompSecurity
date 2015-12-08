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

public class LightningStrikeAlertMessage extends AlertMessage
{

    private static final String TAG = "LightningStrikeAlertMessage";
    private String product;
    private final String text;

    public LightningStrikeAlertMessage(String s, String s1)
    {
        product = s;
        text = s1;
    }

    public Map getAdTargeting()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(AdTargetingParam.ALERT.getParameterKey(), "lghtng");
        return hashmap;
    }

    public int getColor(Context context)
    {
        return context.getResources().getColor(com.weather.commons.R.color.lightning_strike_notification_color);
    }

    public String getDescription()
    {
        return AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.notification_lightning_strike_title);
    }

    public Bitmap getLargeIcon(Context context)
    {
        return ((BitmapDrawable)context.getResources().getDrawable(com.weather.commons.R.drawable.lightning_strike_notification)).getBitmap();
    }

    public String getPresentationName()
    {
        return text;
    }

    public String getProduct()
    {
        return product;
    }

    public String getProductCode()
    {
        return ProductType.PRODUCT_LIGHTNING_STRIKES.getProductName();
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
        return com.weather.commons.R.drawable.lightning_strike_icon_leveled;
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
            Log.e("LightningStrikeAlertMessage", configurationmanagers.getMessage(), configurationmanagers);
            return "http://www.weather.com";
        }
        return configurationmanagers;
    }

    public void setProduct(String s)
    {
        product = s;
    }
}
