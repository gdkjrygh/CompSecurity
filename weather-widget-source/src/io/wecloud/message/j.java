// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import io.wecloud.message.e.c;
import io.wecloud.message.h.a;
import io.wecloud.message.h.g;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

public class j
{

    private static final String a = io/wecloud/message/j.getSimpleName();
    private static android.os.PowerManager.WakeLock b;
    private static String c = null;
    private static int d = -1;
    private static int e = -1;

    public j()
    {
    }

    public static void a()
    {
        io/wecloud/message/j;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            b.release();
            b = null;
        }
_L2:
        io/wecloud/message/j;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        io.wecloud.message.e.c.d("CSH", (new StringBuilder("release wake lock --- ")).append(((Exception) (obj)).getMessage()).toString());
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    public static void a(Context context)
    {
        io.wecloud.message.e.c.b("CSH", "stop this service");
        Intent intent = new Intent(io.wecloud.message.h.a.a(context.getPackageName()));
        intent.setPackage(context.getPackageName());
        intent.putExtra("action", "io.wecloud.message.action.METHOD");
        intent.putExtra("method_key", 1017);
        context.startService(intent);
    }

    public static void a(Context context, int i)
    {
        i;
        JVM INSTR tableswitch 110 113: default 32
    //                   110 78
    //                   111 101
    //                   112 108
    //                   113 184;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        d = -1;
_L7:
        e = i;
        io.wecloud.message.e.c.b(a, (new StringBuilder("ticker interval range: min = ")).append(io.wecloud.message.c.a.o(context)).append(", max = ").append(io.wecloud.message.c.a.p(context)).toString());
        return;
_L2:
        if (e == 112)
        {
            d = 3;
        } else
        {
            b(context, 4);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        d = 3;
        continue; /* Loop/switch isn't completed */
_L4:
        if (e == 110 && d == 4)
        {
            b(context, 1);
        } else
        if (e == 112 && (d == 1 || d == 2))
        {
            b(context, 1);
        } else
        if (e == 111 || e == 113)
        {
            d = 1;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (e == 111)
        {
            io.wecloud.message.c.a.e(context, io.wecloud.message.c.a.m(context));
            io.wecloud.message.e.c.b(a, (new StringBuilder("RESET min interval value = ")).append(io.wecloud.message.c.a.o(context)).toString());
        }
        b(context, 2);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void a(Context context, String s)
    {
        s = new Intent(io.wecloud.message.h.a.a(context.getPackageName()));
        s.setPackage(context.getPackageName());
        s.putExtra("action", "io.wecloud.message.action.METHOD");
        s.putExtra("method_key", 1010);
        s.putExtra("tickAlarm", true);
        context.startService(s);
    }

    public static void a(Context context, boolean flag)
    {
        if (TextUtils.isEmpty(io.wecloud.message.h.a.f(context, "APPKEY")))
        {
            (new android.app.AlertDialog.Builder(context)).setTitle("Error").setMessage("Can't read the 'APPKEY' value from 'AndroidManifest.xml', please have a check!").setPositiveButton("OK", null).setCancelable(false).show();
            return;
        }
        if (e(context))
        {
            io.wecloud.message.e.c.b(a, (new StringBuilder("\u6D88\u606F\u901A\u9053\u5DF2\u542F\u52A8\uFF0C\u5305\u540D\uFF1A")).append(context.getPackageName()).toString());
            return;
        } else
        {
            b(context, flag);
            io.wecloud.message.e.c.b(a, (new StringBuilder("\u6D88\u606F\u901A\u9053\u672A\u542F\u52A8\uFF0C\u542F\u52A8\u81EA\u5DF1\u7684\u6D88\u606F\u901A\u9053\uFF0C\u5305\u540D\uFF1A")).append(context.getPackageName()).toString());
            return;
        }
    }

    public static void b(Context context)
    {
        io/wecloud/message/j;
        JVM INSTR monitorenter ;
        android.os.PowerManager.WakeLock wakelock = b;
        if (wakelock == null)
        {
            try
            {
                b = ((PowerManager)context.getSystemService("power")).newWakeLock(0x20000001, "");
                if (b != null)
                {
                    b.acquire();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            finally
            {
                io/wecloud/message/j;
            }
        }
        io/wecloud/message/j;
        JVM INSTR monitorexit ;
        return;
        throw context;
    }

    public static void b(Context context, int i)
    {
        int k = io.wecloud.message.c.a.k(context);
        switch (i)
        {
        case -1: 
        case 0: // '\0'
        default:
            return;

        case 4: // '\004'
            i = io.wecloud.message.c.a.m(context);
            int l = io.wecloud.message.c.a.n(context);
            if (k == i)
            {
                k = (i + l) / 2;
                io.wecloud.message.c.a.a(context, k);
                io.wecloud.message.c.a.e(context, i);
                io.wecloud.message.c.a.f(context, l);
                d = 4;
                io.wecloud.message.e.c.b(a, (new StringBuilder("\u91CD\u7F6E\u5FC3\u8DF3\u95F4\u9694\uFF0Ccur = ")).append(k).append(", \u6807\u8BB0\u4E0A\u6B21\u64CD\u4F5C\u4E3A = RESET").toString());
                return;
            } else
            {
                d = 3;
                io.wecloud.message.e.c.b(a, (new StringBuilder("\u91CD\u7F6E\u5FC3\u8DF3\u95F4\u9694\uFF0Ccur = ")).append(k).append(", \u6807\u8BB0\u4E0A\u6B21\u64CD\u4F5C\u4E3A = STAY").toString());
                return;
            }

        case 2: // '\002'
            io.wecloud.message.c.a.f(context, k);
            i = (k + io.wecloud.message.c.a.o(context)) / 2;
            io.wecloud.message.c.a.a(context, i);
            d = 2;
            io.wecloud.message.e.c.b(a, (new StringBuilder("BACKWARD -- > new tick interval value = ")).append(i).toString());
            return;

        case 1: // '\001'
            i = io.wecloud.message.c.a.o(context);
            int i1 = io.wecloud.message.c.a.p(context);
            if (i1 - k < 60000)
            {
                d = 3;
                io.wecloud.message.e.c.b(a, (new StringBuilder("keep the current tick interval value = ")).append(k).toString());
                return;
            }
            if (d == 1)
            {
                int j1 = k * 2 - i1;
                if (j1 > i)
                {
                    io.wecloud.message.c.a.e(context, j1);
                    io.wecloud.message.e.c.b(a, (new StringBuilder("FORWARD -- > UPDATE min interval value = ")).append(j1).toString());
                }
            }
            i = (k + i1) / 2;
            io.wecloud.message.c.a.a(context, i);
            d = 1;
            io.wecloud.message.e.c.b(a, (new StringBuilder("FORWARD -- > new tick interval value = ")).append(i).toString());
            return;

        case 3: // '\003'
            io.wecloud.message.e.c.b(a, (new StringBuilder("keep the current tick interval value = ")).append(k).toString());
            return;
        }
    }

    public static void b(Context context, boolean flag)
    {
        if (!io.wecloud.message.c.a.g(context))
        {
            return;
        }
        Intent intent = new Intent(io.wecloud.message.h.a.a(context.getPackageName()));
        intent.setPackage(context.getPackageName());
        intent.putExtra("action", "io.wecloud.message.action.METHOD");
        intent.putExtra("method_key", 1003);
        intent.putExtra("pkg", context.getPackageName());
        if (flag)
        {
            intent.putExtra("re_conn", true);
        }
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            intent.setFlags(32);
        }
        context.startService(intent);
        io.wecloud.message.c.a.y(context);
    }

    public static void c(Context context)
    {
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        Intent intent = new Intent("io.wecloud.message.action.METHOD");
        intent.putExtra("method_key", 1004);
        intent.putExtra("pkg", context.getPackageName());
        new SimpleDateFormat("yyyyMMddHHmmss");
        alarmmanager.set(2, SystemClock.elapsedRealtime() + (long)io.wecloud.message.c.a.k(context), PendingIntent.getBroadcast(context, 0, intent, 0x10000000));
    }

    public static void c(Context context, boolean flag)
    {
        io.wecloud.message.c.a.i(context);
        if (io.wecloud.message.c.a.g(context)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!g.a(context))
        {
            break MISSING_BLOCK_LABEL_125;
        }
        io.wecloud.message.e.c.b("CSH", "\u7F51\u7EDC\u72B6\u6001\u53EF\u7528");
        if (e(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        b(context, true);
        if (io.wecloud.message.c.a.v(context)) goto _L1; else goto _L3
_L3:
        io.wecloud.message.c.a.e(context, true);
        return;
        if (io.wecloud.message.c.a.v(context)) goto _L1; else goto _L4
_L4:
        try
        {
            Intent intent = new Intent(io.wecloud.message.h.a.a(context.getPackageName()));
            intent.setPackage(context.getPackageName());
            intent.putExtra("action", "io.wecloud.message.action.METHOD");
            intent.putExtra("method_key", 1016);
            intent.putExtra("pkg", context.getPackageName());
            context.startService(intent);
        }
        catch (Throwable throwable) { }
        io.wecloud.message.c.a.e(context, true);
        return;
        io.wecloud.message.e.c.c("CSH", "\u7F51\u7EDC\u4E0D\u53EF\u7528");
        if (io.wecloud.message.c.a.v(context))
        {
            io.wecloud.message.c.a.e(context, false);
        }
        a(context);
        return;
    }

    public static void d(Context context)
    {
        AlarmManager alarmmanager = (AlarmManager)context.getSystemService("alarm");
        Intent intent = new Intent("io.wecloud.message.action.METHOD");
        intent.putExtra("method_key", 1004);
        alarmmanager.cancel(PendingIntent.getBroadcast(context, 0, intent, 0x10000000));
    }

    public static boolean e(Context context)
    {
        if (context == null)
        {
            return false;
        }
        if (!TextUtils.isEmpty(c)) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = new Intent("io.wecloud.message.action.PUSH_SERVICE");
        obj = context.getPackageManager().queryIntentServices(((Intent) (obj)), 4).iterator();
_L8:
        if (((Iterator) (obj)).hasNext()) goto _L3; else goto _L2
_L2:
        if (TextUtils.isEmpty(c)) goto _L5; else goto _L4
_L4:
        int i;
        int k;
        obj = ((ActivityManager)context.getSystemService("activity")).getRunningServices(0x7fffffff);
        ResolveInfo resolveinfo;
        if (obj == null)
        {
            return false;
        }
        k = ((List) (obj)).size();
        i = 0;
          goto _L6
_L3:
        resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
        if (!resolveinfo.serviceInfo.packageName.equals(context.getPackageName())) goto _L8; else goto _L7
_L7:
        c = resolveinfo.serviceInfo.name;
        io.wecloud.message.e.c.b(a, (new StringBuilder("find serviceName = ")).append(c).toString());
          goto _L2
_L6:
        if (i < k) goto _L9; else goto _L5
_L5:
        return false;
_L9:
        if (((android.app.ActivityManager.RunningServiceInfo)((List) (obj)).get(i)).service.getPackageName().equals(context.getPackageName()) && ((android.app.ActivityManager.RunningServiceInfo)((List) (obj)).get(i)).service.getClassName().equals(c))
        {
            return true;
        }
        i++;
        if (true) goto _L6; else goto _L10
_L10:
    }

}
