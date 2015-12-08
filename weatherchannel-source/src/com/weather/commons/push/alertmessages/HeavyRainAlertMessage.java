// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.alertmessages;

import android.content.Context;
import android.util.Log;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.push.ProductType;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.config.ConfigException;

// Referenced classes of package com.weather.commons.push.alertmessages:
//            SignificantWeatherAlertMessage

public class HeavyRainAlertMessage extends SignificantWeatherAlertMessage
{

    public HeavyRainAlertMessage(String s)
    {
        super(ProductType.HEAVY_RAIN, AbstractTwcApplication.getRootContext().getString(com.weather.commons.R.string.significant_weather_heavy_rain_title), s);
    }

    protected String getUrlTemplate(ConfigurationManagers configurationmanagers)
    {
        try
        {
            configurationmanagers = configurationmanagers.getFlagshipConfig().heavyRainAlertShareUrl;
        }
        // Misplaced declaration of an exception variable
        catch (ConfigurationManagers configurationmanagers)
        {
            Log.e("SignificantWeatherAlertMessage", "Unable to lookup share URL", configurationmanagers);
            return "http://www.weather.com";
        }
        return configurationmanagers;
    }
}
