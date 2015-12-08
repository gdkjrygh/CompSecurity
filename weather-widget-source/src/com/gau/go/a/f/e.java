// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.f;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;

// Referenced classes of package com.gau.go.a.f:
//            d

public class e
{

    public static String a = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getPath()).append("/.goproduct/").toString();
    private static boolean b = false;

    public static int a(boolean flag)
    {
        return !flag ? 0 : 1;
    }

    public static File a(String s, boolean flag)
    {
        s = new File(s);
        if (!flag && s.exists())
        {
            s.delete();
        }
        if (!s.exists())
        {
            try
            {
                b(s.getParentFile().getAbsolutePath());
                s.createNewFile();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                return s;
            }
        }
        return s;
    }

    public static String a()
    {
        return a(System.currentTimeMillis());
    }

    public static String a(long l)
    {
        Object obj;
        try
        {
            obj = new Date(l);
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
            simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            obj = simpledateformat.format(((Date) (obj)));
        }
        catch (Exception exception)
        {
            return null;
        }
        return ((String) (obj));
    }

    public static String a(byte abyte0[])
    {
        Object obj1;
        ByteArrayOutputStream bytearrayoutputstream;
        obj1 = null;
        bytearrayoutputstream = new ByteArrayOutputStream();
        GZIPOutputStream gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
        Object obj = gzipoutputstream;
        gzipoutputstream.write(abyte0);
        obj = gzipoutputstream;
        gzipoutputstream.flush();
        if (gzipoutputstream != null)
        {
            try
            {
                gzipoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
        }
        abyte0 = obj1;
        if (bytearrayoutputstream != null)
        {
            abyte0 = bytearrayoutputstream.toString("ISO-8859-1");
        }
        return abyte0;
        abyte0;
        obj = null;
_L4:
        throw abyte0;
        abyte0;
_L2:
        if (obj != null)
        {
            try
            {
                ((GZIPOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw abyte0;
        abyte0;
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
        abyte0;
        obj = gzipoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(Context context, SharedPreferences sharedpreferences)
    {
        Object obj = null;
        com/gau/go/a/f/e;
        JVM INSTR monitorenter ;
        Object obj1;
        context = (new StringBuilder()).append(Environment.getDataDirectory()).append("/data/").append(context.getPackageName()).append("/databases/").toString();
        obj1 = (new StringBuilder()).append(context).append("gostatistics_sdk.db").toString();
        context = ((Context) (obj));
        obj1 = SQLiteDatabase.openDatabase(((String) (obj1)), null, 1);
        context = ((Context) (obj1));
        obj = obj1;
        sharedpreferences.edit().putLong("first_run_time", System.currentTimeMillis() - 0x6ddd000L).commit();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        ((SQLiteDatabase) (obj1)).close();
_L2:
        com/gau/go/a/f/e;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj = context;
        sharedpreferences.edit().putLong("first_run_time", System.currentTimeMillis()).commit();
        if (context == null) goto _L2; else goto _L1
_L1:
        context.close();
          goto _L2
        context;
        throw context;
        context;
        obj = null;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        ((SQLiteDatabase) (obj)).close();
        throw context;
        context;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(Exception exception)
    {
        if (b && exception != null)
        {
            Log.d("StatisticsManager", Log.getStackTraceString(exception));
        }
    }

    public static void a(String s)
    {
        a("StatisticsManager", s);
    }

    public static void a(String s, String s1)
    {
        if (b)
        {
            String s2 = s;
            if (s == null)
            {
                s2 = "StatisticsManager";
            }
            Log.d(s2, s1);
        }
    }

    public static boolean a(Context context)
    {
        NetworkInfo networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return networkinfo != null && networkinfo.getType() == 0 && (Proxy.getDefaultHost() != null || Proxy.getHost(context) != null);
    }

    public static int b(Context context)
    {
        context = ((TelephonyManager)context.getSystemService("phone")).getSimOperator();
        if (context != null)
        {
            if (context.startsWith("46000") || context.startsWith("46002"))
            {
                return 0;
            }
            if (context.startsWith("46001"))
            {
                return 1;
            }
            if (context.startsWith("46003"))
            {
                return 2;
            }
        }
        return -1;
    }

    private static String b()
    {
        Object obj1 = new File((new StringBuilder()).append(a).append("goid").toString());
        if (!((File) (obj1)).exists()) goto _L2; else goto _L1
_L1:
        Object obj = new byte[1024];
        FileInputStream fileinputstream = new FileInputStream(((File) (obj1)));
        obj1 = fileinputstream;
        int j = fileinputstream.read(((byte []) (obj)));
        if (j <= 0) goto _L4; else goto _L3
_L3:
        obj1 = fileinputstream;
        Object obj2 = new byte[j];
        IOException ioexception;
        String s;
        int i = 0;
        while (i < j) 
        {
            obj2[i] = obj[i];
            i++;
        }
          goto _L5
_L11:
        obj1 = fileinputstream;
        s = new String(((byte []) (obj2)), "utf-8");
        obj1 = fileinputstream;
        s.trim();
        obj = s;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        obj2 = s;
        obj1 = fileinputstream;
        if (!s.contains("\r\n"))
        {
            break MISSING_BLOCK_LABEL_138;
        }
        obj1 = fileinputstream;
        obj2 = s.replaceAll("\r\n", "");
        obj = obj2;
        obj1 = fileinputstream;
        if (!((String) (obj2)).contains("\n"))
        {
            break MISSING_BLOCK_LABEL_165;
        }
        obj1 = fileinputstream;
        obj = ((String) (obj2)).replaceAll("\n", "");
_L9:
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((IOException) (obj1)).printStackTrace();
            return ((String) (obj));
        }
        return ((String) (obj));
        obj2;
        obj = null;
_L8:
        obj1 = obj;
        ((IOException) (obj2)).printStackTrace();
        try
        {
            ((FileInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
            return null;
        }
        return null;
        obj;
        obj1 = null;
_L7:
        try
        {
            ((FileInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        throw obj;
        obj;
        if (true) goto _L7; else goto _L6
_L6:
        obj2;
        obj = fileinputstream;
        if (true) goto _L8; else goto _L4
_L4:
        obj = null;
        if (true) goto _L9; else goto _L2
_L2:
        return null;
_L5:
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static void b(String s)
    {
        s = new File(s);
        if (s.exists())
        {
            return;
        } else
        {
            s.mkdirs();
            return;
        }
    }

    public static void b(boolean flag)
    {
        b = flag;
    }

    public static String c(Context context)
    {
        return Proxy.getHost(context);
    }

    public static boolean c(String s)
    {
        return s == null || s.trim().equals("") || s.trim().equals("null");
    }

    public static int d(Context context)
    {
        return Proxy.getPort(context);
    }

    private static void d(String s)
    {
        Object obj;
        obj = new File((new StringBuilder()).append(a).append("goid").toString());
        a(((File) (obj)).getAbsolutePath(), false);
        FileOutputStream fileoutputstream = new FileOutputStream(((File) (obj)));
        obj = fileoutputstream;
        fileoutputstream.write(s.getBytes("utf-8"));
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        fileoutputstream.close();
_L2:
        return;
        s;
        s.printStackTrace();
        return;
        s;
        fileoutputstream = null;
_L7:
        obj = fileoutputstream;
        s.printStackTrace();
        if (fileoutputstream == null) goto _L2; else goto _L1
_L1:
        try
        {
            fileoutputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return;
        s;
        fileoutputstream = null;
_L6:
        obj = fileoutputstream;
        s.printStackTrace();
        if (fileoutputstream == null) goto _L2; else goto _L3
_L3:
        try
        {
            fileoutputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return;
        s;
        obj = null;
_L5:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        throw s;
        s;
        if (true) goto _L5; else goto _L4
_L4:
        s;
          goto _L6
        s;
          goto _L7
    }

    public static String e(Context context)
    {
        Object obj1 = null;
        Object obj = context.getSharedPreferences((new StringBuilder()).append("go_static_id").append(context.getPackageName()).toString(), 1).getString("go_static_id", null);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        obj = b();
        obj1 = obj;
        obj = obj1;
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        boolean flag = true;
_L13:
        obj = obj1;
        if (obj1 == null)
        {
            obj = (new StringBuilder()).append(System.currentTimeMillis()).append(com.gau.go.a.f.d.f(context)).toString();
        }
        context.getSharedPreferences((new StringBuilder()).append("go_static_id").append(context.getPackageName()).toString(), 1).edit().putString("go_static_id", ((String) (obj))).commit();
        obj1 = obj;
        if (!flag)
        {
            d(((String) (obj)));
            obj1 = obj;
        }
_L5:
        return ((String) (obj1));
_L2:
        obj1 = obj;
        if (obj != null) goto _L5; else goto _L4
_L4:
        Object obj2 = context.getPackageManager().queryIntentActivities(new Intent("com.jiubang.gau.ACTION_GOSTATICSDK"), 0);
        obj1 = obj;
        if (obj2 == null) goto _L7; else goto _L6
_L6:
        obj1 = obj;
        if (((List) (obj2)).isEmpty()) goto _L7; else goto _L8
_L8:
        obj2 = ((List) (obj2)).iterator();
_L10:
        obj1 = obj;
        if (!((Iterator) (obj2)).hasNext())
        {
            break MISSING_BLOCK_LABEL_337;
        }
        obj1 = obj;
        String s = ((ResolveInfo)((Iterator) (obj2)).next()).activityInfo.packageName;
        if (s == null) goto _L10; else goto _L9
_L9:
        obj1 = obj;
        if (s.equals(context.getPackageName())) goto _L10; else goto _L11
_L11:
        obj1 = obj;
        Context context1 = context.createPackageContext(s, 2);
        if (context1 == null) goto _L10; else goto _L12
_L12:
        obj1 = obj;
        obj = context1.getSharedPreferences((new StringBuilder()).append("go_static_id").append(s).toString(), 1).getString("go_static_id", null);
        obj1 = obj;
        obj = obj1;
        if (obj1 == null) goto _L10; else goto _L7
_L7:
        flag = false;
          goto _L13
        obj;
_L14:
        flag = false;
          goto _L13
        obj1;
        obj1 = obj;
          goto _L14
        obj1 = obj;
          goto _L7
    }

}
