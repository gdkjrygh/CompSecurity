// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.h;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import io.wecloud.message.e.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package io.wecloud.message.h:
//            f

public class a
{

    public static final String a = (new StringBuilder(String.valueOf(Environment.getExternalStorageDirectory().getPath()))).append("/.goproduct/").toString();
    private static final String b = io/wecloud/message/h/a.getSimpleName();

    public a()
    {
    }

    public static int a(Context context, String s)
    {
        int i = -1;
        byte abyte0[];
        try
        {
            context = e(context, s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            io.wecloud.message.e.c.a(b, (new StringBuilder("Exception occured, while getting version code from app, pkgname = ")).append(s).toString(), context);
            return -1;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        i = a(context, s, "raw/version_code");
        context = context.getResources().openRawResource(i);
        abyte0 = new byte[context.available()];
        context.read(abyte0);
        i = Integer.parseInt(new String(abyte0));
        return i;
    }

    public static int a(Context context, String s, String s1)
    {
        byte byte0 = -1;
        int i = byte0;
        if (context != null)
        {
            i = byte0;
            if (!TextUtils.isEmpty(s))
            {
                i = byte0;
                if (!TextUtils.isEmpty(s1))
                {
                    String s2 = (new StringBuilder(String.valueOf(s.trim()))).append(":").append(s1).toString();
                    try
                    {
                        i = context.getResources().getIdentifier(s2, null, null);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        io.wecloud.message.e.c.a(b, (new StringBuilder("get resId EXCEPTION, pkgName = ")).append(s).append(" recName = ").append(s1).toString(), context);
                        return -1;
                    }
                }
            }
        }
        return i;
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

    private static String a()
    {
        Object obj1 = new File((new StringBuilder(String.valueOf(a))).append("goid").toString());
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
        int i = 0;
_L12:
        if (i < j) goto _L6; else goto _L5
_L5:
        obj1 = fileinputstream;
        String s = new String(((byte []) (obj2)), "utf-8");
        obj1 = fileinputstream;
        s.trim();
        obj = s;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_162;
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
            break MISSING_BLOCK_LABEL_162;
        }
        obj1 = fileinputstream;
        obj = ((String) (obj2)).replaceAll("\n", "");
_L10:
        IOException ioexception2;
        IOException ioexception;
        try
        {
            fileinputstream.close();
        }
        catch (IOException ioexception1)
        {
            ioexception1.printStackTrace();
            return ((String) (obj));
        }
        return ((String) (obj));
_L6:
        obj2[i] = obj[i];
        i++;
        continue; /* Loop/switch isn't completed */
        ioexception2;
        obj = null;
_L9:
        obj1 = obj;
        ioexception2.printStackTrace();
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
_L8:
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
        if (true) goto _L8; else goto _L7
_L7:
        ioexception2;
        obj = fileinputstream;
        if (true) goto _L9; else goto _L4
_L4:
        obj = null;
        if (true) goto _L10; else goto _L2
_L2:
        return null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public static String a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return "io.wecloud.message.service.AIDL";
        }
    }

    public static ArrayList a(Context context)
    {
        ArrayList arraylist = new ArrayList();
        Intent intent = new Intent("io.wecloud.message.action.PUSH_SERVICE");
        context = context.getPackageManager().queryIntentServices(intent, 4).iterator();
        do
        {
            if (!context.hasNext())
            {
                return arraylist;
            }
            arraylist.add(((ResolveInfo)context.next()).serviceInfo.packageName);
        } while (true);
    }

    public static String b(Context context)
    {
        ArrayList arraylist = new ArrayList();
        Object obj;
        obj = new Intent("io.wecloud.message.action.PUSH_SERVICE");
        obj = context.getPackageManager().queryIntentServices(((Intent) (obj)), 2).iterator();
_L3:
        boolean flag = ((Iterator) (obj)).hasNext();
        if (flag) goto _L2; else goto _L1
_L1:
        Collections.sort(arraylist, new io.wecloud.message.a.a());
        return ((io.wecloud.message.bean.a)arraylist.get(0)).a;
_L2:
        String s = ((ResolveInfo)((Iterator) (obj)).next()).serviceInfo.packageName;
        io.wecloud.message.bean.a a2 = new io.wecloud.message.bean.a();
        a2.c = a(context, s);
        a2.a = s;
        arraylist.add(a2);
          goto _L3
        Throwable throwable;
        throwable;
        io.wecloud.message.bean.a a1 = new io.wecloud.message.bean.a();
        a1.c = 103;
        a1.a = context.getPackageName();
        arraylist.add(a1);
          goto _L1
    }

    public static void b(String s)
    {
        s = new File(s);
        if (s.exists())
        {
            return;
        }
        File file = s.getParentFile();
        if (!file.exists())
        {
            b(file.getAbsolutePath());
        }
        s.mkdir();
    }

    public static boolean b(Context context, String s)
    {
        if (!context.getPackageName().equals(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if ((context = e(context, s)) == null) goto _L1; else goto _L3
_L3:
        context = f(context, "ShareChannel");
        if (TextUtils.isEmpty(context)) goto _L1; else goto _L4
_L4:
        boolean flag = context.equalsIgnoreCase("on");
        if (flag)
        {
            return true;
        }
          goto _L1
        context;
        io.wecloud.message.e.c.a(b, (new StringBuilder("Exception occured, while getting the configuration of sharing push service, pkgname = ")).append(s).toString(), context);
        return false;
    }

    public static String c(Context context, String s)
    {
        if (!context.getPackageName().equals(s))
        {
            context = e(context, s);
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        return f(context, "APPKEY");
        context;
        return null;
    }

    public static ArrayList c(Context context)
    {
        ArrayList arraylist = new ArrayList();
        if (context == null) goto _L2; else goto _L1
_L1:
        int i;
        context = context.getPackageManager().getInstalledPackages(0);
        i = 0;
_L5:
        if (i < context.size()) goto _L3; else goto _L2
_L2:
        Collections.sort(arraylist);
        return arraylist;
_L3:
        PackageInfo packageinfo;
        packageinfo = (PackageInfo)context.get(i);
        if ((packageinfo.applicationInfo.flags & 1) > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(packageinfo.packageName);
_L7:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        if ((packageinfo.applicationInfo.flags & 0x80) == 0) goto _L7; else goto _L6
_L6:
        arraylist.add(packageinfo.packageName);
          goto _L7
    }

    private static void c(String s)
    {
        Object obj;
        obj = new File((new StringBuilder(String.valueOf(a))).append("goid").toString());
        a(((File) (obj)).getAbsolutePath(), false);
        FileOutputStream fileoutputstream = new FileOutputStream(((File) (obj)));
        obj = fileoutputstream;
        fileoutputstream.write(s.getBytes("utf-8"));
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        fileoutputstream.close();
_L2:
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
        s.printStackTrace();
        return;
        s;
        if (true) goto _L5; else goto _L4
_L4:
        s;
          goto _L6
        s;
          goto _L7
    }

    public static int d(Context context)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        int i = context.getApplicationInfo().icon;
        return i;
        context;
        return -1;
    }

    public static String d(Context context, String s)
    {
        String s1;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        s1 = obj1;
        if (!context.getPackageName().equals(s)) goto _L2; else goto _L1
_L1:
        Object obj = context;
_L9:
        context = obj2;
        if (obj == null) goto _L4; else goto _L3
_L3:
        s1 = obj1;
        try
        {
            context = ((Context) (obj)).getPackageManager().getApplicationInfo(s, 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return s1;
        }
        if (context == null) goto _L6; else goto _L5
_L5:
        s1 = obj1;
        s = ((ApplicationInfo) (context)).metaData;
_L7:
        context = obj2;
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = obj1;
        context = obj2;
        if (!s.containsKey("Channel"))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = obj1;
        obj = s.getString("Channel");
        s1 = ((String) (obj));
        context = ((Context) (obj));
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = ((String) (obj));
        return (new StringBuilder(String.valueOf(s.getInt("Channel")))).toString();
_L2:
        s1 = obj1;
        obj = e(context, s);
        continue; /* Loop/switch isn't completed */
_L6:
        s = null;
        if (true) goto _L7; else goto _L4
_L4:
        return context;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static int e(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 1;
        }
        return i;
    }

    public static Context e(Context context, String s)
    {
        Object obj = null;
        Context context1 = obj;
        if (context != null)
        {
            context1 = obj;
            if (!TextUtils.isEmpty(s))
            {
                try
                {
                    context1 = context.createPackageContext(s, 3);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return null;
                }
            }
        }
        return context1;
    }

    public static String f(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "1";
        }
        return context;
    }

    public static String f(Context context, String s)
    {
        if (context != null && s != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        try
        {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        context = ((ApplicationInfo) (context)).metaData;
_L4:
        if (context == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        context = context.getString(s);
        return context;
        context = null;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static String g(Context context)
    {
        Object obj = null;
        Object obj1 = context.getSharedPreferences((new StringBuilder("go_static_id")).append(context.getPackageName()).toString(), 1).getString("go_static_id", null);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        obj1 = a();
        obj = obj1;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        flag = true;
        obj = obj1;
_L14:
        Object obj2;
        obj1 = obj;
        if (obj == null)
        {
            obj1 = (new StringBuilder(String.valueOf(System.currentTimeMillis()))).append(io.wecloud.message.h.f.a(context)).toString();
        }
        context.getSharedPreferences((new StringBuilder("go_static_id")).append(context.getPackageName()).toString(), 1).edit().putString("go_static_id", ((String) (obj1))).commit();
        obj2 = obj1;
        if (!flag)
        {
            c(((String) (obj1)));
            obj2 = obj1;
        }
_L6:
        return ((String) (obj2));
_L2:
        obj = obj1;
_L4:
        obj2 = obj;
        if (obj != null) goto _L6; else goto _L5
_L5:
        obj1 = context.getPackageManager().queryIntentActivities(new Intent("com.jiubang.gau.ACTION_GOSTATICSDK"), 0);
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        if (((List) (obj1)).isEmpty()) goto _L8; else goto _L9
_L9:
        obj2 = ((List) (obj1)).iterator();
        obj1 = obj;
_L12:
        obj = obj1;
        if (!((Iterator) (obj2)).hasNext())
        {
            obj = obj1;
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        String s = ((ResolveInfo)((Iterator) (obj2)).next()).activityInfo.packageName;
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        if (s.equals(context.getPackageName()))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        Context context1 = context.createPackageContext(s, 2);
        if (context1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        obj1 = context1.getSharedPreferences((new StringBuilder("go_static_id")).append(s).toString(), 1).getString("go_static_id", null);
        obj = obj1;
        if (obj != null)
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_333;
        obj1;
_L11:
        ((Exception) (obj1)).printStackTrace();
        flag = false;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L11; else goto _L10
_L10:
        obj1 = obj;
        if (true) goto _L12; else goto _L8
_L8:
        flag = false;
        if (true) goto _L14; else goto _L13
_L13:
    }

}
