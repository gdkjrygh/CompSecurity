// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.gau.go.launcherex.gowidget.billing.p;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.c.e;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.model.u;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget21Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget41Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget42Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetDays41Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetDays42Provider;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.gtp.a.a.b.c;
import com.jiubang.core.b.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            b

public class w
{

    private static String a;
    private static String b;

    public static String a(Context context)
    {
        StringBuffer stringbuffer = new StringBuffer();
        SharedPreferences sharedpreferences = GoWidgetApplication.c(context.getApplicationContext()).a();
        a(stringbuffer, context, sharedpreferences);
        b(stringbuffer, context, sharedpreferences);
        context = stringbuffer.toString();
        com.gtp.a.a.b.c.a("CYN", context);
        com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u7EC4\u88C5\u6570\u636E\uFF1A \r\n").append(context).toString(), "statistics_log.txt");
        String s1 = URLEncoder.encode(context, "UTF-8");
        context = s1;
_L2:
        Object obj = context;
        if (context != null)
        {
            obj = com.gau.go.launcherex.gowidget.statistics.b.a(context, "lvsiqiaoil611230");
        }
        return ((String) (obj));
        Exception exception;
        exception;
        exception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String a(Context context, SharedPreferences sharedpreferences)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(5).append("||");
        a(stringbuffer, android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id"));
        a(stringbuffer, a(sharedpreferences));
        return stringbuffer.toString();
    }

    public static String a(SharedPreferences sharedpreferences)
    {
        String s1 = "";
        if (sharedpreferences != null)
        {
            s1 = sharedpreferences.getString("statistics_timestamp", "");
        }
        String s2 = s1;
        if (TextUtils.isEmpty(s1))
        {
            Object obj = new Time();
            ((Time) (obj)).setToNow();
            obj = ((Time) (obj)).format("%Y-%m-%d %H:%M:%S");
            s2 = ((String) (obj));
            if (sharedpreferences != null)
            {
                sharedpreferences = sharedpreferences.edit();
                sharedpreferences.putString("statistics_timestamp", ((String) (obj)));
                sharedpreferences.commit();
                s2 = ((String) (obj));
            }
        }
        return s2;
    }

    public static String a(Throwable throwable)
    {
        Object obj = null;
        if (throwable != null) goto _L2; else goto _L1
_L1:
        obj = "";
_L4:
        return ((String) (obj));
_L2:
        String s1 = "";
        Object obj1 = new StringWriter();
        Object obj2 = new PrintWriter(((java.io.Writer) (obj1)));
        throwable.printStackTrace(((PrintWriter) (obj2)));
        throwable = ((StringWriter) (obj1)).toString();
        if (obj1 != null)
        {
            try
            {
                ((StringWriter) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    ((Exception) (obj)).printStackTrace();
                }
            }
        }
        obj = throwable;
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((PrintWriter) (obj2)).close();
        return throwable;
        obj1;
        obj = throwable;
        if (com.gtp.a.a.b.c.a())
        {
            ((Exception) (obj1)).printStackTrace();
            return throwable;
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        throwable = null;
_L8:
        if (com.gtp.a.a.b.c.a())
        {
            ((Exception) (obj1)).printStackTrace();
        }
        if (obj != null)
        {
            try
            {
                ((StringWriter) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    ((Exception) (obj)).printStackTrace();
                }
            }
        }
        obj = s1;
        if (throwable == null) goto _L4; else goto _L5
_L5:
        throwable.close();
        return "";
        throwable;
        obj = s1;
        if (com.gtp.a.a.b.c.a())
        {
            throwable.printStackTrace();
            return "";
        }
          goto _L4
        obj;
        throwable = null;
        obj1 = null;
_L7:
        if (obj1 != null)
        {
            try
            {
                ((StringWriter) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    ((Exception) (obj1)).printStackTrace();
                }
            }
        }
        if (throwable != null)
        {
            try
            {
                throwable.close();
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    throwable.printStackTrace();
                }
            }
        }
        throw obj;
        obj;
        throwable = null;
        continue; /* Loop/switch isn't completed */
        obj;
        throwable = ((Throwable) (obj2));
        continue; /* Loop/switch isn't completed */
        obj2;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L7; else goto _L6
_L6:
        obj2;
        throwable = null;
        obj = obj1;
        obj1 = obj2;
          goto _L8
        throwable;
        obj = obj1;
        obj1 = throwable;
        throwable = ((Throwable) (obj2));
          goto _L8
    }

    public static String a(Throwable throwable, String s1)
    {
        Object obj = null;
        if (throwable != null) goto _L2; else goto _L1
_L1:
        obj = "";
_L4:
        return ((String) (obj));
_L2:
        String s2 = "";
        Object obj1 = new StringWriter();
        Object obj2 = new PrintWriter(((java.io.Writer) (obj1)));
        obj = s2;
        throwable.printStackTrace(((PrintWriter) (obj2)));
        obj = s2;
        throwable = ((StringWriter) (obj1)).toString();
        obj = throwable;
        throwable = throwable.replace("\n", s1);
        obj = throwable;
        throwable = throwable.replace("\r", s1);
        if (obj1 != null)
        {
            try
            {
                ((StringWriter) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s1.printStackTrace();
                }
            }
        }
        obj = throwable;
        if (obj2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((PrintWriter) (obj2)).close();
        return throwable;
        s1;
        obj = throwable;
        if (com.gtp.a.a.b.c.a())
        {
            s1.printStackTrace();
            return throwable;
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        s1 = null;
        throwable = "";
_L8:
        if (com.gtp.a.a.b.c.a())
        {
            ((Exception) (obj1)).printStackTrace();
        }
        if (obj != null)
        {
            try
            {
                ((StringWriter) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    ((Exception) (obj)).printStackTrace();
                }
            }
        }
        obj = throwable;
        if (s1 == null) goto _L4; else goto _L5
_L5:
        s1.close();
        return throwable;
        s1;
        obj = throwable;
        if (com.gtp.a.a.b.c.a())
        {
            s1.printStackTrace();
            return throwable;
        }
          goto _L4
        throwable;
        s1 = null;
        obj1 = null;
_L7:
        if (obj1 != null)
        {
            try
            {
                ((StringWriter) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    ((Exception) (obj)).printStackTrace();
                }
            }
        }
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                if (com.gtp.a.a.b.c.a())
                {
                    s1.printStackTrace();
                }
            }
        }
        throw throwable;
        throwable;
        s1 = null;
        continue; /* Loop/switch isn't completed */
        throwable;
        s1 = ((String) (obj2));
        continue; /* Loop/switch isn't completed */
        throwable;
        obj1 = obj;
        if (true) goto _L7; else goto _L6
_L6:
        throwable;
        s1 = null;
        obj = obj1;
        obj2 = "";
        obj1 = throwable;
        throwable = ((Throwable) (obj2));
          goto _L8
        throwable;
        Object obj3 = obj1;
        obj1 = throwable;
        throwable = ((Throwable) (obj));
        s1 = ((String) (obj2));
        obj = obj3;
          goto _L8
    }

    private static void a(Context context, long l1)
    {
        context.getSharedPreferences("randomdeviceid", 0).edit().putString("random_device_id", String.valueOf(l1)).commit();
    }

    private static void a(android.content.SharedPreferences.Editor editor)
    {
        editor.putInt("go_in_detail", 0);
        editor.putString("statistics_timestamp", "");
    }

    public static void a(SharedPreferences sharedpreferences, android.content.SharedPreferences.Editor editor, String s1)
    {
        editor.putInt(s1, sharedpreferences.getInt(s1, 0) + 1);
    }

    private static void a(String s1, int i1, int j1, StringBuffer stringbuffer)
    {
        if (i1 != 0)
        {
            stringbuffer.append(s1).append(j1).append("||").append(i1).append("\r\n");
        }
    }

    public static void a(String s1, Context context)
    {
        context = GoWidgetApplication.c(context.getApplicationContext()).a();
        android.content.SharedPreferences.Editor editor = context.edit();
        a(((SharedPreferences) (context)), editor, s1);
        editor.commit();
    }

    private static void a(String s1, SharedPreferences sharedpreferences, String s2, int i1, StringBuffer stringbuffer)
    {
        if (sharedpreferences.getInt(s2, 0) != 0)
        {
            stringbuffer.append(s1).append(i1).append("||").append(1).append("\r\n");
        }
    }

    private static void a(StringBuffer stringbuffer, Context context, SharedPreferences sharedpreferences)
    {
        stringbuffer.append("4").append("||");
        a(stringbuffer, android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id"));
        a(stringbuffer, a(sharedpreferences));
        a(stringbuffer, n(context));
        a(stringbuffer, f(context));
        a(stringbuffer, c(context));
        Object obj = GoWidgetApplication.b(context);
        if (((f) (obj)).a(32))
        {
            stringbuffer.append(4);
        } else
        if (((f) (obj)).a(1))
        {
            stringbuffer.append(1);
        } else
        if (((f) (obj)).a(2) && ((f) (obj)).a(64))
        {
            stringbuffer.append(2).append(",").append(3);
        } else
        if (((f) (obj)).a(2) && !((f) (obj)).a(64))
        {
            stringbuffer.append(2);
        } else
        if (!((f) (obj)).a(2) && ((f) (obj)).a(64))
        {
            stringbuffer.append(3);
        } else
        if (((f) (obj)).e())
        {
            stringbuffer.append(0);
        }
        stringbuffer.append("||");
        if (sharedpreferences.getInt("go_in_detail", 0) > 0)
        {
            sharedpreferences = "1";
        } else
        {
            sharedpreferences = "0";
        }
        a(stringbuffer, ((String) (sharedpreferences)));
        obj = d(context);
        sharedpreferences = ((SharedPreferences) (obj));
        if (obj == null)
        {
            sharedpreferences = "0000000000000000";
        }
        a(stringbuffer, ((String) (sharedpreferences)));
        context = (new StringBuilder()).append(e(context)).append("").toString();
        if (!TextUtils.isEmpty(context))
        {
            stringbuffer.append(context.replace("|", " ").replace("\r", " ").replace("\n", " "));
        }
        stringbuffer.append("\r\n");
    }

    public static void a(StringBuffer stringbuffer, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            stringbuffer.append(s1.replace("|", " ").replace("\r", " ").replace("\n", " "));
        }
        stringbuffer.append("||");
    }

    public static boolean a()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean a(Context context, String s1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (context != null)
        {
            flag = flag1;
            if (s1 != null)
            {
                try
                {
                    context.getPackageManager().getPackageInfo(s1, 1024);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return false;
                }
                flag = true;
            }
        }
        return flag;
    }

    public static boolean a(Context context, String s1, int i1)
    {
        boolean flag = true;
        int j1;
        try
        {
            j1 = context.getPackageManager().getPackageInfo(s1, 1).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        if (j1 >= i1)
        {
            flag = false;
        }
        return flag;
    }

    public static int b()
    {
        return 2;
    }

    public static void b(Context context)
    {
        context = GoWidgetApplication.c(context).a().edit();
        a(context);
        b(((android.content.SharedPreferences.Editor) (context)));
        context.commit();
    }

    private static void b(android.content.SharedPreferences.Editor editor)
    {
        editor.putInt("widget42_to_detail", 0);
        editor.putInt("widget41_to_detail", 0);
        editor.putInt("widget21_to_detail", 0);
        editor.putInt("widget11_to_detail", 0);
        editor.putInt("appwidget42_to_detail", 0);
        editor.putInt("appwidget41_to_detail", 0);
        editor.putInt("appwidget21_to_detail", 0);
        editor.putInt("count_share_screenshot", 0);
        editor.putInt("count_share_camera", 0);
        editor.putInt("user_behavior_houly", 0);
        editor.putInt("user_behavior_houly_graph", 0);
        editor.putInt("user_behavior_daily", 0);
        editor.putInt("user_behavior_daily_graph", 0);
        editor.putInt("user_behavior_wind", 0);
        editor.putInt("user_behavior_wind_graph", 0);
        editor.putInt("user_behavior_rain", 0);
        editor.putInt("user_behavior_rain_graph", 0);
        editor.putInt("user_behavior_maps", 0);
        editor.putInt("user_behavior_theme", 0);
        editor.putInt("user_behavior_edit_city", 0);
        editor.putInt("user_behavior_setting", 0);
        editor.putInt("user_behavior_feedback", 0);
        editor.putInt("user_behavior_msg_center", 0);
        editor.putInt("user_behavior_apps_recommend", 0);
        editor.putInt("user_behavior_widget_theme", 0);
        editor.putInt("count_send_feedback", 0);
        editor.putInt("maps_tab_radar", 0);
        editor.putInt("map_tab_satellite", 0);
        editor.putInt("maps_tab_map_detail", 0);
        editor.putInt("key_gowidget_theme_switcher_click", 0);
        editor.putInt("key_home_open_sidebar", 0);
        editor.putInt("weather_warning_list_show", 0);
        editor.putInt("weather_warning_detail_show", 0);
        editor.putInt("weather_warning_notify_click", 0);
        editor.putInt("weather_warning_application_click", 0);
    }

    private static void b(String s1, SharedPreferences sharedpreferences, String s2, int i1, StringBuffer stringbuffer)
    {
        int j1 = sharedpreferences.getInt(s2, 0);
        if (j1 != 0)
        {
            stringbuffer.append(s1).append(i1).append("||").append(j1).append("\r\n");
        }
    }

    private static void b(StringBuffer stringbuffer, Context context, SharedPreferences sharedpreferences)
    {
        boolean flag = true;
        String s1 = a(context, sharedpreferences);
        a(s1, sharedpreferences.getInt("widget42_to_detail", 0) + 0 + sharedpreferences.getInt("widget41_to_detail", 0) + sharedpreferences.getInt("widget21_to_detail", 0) + sharedpreferences.getInt("widget11_to_detail", 0), 1, stringbuffer);
        a(s1, sharedpreferences.getInt("appwidget42_to_detail", 0) + 0 + sharedpreferences.getInt("appwidget41_to_detail", 0) + sharedpreferences.getInt("appwidget21_to_detail", 0), 2, stringbuffer);
        b(s1, sharedpreferences, "count_share_screenshot", 3, stringbuffer);
        b(s1, sharedpreferences, "count_share_camera", 4, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_houly", 5, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_houly_graph", 6, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_daily", 7, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_daily_graph", 8, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_wind", 9, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_wind_graph", 10, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_rain", 11, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_rain_graph", 12, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_theme", 13, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_edit_city", 14, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_setting", 15, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_feedback", 16, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_msg_center", 17, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_apps_recommend", 18, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_widget_theme", 19, stringbuffer);
        b(s1, sharedpreferences, "count_send_feedback", 20, stringbuffer);
        b(s1, sharedpreferences, "weather_warning_notify_click", 21, stringbuffer);
        b(s1, sharedpreferences, "weather_warning_application_click", 22, stringbuffer);
        b(s1, sharedpreferences, "weather_warning_list_show", 23, stringbuffer);
        b(s1, sharedpreferences, "weather_warning_detail_show", 24, stringbuffer);
        b(s1, sharedpreferences, "user_behavior_maps", 25, stringbuffer);
        b(s1, sharedpreferences, "maps_tab_radar", 26, stringbuffer);
        b(s1, sharedpreferences, "map_tab_satellite", 27, stringbuffer);
        b(s1, sharedpreferences, "maps_tab_map_detail", 29, stringbuffer);
        b(s1, sharedpreferences, "key_gowidget_theme_switcher_click", 31, stringbuffer);
        b(s1, sharedpreferences, "key_home_open_sidebar", 32, stringbuffer);
        Object obj = com.gau.go.launcherex.gowidget.weather.c.c.a(context.getApplicationContext());
        int i1 = ((com.gau.go.launcherex.gowidget.weather.c.c) (obj)).h().c().size();
        if (i1 >= 1)
        {
            if (i1 == 1)
            {
                a(s1, 1, 200, stringbuffer);
            } else
            if (i1 <= 4)
            {
                a(s1, 1, 201, stringbuffer);
            } else
            if (i1 <= 9)
            {
                a(s1, 1, 202, stringbuffer);
            }
        }
        obj = ((com.gau.go.launcherex.gowidget.weather.c.c) (obj)).f().a();
        a(s1, ((u) (obj)).l, 211, stringbuffer);
        a(s1, ((u) (obj)).s, 212, stringbuffer);
        a(s1, ((u) (obj)).m, 213, stringbuffer);
        a(s1, ((u) (obj)).b, 214, stringbuffer);
        a(s1, sharedpreferences, "count_gowidget_11", 215, stringbuffer);
        a(s1, sharedpreferences, "count_gowidget_21", 216, stringbuffer);
        a(s1, sharedpreferences, "count_gowidget_41", 217, stringbuffer);
        a(s1, sharedpreferences, "count_gowidget_42", 218, stringbuffer);
        if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget21Provider)).length > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        a(s1, i1, 219, stringbuffer);
        if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget41Provider)).length > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        a(s1, i1, 220, stringbuffer);
        if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget42Provider)).length > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        a(s1, i1, 221, stringbuffer);
        if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays41Provider)).length > 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        a(s1, i1, 222, stringbuffer);
        if (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays42Provider)).length > 0)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        a(s1, i1, 223, stringbuffer);
        a(s1, sharedpreferences, "count_gowidget_days_41", 224, stringbuffer);
        a(s1, sharedpreferences, "count_gowidget_days_42", 225, stringbuffer);
    }

    public static String c()
    {
        return UUID.randomUUID().toString();
    }

    public static String c(Context context)
    {
        Object obj = context.getPackageManager();
        try
        {
            obj = ((PackageManager) (obj)).getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return "";
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        context = ((Context) (obj));
        if (((String) (obj)).length() >= 0)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        context = "";
        return context;
    }

    public static String d(Context context)
    {
        String s1;
        String s2;
        s2 = y(context);
        s1 = s2;
        if (s2 == null) goto _L2; else goto _L1
_L1:
        s1 = s2;
        if (!s2.equals("0000000000000000")) goto _L2; else goto _L3
_L3:
        long l1 = SystemClock.elapsedRealtime();
        long l2 = Math.abs((new Random()).nextLong());
        l1 += l2;
        a(context, l1);
_L5:
        s1 = String.valueOf(l1);
_L2:
        return s1;
        context;
_L6:
        context.printStackTrace();
        if (true) goto _L5; else goto _L4
_L4:
        context;
          goto _L6
    }

    public static int e(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        int i1;
        try
        {
            i1 = packagemanager.getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return 0;
        }
        return i1;
    }

    public static String f(Context context)
    {
        Object obj;
        Object obj1;
        InputStream inputstream;
        if (!TextUtils.isEmpty(a))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        inputstream = context.getResources().openRawResource(0x7f060027);
        obj = null;
        obj1 = null;
        context = new BufferedReader(new InputStreamReader(inputstream, "UTF-8"));
        obj = context;
        a = context.readLine();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        context.close();
        if (inputstream != null)
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
        }
_L1:
        return a;
        obj1;
        context = null;
_L5:
        obj = context;
        ((UnsupportedEncodingException) (obj1)).printStackTrace();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        context.close();
        if (inputstream != null)
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
        }
          goto _L1
        obj;
        context = ((Context) (obj1));
        obj1 = obj;
