// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.f;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.jiubang.playsdk.a.y;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jiubang.playsdk.f:
//            l, d

public class a
{

    private static final String a = com/jiubang/playsdk/f/a.getName();

    public a()
    {
    }

    public static int a(int k)
    {
        if (k == 80)
        {
            return 23;
        }
        if (k == 81)
        {
            return 35;
        }
        if (k == 82)
        {
            return 21;
        }
        if (k == 83)
        {
            return 17;
        }
        return k != 84 ? -1 : 24;
    }

    public static int a(String s)
    {
        if (l.a(s))
        {
            return y.a().e();
        }
        if (s.equalsIgnoreCase("com.jb.gosms"))
        {
            return 80;
        }
        if (s.equalsIgnoreCase("com.jb.gokeyboard"))
        {
            return 81;
        }
        if (s.equalsIgnoreCase("com.gau.go.launcherex"))
        {
            return 82;
        }
        if (s.equalsIgnoreCase("com.jiubang.goscreenlock"))
        {
            return 83;
        }
        if (s.equalsIgnoreCase("com.gau.go.launcherex.gowidget.weatherwidget"))
        {
            return 84;
        } else
        {
            return y.a().e();
        }
    }

    public static String a(Context context)
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = "";
        if (c(context, "com.gau.go.launcherex"))
        {
            s = b(context);
        }
        if (!TextUtils.isEmpty(s))
        {
            stringbuffer.append(s).append(",");
        }
        if (c(context, "com.jiubang.goscreenlock"))
        {
            s = c(context);
        } else
        {
            s = "";
        }
        if (!TextUtils.isEmpty(s))
        {
            stringbuffer.append(s).append(",");
        }
        if (c(context, "com.jb.gosms"))
        {
            s = d(context);
        } else
        {
            s = "";
        }
        if (!TextUtils.isEmpty(s))
        {
            stringbuffer.append(s).append(",");
        }
        if (c(context, "com.gau.go.launcherex.gowidget.weatherwidget"))
        {
            s = e(context);
        } else
        {
            s = "";
        }
        if (!TextUtils.isEmpty(s))
        {
            stringbuffer.append(s).append(",");
        }
        if (c(context, "com.jb.gokeyboard"))
        {
            context = f(context);
        } else
        {
            context = "";
        }
        if (!TextUtils.isEmpty(context))
        {
            stringbuffer.append(context).append(",");
        }
        if (!TextUtils.isEmpty(stringbuffer))
        {
            context = stringbuffer.toString();
            return context.substring(0, context.length() - ",".length());
        } else
        {
            return "";
        }
    }

    public static void a(View view)
    {
        android.view.ViewParent viewparent;
        if (view != null)
        {
            if ((viewparent = view.getParent()) != null && (viewparent instanceof ViewGroup))
            {
                ((ViewGroup)view.getParent()).removeView(view);
                return;
            }
        }
    }

    public static boolean a(Context context, int k, String s)
    {
        boolean flag = false;
        boolean flag1 = false;
        if (!TextUtils.isEmpty(s))
        {
            if (k == 2)
            {
                flag = a(context, s);
            }
            flag1 = flag;
            if (!flag)
            {
                return b(context, s);
            }
        }
        return flag1;
    }

    public static boolean a(Context context, com.jiubang.playsdk.d.a a1)
    {
        if (a1 == null || TextUtils.isEmpty(a1.j()))
        {
            return false;
        } else
        {
            return a(context, a1.i(), a1.j());
        }
    }

    public static boolean a(Context context, String s)
    {
        com.jiubang.playsdk.f.d.a(a, (new StringBuilder()).append("toGooglePlay,url=").append(s).toString());
        if (context == null || TextUtils.isEmpty(s))
        {
            return false;
        }
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        s.setPackage("com.android.vending");
        if (context instanceof Activity)
        {
            s.setFlags(0x40000000);
        } else
        {
            s.setFlags(0x10000000);
        }
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
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean a(Context context, String s, String s1)
    {
        boolean flag1 = false;
        context = context.getPackageManager();
        boolean flag;
        boolean flag2;
        try
        {
            context = context.getPackageInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        flag = flag1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if ("".equals(s1) || s1.equals(((PackageInfo) (context)).versionName))
        {
            break MISSING_BLOCK_LABEL_65;
        }
        flag2 = "Varies with device".equals(((PackageInfo) (context)).versionName);
        flag = flag1;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        flag = true;
        return flag;
    }

    public static String b(Context context)
    {
        Context context1;
        Object obj1;
        context1 = null;
        Object obj = null;
        obj1 = Uri.parse("content://com.jiubang.ggheart.data.content.gocontentprovider/curtheme");
        obj1 = context.getContentResolver().query(((Uri) (obj1)), new String[] {
            "themename"
        }, null, null, null);
        context = obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        context = obj;
        if (((Cursor) (obj1)).moveToFirst())
        {
            context = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndex("themename"));
        }
        context1 = context;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            context1 = context;
        }
_L2:
        return context1;
        context;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        ((Cursor) (obj1)).close();
        return null;
        context;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw context;
    }

    public static boolean b(Context context, String s)
    {
        if (context != null && !TextUtils.isEmpty(s))
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

    public static boolean b(Context context, String s, String s1)
    {
        if (!s.equalsIgnoreCase("com.jb.gosms")) goto _L2; else goto _L1
_L1:
        g(context, s1);
_L4:
        return true;
_L2:
        if (s.equalsIgnoreCase("com.jb.gokeyboard"))
        {
            h(context, s1);
        } else
        if (s.equalsIgnoreCase("com.gau.go.launcherex"))
        {
            i(context, s1);
        } else
        if (s.equalsIgnoreCase("com.jiubang.goscreenlock"))
        {
            j(context, s1);
        } else
        if (s.equalsIgnoreCase("com.gau.go.launcherex.gowidget.weatherwidget"))
        {
            f(context, s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String c(Context context)
    {
        Context context1;
        Object obj1;
        context1 = null;
        Object obj = null;
        obj1 = Uri.parse("content://com.jiubang.goscreenlock/theme");
        obj1 = context.getContentResolver().query(((Uri) (obj1)), new String[] {
            "usingThemePackageName"
        }, null, null, null);
        context = obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        context = obj;
        if (((Cursor) (obj1)).moveToFirst())
        {
            context = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndex("usingThemePackageName"));
        }
        context1 = context;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            context1 = context;
        }
_L2:
        return context1;
        context;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        ((Cursor) (obj1)).close();
        return null;
        context;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw context;
    }

    public static boolean c(Context context, String s)
    {
        if (context == null || s == null)
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

    public static int d(Context context, String s)
    {
        int k = 0;
        if (s != null)
        {
            context = context.getPackageManager();
            try
            {
                k = context.getPackageInfo(s, 0).versionCode;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.i("AppUtils", (new StringBuilder()).append("getVersionCodeByPkgName=").append(s).append(" has ").append(context.getMessage()).toString());
                return 0;
            }
        }
        return k;
    }

    public static String d(Context context)
    {
        Context context1;
        Object obj1;
        context1 = null;
        Object obj = null;
        obj1 = Uri.parse("content://gosms.provider.applytheme");
        obj1 = context.getContentResolver().query(((Uri) (obj1)), new String[] {
            "gosms"
        }, null, null, null);
        context = obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        context = obj;
        if (((Cursor) (obj1)).moveToFirst())
        {
            context = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndex("gosms"));
        }
        context1 = context;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            context1 = context;
        }
_L2:
        return context1;
        context;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        ((Cursor) (obj1)).close();
        return null;
        context;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw context;
    }

    public static String e(Context context)
    {
        Object obj;
        String s = "";
        obj = Uri.parse("content://com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider/common_setting_table");
        obj = context.getContentResolver().query(((Uri) (obj)), new String[] {
            "setting_key", "setting_value"
        }, "setting_key in ('app_widget_theme')", null, null);
        context = s;
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((Cursor) (obj)).getCount() <= 0) goto _L4; else goto _L3
_L3:
        int k;
        int i1;
        ((Cursor) (obj)).moveToFirst();
        k = ((Cursor) (obj)).getColumnIndex("setting_key");
        i1 = ((Cursor) (obj)).getColumnIndex("setting_value");
        if (!((Cursor) (obj)).getString(k).equals("app_widget_theme")) goto _L4; else goto _L5
_L5:
        context = ((Cursor) (obj)).getString(i1);
_L7:
        ((Cursor) (obj)).close();
_L2:
        return context;
        context;
        context.printStackTrace();
        ((Cursor) (obj)).close();
        return "";
        context;
        ((Cursor) (obj)).close();
        throw context;
_L4:
        context = "";
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String e(Context context, String s)
    {
        String s1 = "0.0";
        if (s != null)
        {
            context = context.getPackageManager();
            try
            {
                s1 = context.getPackageInfo(s, 0).versionName;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return "0.0";
            }
        }
        return s1;
    }

    public static String f(Context context)
    {
        Context context1;
        Object obj1;
        context1 = null;
        Object obj = null;
        obj1 = Uri.parse("content://com.jb.gokeyboard.gokeyboardprovider/curtheme");
        obj1 = context.getContentResolver().query(((Uri) (obj1)), new String[] {
            "themename"
        }, null, null, null);
        context = obj;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        context = obj;
        if (((Cursor) (obj1)).moveToFirst())
        {
            context = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndex("themename"));
        }
        context1 = context;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
            context1 = context;
        }
