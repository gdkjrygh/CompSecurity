// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.alertmessages;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.weather.ads2.targeting.AdTargetingParam;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.push.ProductType;
import com.weather.commons.ui.NotificationUtil;
import com.weather.commons.ui.WxIconBitmapCache;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.commons.push.alertmessages:
//            AlertMessage

public abstract class SignificantWeatherAlertMessage extends AlertMessage
{

    private static final String AD_TARGETING_ALERT_VALUE = "significantweather";
    protected static final String TAG = "SignificantWeatherAlertMessage";
    private final String description;
    private final ProductType productType;
    private final String text;

    SignificantWeatherAlertMessage(ProductType producttype, String s, String s1)
    {
        productType = producttype;
        text = s1;
        description = s;
    }

    public Map getAdTargeting()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(AdTargetingParam.ALERT.getParameterKey(), "significantweather");
        return hashmap;
    }

    public int getColor(Context context)
    {
        return context.getResources().getColor(com.weather.commons.R.color.notification_default_color);
    }

    public String getDescription()
    {
        return description;
    }

    public Bitmap getLargeIcon(Context context)
    {
        return NotificationUtil.addSeverityBackground(context, WxIconBitmapCache.getBitmap(com.weather.commons.R.raw.igeneric_alert), 0, context.getResources().getColor(com.weather.commons.R.color.notification_default_color));
    }

    public String getPresentationName()
    {
        return text;
    }

    public String getProductCode()
    {
        return productType.getProductName();
    }

    public int getSmallIcon()
    {
        return com.weather.commons.R.drawable.rain_snow_icon_leveled;
    }

    public String getText()
    {
        return text;
    }

    protected abstract String getUrlTemplate(ConfigurationManagers configurationmanagers);
}
