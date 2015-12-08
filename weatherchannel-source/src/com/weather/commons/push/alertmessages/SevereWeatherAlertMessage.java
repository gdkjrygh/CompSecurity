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
import com.weather.commons.facade.WeatherAlert;
import com.weather.commons.facade.WeatherAlertIcon;
import com.weather.commons.push.ProductType;
import com.weather.commons.ui.NotificationUtil;
import com.weather.commons.ui.WxIconBitmapCache;
import com.weather.util.config.ConfigException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.weather.commons.push.alertmessages:
//            AlertMessage

public class SevereWeatherAlertMessage extends AlertMessage
{

    private static final String TAG = "SevereAlertMessage";
    private String city;
    private String country;
    private String countryCode;
    private String description;
    private String etn;
    private String locType;
    private String location;
    private String officeId;
    private String phenom;
    private String pil;
    private String presentationName;
    private String product;
    private int severityNum;
    private String significance;
    private String state;
    private String twcEventId;

    public SevereWeatherAlertMessage(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9, String s10, String s11, String s12, 
            String s13)
    {
        severityNum = i;
        phenom = s;
        significance = s1;
        product = s2;
        countryCode = s3;
        city = s4;
        state = s5;
        country = s6;
        description = s7;
        twcEventId = s8;
        presentationName = s9;
        locType = s10;
        location = s11;
        officeId = s12;
        etn = s13;
    }

    public Map getAdTargeting()
    {
        HashMap hashmap = new HashMap(1);
        hashmap.put(AdTargetingParam.ALERT.getParameterKey(), "severe");
        return hashmap;
    }

    public String getCity()
    {
        return city;
    }

    public int getColor(Context context)
    {
        int i;
        if (severityNum == 1)
        {
            i = com.weather.commons.R.color.severe_ticker_red;
        } else
        {
            i = com.weather.commons.R.color.severe_ticker_orange;
        }
        return context.getResources().getColor(i);
    }

    public String getCountry()
    {
        return country;
    }

    public String getCountryCode()
    {
        return countryCode;
    }

    public String getDescription()
    {
        return description;
    }

    public String getEtn()
    {
        return etn;
    }

    public Bitmap getLargeIcon(Context context)
    {
        return NotificationUtil.addSeverityBackground(context, WxIconBitmapCache.getBitmap(WeatherAlert.getIconCode(phenom, significance).getIconId()), severityNum, 0);
    }

    public String getLocType()
    {
        return locType;
    }

    public String getLocation()
    {
        return location;
    }

    public String getOfficeId()
    {
        return officeId;
    }

    public String getPhenom()
    {
        return phenom;
    }

    public String getPil()
    {
        return pil;
    }

    public String getPresentationName()
    {
        return presentationName;
    }

    public int getPriority()
    {
        return 2;
    }

    public String getProduct()
    {
        return product;
    }

    public String getProductCode()
    {
        return ProductType.PRODUCT_SEVERE.getProductName();
    }

    public int getSeverityNum()
    {
        return severityNum;
    }

    public String getSignificance()
    {
        return significance;
    }

    public int getSmallIcon()
    {
        return WeatherAlert.getIconCode(phenom, significance).getNotificationId();
    }

    public String getState()
    {
        return state;
    }

    public String getTwcEventId()
    {
        return twcEventId;
    }

    protected String getUrlTemplate(ConfigurationManagers configurationmanagers)
    {
        try
        {
            configurationmanagers = configurationmanagers.getFlagshipConfig().severeAlertShareUrl;
        }
        // Misplaced declaration of an exception variable
        catch (ConfigurationManagers configurationmanagers)
        {
            Log.e("SevereAlertMessage", "Unable to lookup severe share URL", configurationmanagers);
            return "http://www.weather.com";
        }
        return configurationmanagers;
    }

    public void setCity(String s)
    {
        city = s;
    }

    public void setCountry(String s)
    {
        country = s;
    }

    public void setCountryCode(String s)
    {
        countryCode = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setLocType(String s)
    {
        locType = s;
    }

    public void setLocation(String s)
    {
        location = s;
    }

    public void setPhenom(String s)
    {
        phenom = s;
    }

    public void setPil(String s)
    {
        pil = s;
    }

    public void setPresentationName(String s)
    {
        presentationName = s;
    }

    public void setProduct(String s)
    {
        product = s;
    }

    public void setSeverityNum(int i)
    {
        severityNum = i;
    }

    public void setSignificance(String s)
    {
        significance = s;
    }

    public void setState(String s)
    {
        state = s;
    }

    public void setTwcEventId(String s)
    {
        twcEventId = s;
    }
}
