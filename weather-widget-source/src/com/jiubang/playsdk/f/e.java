// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.jiubang.playsdk.g;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

// Referenced classes of package com.jiubang.playsdk.f:
//            k

public class e
{

    public static boolean a(Context context)
    {
        if (context == null) goto _L2; else goto _L1
_L1:
        context = (TelephonyManager)context.getSystemService("phone");
        boolean flag;
        if (context.getSimState() != 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = context.getSimOperator();
        if (!flag && !TextUtils.isEmpty(context)) goto _L4; else goto _L3
_L3:
        context = Locale.getDefault().getCountry();
        if (context == null || !context.contains("CN")) goto _L6; else goto _L5
_L5:
        return true;
_L6:
        return false;
_L4:
        if (context.startsWith("460")) goto _L5; else goto _L2
_L2:
        return false;
    }

    public static String b(Context context)
    {
        Object obj;
        k k1;
        k1 = new k(context, "request_info");
        obj = k1.a("device_id", "");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_68;
        }
        context = ((TelephonyManager)context.getSystemService("phone")).getDeviceId();
        k1.b("device_id", context);
        k1.a();
        return context;
        Exception exception;
        exception;
        context = ((Context) (obj));
        obj = exception;
_L2:
        ((Exception) (obj)).printStackTrace();
        return context;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        return ((String) (obj));
    }

    public static String c(Context context)
    {
        if (context != null)
        {
            try
            {
                context = ((TelephonyManager)context.getSystemService("phone")).getSimOperator();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return "000";
            }
        } else
        {
            context = "000";
        }
        return context;
    }

    public static String d(Context context)
    {
        Locale locale = Locale.getDefault();
        Object obj = ((TelephonyManager)context.getSystemService("phone")).getSimCountryIso();
        context = ((Context) (obj));
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            context = String.format("%s_%s", new Object[] {
                locale.getLanguage().toLowerCase(), ((String) (obj)).toLowerCase()
            });
        }
_L2:
        obj = context;
        if (TextUtils.isEmpty(context))
        {
            obj = String.format("%s_%s", new Object[] {
                locale.getLanguage().toLowerCase(), locale.getCountry().toLowerCase()
            });
        }
        context = ((Context) (obj));
        if (obj == null)
        {
            context = "error";
        }
        return context;
        obj;
        context = null;
_L3:
        ((Throwable) (obj)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        Throwable throwable;
        throwable;
        context = ((Context) (obj));
        obj = throwable;
          goto _L3
    }

    public static String e(Context context)
    {
        Locale locale = Locale.getDefault();
        Object obj;
        try
        {
            obj = ((TelephonyManager)context.getSystemService("phone")).getSimCountryIso();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            obj = null;
        }
        context = ((Context) (obj));
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            context = locale.getCountry().toLowerCase();
        }
        obj = context;
        if (context == null)
        {
            obj = "error";
        }
        return ((String) (obj));
    }

    public static String f(Context context)
    {
        InputStream inputstream;
        String s = (new k(context, "request_info")).a("channel_id", "");
        if (!TextUtils.isEmpty(s))
        {
            return s;
        }
        inputstream = context.getResources().openRawResource(g.a);
        context = new byte[1024];
        int i1 = inputstream.read(context);
        if (i1 <= 0)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
            return "200";
        }
        byte abyte0[] = new byte[i1];
        String s1;
        IOException ioexception;
        int l = 0;
        while (l < i1) 
        {
            abyte0[l] = context[l];
            l++;
        }
          goto _L1
_L3:
        s1 = (new String(abyte0)).trim();
        context = s1;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        context = s1;
        if (s1.contains("\n"))
        {
            context = s1.replaceAll("\n", "");
        }
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            return context;
        }
        return context;
        context;
        context.printStackTrace();
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        return "200";
        context;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        throw context;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static String g(Context context)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        int l = displaymetrics.widthPixels;
        int i1 = displaymetrics.heightPixels;
        return (new StringBuilder()).append(l).append("*").append(i1).toString();
    }

    public static String h(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String i(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return "";
        }
        return context;
    }

    public static boolean j(Context context)
    {
        if (context != null)
        {
            context = (ConnectivityManager)context.getSystemService("connectivity");
            if (context != null)
            {
                context = context.getActiveNetworkInfo();
                if (context != null && context.isConnected())
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static String k(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null)
        {
            return "";
        }
        if (context.getType() != 1) goto _L2; else goto _L1
_L1:
        context = "WIFI";
          goto _L3
_L2:
        if (context.getType() != 0) goto _L5; else goto _L4
_L4:
        context.getSubtype();
        JVM INSTR tableswitch 1 11: default 373
    //                   1 174
    //                   2 174
    //                   3 245
    //                   4 174
    //                   5 245
    //                   6 245
    //                   7 174
    //                   8 245
    //                   9 245
    //                   10 245
    //                   11 174;
           goto _L6 _L7 _L7 _L8 _L7 _L8 _L8 _L7 _L8 _L8 _L8 _L7
_L6:
        context = (new StringBuilder()).append("UNKNOW(typeid = ").append(context.getType()).append("  typename = ").append(context.getTypeName()).append("  subtypeid = ").append(context.getSubtype()).append("  subtypename = ").append(context.getSubtypeName()).append(")").toString();
        break; /* Loop/switch isn't completed */
_L7:
        try
        {
            context = (new StringBuilder()).append("2G(typeid = ").append(context.getType()).append("  typename = ").append(context.getTypeName()).append("  subtypeid = ").append(context.getSubtype()).append("  subtypename = ").append(context.getSubtypeName()).append(")").toString();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = "";
        }
        break; /* Loop/switch isn't completed */
_L8:
        context = (new StringBuilder()).append("3G/4G(typeid = ").append(context.getType()).append("  typename = ").append(context.getTypeName()).append("  subtypeid = ").append(context.getSubtype()).append("  subtypename = ").append(context.getSubtypeName()).append(")").toString();
        break; /* Loop/switch isn't completed */
_L5:
        context = (new StringBuilder()).append("UNKNOW(typeid = ").append(context.getType()).append("  typename = ").append(context.getTypeName()).append(")").toString();
_L3:
        return context;
    }
}
