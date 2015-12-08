// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.push.alertmessages;

import android.content.Context;
import android.graphics.Bitmap;
import com.weather.commons.config.ConfigurationManagers;
import com.weather.commons.locations.LocationManager;
import com.weather.dal2.locations.SavedLocation;
import java.util.Locale;
import java.util.Map;

public abstract class AlertMessage
{

    public AlertMessage()
    {
    }

    public abstract Map getAdTargeting();

    public String getArticleId()
    {
        return null;
    }

    public abstract int getColor(Context context);

    public String getCountryCode()
    {
        return null;
    }

    public abstract String getDescription();

    public String getEtn()
    {
        return null;
    }

    public abstract Bitmap getLargeIcon(Context context);

    public String getLocType()
    {
        return null;
    }

    public String getLocation()
    {
        return null;
    }

    public String getLocationCode()
    {
        return null;
    }

    public String getOfficeId()
    {
        return null;
    }

    public String getPhenom()
    {
        return null;
    }

    public abstract String getPresentationName();

    public int getPriority()
    {
        return 0;
    }

    public abstract String getProductCode();

    public String getSharedUrl(LocationManager locationmanager, ConfigurationManagers configurationmanagers)
    {
        String s1 = getLocationCode();
        String s = s1;
        if (s1 == null)
        {
            String s2 = getLocType();
            String s3 = getLocation();
            s = s1;
            if (s2 != null)
            {
                s = s1;
                if (s3 != null)
                {
                    locationmanager = locationmanager.findLocation(s2, s3);
                    s = s1;
                    if (locationmanager != null)
                    {
                        s = locationmanager.getKeyTypeCountry();
                    }
                }
            }
        }
        if (s == null)
        {
            return "http://www.weather.com";
        } else
        {
            return String.format(Locale.US, getUrlTemplate(configurationmanagers), new Object[] {
                s
            });
        }
    }

    public String getSignificance()
    {
        return null;
    }

    public abstract int getSmallIcon();

    public int getSmallIconLevel()
    {
        return 1;
    }

    protected abstract String getUrlTemplate(ConfigurationManagers configurationmanagers);
}
