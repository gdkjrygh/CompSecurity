// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme;

import android.appwidget.AppWidgetManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.c.g;
import com.gau.go.launcherex.gowidget.language.e;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gau.go.launcherex.gowidget.weather.globaltheme.c.c;
import com.gau.go.launcherex.gowidget.weather.model.ThemeDataBean;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget21Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget41Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidget42Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetDays41Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetDays42Provider;
import com.gau.go.launcherex.gowidget.weather.systemwidget.AppWidgetWorldClock42Provider;
import com.gtp.go.weather.sharephoto.d.h;
import com.gtp.go.weather.sharephoto.x;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class a
{

    private static final List a;

    public static android.graphics.Bitmap.CompressFormat a(Resources resources, int k)
    {
label0:
        {
            android.graphics.Bitmap.CompressFormat compressformat = android.graphics.Bitmap.CompressFormat.PNG;
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(resources, k, options);
            if (!options.outMimeType.equalsIgnoreCase("image/jpeg"))
            {
                resources = compressformat;
                if (!options.outMimeType.equalsIgnoreCase("image/bmp"))
                {
                    break label0;
                }
            }
            resources = android.graphics.Bitmap.CompressFormat.JPEG;
        }
        return resources;
    }

    public static Drawable a(Context context, b b1)
    {
        Object obj2 = null;
        Object obj = null;
        Object obj1 = obj;
        if (b1 != null)
        {
            if (context == null)
            {
                obj1 = obj;
            } else
            {
                Drawable drawable = obj2;
                if (b1.B())
                {
                    drawable = obj2;
                    if (b1.C() != -1)
                    {
                        drawable = context.getResources().getDrawable(b1.C());
                    }
                }
                obj1 = drawable;
                if (drawable == null)
                {
                    if (com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(b1.x()))
                    {
                        b1 = new com.gtp.go.weather.sharephoto.d.b(context);
                        obj1 = new android.graphics.BitmapFactory.Options();
                        obj1.inSampleSize = 3;
                        b1.a(((android.graphics.BitmapFactory.Options) (obj1)));
                        b1 = com.gtp.go.weather.sharephoto.d.h.a(context, x.a, b1);
                        obj1 = drawable;
                        if (b1 != null)
                        {
                            return new BitmapDrawable(context.getResources(), b1);
                        }
                    } else
                    {
                        return a(context, b1.x());
                    }
                }
            }
        }
        return ((Drawable) (obj1));
    }

    public static Drawable a(Context context, String s)
    {
        return b(context, s, "z_theme_preview");
    }

    public static Drawable a(Context context, String s, String s1)
    {
        Object obj = null;
        try
        {
            context = context.createPackageContext(s, 2).getResources();
            context = context.getDrawable(context.getIdentifier(s1, "drawable", s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            context = obj;
            if (com.gtp.a.a.b.c.a())
            {
                s.printStackTrace();
                return null;
            }
        }
        return context;
    }

    private static void a(Context context, int k)
    {
        Toast.makeText(context, k, 1).show();
    }

    public static void a(Context context, ThemeDataBean themedatabean)
    {
        if (!com.gau.go.launcherex.gowidget.c.g.a(context))
        {
            a(context, 0x7f0804c4);
            return;
        }
        if (!TextUtils.isEmpty(themedatabean.d()))
        {
            String s;
            if (TextUtils.isEmpty(themedatabean.b()))
            {
                s = (new StringBuilder()).append(context.getText(0x7f0804c2).toString()).append(themedatabean.a()).toString();
            } else
            {
                s = themedatabean.b();
            }
            com.gau.go.launcherex.gowidget.download.b.a(context, (new StringBuilder()).append(s).append(".apk").toString(), themedatabean.d(), themedatabean.a(), themedatabean.c());
            return;
        }
        if (!TextUtils.isEmpty(themedatabean.e()) && w.s(context))
        {
            themedatabean = new Intent("android.intent.action.VIEW", Uri.parse(themedatabean.e().trim()));
            try
            {
                themedatabean.setPackage("com.android.vending");
                themedatabean.setFlags(0x10000000);
                context.startActivity(themedatabean);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
            return;
        }
        if (!TextUtils.isEmpty(themedatabean.g()))
        {
            d(context, themedatabean.g());
            return;
        }
        if (!TextUtils.isEmpty(themedatabean.f()))
        {
            d(context, themedatabean.f());
            return;
        } else
        {
            a(context, 0x7f0804c5);
            return;
        }
    }

    public static void a(b b1, Context context)
    {
        b1.c(e(b1.x(), context));
        String s = f(context, b1.x(), "categoryType");
        byte byte0 = -1;
        int k = byte0;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                k = Integer.valueOf(s).intValue();
            }
            catch (NumberFormatException numberformatexception)
            {
                k = byte0;
                if (com.gtp.a.a.b.c.a())
                {
                    numberformatexception.printStackTrace();
                    k = byte0;
                }
            }
        }
        b1.b(k);
        if (b1.p() == 3)
        {
            b1.d(j(b1.x(), context));
        }
        if ("true".equals(f(context, b1.x(), "couponSupport")))
        {
            b1.b(true);
        } else
        {
            b1.b(false);
        }
        if ("false".equals(f(context, b1.x(), "animationSupport")))
        {
            b1.c(false);
            return;
        } else
        {
            b1.b(true);
            return;
        }
    }

    public static boolean a(Context context)
    {
        while (AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget21Provider)).length > 0 || AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget41Provider)).length > 0 || AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidget42Provider)).length > 0 || AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays41Provider)).length > 0 || AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetDays42Provider)).length > 0 || AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, com/gau/go/launcherex/gowidget/weather/systemwidget/AppWidgetWorldClock42Provider)).length > 0) 
        {
            return true;
        }
        return false;
    }

    public static boolean a(Context context, Class class1)
    {
        int k = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, class1)).length;
        com.gtp.a.a.b.c.a("appwidget", (new StringBuilder()).append("isExist[").append(class1.getSimpleName()).append("] - ").append("[").append(k).append("]").toString());
        return k > 0;
    }

    public static boolean a(b b1)
    {
        if (b1 != null && b1.D())
        {
            b b2 = com.gau.go.launcherex.gowidget.weather.globaltheme.c.c.a(b1.x(), a);
            if (b2 != null && b2.y() > b1.y())
            {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String s)
    {
        while (s.equals("com.mediawoz.goweather.htcstyle") || s.equals("com.gau.go.weatherex.systemwidgetskin.defaultskin")) 
        {
            return true;
        }
        return false;
    }

    public static boolean a(String s, Context context)
    {
        if (a(s))
        {
            return true;
        }
        context = context.getPackageManager();
        Intent intent = new Intent("com.gau.go.weatherex.theme.systemwidget");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("com.gau.go.weatherex.systemwidget.category.DEFAULT");
        context = context.queryIntentActivities(intent, 0);
        int l = context.size();
        for (int k = 0; k < l; k++)
        {
            if (s.equals(((ResolveInfo)context.get(k)).activityInfo.packageName))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean a(String s, boolean flag, Context context)
    {
        boolean flag2 = true;
        String s1 = com.gau.go.launcherex.gowidget.c.g.a((new StringBuilder()).append(s).append(w.v(context)).toString());
        Object obj;
        boolean flag1;
        if (w.a())
        {
            obj = new File(com.gtp.a.a.c.c.a(), (new StringBuilder()).append(".sys/l/l/i/b").append(File.separator).append(s1).toString());
            if (flag)
            {
                if (!((File) (obj)).exists())
                {
                    try
                    {
                        ((File) (obj)).getParentFile().mkdirs();
                        flag1 = ((File) (obj)).createNewFile();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        ((IOException) (obj)).printStackTrace();
                        flag1 = false;
                    }
                } else
                {
                    flag1 = true;
                }
            } else
            if (((File) (obj)).exists())
            {
                flag1 = ((File) (obj)).delete();
            } else
            {
                flag1 = true;
            }
        } else
        {
            flag1 = false;
        }
        obj = new File(context.getFilesDir(), s1);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!((File) (obj)).exists())
        {
            try
            {
                ((File) (obj)).createNewFile();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
                flag1 = false;
                continue; /* Loop/switch isn't completed */
            }
            flag1 = flag2;
        }
_L7:
        s = context.createPackageContext(s, 2).getSharedPreferences(com.gau.go.launcherex.gowidget.c.g.a("goweatherex_theme_paid_info_shared_preferences"), 2).edit();
        if (!flag) goto _L4; else goto _L3
_L3:
        s.putInt(s1, 1);
_L5:
        s.commit();
        return flag1;
_L2:
        flag1 = flag2;
        if (((File) (obj)).exists())
        {
            flag1 = ((File) (obj)).delete();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        s.remove(s1);
          goto _L5
        s;
        s.printStackTrace();
        return flag1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static Drawable b(Context context, String s, String s1)
    {
        try
        {
            Resources resources = context.createPackageContext(s, 2).getResources();
            int k = resources.getIdentifier(s1, "drawable", s);
            if (a(resources, k) == android.graphics.Bitmap.CompressFormat.JPEG)
            {
                s = new android.graphics.BitmapFactory.Options();
                s.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeResource(resources, k, s));
            }
            context = resources.getDrawable(k);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            if (com.gtp.a.a.b.c.a())
            {
                context.printStackTrace();
            }
            return null;
        }
        return context;
    }

    public static String b(Context context, String s)
    {
        Object obj;
        Configuration configuration;
        try
        {
            obj = context.createPackageContext(s, 2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        obj = ((Context) (obj)).getResources();
        context = com.gau.go.launcherex.gowidget.language.e.a(context);
        context = new Locale(context.b(), context.e());
        configuration = ((Resources) (obj)).getConfiguration();
        configuration.locale = context;
        ((Resources) (obj)).updateConfiguration(configuration, ((Resources) (obj)).getDisplayMetrics());
        try
        {
            context = ((Resources) (obj)).getString(((Resources) (obj)).getIdentifier("theme_app_name", "string", s));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return context;
    }

    public static boolean b(Context context, b b1)
    {
        return b1.B() || w.e(context) >= b1.r();
    }

    public static boolean b(String s)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (((b)iterator.next()).x().equals(s))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean b(String s, Context context)
    {
        context = context.getPackageManager();
        Intent intent = new Intent("com.gau.go.weatherex.theme.apptheme");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("com.gau.go.weatherex.app.category.DEFAULT");
        context = context.queryIntentActivities(intent, 0);
        int l = context.size();
        for (int k = 0; k < l; k++)
        {
            if (s.equals(((ResolveInfo)context.get(k)).activityInfo.packageName))
            {
                return true;
            }
        }

        return false;
    }

    public static int[] b(Context context, Class class1)
    {
        class1 = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, class1));
        context = class1;
        if (class1 == null)
        {
            context = new int[0];
        }
        return context;
    }

    public static ThemeDataBean c(String s, Context context)
    {
        Object obj = context.getPackageManager();
        Intent intent = new Intent("com.gau.go.weatherex.theme.livewallpaper");
        intent.addCategory("android.intent.category.DEFAULT");
        obj = ((PackageManager) (obj)).queryIntentActivities(intent, 0);
        int l = ((List) (obj)).size();
        for (int k = 0; k < l; k++)
        {
            if (s.equals(((ResolveInfo)((List) (obj)).get(k)).activityInfo.packageName))
            {
                s = d(s, context);
                s.g(3);
                s.a(true);
                return s;
            }
        }

        return null;
    }

    public static String c(Context context, String s)
    {
        Object obj;
        Configuration configuration;
        try
        {
            obj = context.createPackageContext(s, 2);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        obj = ((Context) (obj)).getResources();
        context = com.gau.go.launcherex.gowidget.language.e.a(context);
        context = new Locale(context.b(), context.e());
        configuration = ((Resources) (obj)).getConfiguration();
        configuration.locale = context;
        ((Resources) (obj)).updateConfiguration(configuration, ((Resources) (obj)).getDisplayMetrics());
        try
        {
            context = ((Resources) (obj)).getString(((Resources) (obj)).getIdentifier("theme_name", "string", s));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return context;
    }

    public static String c(Context context, String s, String s1)
    {
        String s2 = "0";
        try
        {
            context = context.createPackageContext(s, 2).getResources();
            context = context.getString(context.getIdentifier(s1, "string", s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            context = s2;
            if (com.gtp.a.a.b.c.a())
            {
                s.printStackTrace();
                return "0";
            }
        }
        return context;
    }

    public static ThemeDataBean d(String s, Context context)
    {
        String s2;
        String s3;
        String s5;
        ThemeDataBean themedatabean;
        themedatabean = new ThemeDataBean();
        s5 = "0.0";
        s3 = c(context, s);
        s2 = s3;
        PackageInfo packageinfo = context.getPackageManager().getPackageInfo(s, 1);
        String s1;
        s1 = s3;
        if (s3 != null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        s2 = s3;
        s1 = packageinfo.applicationInfo.loadLabel(context.getPackageManager()).toString();
        s2 = s1;
        int k = packageinfo.versionCode;
        s2 = packageinfo.versionName;
_L2:
        String s4 = s1;
        if (TextUtils.isEmpty(s1))
        {
            s4 = context.getString(0x7f0804c2);
        }
        themedatabean.e(s);
        themedatabean.a(s4);
        themedatabean.d(s2);
        themedatabean.d(k);
        themedatabean.f(e(s, context));
        return themedatabean;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        k = -1;
        s1 = s2;
_L3:
        namenotfoundexception.printStackTrace();
        s2 = s5;
        if (true) goto _L2; else goto _L1
_L1:
        namenotfoundexception;
          goto _L3
    }

    public static boolean d(Context context, String s)
    {
        if (context != null && s != null && !"".equals(s.trim()))
        {
            if ((s = Uri.parse(s)) != null)
            {
                s = new Intent("android.intent.action.VIEW", s);
                s.setFlags(0x10000000);
                try
                {
                    context.startActivity(s);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    context.printStackTrace();
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static String[] d(Context context, String s, String s1)
    {
        Object obj = null;
        try
        {
            context = context.createPackageContext(s, 2).getResources();
            context = context.getStringArray(context.getIdentifier(s1, "array", s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            context = obj;
            if (com.gtp.a.a.b.c.a())
            {
                s.printStackTrace();
                return null;
            }
        }
        return context;
    }

    public static int e(String s, Context context)
    {
        int k = 0;
        try
        {
            s = context.getPackageManager().getActivityInfo(new ComponentName(s, "com.gau.go.weatherex.framework.ForSearch"), 129).metaData;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return 0;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        k = s.getInt("minGoWeatherEx", 0);
        return k;
    }

    public static void e(Context context, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            context.startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", s, null)));
            return;
        }
    }

    public static int[] e(Context context, String s, String s1)
    {
        Object obj = null;
        try
        {
            context = context.createPackageContext(s, 2).getResources();
            context = context.getIntArray(context.getIdentifier(s1, "array", s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            context = obj;
            if (com.gtp.a.a.b.c.a())
            {
                s.printStackTrace();
                return null;
            }
        }
        return context;
    }

    public static String f(Context context, String s, String s1)
    {
        Object obj = null;
        try
        {
            context = context.createPackageContext(s, 2).getResources();
            context = context.getString(context.getIdentifier(s1, "string", s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            context = obj;
            if (com.gtp.a.a.b.c.a())
            {
                s.printStackTrace();
                return null;
            }
        }
        return context;
    }

    public static boolean f(String s, Context context)
    {
        int k;
        int l;
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        context = context.getPackageManager();
        Intent intent = new Intent("com.gau.go.weatherex.theme.apptheme");
        intent.addCategory("android.intent.category.DEFAULT");
        context = context.queryIntentActivities(intent, 0);
        l = context.size();
        k = 0;
_L3:
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (!s.equals(((ResolveInfo)context.get(k)).activityInfo.packageName)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        k++;
          goto _L3
        flag = false;
          goto _L4
    }

    public static boolean g(String s, Context context)
    {
        int k;
        int l;
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        context = context.getPackageManager();
        Intent intent = new Intent("com.gau.go.weatherex.theme.livewallpaper");
        intent.addCategory("android.intent.category.DEFAULT");
        context = context.queryIntentActivities(intent, 0);
        l = context.size();
        k = 0;
_L3:
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (!s.equals(((ResolveInfo)context.get(k)).activityInfo.packageName)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        k++;
          goto _L3
        flag = false;
          goto _L4
    }

    public static boolean h(String s, Context context)
    {
        int k;
        int l;
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        context = context.getPackageManager();
        Intent intent = new Intent("com.gau.go.weatherex.theme.systemwidget");
        intent.addCategory("android.intent.category.DEFAULT");
        context = context.queryIntentActivities(intent, 0);
        l = context.size();
        k = 0;
_L3:
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (!s.equals(((ResolveInfo)context.get(k)).activityInfo.packageName)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        k++;
          goto _L3
        flag = false;
          goto _L4
    }

    public static boolean i(String s, Context context)
    {
        int k;
        int l;
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        context = context.getPackageManager();
        Intent intent = new Intent("com.gau.go.weatherex.theme.gowidget");
        intent.addCategory("android.intent.category.DEFAULT");
        context = context.queryIntentActivities(intent, 0);
        l = context.size();
        k = 0;
_L3:
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        if (!s.equals(((ResolveInfo)context.get(k)).activityInfo.packageName)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        k++;
          goto _L3
        flag = false;
          goto _L4
    }

    public static boolean j(String s, Context context)
    {
        String s1 = com.gau.go.launcherex.gowidget.c.g.a((new StringBuilder()).append(s).append(w.v(context)).toString());
        int k;
        boolean flag;
        boolean flag1;
        if (w.a() && (new File(com.gtp.a.a.c.c.a(), (new StringBuilder()).append(".sys/l/l/i/b").append(File.separator).append(s1).toString())).exists())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            flag1 = (new File(context.getFilesDir(), s1)).exists();
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        k = context.createPackageContext(s, 2).getSharedPreferences(com.gau.go.launcherex.gowidget.c.g.a("goweatherex_theme_paid_info_shared_preferences"), 2).getInt(s1, -1);
        return k == 1;
        s;
        s.printStackTrace();
        return flag1;
    }

    static 
    {
        a = new ArrayList();
        b b1 = new b();
        b1.c("com.gau.go.weatherex.theme.gowidget.jokulskin");
        b1.e(3);
        b1.d("1.2");
        a.add(b1);
        b1 = new b();
        b1.c("com.gau.go.weatherex.theme.gowidget.outerspaceskin");
        b1.e(5);
        b1.d("1.3");
        a.add(b1);
        b1 = new b();
        b1.c("com.gau.go.weatherex.theme.gowidget.purplenightskin");
        b1.e(6);
        b1.d("1.3");
        a.add(b1);
        b1 = new b();
        b1.c("com.gau.go.weatherex.theme.appbilling.gowidget.quietlyelegantskin");
        b1.e(3);
        b1.d("1.1");
        a.add(b1);
        b1 = new b();
        b1.c("com.gau.go.weatherex.theme.gowidget.silenceskin");
        b1.e(4);
        b1.d("1.3");
        a.add(b1);
        b1 = new b();
        b1.c("com.gau.go.weatherex.theme.gowidget.springskin");
        b1.e(4);
        b1.d("1.3");
        a.add(b1);
        b1 = new b();
        b1.c("com.gau.go.weatherex.theme.gowidget.starpathskin");
        b1.e(3);
        b1.d("1.2");
        a.add(b1);
        b1 = new b();
        b1.c("com.gau.go.weatherex.theme.gowidget.stoneenergyskin");
        b1.e(5);
        b1.d("1.3");
        a.add(b1);
        b1 = new b();
        b1.c("com.gau.go.weatherex.theme.gowidget.universeskin");
        b1.e(3);
        b1.d("1.2");
        a.add(b1);
        b1 = new b();
        b1.c("com.gau.go.weatherex.theme.gowidget.blacktransparentskin");
        b1.e(4);
        b1.d("1.3");
        a.add(b1);
        b1 = new b();
        b1.c("com.gau.go.weatherex.theme.gowidget.christmasskin");
        b1.e(5);
        b1.d("1.4");
        a.add(b1);
        b1 = new b();
        b1.c("com.gau.go.launcherex.goweatherex.theme.futureworld");
        b1.e(4);
        b1.d("1.3");
        a.add(b1);
        b1 = new b();
        b1.c("com.gau.go.weatherex.theme.gowidget.quietlyelegantskin");
        b1.e(2);
        b1.d("1.1");
        a.add(b1);
        b1 = new b();
        b1.c("com.gau.go.weatherex.theme.gowidget.quietlyelegantskinfree");
        b1.e(3);
        b1.d("1.2");
        a.add(b1);
    }
}
