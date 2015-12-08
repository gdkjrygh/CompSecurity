// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.utils:
//            j, q

public class b
{

    private static long a = 0L;
    private static String b = "";

    public static String a(Context context)
    {
        context = ((ActivityManager)context.getSystemService("activity")).getRunningTasks(1);
        if (context.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        context = ((android.app.ActivityManager.RunningTaskInfo)context.get(0)).topActivity.getPackageName();
        return context;
        context;
        return null;
    }

    public static boolean a(Context context, String s)
    {
        if (context == null || TextUtils.isEmpty(s))
        {
            return false;
        }
        try
        {
            context.getPackageManager().getPackageInfo(s, 1024);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static int b(Context context, String s)
    {
        if (context == null || s == null)
        {
            return -1;
        }
        int k;
        try
        {
            k = context.getPackageManager().getPackageInfo(s, 1024).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            j.d("Ad_SDK", (new StringBuilder()).append("Error :").append(s).append(" is not exist.").toString());
            return -1;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return -1;
        }
        return k;
    }

    public static List b(Context context)
    {
        return context.getPackageManager().getInstalledPackages(0);
    }

    public static String c(Context context)
    {
        com/jiubang/commerce/utils/b;
        JVM INSTR monitorenter ;
        if (context != null) goto _L2; else goto _L1
_L1:
        context = null;
_L12:
        com/jiubang/commerce/utils/b;
        JVM INSTR monitorexit ;
        return context;
_L2:
        String s;
        long l1 = System.currentTimeMillis();
        if (!b.equals("") && a != 0L && l1 - a <= 0xdbba00L)
        {
            context = b;
            continue; /* Loop/switch isn't completed */
        }
        s = "";
        List list = context.getPackageManager().getInstalledPackages(0);
        Object obj = s;
        if (list == null) goto _L4; else goto _L3
_L3:
        int k;
        int l;
        l = 0;
        k = 0;
        context = s;
_L10:
        obj = context;
        if (l >= list.size()) goto _L4; else goto _L5
_L5:
        obj = (PackageInfo)list.get(l);
        if ((((PackageInfo) (obj)).applicationInfo.flags & 1) != 0) goto _L7; else goto _L6
_L6:
        if (j.a)
        {
            j.a("", (new StringBuilder()).append(l).append("   :   ").append(((PackageInfo) (obj)).packageName).toString());
        }
        obj = (new StringBuilder()).append(context).append(((PackageInfo) (obj)).packageName).append(",").toString();
        k++;
        if (k < 50) goto _L8; else goto _L4
_L4:
        b = ((String) (obj));
        context = b;
        continue; /* Loop/switch isn't completed */
_L8:
        context = ((Context) (obj));
_L7:
        l++;
        if (true) goto _L10; else goto _L9
_L9:
        context;
        throw context;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public static String c(Context context, String s)
    {
        if (context == null || s == null)
        {
            return "";
        }
        try
        {
            context = context.getPackageManager().getPackageInfo(s, 1024).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            j.d("Ad_SDK", (new StringBuilder()).append("Error :").append(s).append(" is not exist.").toString());
            return "";
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "";
        }
        return context;
    }

    public static String d(Context context)
    {
        int k;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        k = Process.myPid();
        context = (ActivityManager)context.getSystemService("activity");
        context = context.getRunningAppProcesses().iterator();
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        do
        {
            if (!context.hasNext())
            {
                break MISSING_BLOCK_LABEL_67;
            }
            runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)context.next();
        } while (runningappprocessinfo.pid != k);
        context = runningappprocessinfo.processName;
        return context;
        context;
        context.printStackTrace();
        return null;
    }

    public static String d(Context context, String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        try
        {
            context = context.getPackageManager();
            s = context.getApplicationInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (s == null) goto _L1; else goto _L3
_L3:
        context = context.getApplicationLabel(s).toString();
        return context;
    }

    public static boolean e(Context context, String s)
    {
        if (q.e)
        {
            return i(context, s);
        } else
        {
            return h(context, s);
        }
    }

    public static PackageInfo f(Context context, String s)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static boolean g(Context context, String s)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        Intent intent1;
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_97;
        }
        intent1 = context.getPackageManager().getLaunchIntentForPackage(s);
        Intent intent;
        intent = intent1;
        if (intent1 != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        PackageInfo packageinfo = f(context, s);
        intent = intent1;
        if (packageinfo == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        intent = intent1;
        if (!TextUtils.isEmpty(packageinfo.applicationInfo.className))
        {
            intent = new Intent();
            intent.addFlags(0x10000000);
            intent.setClassName(s, packageinfo.applicationInfo.className);
        }
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        context.startActivity(intent);
        return true;
        context;
_L2:
        return false;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean h(Context context, String s)
    {
        boolean flag;
        context = ((ActivityManager)context.getSystemService("activity")).getRunningTasks(1);
        if (context.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        flag = s.equals(((android.app.ActivityManager.RunningTaskInfo)context.get(0)).topActivity.getPackageName());
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_51;
        context;
        return false;
    }

    private static boolean i(Context context, String s)
    {
        context = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
        if (context == null)
        {
            return false;
        }
        context = context.iterator();
        boolean flag;
        do
        {
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
            do
            {
                if (!context.hasNext())
                {
                    break MISSING_BLOCK_LABEL_86;
                }
                runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)context.next();
            } while (runningappprocessinfo.importance != 100);
            if (runningappprocessinfo.processName.equals(s))
            {
                break;
            }
            flag = Arrays.asList(runningappprocessinfo.pkgList).contains(s);
        } while (!flag);
        return true;
        context;
        return false;
    }

}