_L4:
        obj = context;
        ((IOException) (obj1)).printStackTrace();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        context.close();
        if (inputstream != null)
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
        }
          goto _L1
        context;
_L3:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        ((BufferedReader) (obj)).close();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        throw context;
        context;
        if (true) goto _L3; else goto _L2
_L2:
        obj1;
          goto _L4
        obj1;
          goto _L5
    }

    public static String g(Context context)
    {
        Object obj;
        Object obj1;
        InputStream inputstream;
        if (!TextUtils.isEmpty(b))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        inputstream = context.getResources().openRawResource(0x7f060025);
        obj = null;
        obj1 = null;
        context = new BufferedReader(new InputStreamReader(inputstream, "UTF-8"));
        obj = context;
        b = context.readLine();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        context.close();
        if (inputstream != null)
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
        }
_L1:
        return b;
        obj1;
        context = null;
_L5:
        obj = context;
        ((UnsupportedEncodingException) (obj1)).printStackTrace();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        context.close();
        if (inputstream != null)
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
        }
          goto _L1
        obj;
        context = ((Context) (obj1));
        obj1 = obj;
_L4:
        obj = context;
        ((IOException) (obj1)).printStackTrace();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        context.close();
        if (inputstream != null)
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
        }
          goto _L1
        context;
