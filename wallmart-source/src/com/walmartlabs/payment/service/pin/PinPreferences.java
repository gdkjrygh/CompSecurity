// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.pin;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.walmartlabs.utils.WLog;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PinPreferences
{

    private static final String FILE_PREF = "pm_pin_preferences";
    private static final String PREF_PIN = "PIN";
    private static final String PREF_PIN_ATTEMPTS = "ATTEMPTS";
    private static final String PREF_PIN_PASS = "PIN_PASS";
    private static final String TAG = com/walmartlabs/payment/service/pin/PinPreferences.getSimpleName();

    public PinPreferences()
    {
    }

    public static boolean comparePin(Context context, String s, String s1)
    {
        context = context.getSharedPreferences("pm_pin_preferences", 0);
        s = createHash(s, s1);
        if (s != null)
        {
            boolean flag = s.equals(context.getString(customizeKey("PIN", s1), null));
            if (flag)
            {
                context.edit().putLong(customizeKey("PIN_PASS", s1), System.currentTimeMillis()).apply();
                return flag;
            } else
            {
                context.edit().putInt(customizeKey("ATTEMPTS", s1), context.getInt(customizeKey("ATTEMPTS", s1), 0) + 1).apply();
                return flag;
            }
        } else
        {
            return false;
        }
    }

    private static String createHash(String s, String s1)
    {
        MessageDigest messagedigest = MessageDigest.getInstance("SHA-1");
        messagedigest.update(s.getBytes("ASCII"));
        messagedigest.update(s1.getBytes("ASCII"));
        s = Base64.encodeToString(messagedigest.digest(), 2);
        return s;
        s;
_L2:
        WLog.e(TAG, "Failed to create PIN hash", s);
        return null;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String customizeKey(String s, String s1)
    {
        return (new StringBuilder()).append(s).append(s1).toString();
    }

    public static boolean hasAttempts(Context context, String s, int i)
    {
        boolean flag = false;
        if (context.getSharedPreferences("pm_pin_preferences", 0).getInt(customizeKey("ATTEMPTS", s), 0) > i)
        {
            flag = true;
        }
        return flag;
    }

    public static boolean hasPin(Context context, String s)
    {
        return context.getSharedPreferences("pm_pin_preferences", 0).contains(customizeKey("PIN", s));
    }

    public static boolean hasPinPassedSince(Context context, String s, long l)
    {
        boolean flag = false;
        if (context.getSharedPreferences("pm_pin_preferences", 0).getLong(customizeKey("PIN_PASS", s), 0L) > l)
        {
            flag = true;
        }
        return flag;
    }

    public static void resetAttempts(Context context, String s)
    {
        context.getSharedPreferences("pm_pin_preferences", 0).edit().remove(customizeKey("ATTEMPTS", s)).apply();
    }

    public static boolean resetPin(Context context, String s)
    {
        context = context.getSharedPreferences("pm_pin_preferences", 0).edit();
        context.remove(customizeKey("PIN", s));
        context.putInt(customizeKey("ATTEMPTS", s), 0);
        context.putLong(customizeKey("PIN_PASS", s), 0L);
        return context.commit();
    }

    public static void resetPinPassed(Context context, String s)
    {
        context.getSharedPreferences("pm_pin_preferences", 0).edit().remove(customizeKey("PIN_PASS", s)).apply();
    }

    public static boolean setPin(Context context, String s, String s1)
    {
        boolean flag = false;
        context = context.getSharedPreferences("pm_pin_preferences", 0);
        s = createHash(s, s1);
        if (s != null)
        {
            context = context.edit();
            context.putString(customizeKey("PIN", s1), s);
            context.putInt(customizeKey("ATTEMPTS", s1), 0);
            context.putLong(customizeKey("PIN_PASS", s1), System.currentTimeMillis());
            flag = context.commit();
        }
        return flag;
    }

}
