// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.h;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;

public class f
{

    private static String a = null;
    private static String b = null;
    private static ArrayList c = null;

    public static long a()
    {
        BufferedReader bufferedreader;
        int i;
        bufferedreader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
        i = Integer.valueOf(bufferedreader.readLine().split("\\s+")[1]).intValue();
        long l = i;
        bufferedreader.close();
_L2:
        return l / 1024L;
        IOException ioexception;
        ioexception;
        l = 0L;
_L3:
        ioexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
          goto _L3
    }

    public static String a(Context context)
    {
        if (a == null)
        {
            a = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        return a;
    }

    public static String b(Context context)
    {
        if (b == null)
        {
            b = ((TelephonyManager)context.getSystemService("phone")).getSubscriberId();
            if (b == null)
            {
                b = "000";
            }
        }
        return b;
    }

    public static String c(Context context)
    {
        return ((TelephonyManager)context.getSystemService("phone")).getDeviceId();
    }

    public static String d(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        if (context == null) goto _L2; else goto _L1
_L1:
        context = context.getSimCountryIso().toUpperCase();
_L4:
        Object obj;
label0:
        {
            if (context != null)
            {
                obj = context;
                if (!context.equals(""))
                {
                    break label0;
                }
            }
            obj = Locale.getDefault().getCountry().toUpperCase();
        }
        return ((String) (obj));
        context;
        context.printStackTrace();
_L2:
        context = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static ArrayList e(Context context)
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        c = new ArrayList();
        Class class1 = context.getClassLoader().loadClass("android.accounts.AccountManager");
        context = ((Context) (class1.getDeclaredMethod("get", new Class[] {
            android/content/Context
        }).invoke(null, new Object[] {
            context
        })));
        context = ((Context) ((Object[])class1.getDeclaredMethod("getAccountsByType", new Class[] {
            java/lang/String
        }).invoke(context, new Object[] {
            "com.google"
        })));
        int i = 0;
_L4:
        int j = context.length;
        if (i < j) goto _L3; else goto _L2
_L2:
        return c;
_L3:
        String s = (String)context[i].getClass().getDeclaredField("name").get(context[i]);
        if (!TextUtils.isEmpty(s) && !c.contains(s))
        {
            c.add(s);
        }
        i++;
          goto _L4
        context;
          goto _L2
    }

    public static String f(Context context)
    {
        if (context != null)
        {
            context = (WindowManager)context.getSystemService("window");
            int i = context.getDefaultDisplay().getWidth();
            int j = context.getDefaultDisplay().getHeight();
            return (new StringBuilder(String.valueOf(i))).append("*").append(j).toString();
        } else
        {
            return "";
        }
    }

    public static String g(Context context)
    {
        try
        {
            context = new StatFs(Environment.getDataDirectory().getPath());
            long l = context.getBlockCount();
            long l1 = context.getBlockSize();
            context = (new StringBuilder()).append((l1 * l) / 1024L / 1024L).toString();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return "";
        }
        return context;
    }

}