_L3:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        ((BufferedReader) (obj)).close();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        throw context;
        context;
        if (true) goto _L3; else goto _L2
_L2:
        obj1;
          goto _L4
        obj1;
          goto _L5
    }

    public static boolean h(Context context)
    {
        return f(context).equals("200");
    }

    public static boolean i(Context context)
    {
        String s1;
        String as[];
        int i1;
        s1 = f(context);
        as = context.getResources().getStringArray(0x7f0d0001);
        i1 = 0;
_L3:
        if (i1 >= as.length)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        if (!s1.equals(as[i1])) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        i1++;
          goto _L3
        context = context.getResources().getStringArray(0x7f0d0000);
        int j1 = 0;
        while (j1 < context.length) 
        {
            if (s1.equals(context[j1]))
            {
                return true;
            }
            j1++;
        }
          goto _L1
    }

    public static String j(Context context)
    {
        return String.format("%s_%s", new Object[] {
            context.getResources().getConfiguration().locale.getLanguage(), n(context)
        }).toLowerCase(Locale.US);
    }

    public static String k(Context context)
    {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    public static String l(Context context)
    {
        com.gau.go.launcherex.gowidget.language.e e1 = com.gau.go.launcherex.gowidget.language.e.a(context);
        if (e1 != null)
        {
            context = e1.b();
        } else
        {
            context = context.getApplicationContext().getResources().getConfiguration().locale.getLanguage();
        }
        return context.toLowerCase(Locale.US);
    }

    public static String m(Context context)
    {
        com.gau.go.launcherex.gowidget.language.e e1 = com.gau.go.launcherex.gowidget.language.e.a(context);
        if (e1 != null)
        {
            context = e1.e();
        } else
        {
            context = context.getApplicationContext().getResources().getConfiguration().locale.getCountry();
        }
        return context.toLowerCase(Locale.US);
    }

    public static String n(Context context)
    {
        return com.gau.go.launcherex.gowidget.billing.p.a(context);
    }

    public static boolean o(Context context)
    {
_L2:
        return false;
        if (i(context) || context == null) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = (TelephonyManager)context.getSystemService("phone");
        boolean flag;
        if (((TelephonyManager) (obj)).getSimState() != 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = ((TelephonyManager) (obj)).getSimOperator();
        if (!flag && !TextUtils.isEmpty(((CharSequence) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (com.gau.go.launcherex.gowidget.weather.util.r.a(context) != 1) goto _L2; else goto _L3
_L3:
        return true;
        if (!((String) (obj)).startsWith("460")) goto _L2; else goto _L4
_L4:
        return true;
    }

    public static boolean p(Context context)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (context != null)
        {
            context = com.gau.go.launcherex.gowidget.billing.p.a(context);
            flag = flag1;
            if (context != null)
            {
                flag = flag1;
                if (context.equalsIgnoreCase("CN"))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static String q(Context context)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        int i1 = displaymetrics.widthPixels;
        int j1 = displaymetrics.heightPixels;
        return (new StringBuilder()).append(i1).append("_").append(j1).toString();
    }

    public static String r(Context context)
    {
label0:
        {
            context = (TelephonyManager)context.getSystemService("phone");
            String s1;
            boolean flag;
            if (context.getSimState() != 5)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            s1 = context.getSimOperator();
            if (!flag)
            {
                context = s1;
                if (!TextUtils.isEmpty(s1))
                {
                    break label0;
                }
            }
            context = "";
        }
        return context;
    }

    public static boolean s(Context context)
    {
        return a(context, "com.android.vending");
    }

    public static boolean t(Context context)
    {
        return !o(context) && s(context);
    }

    public static int u(Context context)
    {
        if (com.gau.go.launcherex.gowidget.c.g.a(context))
        {
            context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (context != null)
            {
                if (context.getType() == 1)
                {
                    return 1;
                }
                if (context.getType() == 0)
                {
                    return 2;
                }
            }
        }
        return 0;
    }

    public static String v(Context context)
    {
        return android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String w(Context context)
    {
        try
        {
            context = AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return "";
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return "";
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return "";
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return "";
        }
        return context;
    }

    public static String x(Context context)
    {
        StringBuffer stringbuffer = new StringBuffer();
        context = context.getResources().getDisplayMetrics();
        stringbuffer.append(Math.min(((DisplayMetrics) (context)).widthPixels, ((DisplayMetrics) (context)).heightPixels));
        stringbuffer.append("*");
        stringbuffer.append(Math.max(((DisplayMetrics) (context)).widthPixels, ((DisplayMetrics) (context)).heightPixels));
        return stringbuffer.toString();
    }

    private static String y(Context context)
    {
        return context.getSharedPreferences("randomdeviceid", 0).getString("random_device_id", "0000000000000000");
    }
}
