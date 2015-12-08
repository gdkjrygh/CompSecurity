// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts;

import com.google.common.base.Preconditions;
import com.weather.commons.push.ProductType;

public class WeatherAlertSettingsListItem
{

    private final String description;
    private final boolean enabled;
    private final String title;
    private final ProductType type;

    public WeatherAlertSettingsListItem(ProductType producttype, String s, String s1, boolean flag)
    {
        type = producttype;
        title = (String)Preconditions.checkNotNull(s);
        description = (String)Preconditions.checkNotNull(s1);
        enabled = flag;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (getClass() == obj.getClass())
                {
                    obj = (WeatherAlertSettingsListItem)obj;
                    flag = flag1;
                    if (type == ((WeatherAlertSettingsListItem) (obj)).type)
                    {
                        flag = flag1;
                        if (title.equals(((WeatherAlertSettingsListItem) (obj)).title))
                        {
                            return description.equals(((WeatherAlertSettingsListItem) (obj)).description);
                        }
                    }
                }
            }
        }
        return flag;
    }

    public String getDescription()
    {
        return description;
    }

    public String getTitle()
    {
        return title;
    }

    public ProductType getType()
    {
        return type;
    }

    public int hashCode()
    {
        return (type.hashCode() * 31 + title.hashCode()) * 31 + description.hashCode();
    }

    public boolean isEnabled()
    {
        return enabled;
    }
}
