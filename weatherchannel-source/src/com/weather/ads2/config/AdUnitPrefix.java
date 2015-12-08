// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.config;

import com.google.common.collect.ComparisonChain;
import com.weather.util.device.LocaleUtil;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class AdUnitPrefix
    implements Comparable
{

    private static final String KEY_LANGUAGE = "language";
    private static final String KEY_PREFIX = "adUnitPrefix";
    private static final String KEY_REGION = "region";
    private final String adUnitPrefix;
    private final String language;
    private final String locale;
    private final String region;

    public AdUnitPrefix(JSONObject jsonobject)
        throws JSONException
    {
        region = jsonobject.getString("region");
        language = jsonobject.getString("language");
        adUnitPrefix = jsonobject.getString("adUnitPrefix");
        locale = (new StringBuilder()).append(language).append('_').append(region).toString();
    }

    public int compareTo(AdUnitPrefix adunitprefix)
    {
        return ComparisonChain.start().compareFalseFirst(isInternational(), adunitprefix.isInternational()).compareFalseFirst(isWildcard(), adunitprefix.isWildcard()).compare(locale, adunitprefix.locale).compare(adUnitPrefix, adunitprefix.adUnitPrefix).result();
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((AdUnitPrefix)obj);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AdUnitPrefix)obj;
            if (!adUnitPrefix.equals(((AdUnitPrefix) (obj)).adUnitPrefix))
            {
                return false;
            }
            if (!locale.equals(((AdUnitPrefix) (obj)).locale))
            {
                return false;
            }
        }
        return true;
    }

    public String getAdUnitPrefix()
    {
        return adUnitPrefix;
    }

    public int hashCode()
    {
        return locale.hashCode() * 31 + adUnitPrefix.hashCode();
    }

    public boolean isForCurrentLocale()
    {
        return LocaleUtil.isMatch(locale, Locale.getDefault());
    }

    public boolean isInternational()
    {
        return region.equals("*") && language.equals("*");
    }

    public boolean isWildcard()
    {
        return region.equals("*") || language.equals("*");
    }
}