_L2:
        return context1;
        context;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        ((Cursor) (obj1)).close();
        return null;
        context;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw context;
    }

    public static void f(Context context, String s)
    {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        Iterator iterator = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ResolveInfo resolveinfo = (ResolveInfo)iterator.next();
            if (resolveinfo == null || resolveinfo.activityInfo == null || resolveinfo.activityInfo.packageName == null || resolveinfo.activityInfo.name == null || !resolveinfo.activityInfo.packageName.startsWith("com.gau.go.launcherex.gowidget.weatherwidget"))
            {
                continue;
            }
            intent.setComponent(new ComponentName("com.gau.go.launcherex.gowidget.weatherwidget", resolveinfo.activityInfo.name));
            intent.putExtra("detailSrc", 3);
            intent.putExtra("extra_src_app_package_name", s);
            break;
        } while (true);
        try
        {
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public static void g(Context context, String s)
    {
        try
        {
            s = new Intent();
            s.setClassName("com.jb.gosms", "com.jb.gosms.themeinfo.ThemeSettingTabActivity");
            s.setFlags(0x14000000);
            s.putExtra("installed", true);
            context.startActivity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public static void h(Context context, String s)
    {
        try
        {
            s = new Intent();
            s.setClassName("com.jb.gokeyboard", "com.jb.gokeyboard.gostore.GoStroeFragmentActivity");
            s.putExtra("theme_install_page", true);
            context.startActivity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            s = new Intent();
            s.setClassName("com.jb.gokeyboard", "com.jb.gokeyboard.MainActivity");
            context.startActivity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public static void i(Context context, String s)
    {
        try
        {
            Intent intent = new Intent("com.gau.go.launcherex.MyThemes.mythemeaction");
            intent.putExtra("type", 2);
            intent.putExtra("pkgname", s);
            intent.putExtra("launcher_pkgname", "com.gau.go.launcherex");
            context.sendBroadcast(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public static void j(Context context, String s)
    {
        try
        {
            Intent intent = new Intent("com.jiubang.goscreenlock.themeDetail");
            intent.putExtra("themePkg", s);
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

}
