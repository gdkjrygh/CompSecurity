// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.android.id;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.comscore.android.id:
//            b, c, API4, API9, 
//            DeviceId

public class IdHelperAndroid
{

    public static final String NO_ID_AVAILABLE = "none";
    private static final String a = "com.google.android.gms";
    private static final String b = "com.google.android.gms.ads.identifier.service.START";
    private static boolean c = false;
    private static final boolean d = false;

    public IdHelperAndroid()
    {
    }

    private static String a(Context context)
    {
        Exception exception1;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        String s = "";
        b b1 = new b(null);
        Intent intent = new Intent(b);
        intent.setPackage(a);
        if (context.bindService(intent, b1, 1))
        {
            try
            {
                s = (new c(b1.getBinder())).getId();
            }
            catch (Exception exception)
            {
                context.unbindService(b1);
                return "";
            }
            finally
            {
                context.unbindService(b1);
            }
            context.unbindService(b1);
        }
        return s;
        throw exception1;
    }

    private static boolean b(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT > 4)
        {
            if (d)
            {
                return true;
            } else
            {
                return API4.isPackageInstalledFromGooglePlayStore(context);
            }
        } else
        {
            return false;
        }
    }

    private static final String c(Context context)
    {
        context = e(context);
        if (context != null && context.length() > 0 && !context.equals("unknown") && context.length() > 3 && !context.substring(0, 3).equals("***") && !context.substring(0, 3).equals("000"))
        {
            return context;
        } else
        {
            return null;
        }
    }

    private static final String d(Context context)
    {
        context = f(context);
        if (context != null && context.length() > 0)
        {
            return context;
        } else
        {
            return null;
        }
    }

    private static final String e(Context context)
    {
        if (Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() >= 9)
        {
            return API9.getAndroidSerial(context);
        } else
        {
            return null;
        }
    }

    private static final String f(Context context)
    {
        if (Integer.valueOf(android.os.Build.VERSION.SDK_INT).intValue() >= 3)
        {
            context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (context != null && context.length() > 0 && !"9774d56d682e549c".equals(context) && !"unknown".equals(context) && !"android_id".equals(context))
            {
                return context;
            }
        }
        return null;
    }

    public static final DeviceId getAdvertisingDeviceId(Context context)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (b(context))
        {
            boolean flag;
            try
            {
                flag = isGooglePlayServicesAvailable(context);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw context;
            }
            if (flag)
            {
                if (isAdvertisingIdEnabled(context))
                {
                    context = a(context);
                } else
                {
                    context = "none";
                }
                return new DeviceId(context);
            } else
            {
                return null;
            }
        } else
        {
            return getDeviceId(context);
        }
    }

    public static DeviceId getDeviceId(Context context)
    {
        String s1 = c(context);
        byte byte1 = 3;
        byte byte0 = 1;
        String s = s1;
        if (s1 == null)
        {
            s = d(context);
            byte1 = 7;
            byte0 = 2;
        }
        return new DeviceId(s, byte1, byte0);
    }

    public static boolean isAdvertisingIdEnabled(Context context)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = false;
        flag = false;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (!c) goto _L2; else goto _L1
_L1:
        flag1 = flag;
_L4:
        return flag1;
_L2:
        b b1;
        b1 = new b(null);
        Intent intent = new Intent(b);
        intent.setPackage(a);
        flag = flag2;
        if (!context.bindService(intent, b1, 1))
        {
            break MISSING_BLOCK_LABEL_112;
        }
        boolean flag3 = (new c(b1.getBinder())).isLimitAdTrackingEnabled(true);
        flag = flag1;
        if (!flag3)
        {
            flag = true;
        }
        context.unbindService(b1);
_L5:
        flag1 = flag;
        if (!flag)
        {
            c = true;
            return flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        context.unbindService(b1);
        flag = flag2;
          goto _L5
        obj;
        context.unbindService(b1);
        throw obj;
    }

    public static boolean isGooglePlayServicesAvailable(Context context)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (android.os.Build.VERSION.SDK_INT > 8)
        {
            b b1;
            Intent intent;
            try
            {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            b1 = new b(null);
            intent = new Intent(b);
            intent.setPackage(a);
            if (context.bindService(intent, b1, 1))
            {
                context.unbindService(b1);
                return true;
            }
        }
        return false;
    }

    public static String md5(String s)
    {
        StringBuilder stringbuilder;
        int j;
        try
        {
            s = MessageDigest.getInstance("MD5").digest(s.getBytes("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Huh, MD5 should be supported?", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("Huh, UTF-8 should be supported?", s);
        }
        stringbuilder = new StringBuilder(s.length * 2);
        j = s.length;
        for (int i = 0; i < j; i++)
        {
            int k = s[i] & 0xff;
            if (k < 16)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(Integer.toHexString(k));
        }

        return stringbuilder.toString();
    }

}
