// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class cwm
{

    private static final List a = Collections.unmodifiableList(Arrays.asList(new String[] {
        "/sbin/", "/system/bin/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/xbin/", "/data/local/", "/data/local/bin/", "/data/local/xbin/"
    }));

    public static Integer a(String s, String s1)
    {
        s = a(s);
        s1 = a(s1);
        int i;
        for (i = 0; i < s.length && i < s1.length && s[i].equals(s1[i]); i++) { }
        if (i < s.length && i < s1.length)
        {
            return Integer.valueOf(Integer.signum(Integer.valueOf(s[i]).compareTo(Integer.valueOf(s1[i]))));
        } else
        {
            return Integer.valueOf(Integer.signum(s.length - s1.length));
        }
    }

    public static void a(Context context, int i)
    {
        Toast.makeText(context, i, 0).show();
    }

    public static void a(Context context, String s)
    {
        Toast.makeText(context, s, 0).show();
    }

    public static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    public static boolean a(Context context)
    {
        return cwt.r(context);
    }

    public static boolean a(Window window)
    {
        return window != null && window.getDecorView() != null && window.getDecorView().getWindowToken() != null;
    }

    private static String[] a(String s)
    {
        return s.replaceAll("-", ".").replaceAll("[^\\d.]", "").split("\\.");
    }

    public static int b(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        if (context.getTheme().resolveAttribute(0x10102eb, typedvalue, true))
        {
            return TypedValue.complexToDimensionPixelSize(typedvalue.data, context.getResources().getDisplayMetrics());
        } else
        {
            return 0;
        }
    }

    public static boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 19;
    }

    public static boolean b(Context context, String s)
    {
        boolean flag1 = false;
        boolean flag;
        boolean flag2;
        try
        {
            context = context.getPackageManager().getPackageInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        flag = flag1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        flag = flag1;
        if (((PackageInfo) (context)).applicationInfo == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        flag2 = ((PackageInfo) (context)).applicationInfo.enabled;
        flag = flag1;
        if (flag2)
        {
            flag = true;
        }
        return flag;
    }

    public static void c(Context context, String s)
    {
        s = context.getPackageManager().getLaunchIntentForPackage(s);
        try
        {
            context.startActivity(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

}
