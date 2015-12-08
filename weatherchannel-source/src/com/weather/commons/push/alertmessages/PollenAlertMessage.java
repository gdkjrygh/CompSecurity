// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.alertmessages;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.Log;
import com.weather.ads2.targeting.AdTargetingParam;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.config.FlagshipConfig;
import com.weather.commons.push.ProductType;
import com.weather.commons.ui.NotificationUtil;
import com.weather.commons.ui.WxIconBitmapCache;
import com.weather.util.config.ConfigException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.commons.push.alertmessages:
//            AlertMessage

public class PollenAlertMessage extends AlertMessage
{

    private static final String TAG = "PollenAlertMessage";
    private String grassLevel;
    private String locationCode;
    private String presentationName;
    private String product;
    private String treeLevel;
    private String weedsLevel;

    public PollenAlertMessage(String s, String s1, String s2, String s3, String s4, String s5)
    {
        product = s;
        locationCode = s1;
        treeLevel = s2;
        grassLevel = s3;
        weedsLevel = s4;
        presentationName = s5;
    }

    public Map getAdTargeting()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(AdTargetingParam.ALERT.getParameterKey(), "plln");
        return hashmap;
    }

    public int getColor(Context context)
    {
        return context.getResources().getColor(com.weather.commons.R.color.pollen_notification_color);
    }

    public String getDescription()
    {
        return (new StringBuilder()).append("Tree:").append(treeLevel).append(", Grass:").append(grassLevel).append(", Weed:").append(weedsLevel).toString();
    }

    public String getGrassLevel()
    {
        return grassLevel;
    }

    public Bitmap getLargeIcon(Context context)
    {
        return NotificationUtil.addSeverityBackground(context, WxIconBitmapCache.getBitmap(com.weather.commons.R.raw.igeneric_alert), 0, context.getResources().getColor(com.weather.commons.R.color.pollen_notification_color));
    }

    public String getLocationCode()
    {
        return locationCode;
    }

    public String getPresentationName()
    {
        return presentationName;
    }

    public String getProduct()
    {
        return product;
    }

    public String getProductCode()
    {
        return ProductType.PRODUCT_POLLEN.getProductName();
    }

    public int getSmallIcon()
    {
        return com.weather.commons.R.drawable.pollen_icon_leveled;
    }

    public String getTreeLevel()
    {
        return treeLevel;
    }

    protected String getUrlTemplate(ConfigurationManagers configurationmanagers)
    {
        try
        {
            configurationmanagers = configurationmanagers.getFlagshipConfig().pollenShareUrl;
        }
        // Misplaced declaration of an exception variable
        catch (ConfigurationManagers configurationmanagers)
        {
            Log.e("PollenAlertMessage", "Unable to lookup pollen share URL", configurationmanagers);
            return "http://www.weather.com";
        }
        return configurationmanagers;
    }

    public String getWeedsLevel()
    {
        return weedsLevel;
    }

    public void setGrassLevel(String s)
    {
        grassLevel = s;
    }

    public void setLocationCode(String s)
    {
        locationCode = s;
    }

    public void setPresentationName(String s)
    {
        presentationName = s;
    }

    public void setProduct(String s)
    {
        product = s;
    }

    public void setTreeLevel(String s)
    {
        treeLevel = s;
    }

    public void setWeedsLevel(String s)
    {
        weedsLevel = s;
    }
}
