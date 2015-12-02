// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.TreeSet;

public final class cwt
{

    private static final Map a = new _cls1();
    private static final String b = h();

    public static String a()
    {
        Object obj = Locale.getDefault();
        String s2 = ((Locale) (obj)).getCountry().toUpperCase(Locale.US);
        String s1 = ((Locale) (obj)).getLanguage().toLowerCase(Locale.US);
        obj = s1;
        if ("".equals(s1))
        {
            obj = "en";
        }
        if ("".equals(s2))
        {
            s1 = ((String) (obj));
            if ("zh".equals(obj))
            {
                s1 = "zh_TW";
            }
            return s1;
        }
        s1 = ((String) (obj));
        if (a.containsKey(obj))
        {
            s1 = (String)a.get(obj);
        }
        return String.format("%s_%s", new Object[] {
            s1, s2
        });
    }

    public static String a(Context context)
    {
        Object obj = f(context);
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            String s1 = c();
            obj = s1;
            if (TextUtils.isEmpty(s1))
            {
                String s2 = i(context);
                obj = s2;
                if (TextUtils.isEmpty(s2))
                {
                    context = s(context);
                    obj = context;
                    if (TextUtils.isEmpty(context))
                    {
                        return "Error getting deviceId";
                    }
                }
            }
        }
        return ((String) (obj));
    }

    public static String b()
    {
        String s2 = Locale.getDefault().getLanguage().toLowerCase(Locale.US);
        String s1 = s2;
        if ("".equals(s2))
        {
            s1 = "en";
        }
        s2 = s1;
        if (a.containsKey(s1))
        {
            s2 = (String)a.get(s1);
        }
        return s2;
    }

    public static String b(Context context)
    {
        context = ((TelephonyManager)context.getSystemService("phone")).getNetworkOperator();
        if (context != null && context.length() >= 3)
        {
            return context.substring(0, 3);
        } else
        {
            return "";
        }
    }

    public static String c()
    {
        if (b != null)
        {
            return b;
        } else
        {
            return Build.SERIAL;
        }
    }

    public static String c(Context context)
    {
        context = ((TelephonyManager)context.getSystemService("phone")).getNetworkOperator();
        if (context != null && context.length() >= 3)
        {
            return context.substring(3);
        } else
        {
            return "";
        }
    }

    public static String d()
    {
        TreeSet treeset = new TreeSet();
        treeset.add(Build.CPU_ABI);
        treeset.add(Build.CPU_ABI2);
        if (android.os.Build.VERSION.SDK_INT >= 21 && Build.SUPPORTED_ABIS != null)
        {
            String as[] = Build.SUPPORTED_ABIS;
            int j1 = as.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                treeset.add(as[i1]);
            }

        }
        return TextUtils.join(", ", treeset);
    }

    public static String d(Context context)
    {
        try
        {
            context = ((TelephonyManager)context.getSystemService("phone")).getLine1Number();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static String e()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public static String e(Context context)
    {
        return ((TelephonyManager)context.getSystemService("phone")).getSimCountryIso();
    }

    public static String f()
    {
        return Build.MODEL;
    }

    public static String f(Context context)
    {
        try
        {
            context = ((TelephonyManager)context.getSystemService("phone")).getDeviceId();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static String g()
    {
        Object obj = Locale.getDefault();
        try
        {
            obj = ((Locale) (obj)).getCountry();
        }
        catch (MissingResourceException missingresourceexception)
        {
            return null;
        }
        return ((String) (obj));
    }

    public static String g(Context context)
    {
        String s1;
        try
        {
            s1 = ((TelephonyManager)context.getSystemService("phone")).getSubscriberId();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "";
        }
        context = s1;
        if (s1 == null)
        {
            context = "";
        }
        return context;
    }

    private static String h()
    {
        Object obj;
        boolean flag;
        try
        {
            obj = Class.forName("android.os.SystemProperties");
            obj = (String)((Class) (obj)).getMethod("get", new Class[] {
                java/lang/String, java/lang/String
            }).invoke(obj, new Object[] {
                "ril.serialnumber", null
            });
            flag = TextUtils.isEmpty(((CharSequence) (obj)));
        }
        catch (Exception exception)
        {
            return null;
        }
        if (!flag)
        {
            return ((String) (obj));
        } else
        {
            return null;
        }
    }

    public static String h(Context context)
    {
        String s1;
        try
        {
            s1 = ((TelephonyManager)context.getSystemService("phone")).getSimSerialNumber();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "";
        }
        context = s1;
        if (s1 == null)
        {
            context = "";
        }
        return context;
    }

    public static String i(Context context)
    {
        try
        {
            context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static Point j(Context context)
    {
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        context.getSize(point);
        return point;
    }

    public static String k(Context context)
    {
        try
        {
            context = ((TelephonyManager)context.getSystemService("phone")).getNetworkOperatorName();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static boolean l(Context context)
    {
        context = (AccessibilityManager)context.getSystemService("accessibility");
        if (context != null)
        {
            boolean flag = context.isEnabled();
            boolean flag1 = context.isTouchExplorationEnabled();
            return flag && flag1;
        } else
        {
            return false;
        }
    }

    public static boolean m(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17) goto _L2; else goto _L1
_L1:
        if (android.provider.Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps", 0) != 1) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (android.provider.Settings.Global.getInt(context.getContentResolver(), "install_non_market_apps", 0) != 1)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static boolean n(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1);
        if (context == null)
        {
            return false;
        } else
        {
            return context.isConnected();
        }
    }

    public static String o(Context context)
    {
        ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
        WifiManager wifimanager = (WifiManager)context.getSystemService("wifi");
        if (n(context))
        {
            try
            {
                context = Formatter.formatIpAddress(wifimanager.getConnectionInfo().getIpAddress());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return null;
            }
            return context;
        }
        context = connectivitymanager.getNetworkInfo(0);
        if (context == null || !context.isConnected())
        {
            break MISSING_BLOCK_LABEL_177;
        }
        context = new StringBuilder();
        for (Enumeration enumeration = NetworkInterface.getNetworkInterfaces(); enumeration.hasMoreElements();)
        {
            Enumeration enumeration1 = ((NetworkInterface)enumeration.nextElement()).getInetAddresses();
            while (enumeration1.hasMoreElements()) 
            {
                InetAddress inetaddress = (InetAddress)enumeration1.nextElement();
                if (!inetaddress.isLoopbackAddress() && inetaddress.getHostAddress() != null)
                {
                    String s1 = inetaddress.getHostAddress().toUpperCase();
                    if (inetaddress instanceof Inet4Address)
                    {
                        if (context.length() != 0)
                        {
                            context.append("|");
                        }
                        context.append(s1);
                    }
                }
            }
        }

        try
        {
            context = context.toString();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
        return null;
    }

    public static String p(Context context)
    {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (context == null)
        {
            return "unknown";
        }
        switch (context.getIntExtra("status", -1))
        {
        default:
            return "unknown";

        case 2: // '\002'
            return "charging";

        case 3: // '\003'
            return "discharging";

        case 5: // '\005'
            return "full";

        case 4: // '\004'
            return "unplugged";
        }
    }

    public static double q(Context context)
    {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (context != null)
        {
            int i1 = context.getIntExtra("level", -1);
            int j1 = context.getIntExtra("scale", -1);
            if (j1 > 0)
            {
                return (double)i1 / (double)j1;
            }
        }
        return -1D;
    }

    public static boolean r(Context context)
    {
        return "1".equals(android.provider.Settings.Secure.getString(context.getContentResolver(), "mock_location"));
    }

    private static String s(Context context)
    {
        try
        {
            context = ((WifiManager)context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }


    /* member class not found */
    class _cls1 {}

}
