// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.f;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Locale;

// Referenced classes of package com.gau.go.a.f:
//            c

public class d
{

    private static boolean a = false;
    private static boolean b = false;
    private static int c = -1;

    public static int a()
    {
        String as[];
        int i;
        if (c == 1)
        {
            return 1;
        }
        if (c == 0)
        {
            return 0;
        }
        as = new String[5];
        as[0] = "/system/bin/";
        as[1] = "/system/xbin/";
        as[2] = "/system/sbin/";
        as[3] = "/sbin/";
        as[4] = "/vendor/bin/";
        i = 0;
_L2:
        File file;
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        file = new File((new StringBuilder()).append(as[i]).append("su").toString());
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        c = 1;
        return 1;
        Exception exception;
        exception;
        c = 0;
        return 0;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String a(Context context)
    {
        try
        {
            context = ((TelephonyManager)context.getSystemService("phone")).getSimOperator();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "";
        }
        return context;
    }

    public static String[] a(long l)
    {
        String s = "";
        long l1 = l;
        if (l >= 1024L)
        {
            s = "KB";
            l /= 1024L;
            l1 = l;
            if (l >= 1024L)
            {
                s = "MB";
                l /= 1024L;
                l1 = l;
                if (l >= 1024L)
                {
                    s = "GB";
                    l1 = l / 1024L;
                }
            }
        }
        DecimalFormat decimalformat = new DecimalFormat();
        decimalformat.setGroupingSize(3);
        return (new String[] {
            decimalformat.format(l1), s
        });
    }

    public static String b(Context context)
    {
        Object obj;
        Object obj1;
        try
        {
            obj = ((TelephonyManager)context.getSystemService("phone")).getSimCountryIso();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = "";
        }
        if (obj == null || ((String) (obj)).trim().equals(""))
        {
            obj1 = e(context);
        } else
        {
            obj1 = obj;
            if (((String) (obj)).contains(","))
            {
                String as[] = ((String) (obj)).split(",");
                obj1 = obj;
                if (as != null)
                {
                    obj1 = obj;
                    if (as.length > 1)
                    {
                        if (as[0] != null && !as[0].trim().equals(""))
                        {
                            return as[0];
                        }
                        if (as[1] != null && !as[1].trim().equals(""))
                        {
                            return as[1];
                        } else
                        {
                            return e(context);
                        }
                    }
                }
            }
        }
        return ((String) (obj1));
    }

    public static long[] b()
    {
label0:
        {
            long al[] = new long[2];
            long l;
            long l1;
            long l2;
            try
            {
                if (!"mounted".equals(Environment.getExternalStorageState()))
                {
                    break label0;
                }
                StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                l = statfs.getBlockSize();
                l1 = statfs.getBlockCount();
                l2 = statfs.getAvailableBlocks();
            }
            catch (Exception exception)
            {
                al[0] = 0L;
                al[1] = 0L;
                return al;
            }
            al[0] = l1 * l;
            al[1] = l2 * l;
        }
        return al;
    }

    public static String c()
    {
        long l2 = 0L;
        StatFs statfs;
        int i;
        statfs = new StatFs(Environment.getDataDirectory().getPath());
        i = statfs.getBlockSize();
        long l = i;
        i = statfs.getBlockCount();
        long l3 = i;
        i = statfs.getAvailableBlocks();
        long l1;
        l2 = i;
        long l4 = l3 - l2;
        l1 = l;
        l = l4;
_L2:
        String as[] = a(l3 * l1);
        String as1[] = a(l2 * l1);
        a(l * l1);
        return (new StringBuilder()).append(as[0]).append(as[1]).append(",").append(as1[0]).append(as1[1]).toString();
        Exception exception;
        exception;
        l = 0L;
        l1 = 0L;
_L3:
        l3 = l;
        long l5 = 0L;
        l = l2;
        l2 = l5;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        l3 = 0L;
        l1 = l;
        l = l3;
          goto _L3
        exception;
        l1 = l;
        l = l3;
          goto _L3
    }

    public static boolean c(Context context)
    {
        if (a)
        {
            return b;
        } else
        {
            a = true;
            b = d();
            return b;
        }
    }

    public static int d(Context context)
    {
        byte byte0;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        Object obj;
        boolean flag;
        try
        {
            obj = (ConnectivityManager)context.getSystemService("connectivity");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        if (!((NetworkInfo) (obj)).isConnected())
        {
            break MISSING_BLOCK_LABEL_84;
        }
        obj = ((NetworkInfo) (obj)).getTypeName();
        if (((String) (obj)).equalsIgnoreCase("WIFI"))
        {
            byte0 = 4;
            break MISSING_BLOCK_LABEL_86;
        }
        if (!((String) (obj)).equalsIgnoreCase("MOBILE"))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        flag = g(context);
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 1;
        }
        break MISSING_BLOCK_LABEL_86;
        byte0 = -1;
        return byte0;
    }

    private static boolean d()
    {
        boolean flag = true;
        if ((double)c.a < 1.5D && c.a > 0.0F) goto _L2; else goto _L1
_L1:
        flag = false;
_L6:
        return flag;
_L2:
        if (c.c >= c.d) goto _L4; else goto _L3
_L3:
        if (c.c > 480 && c.d > 800) goto _L6; else goto _L5
_L5:
        return false;
_L4:
        if (c.c > 800 && c.d > 480)
        {
            return true;
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    public static String e(Context context)
    {
        return Locale.getDefault().getCountry().toLowerCase();
    }

    public static String f(Context context)
    {
        String s = null;
        if (context != null)
        {
            s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        return s;
    }

    private static boolean g(Context context)
    {
        switch (((TelephonyManager)context.getSystemService("phone")).getNetworkType())
        {
        default:
            return false;

        case 7: // '\007'
            return false;

        case 4: // '\004'
            return false;

        case 2: // '\002'
            return false;

        case 5: // '\005'
            return true;

        case 6: // '\006'
            return true;

        case 1: // '\001'
            return false;

        case 8: // '\b'
            return true;

        case 10: // '\n'
            return true;

        case 9: // '\t'
            return true;

        case 3: // '\003'
            return true;

        case 14: // '\016'
            return true;

        case 12: // '\f'
            return true;

        case 15: // '\017'
            return true;

        case 11: // '\013'
            return false;

        case 13: // '\r'
            return true;

        case 0: // '\0'
            return false;
        }
    }

}
