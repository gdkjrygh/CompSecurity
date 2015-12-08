// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;

public class a
{

    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static long g = -1L;
    private static long h = -1L;
    private static String i = null;

    public static int A(Context context)
    {
        return j(context).getInt("create_socket_fail_times", 0);
    }

    public static String B(Context context)
    {
        return j(context).getString("logContent", "");
    }

    public static long a(Context context)
    {
        if (g < 0L)
        {
            g = j(context).getLong("lastSendLogTime", 0L);
        }
        return g;
    }

    public static void a(Context context, int i1)
    {
        a = i1;
        a(context, "tickInterval", a);
    }

    public static void a(Context context, long l1)
    {
        a(context, "lastMsgId", l1);
    }

    public static void a(Context context, String s1)
    {
        String s2 = s1.split(":")[0];
        int i1 = Integer.parseInt(s1.split(":")[1]);
        a(context, "pushIP", s2);
        a(context, "pushPort", i1);
    }

    public static void a(Context context, String s1, int i1)
    {
        try
        {
            context = j(context).edit();
            context.putInt(s1, i1);
            context.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(Context context, String s1, long l1)
    {
        try
        {
            context = j(context).edit();
            context.putLong(s1, l1);
            context.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(Context context, String s1, String s2)
    {
        try
        {
            context = j(context).edit();
            context.putString(s1, s2);
            context.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(Context context, String s1, boolean flag)
    {
        try
        {
            context = j(context).edit();
            context.putBoolean(s1, flag);
            context.commit();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static void a(Context context, boolean flag)
    {
        a(context, "shouldWork", flag);
    }

    public static long b(Context context)
    {
        if (h < 0L)
        {
            j(context).getLong("upload_usage_time", System.currentTimeMillis());
        }
        return h;
    }

    public static void b(Context context, int i1)
    {
        b = i1;
        a(context, "tickTimeOut", b);
    }

    public static void b(Context context, long l1)
    {
        g = l1;
        a(context, "lastSendLogTime", l1);
    }

    public static void b(Context context, String s1)
    {
        a(context, "pushIP", s1);
    }

    public static void b(Context context, boolean flag)
    {
        a(context, "needLog", flag);
    }

    public static void c(Context context, int i1)
    {
        if (i1 <= 0)
        {
            c = k(context);
        } else
        {
            c = i1;
        }
        a(context, "tick_interval_min", c);
    }

    public static void c(Context context, long l1)
    {
        h = l1;
        a(context, "upload_usage_time", l1);
    }

    public static void c(Context context, String s1)
    {
        a(context, "uploaded_installed_apps_data", s1);
    }

    public static void c(Context context, boolean flag)
    {
        a(context, "upload_installed_apps_success", flag);
    }

    public static boolean c(Context context)
    {
        return j(context).getBoolean("needLog", true);
    }

    public static String d(Context context)
    {
        return io.wecloud.message.h.a.g(context);
    }

    public static void d(Context context, int i1)
    {
        if (i1 <= 0)
        {
            d = l(context);
        } else
        {
            d = i1;
        }
        a(context, "tick_interval_max", d);
    }

    public static void d(Context context, long l1)
    {
        a(context, "last_upload_time", l1);
    }

    public static void d(Context context, String s1)
    {
        a(context, "latitude_data", s1);
    }

    public static void d(Context context, boolean flag)
    {
        a(context, "update_upload_installed_apps_state", flag);
    }

    public static String e(Context context)
    {
        return j(context).getString("pushIP", "");
    }

    public static void e(Context context, int i1)
    {
        if (i1 <= 0)
        {
            e = k(context);
        } else
        {
            e = i1;
        }
        a(context, "tick_interval_min_oper", e);
    }

    public static void e(Context context, long l1)
    {
        a(context, "last_notify_time_stamp", l1);
    }

    public static void e(Context context, String s1)
    {
        if (context != null)
        {
            context = context.getSharedPreferences("message_list", 4);
            if (context != null)
            {
                context.edit().putString("received_message_list", s1).commit();
            }
        }
    }

    public static void e(Context context, boolean flag)
    {
        a(context, "network_latest_state", flag);
    }

    public static int f(Context context)
    {
        return j(context).getInt("pushPort", 0);
    }

    public static void f(Context context, int i1)
    {
        if (i1 <= 0)
        {
            f = l(context);
        } else
        {
            f = i1;
        }
        a(context, "tick_interval_max_oper", f);
    }

    public static void f(Context context, String s1)
    {
        a(context, "logContent", s1);
    }

    public static void f(Context context, boolean flag)
    {
        if (context != null)
        {
            context = context.getSharedPreferences("share_sp_name", 5);
            if (context != null)
            {
                context.edit().putBoolean("debuger_controller", flag).commit();
            }
        }
        io.wecloud.message.b.a.b = flag;
        io.wecloud.message.b.a.a = flag;
    }

    public static void g(Context context, int i1)
    {
        a(context, "create_socket_fail_times", i1);
    }

    public static void g(Context context, String s1)
    {
        i = s1;
        a(context, "event_log_content", s1);
    }

    public static void g(Context context, boolean flag)
    {
        a(context, "create_socket_fail_state", flag);
    }

    public static boolean g(Context context)
    {
        return j(context).getBoolean("shouldWork", true);
    }

    public static String h(Context context)
    {
        return j(context).getString("lastNetworkType", "");
    }

    public static String h(Context context, int i1)
    {
        if (i1 == 0)
        {
            return i;
        } else
        {
            return j(context).getString("event_log_content", "");
        }
    }

    public static void i(Context context)
    {
        a(context, "lastNetworkChangeTime", System.currentTimeMillis());
    }

    public static SharedPreferences j(Context context)
    {
        return context.getSharedPreferences("wecloud", 4);
    }

    public static int k(Context context)
    {
        if (a == 0)
        {
            int i1 = j(context).getInt("tickInterval", 0);
            if (i1 != 0)
            {
                a = i1;
            } else
            {
                a = 0x2bf20;
                a(context, 0x2bf20);
            }
        }
        return a;
    }

    public static int l(Context context)
    {
        if (b == 0)
        {
            int i1 = j(context).getInt("tickTimeOut", 0);
            if (i1 != 0)
            {
                b = i1;
            } else
            {
                b = 0x668a0;
                b(context, 0x668a0);
            }
        }
        return b;
    }

    public static int m(Context context)
    {
        if (c == 0)
        {
            int i1 = j(context).getInt("tick_interval_min", 0);
            if (i1 != 0)
            {
                c = i1;
            } else
            {
                c = 0x2bf20;
                c(context, c);
            }
        }
        return c;
    }

    public static int n(Context context)
    {
        if (d == 0)
        {
            int i1 = j(context).getInt("tick_interval_max", 0);
            if (i1 != 0)
            {
                d = i1;
            } else
            {
                d = l(context);
                d(context, d);
            }
        }
        return d;
    }

    public static int o(Context context)
    {
        if (e == 0)
        {
            int i1 = j(context).getInt("tick_interval_min_oper", 0);
            if (i1 != 0)
            {
                e = i1;
            } else
            {
                e = 0x2bf20;
                c(context, e);
            }
        }
        return e;
    }

    public static int p(Context context)
    {
        if (f == 0)
        {
            int i1 = j(context).getInt("tick_interval_max_oper", 0);
            if (i1 != 0)
            {
                f = i1;
            } else
            {
                f = l(context);
                d(context, f);
            }
        }
        return f;
    }

    public static long q(Context context)
    {
        return j(context).getLong("last_upload_time", 0L);
    }

    public static boolean r(Context context)
    {
        return j(context).getBoolean("upload_installed_apps_success", false);
    }

    public static boolean s(Context context)
    {
        return j(context).getBoolean("update_upload_installed_apps_state", true);
    }

    public static String t(Context context)
    {
        return j(context).getString("uploaded_installed_apps_data", "");
    }

    public static long u(Context context)
    {
        return j(context).getLong("last_notify_time_stamp", 0L);
    }

    public static boolean v(Context context)
    {
        return j(context).getBoolean("network_latest_state", false);
    }

    public static String w(Context context)
    {
        return j(context).getString("latitude_data", "");
    }

    public static ArrayList x(Context context)
    {
        ArrayList arraylist = new ArrayList();
        if (context == null) goto _L2; else goto _L1
_L1:
        context = context.getSharedPreferences("message_list", 4);
        if (context == null) goto _L2; else goto _L3
_L3:
        context = context.getString("received_message_list", "").split(",");
        if (context == null) goto _L2; else goto _L4
_L4:
        int i1;
        int j1;
        j1 = context.length;
        i1 = 0;
_L7:
        if (i1 < j1) goto _L5; else goto _L2
_L2:
        return arraylist;
_L5:
        CharSequence charsequence = context[i1];
        if (!TextUtils.isEmpty(charsequence) && !arraylist.contains(charsequence))
        {
            arraylist.add(charsequence);
        }
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static boolean y(Context context)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (context != null)
        {
            context = context.getSharedPreferences("share_sp_name", 5);
            flag = flag1;
            if (context != null)
            {
                flag = context.getBoolean("debuger_controller", false);
            }
        }
        io.wecloud.message.b.a.b = flag;
        io.wecloud.message.b.a.a = flag;
        return flag;
    }

    public static boolean z(Context context)
    {
        return j(context).getBoolean("create_socket_fail_state", false);
    }

}
