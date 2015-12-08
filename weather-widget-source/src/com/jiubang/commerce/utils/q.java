// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Locale;

// Referenced classes of package com.jiubang.commerce.utils:
//            p, r

public class q
{

    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;

    public static String a(Context context)
    {
        String s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        context = s;
        if (TextUtils.isEmpty(s))
        {
            context = "UNABLE-TO-RETRIEVE";
        }
        return context;
    }

    public static String b(Context context)
    {
        context = (TelephonyManager)context.getSystemService("phone");
        if (context == null) goto _L2; else goto _L1
_L1:
        Object obj = context.getSimCountryIso().toUpperCase();
_L4:
        context = ((Context) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            context = Locale.getDefault().getCountry().toUpperCase();
        }
        obj = context;
        if (TextUtils.isEmpty(context))
        {
            obj = "ZZ";
        }
        context = ((Context) (obj));
        if (obj == null)
        {
            context = "error";
        }
        return context;
        context;
        context.printStackTrace();
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String c(Context context)
    {
        Object obj = "000";
        if (context != null)
        {
            try
            {
                context = ((TelephonyManager)context.getSystemService("phone")).getSimOperator();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = ((Context) (obj));
            }
        } else
        {
            context = "000";
        }
        obj = context;
        if (TextUtils.isEmpty(context))
        {
            obj = "000";
        }
        return ((String) (obj));
    }

    public static String d(Context context)
    {
        context = null;
        String s = Locale.getDefault().getLanguage();
        context = s;
_L1:
        Exception exception;
        if (TextUtils.isEmpty(context))
        {
            return "en";
        } else
        {
            return p.b(context);
        }
        exception;
        exception.printStackTrace();
          goto _L1
    }

    public static String e(Context context)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        int i = displaymetrics.widthPixels;
        int j = displaymetrics.heightPixels;
        return (new StringBuilder()).append(i).append("*").append(j).toString();
    }

    public static String f(Context context)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        return String.valueOf(displaymetrics.densityDpi);
    }

    public static String g(Context context)
    {
        return (new r()).a(context);
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        f = flag;
    }
}
