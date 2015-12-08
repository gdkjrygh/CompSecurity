// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.globaltheme.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.weather.globaltheme.a;
import com.gau.go.launcherex.gowidget.weather.globaltheme.b.b;
import com.gau.go.launcherex.gowidget.weather.util.n;
import com.gtp.go.weather.sharephoto.d.h;
import com.gtp.go.weather.sharephoto.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
{

    private static long a(PackageInfo packageinfo)
    {
        long l = -1L;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            l = packageinfo.firstInstallTime;
        }
        return l;
    }

    public static b a(Context context)
    {
        Resources resources = context.getResources();
        b b1 = new b();
        b1.a(resources.getString(0x7f08002c));
        b1.b(resources.getString(0x7f0804a3));
        b1.b(1);
        b1.f(-1);
        b1.g(-1);
        b1.c("com.gtp.go.weather.phototheme");
        b1.p(true);
        b1.o(true);
        b1.q(true);
        b1.r(true);
        b1.a(0x7fffffffffffffffL);
        b1.b(0x7fffffffffffffffL);
        com.gtp.go.weather.sharephoto.d.b b2 = new com.gtp.go.weather.sharephoto.d.b(context);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = 3;
        b2.a(options);
        context = h.a(context, x.a, b2);
        if (context != null)
        {
            b1.a(new BitmapDrawable(resources, context));
        }
        b1.a(android.widget.ImageView.ScaleType.CENTER_CROP);
        return b1;
    }

    public static b a(Context context, String s, Resources resources)
    {
        b b1;
label0:
        {
            b1 = null;
            if (!TextUtils.isEmpty(s))
            {
                b1 = a(s, context, resources);
                if (b1 == null)
                {
                    break label0;
                }
                resources = context.getPackageManager();
                Object obj = new Intent("com.gau.go.weatherex.theme.apptheme");
                ((Intent) (obj)).addCategory("android.intent.category.DEFAULT");
                obj = resources.queryIntentActivities(((Intent) (obj)), 0).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    if (!s.equals(((ResolveInfo)((Iterator) (obj)).next()).activityInfo.packageName))
                    {
                        continue;
                    }
                    b1.o(true);
                    if (b1.p() == -1)
                    {
                        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(b1.x(), context))
                        {
                            b1.b(1);
                        } else
                        {
                            b1.b(2);
                        }
                    }
                    break;
                } while (true);
                obj = new Intent("com.gau.go.weatherex.theme.livewallpaper");
                ((Intent) (obj)).addCategory("android.intent.category.DEFAULT");
                obj = resources.queryIntentActivities(((Intent) (obj)), 0).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    if (!s.equals(((ResolveInfo)((Iterator) (obj)).next()).activityInfo.packageName))
                    {
                        continue;
                    }
                    b1.p(true);
                    if (b1.p() == -1)
                    {
                        if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(b1.x(), context))
                        {
                            b1.b(1);
                        } else
                        {
                            b1.b(2);
                        }
                    }
                    break;
                } while (true);
                obj = new Intent("com.gau.go.weatherex.theme.gowidget");
                ((Intent) (obj)).addCategory("android.intent.category.DEFAULT");
                obj = resources.queryIntentActivities(((Intent) (obj)), 0).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    if (!s.equals(((ResolveInfo)((Iterator) (obj)).next()).activityInfo.packageName))
                    {
                        continue;
                    }
                    b1.s(true);
                    if (b1.p() == -1)
                    {
                        b1.b(1);
                    }
                    b(context, b1);
                    a(context, b1);
                    b1.a(n.a(context, b1.x()));
                    break;
                } while (true);
                obj = new Intent("com.gau.go.weatherex.theme.systemwidget");
                ((Intent) (obj)).addCategory("android.intent.category.DEFAULT");
                resources = resources.queryIntentActivities(((Intent) (obj)), 0).iterator();
                do
                {
                    if (!resources.hasNext())
                    {
                        break label0;
                    }
                } while (!s.equals(((ResolveInfo)resources.next()).activityInfo.packageName));
                b1.t(true);
                if (b1.p() == -1)
                {
                    if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(b1.x(), context))
                    {
                        b1.b(1);
                    } else
                    {
                        b1.b(2);
                    }
                }
                a(context, b1);
            }
            return b1;
        }
        return b1;
    }

    public static b a(Resources resources)
    {
        b b1 = new b();
        b1.a(resources.getString(0x7f08002c));
        b1.b(resources.getString(0x7f0804c3));
        b1.b(1);
        b1.f(0x7f020309);
        b1.g(0x7f0205b7);
        b1.c("com.gau.go.launcherex.gowidget.weatherwidget");
        b1.p(true);
        b1.o(true);
        b1.q(true);
        b1.r(true);
        b1.c(false);
        b1.a(0x7fffffffffffffffL);
        b1.b(0x7fffffffffffffffL);
        b1.a(resources.getDrawable(0x7f0205b7));
        return b1;
    }

    public static b a(Resources resources, String s, String s1)
    {
        b b1 = new b();
        b1.t(true);
        b1.b(1);
        b1.a(resources.getString(0x7f08002c));
        b1.c(s);
        b1.q(true);
        b1.r(true);
        b1.a(0x7fffffffffffffffL);
        b1.b(0x7fffffffffffffffL);
        b1.h(true);
        b1.i(true);
        b1.j(true);
        b1.k(true);
        b1.l(true);
        b1.n(false);
        if (s1.equals("1"))
        {
            b1.n(true);
            b1.g(0x7f0205a1);
            b1.b((new StringBuilder()).append(resources.getString(0x7f0801b5)).append("1").toString());
        } else
        {
            if (s1.equals("2"))
            {
                b1.g(0x7f0201a9);
                b1.b((new StringBuilder()).append(resources.getString(0x7f0801b5)).append("2").toString());
                return b1;
            }
            if (s1.equals("3"))
            {
                b1.g(0x7f0201e6);
                b1.b((new StringBuilder()).append(resources.getString(0x7f0801b5)).append("3").toString());
                return b1;
            }
        }
        return b1;
    }

    public static b a(String s, Context context, Resources resources)
    {
        Object obj1;
        Object obj2;
        String s1;
        String s2;
        String s5;
        int i;
        int j;
        j = -1;
        s5 = "0.0";
        obj1 = com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(context, s);
        s2 = com.gau.go.launcherex.gowidget.weather.globaltheme.a.c(context, s);
        i = j;
        obj2 = s2;
        s1 = ((String) (obj1));
        PackageInfo packageinfo = context.getPackageManager().getPackageInfo(s, 1);
        Object obj;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        i = j;
        obj2 = s2;
        s1 = ((String) (obj1));
        obj = packageinfo.applicationInfo.loadLabel(context.getPackageManager()).toString();
        obj1 = s2;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        i = j;
        obj2 = s2;
        s1 = ((String) (obj));
        obj1 = packageinfo.applicationInfo.loadLabel(context.getPackageManager()).toString();
        i = j;
        obj2 = obj1;
        s1 = ((String) (obj));
        j = packageinfo.versionCode;
        i = j;
        obj2 = obj1;
        s1 = ((String) (obj));
        String s6 = packageinfo.versionName;
        obj2 = packageinfo;
        String s3 = ((String) (obj));
        s1 = s6;
        obj = obj1;
        obj1 = s3;
_L2:
        if (obj2 == null)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
        obj;
        if (com.gtp.a.a.b.c.a())
        {
            ((android.content.pm.PackageManager.NameNotFoundException) (obj)).printStackTrace();
        }
        obj1 = s1;
        obj = obj2;
        obj2 = null;
        s1 = s5;
        j = i;
        if (true) goto _L2; else goto _L1
_L1:
        b b1 = new b();
        b1.q(true);
        String s4 = ((String) (obj1));
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            s4 = resources.getString(0x7f0804c2);
        }
        obj1 = obj;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj1 = resources.getString(0x7f0804c2);
        }
        b1.c(s);
        b1.a(s4);
        b1.b(((String) (obj1)));
        b1.d(s1);
        b1.e(j);
        long l = a(((PackageInfo) (obj2)));
        b1.a(l);
        long l1 = b(((PackageInfo) (obj2)));
        if (l1 != 0L)
        {
            l = l1;
        }
        b1.b(l);
        com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(b1, context);
        return b1;
    }

    public static b a(String s, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            b b1 = (b)list.next();
            if (!TextUtils.isEmpty(b1.x()) && b1.x().equals(s))
            {
                return b1;
            }
        }

        return null;
    }

    public static com.jiubang.playsdk.a.a a(b b1, com.jiubang.playsdk.a.a a1)
    {
        if (b1 == null || a1 == null)
        {
            return null;
        } else
        {
            a1.d(b1.k());
            a1.e(b1.l());
            a1.f(b1.m());
            a1.g(b1.n());
            a1.h(b1.o());
            a1.i(b1.s());
            a1.c(b1.a());
            a1.a(b1.v());
            a1.a(b1.z());
            a1.c(b1.A());
            a1.a(b1.B());
            a1.b(b1.x());
            a1.g(b1.w());
            a1.b(true);
            return a1;
        }
    }

    public static final String a(Context context, String s)
    {
        if (TextUtils.isEmpty(s) || s.equals("app_widget_theme_black") || s.equals("app_widget_theme_white"))
        {
            return context.getResources().getString(0x7f080080);
        }
        int i = context.getResources().getIdentifier(s, "string", context.getPackageName());
        context = context.getResources();
        if (i == 0)
        {
            i = 0x7f080080;
        }
        return context.getString(i);
    }

    public static ArrayList a(Context context, Resources resources)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = context.getPackageManager();
        Intent intent = new Intent("com.gau.go.weatherex.theme.apptheme");
        intent.addCategory("android.intent.category.DEFAULT");
        obj = ((PackageManager) (obj)).queryIntentActivities(intent, 0);
        int j = ((List) (obj)).size();
        int i = 0;
        while (i < j) 
        {
            b b1 = a(((ResolveInfo)((List) (obj)).get(i)).activityInfo.packageName, context, resources);
            if (b1 == null)
            {
                continue;
            }
            b1.o(true);
            b1.q(true);
            if (b1.p() == -1)
            {
                if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(b1.x(), context))
                {
                    b1.b(1);
                } else
                {
                    b1.b(2);
                }
            }
            arraylist.add(b1);
            i++;
        }
        return arraylist;
    }

    public static void a(Context context, b b1)
    {
        String as1[] = com.gau.go.launcherex.gowidget.weather.globaltheme.a.d(context, b1.x(), "widget_theme_support_style_config");
        String as[] = as1;
        if (as1 == null)
        {
            as = com.gau.go.launcherex.gowidget.weather.globaltheme.a.d(context, b1.x(), "appwidget_theme_support_style_config");
            b1.h(true);
            b1.i(true);
            b1.j(true);
        }
        if (as != null)
        {
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                context = as[i];
                if ("appwidget_theme_style1".equalsIgnoreCase(context))
                {
                    b1.h(true);
                } else
                if ("appwidget_theme_style2".equalsIgnoreCase(context))
                {
                    b1.i(true);
                } else
                if ("appwidget_theme_style3".equalsIgnoreCase(context))
                {
                    b1.j(true);
                } else
                if ("appwidget_theme_style4".equalsIgnoreCase(context))
                {
                    b1.k(true);
                } else
                if ("appwidget_theme_style5".equalsIgnoreCase(context))
                {
                    b1.l(true);
                } else
                if ("appwidget_theme_style6".equalsIgnoreCase(context))
                {
                    b1.n(true);
                }
                i++;
            }
        }
    }

    public static boolean a(com.jiubang.playsdk.a.a a1, int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("widgetType undefined: ").append(i).toString());

        case 1: // '\001'
            return a1.i();

        case 2: // '\002'
            return a1.j();

        case 3: // '\003'
            return a1.k();

        case 5: // '\005'
            return a1.l();

        case 4: // '\004'
            return a1.m();

        case 6: // '\006'
            return a1.n();
        }
    }

    public static boolean a(String s)
    {
        return "com.gtp.go.weather.phototheme".equals(s);
    }

    private static long b(PackageInfo packageinfo)
    {
        long l1 = -1L;
        long l;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            l = packageinfo.lastUpdateTime;
        } else
        {
            l = l1;
            if (!TextUtils.isEmpty(packageinfo.applicationInfo.sourceDir))
            {
                packageinfo = new File(packageinfo.applicationInfo.sourceDir);
                l = l1;
                if (packageinfo != null)
                {
                    return packageinfo.lastModified();
                }
            }
        }
        return l;
    }

    public static b b(Resources resources)
    {
        return a(resources, "app_widget_theme_default_transparent", "3");
    }

    public static ArrayList b(Context context, Resources resources)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = context.getPackageManager();
        Intent intent = new Intent("com.gau.go.weatherex.theme.livewallpaper");
        intent.addCategory("android.intent.category.DEFAULT");
        obj = ((PackageManager) (obj)).queryIntentActivities(intent, 0);
        int j = ((List) (obj)).size();
        int i = 0;
        while (i < j) 
        {
            b b1 = a(((ResolveInfo)((List) (obj)).get(i)).activityInfo.packageName, context, resources);
            if (b1 == null)
            {
                continue;
            }
            b1.p(true);
            b1.q(true);
            if (b1.p() == -1)
            {
                if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.b(b1.x(), context))
                {
                    b1.b(1);
                } else
                {
                    b1.b(2);
                }
            }
            arraylist.add(b1);
            i++;
        }
        return arraylist;
    }

    public static void b(Context context, b b1)
    {
        context = com.gau.go.launcherex.gowidget.weather.globaltheme.a.d(context, b1.x(), "gowidget_theme_support_style_config");
        if (context != null)
        {
            int j = context.length;
            int i = 0;
            while (i < j) 
            {
                String s = context[i];
                if ("gowidget_theme_style5".equalsIgnoreCase(s))
                {
                    b1.e(true);
                } else
                if ("gowidget_theme_style2_layout2".equalsIgnoreCase(s))
                {
                    b1.g(true);
                } else
                if ("gowidget_theme_style6".equalsIgnoreCase(s))
                {
                    b1.f(true);
                }
                i++;
            }
        }
        b1.h(true);
        b1.i(true);
        b1.j(true);
    }

    public static boolean b(Context context)
    {
        boolean flag = false;
        PackageManager packagemanager = context.getPackageManager();
        int i;
        try
        {
            i = packagemanager.getApplicationInfo(context.getPackageName(), 0).flags;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        if ((i & 0x40000) != 0)
        {
            flag = true;
        }
        return flag;
    }

    public static boolean b(Context context, String s)
    {
        context = context.getPackageManager();
        try
        {
            context.getPackageInfo(s, 8192);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static ArrayList c(Context context, Resources resources)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = context.getPackageManager();
        Intent intent = new Intent("com.gau.go.weatherex.theme.gowidget");
        intent.addCategory("android.intent.category.DEFAULT");
        obj = ((PackageManager) (obj)).queryIntentActivities(intent, 0);
        int j = ((List) (obj)).size();
        for (int i = 0; i < j; i++)
        {
            b b1 = a(((ResolveInfo)((List) (obj)).get(i)).activityInfo.packageName, context, resources);
            if (b1 == null)
            {
                continue;
            }
            b1.s(true);
            b1.q(true);
            if (b1.p() == -1)
            {
                b1.b(1);
            }
            b(context, b1);
            a(context, b1);
            arraylist.add(b1);
        }

        return arraylist;
    }

    public static ArrayList d(Context context, Resources resources)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = context.getPackageManager();
        Intent intent = new Intent("com.gau.go.weatherex.theme.systemwidget");
        intent.addCategory("android.intent.category.DEFAULT");
        obj = ((PackageManager) (obj)).queryIntentActivities(intent, 0);
        int j = ((List) (obj)).size();
        int i = 0;
        while (i < j) 
        {
            b b1 = a(((ResolveInfo)((List) (obj)).get(i)).activityInfo.packageName, context, resources);
            if (b1 == null)
            {
                continue;
            }
            b1.t(true);
            b1.q(true);
            if (b1.p() == -1)
            {
                if (com.gau.go.launcherex.gowidget.weather.globaltheme.a.a(b1.x(), context))
                {
                    b1.b(1);
                } else
                {
                    b1.b(2);
                }
            }
            a(context, b1);
            arraylist.add(b1);
            i++;
        }
        return arraylist;
    }
}
