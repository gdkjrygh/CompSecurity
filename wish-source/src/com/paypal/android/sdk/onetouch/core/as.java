// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            x, s, u, at, 
//            w

public final class as
{

    private static final boolean a;
    private static final boolean b;
    private static final String c = (new StringBuilder()).append(com/paypal/android/sdk/onetouch/core/x.getSimpleName()).append(".").append(com/paypal/android/sdk/onetouch/core/as.getSimpleName()).toString();
    private static final Uri d;

    private as()
    {
    }

    public static Location a(LocationManager locationmanager)
    {
        Location location = null;
        List list;
        int i;
        list = locationmanager.getProviders(true);
        i = list.size();
        i--;
        do
        {
            if (i < 0)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            Location location1;
            try
            {
                location1 = locationmanager.getLastKnownLocation((String)list.get(i));
            }
            // Misplaced declaration of an exception variable
            catch (LocationManager locationmanager)
            {
                return location;
            }
            location = location1;
            location1 = location;
            if (location != null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            i--;
        } while (true);
        locationmanager;
        location1 = null;
        return location1;
        return location;
    }

    public static s a(Context context)
    {
        s s1 = new s();
        s1.a(context.getPackageName());
        try
        {
            s1.b(context.getPackageManager().getPackageInfo(s1.a(), 0).versionName);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return s1;
        }
        return s1;
    }

    public static Object a(Object obj, Class class1)
    {
        if (obj != null && class1.isAssignableFrom(obj.getClass()))
        {
            return class1.cast(obj);
        } else
        {
            return null;
        }
    }

    public static String a()
    {
        String s2 = "";
        String s1 = s2;
        String s3;
        u u1;
        try
        {
            u1 = new u();
        }
        catch (Exception exception)
        {
            return s1;
        }
        s1 = s2;
        u1.a((new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/Android/data/com.ebay.lid/").toString());
        s1 = s2;
        s2 = u1.b("fb.bin");
        s3 = s2;
        s1 = s2;
        if (!"".equals(s2.trim()))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        s1 = s2;
        s3 = UUID.randomUUID().toString();
        s1 = s3;
        u1.a("fb.bin", s3.getBytes("UTF-8"));
        return s3;
    }

    public static String a(Context context, w w)
    {
        try
        {
            if (android.os.Build.VERSION.SDK_INT >= 9 && GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0)
            {
                if (Looper.myLooper() != Looper.getMainLooper())
                {
                    return AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
                }
                (new Thread(new at(context, w))).start();
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.getLocalizedMessage();
        }
        return null;
    }

    public static String a(Context context, String s1, String s2)
    {
        (new StringBuilder("entering getMetadata loading name=")).append(s1);
        context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        if (((ApplicationInfo) (context)).metaData == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        (new StringBuilder("leaving getMetadata successfully loading name=")).append(s1);
        context = ((ApplicationInfo) (context)).metaData.getString(s1);
        return context;
        context;
        (new StringBuilder("load metadata in manifest failed, name=")).append(s1);
        (new StringBuilder("leaving getMetadata with default value,name=")).append(s1);
        return null;
    }

    public static List a(boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        Enumeration enumeration = NetworkInterface.getNetworkInterfaces();
_L4:
        Enumeration enumeration1;
        if (!enumeration.hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_106;
        }
        enumeration1 = ((NetworkInterface)enumeration.nextElement()).getInetAddresses();
_L2:
        InetAddress inetaddress;
        String s1;
        if (!enumeration1.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        inetaddress = (InetAddress)enumeration1.nextElement();
        if (inetaddress.isLoopbackAddress())
        {
            continue; /* Loop/switch isn't completed */
        }
        s1 = inetaddress.getHostAddress();
        if (inetaddress instanceof Inet6Address)
        {
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
            try
            {
                arraylist.add(s1);
                continue; /* Loop/switch isn't completed */
            }
            catch (Exception exception) { }
            break MISSING_BLOCK_LABEL_106;
        }
        arraylist.add(s1);
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
        return arraylist;
    }

    public static void a(int i, String s1, String s2)
    {
        if (b)
        {
            Log.println(i, s1, s2);
        }
    }

    public static void a(int i, String s1, String s2, Throwable throwable)
    {
        if (b)
        {
            Log.println(6, s1, (new StringBuilder()).append(s2).append('\n').append(Log.getStackTraceString(throwable)).toString());
        }
    }

    public static void a(String s1, String s2)
    {
    }

    public static void a(String s1, String s2, Throwable throwable)
    {
    }

    public static void a(String s1, JSONObject jsonobject)
    {
        if (a && jsonobject != null)
        {
            jsonobject.toString();
        }
    }

    public static boolean a(Context context, String s1)
    {
        boolean flag = false;
        int i;
        try
        {
            i = context.getApplicationContext().checkCallingOrSelfPermission(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if (i == 0)
        {
            flag = true;
        }
        return flag;
    }

    public static boolean a(PackageManager packagemanager, Intent intent)
    {
        packagemanager = packagemanager.queryIntentActivities(intent, 0x10000);
        return packagemanager != null && packagemanager.size() > 0;
    }

    public static String b()
    {
        List list = a(false);
        if (list.isEmpty())
        {
            return "";
        } else
        {
            return (String)list.get(0);
        }
    }

    public static String b(Context context)
    {
label0:
        {
            if (d != null && a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES"))
            {
                context = context.getContentResolver().query(d, null, null, new String[] {
                    "android_id"
                }, null);
                if (context != null)
                {
                    break label0;
                }
            }
            return null;
        }
        int i;
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_67;
        }
        i = context.getColumnCount();
        if (i >= 2)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        context.close();
        return null;
        Exception exception;
        String s1;
        try
        {
            s1 = Long.toHexString(Long.parseLong(context.getString(1)));
        }
        catch (NumberFormatException numberformatexception)
        {
            context.close();
            return null;
        }
        finally
        {
            context.close();
        }
        context.close();
        return s1;
        throw exception;
    }

    public static String b(Context context, String s1)
    {
        context = new BufferedReader(new InputStreamReader(context.getAssets().open(s1)));
        s1 = new StringBuilder();
        do
        {
            String s2 = context.readLine();
            if (s2 != null)
            {
                s1.append(s2);
            } else
            {
                context.close();
                return new String(Base64.decode(s1.toString(), 0), "UTF-8");
            }
        } while (true);
    }

    public static boolean b(String s1, String s2)
    {
        boolean flag = false;
        String as1[] = s1.split("\\.");
        String as2[] = s2.split("\\.");
        (new StringBuilder("Cached version is ")).append(s1);
        (new StringBuilder("default version is ")).append(s2);
        int i;
        for (i = 0; i < as1.length && i < as2.length && as1[i].equals(as2[i]); i++) { }
        if (i < as1.length && i < as2.length)
        {
            s1 = Integer.valueOf(Integer.signum(Integer.valueOf(as1[i]).compareTo(Integer.valueOf(as2[i]))));
        } else
        {
            s1 = Integer.valueOf(Integer.signum(as1.length - as2.length));
        }
        if (s1.intValue() >= 0)
        {
            flag = true;
        }
        return flag;
    }

    public static long c()
    {
        int i;
        long l;
        try
        {
            StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            l = statfs.getBlockSize();
            i = statfs.getBlockCount();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            illegalargumentexception.getLocalizedMessage();
            return 0L;
        }
        return (long)i * l;
    }

    public static String d()
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            String s1 = System.getProperty("http.proxyHost");
            if (s1 != null)
            {
                String s2 = System.getProperty("http.proxyPort");
                if (s2 != null)
                {
                    return (new StringBuilder("host=")).append(s1).append(",port=").append(s2).toString();
                }
            }
        }
        return null;
    }

    public static String e()
    {
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("ls /sys/class/net").getInputStream()));
_L2:
        String s1 = bufferedreader.readLine();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        boolean flag;
        if (s1.startsWith("ppp") || s1.startsWith("tun"))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = s1.startsWith("tap");
        if (!flag) goto _L2; else goto _L1
_L1:
        return s1;
        Exception exception;
        exception;
        return null;
    }

    static String f()
    {
        return c;
    }

    static 
    {
        a = Boolean.valueOf(System.getProperty("dyson.debug.mode", Boolean.FALSE.toString())).booleanValue();
        b = Boolean.valueOf(System.getProperty("prd.debug.mode", Boolean.FALSE.toString())).booleanValue();
        Uri uri;
        try
        {
            uri = Uri.parse("content://com.google.android.gsf.gservices");
        }
        catch (Exception exception)
        {
            exception = null;
        }
        d = uri;
    }
}
