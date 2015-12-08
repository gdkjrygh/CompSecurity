// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.device;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.common.base.Preconditions;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public final class RmidUtils
{

    private static final String CHAR_SET = "iso-8859-1";
    private static final String MD5_ALGORITHM = "MD5";
    private static final String PREFS_NAME_RMID_CONFIG = "rmid";
    private static final String PREF_KEY_BODY = "i";
    private static final String SHA1_ALGORITHM = "SHA-1";
    private static final String TAG = "RmidUtils";
    private static String hashedId = null;

    private RmidUtils()
    {
    }

    private static String convertToHex(byte abyte0[])
    {
        StringBuilder stringbuilder;
        int i;
        int l;
        stringbuilder = new StringBuilder(41);
        l = abyte0.length;
        i = 0;
_L2:
        int j;
        int k;
        byte byte0;
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        byte0 = abyte0[i];
        k = byte0 >>> 4 & 0xf;
        j = 0;
_L3:
        if (k >= 0 && k <= 9)
        {
            stringbuilder.append((char)(k + 48));
        } else
        {
            stringbuilder.append((char)((k - 10) + 97));
        }
        k = byte0 & 0xf;
        if (j < 1)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return stringbuilder.toString();
        j++;
          goto _L3
    }

    private static String getGeneratedId(Context context)
    {
        SharedPreferences sharedpreferences = context.getSharedPreferences("rmid", 0);
        String s = sharedpreferences.getString("i", "");
        context = s;
        if (TextUtils.isEmpty(s))
        {
            context = UUID.randomUUID().toString();
            sharedpreferences.edit().putString("i", context).apply();
        }
        return context;
    }

    public static String getMD5HASH(String s)
    {
        Preconditions.checkNotNull(s);
        MessageDigest messagedigest = MessageDigest.getInstance("MD5");
        messagedigest.update(s.getBytes("iso-8859-1"), 0, s.length());
        s = convertToHex(messagedigest.digest());
        return s;
        s;
_L2:
        LogUtil.w("RmidUtils", LoggingMetaTags.TWC_AD, "Error generating generating MD5 hash: ", new Object[] {
            s
        });
        return "";
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String getSHA1(String s)
    {
        MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
        messagedigest.update(s.getBytes("iso-8859-1"), 0, s.length());
        s = convertToHex(messagedigest.digest());
        return s;
        s;
_L2:
        LogUtil.w("RmidUtils", LoggingMetaTags.TWC_AD, "Error generating generating SHA-1: ", new Object[] {
            s
        });
        return "";
        s;
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String init(Context context)
    {
        com/weather/util/device/RmidUtils;
        JVM INSTR monitorenter ;
        if (hashedId == null)
        {
            hashedId = getSHA1(getGeneratedId(context));
        }
        com/weather/util/device/RmidUtils;
        JVM INSTR monitorexit ;
        return hashedId;
        context;
        com/weather/util/device/RmidUtils;
        JVM INSTR monitorexit ;
        throw context;
    }

}
