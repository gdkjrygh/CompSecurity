// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.weatherfx;

import com.google.common.base.Strings;
import com.weather.dal2.locations.SavedLocation;
import com.weather.util.CountryCodeUtil;

// Referenced classes of package com.weather.ads2.weatherfx:
//            WeatherFxConnection

private static final class countryCode
{

    private final String countryCode;
    private final String zip;

    static countryCode valueOf(SavedLocation savedlocation)
    {
        if (savedlocation != null && !Strings.isNullOrEmpty(savedlocation.getZipCode()))
        {
            String s = null;
            if (CountryCodeUtil.isUs(savedlocation.getCountryCode()))
            {
                s = "US";
            } else
            if (CountryCodeUtil.isUk(savedlocation.getCountryCode()))
            {
                s = "GB";
            }
            if (s != null)
            {
                return new <init>(savedlocation.getZipCode(), s);
            }
        }
        return null;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (<init>)obj;
            if (!countryCode.equals(((countryCode) (obj)).countryCode))
            {
                return false;
            }
            if (!zip.equals(((zip) (obj)).zip))
            {
                return false;
            }
        }
        return true;
    }

    public String getLocationId()
    {
        return (new StringBuilder()).append(countryCode).append("_4_").append(zip).toString();
    }

    public String getZip()
    {
        return zip;
    }

    public int hashCode()
    {
        return zip.hashCode() * 31 + countryCode.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Location{zip='").append(zip).append('\'').append(", countryCode='").append(countryCode).append('\'').append('}').toString();
    }


    private (String s, String s1)
    {
        zip = s;
        countryCode = s1;
    }
}
