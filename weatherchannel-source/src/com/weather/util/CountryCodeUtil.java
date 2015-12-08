// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.List;

public class CountryCodeUtil
{
    public static final class Spec extends Enum
    {

        private static final Spec $VALUES[];
        public static final Spec FIPS;
        public static final Spec ISO;

        public static Spec valueOf(String s)
        {
            return (Spec)Enum.valueOf(com/weather/util/CountryCodeUtil$Spec, s);
        }

        public static Spec[] values()
        {
            return (Spec[])$VALUES.clone();
        }

        static 
        {
            FIPS = new Spec("FIPS", 0);
            ISO = new Spec("ISO", 1);
            $VALUES = (new Spec[] {
                FIPS, ISO
            });
        }

        private Spec(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String CA = "CA";
    public static final String DE = "DE";
    private static final List FIPS_SEVERE_ALERT_LOCATIONS = Arrays.asList(new String[] {
        "US", "UK", "AU", "BK", "BE", "BU", "SZ", "CY", "EZ", "GM", 
        "DK", "EN", "SP", "FI", "FR", "GR", "HR", "HU", "EI", "IC", 
        "IT", "LU", "LG", "MK", "MT", "MJ", "NL", "NO", "PL", "PO", 
        "RO", "RI", "SW", "SI", "LO"
    });
    private static final List ISO_SEVERE_ALERT_LOCATIONS = Arrays.asList(new String[] {
        "US", "XA", "GB", "AT", "BA", "BE", "BG", "CH", "CY", "CZ", 
        "DE", "DK", "EE", "ES", "FI", "FR", "GR", "HR", "HU", "IE", 
        "IS", "IT", "LU", "LV", "MK", "MT", "ME", "NL", "NO", "PL", 
        "PT", "RO", "RS", "SE", "SI", "SK"
    });
    private static final List REAL_TIME_RAIN_ALERT_LOCATIONS = Arrays.asList(new String[] {
        "GB", "UK", "IE", "FR", "DE", "BE", "NL", "CH", "LU", "CA"
    });
    public static final String UK = "GB";
    public static final String UK_DSX = "UK";
    public static final String US = "US";
    public static final String XA = "XA";

    public CountryCodeUtil()
    {
    }

    public static boolean isGermany(String s)
    {
        Preconditions.checkNotNull(s);
        return "DE".equals(s);
    }

    public static boolean isUk(String s)
    {
        Preconditions.checkNotNull(s);
        return "UK".equals(s) || "GB".equals(s);
    }

    public static boolean isUs(String s)
    {
        Preconditions.checkNotNull(s);
        return "US".equals(s) || "XA".equals(s);
    }

    public static boolean isXa(String s)
    {
        Preconditions.checkNotNull(s);
        return "XA".equals(s);
    }

    public static boolean supportsRealTimeRainAlerts(String s)
    {
        return REAL_TIME_RAIN_ALERT_LOCATIONS.contains(s);
    }

    public static boolean supportsSevereAlerts(String s, Spec spec)
    {
        if (spec == Spec.ISO)
        {
            spec = ISO_SEVERE_ALERT_LOCATIONS;
        } else
        {
            spec = FIPS_SEVERE_ALERT_LOCATIONS;
        }
        return spec.contains(s);
    }

}
