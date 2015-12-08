// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.device;

import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.weather.util.CountryCodeUtil;
import com.weather.util.parsing.TwcPatterns;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class LocaleUtil
{

    private static final char HYPHEN = 45;
    private static final String TAG = com/weather/util/device/LocaleUtil.getSimpleName();
    private static final char UNDERSCORE = 95;

    private LocaleUtil()
    {
    }

    public static boolean deviceCountryIsNonUsAndSupportsSevereAlerts()
    {
        return !isDeviceInUS() && deviceCountrySupportsSevereAlerts();
    }

    public static boolean deviceCountrySupportsRealTimeRainAlerts()
    {
        return CountryCodeUtil.supportsRealTimeRainAlerts(getLocale().getCountry());
    }

    public static boolean deviceCountrySupportsSevereAlerts()
    {
        return CountryCodeUtil.supportsSevereAlerts(getLocale().getCountry(), com.weather.util.CountryCodeUtil.Spec.ISO);
    }

    public static Locale getLocale()
    {
        return Locale.getDefault();
    }

    public static String[] getStrings(CharSequence charsequence)
    {
        return (String[])Iterables.toArray(Splitter.on('_').limit(2).omitEmptyStrings().split(charsequence), java/lang/String);
    }

    public static String getTwoPartLocale()
    {
        return getTwoPartLocale(getLocale());
    }

    public static String getTwoPartLocale(Locale locale)
    {
        if (locale == null)
        {
            return "";
        }
        Object obj = locale.getLanguage();
        String s = locale.getCountry();
        StringBuilder stringbuilder = new StringBuilder();
        locale = ((Locale) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            locale = "en";
        }
        obj = stringbuilder.append(locale).append('_');
        locale = s;
        if (TextUtils.isEmpty(s))
        {
            locale = "US";
        }
        return ((StringBuilder) (obj)).append(locale).toString();
    }

    public static boolean isDeviceCountry(String s)
    {
        s = s.split(":");
        return s[s.length - 1].equals(getLocale().getCountry());
    }

    public static boolean isDeviceInCanada()
    {
        return "CA".equals(getLocale().getCountry());
    }

    public static boolean isDeviceInEnglish()
    {
        return "en".equals(getLocale().getLanguage());
    }

    public static boolean isDeviceInGerman()
    {
        return "de".equals(getLocale().getLanguage());
    }

    public static boolean isDeviceInGermany()
    {
        return CountryCodeUtil.isGermany(getLocale().getCountry());
    }

    public static boolean isDeviceInGermanyGerman()
    {
        return isDeviceInGermany() && isDeviceInGerman();
    }

    public static boolean isDeviceInPortuguese()
    {
        return "pt".equals(getLocale().getLanguage());
    }

    public static boolean isDeviceInSpanish()
    {
        return "es".equals(getLocale().getLanguage());
    }

    public static boolean isDeviceInUK()
    {
        return CountryCodeUtil.isUk(getLocale().getCountry());
    }

    public static boolean isDeviceInUKEnglish()
    {
        return isDeviceInUK() && isDeviceInEnglish();
    }

    public static boolean isDeviceInUS()
    {
        return CountryCodeUtil.isUs(getLocale().getCountry());
    }

    public static boolean isDeviceInUSEnglish()
    {
        return isDeviceInUS() && isDeviceInEnglish();
    }

    public static boolean isMatch(String s, Locale locale)
    {
        String s1;
        String s2;
        String s3;
        boolean flag1;
        flag1 = true;
        Preconditions.checkNotNull(locale);
        if (!isValidLocaleGlob(s))
        {
            Log.w(TAG, (new StringBuilder()).append("isMatch: invalid locale string. localeGlob=").append(s).toString());
            return false;
        }
        s = getStrings(s);
        s1 = s[0];
        s2 = s[1];
        s3 = locale.getLanguage();
        locale = locale.getCountry();
        s = locale;
        if (CountryCodeUtil.isXa(locale))
        {
            s = "US";
        }
        if (!s1.equals("*") && !s1.equalsIgnoreCase(s3)) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (s2.equals("*")) goto _L4; else goto _L3
_L3:
        if (!s2.equalsIgnoreCase(s)) goto _L2; else goto _L5
_L5:
        flag = flag1;
_L4:
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L6
_L6:
    }

    public static boolean isValidLocaleGlob(CharSequence charsequence)
    {
        return charsequence != null && TwcPatterns.LOCALE_GLOB_PATTERN.matcher(charsequence).matches();
    }

    public static String languageForLocaleString(String s)
    {
        Object obj;
        if (TextUtils.isEmpty(s))
        {
            obj = "en";
        } else
        {
            s = s.trim().toLowerCase(Locale.ENGLISH).replace('-', '_');
            obj = Splitter.on('_').limit(3).split(s).iterator();
            s = null;
            if (((Iterator) (obj)).hasNext())
            {
                s = (String)((Iterator) (obj)).next();
            }
            obj = s;
            if (TextUtils.isEmpty(s))
            {
                return "en";
            }
        }
        return ((String) (obj));
    }

}
