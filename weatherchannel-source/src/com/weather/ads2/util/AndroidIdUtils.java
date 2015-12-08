// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.util;

import android.content.Context;
import android.text.TextUtils;
import com.weather.util.app.AbstractTwcApplication;
import com.weather.util.device.RmidUtils;

// Referenced classes of package com.weather.ads2.util:
//            AdUtils

public final class AndroidIdUtils
{

    private static final int DEVICE_ID_LENGTH = 16;
    private static String sFilteredAndroidIdCache;
    private static String sHashedAndroidIdCache;

    private AndroidIdUtils()
    {
    }

    private static String getFilteredAndroidId()
    {
        StringBuilder stringbuilder;
        int j;
        if (sFilteredAndroidIdCache != null)
        {
            return sFilteredAndroidIdCache;
        }
        String s = android.provider.Settings.System.getString(AbstractTwcApplication.getRootContext().getContentResolver(), "android_id");
        stringbuilder = new StringBuilder();
        if (!TextUtils.isEmpty(s))
        {
            int i = 0;
            for (int k = s.length(); i < k; i++)
            {
                char c = s.charAt(i);
                if (Character.isLetterOrDigit(c))
                {
                    stringbuilder.append(Character.toLowerCase(c));
                }
            }

        }
        j = stringbuilder.length();
        if (j != 16) goto _L2; else goto _L1
_L1:
        sFilteredAndroidIdCache = stringbuilder.toString();
        return sFilteredAndroidIdCache;
_L2:
        if (j > 16)
        {
            stringbuilder.setLength(16);
        } else
        if (j < 8)
        {
            stringbuilder.setLength(0);
        } else
        if (j < 16)
        {
            stringbuilder.insert(0, "00000000".substring(0, 16 - j));
            stringbuilder.setLength(16);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static String getHashedAndroidId()
    {
        if (sHashedAndroidIdCache != null)
        {
            return sHashedAndroidIdCache;
        } else
        {
            sHashedAndroidIdCache = RmidUtils.getSHA1(getFilteredAndroidId());
            return sHashedAndroidIdCache;
        }
    }

    public static String getKindleAndroidId()
    {
        String s1 = getFilteredAndroidId();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = "nl";
        }
        return s;
    }

    public static String getObfuscatedAndroidId()
    {
        String s = getFilteredAndroidId();
        if (TextUtils.isEmpty(s))
        {
            return "nl";
        } else
        {
            return AdUtils.obfuscateString(s);
        }
    }
}
