// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v7.a.b;
import android.support.v7.a.c;
import android.support.v7.a.e;
import android.support.v7.a.h;
import android.support.v7.a.l;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;

public class a
{

    private Context a;

    private a(Context context)
    {
        a = context;
    }

    public static a a(Context context)
    {
        return new a(context);
    }

    public int a()
    {
        return a.getResources().getInteger(h.abc_max_action_buttons);
    }

    public boolean b()
    {
        while (android.os.Build.VERSION.SDK_INT >= 19 || !ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(a))) 
        {
            return true;
        }
        return false;
    }

    public int c()
    {
        return a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public boolean d()
    {
        if (a.getApplicationInfo().targetSdkVersion >= 16)
        {
            return a.getResources().getBoolean(c.abc_action_bar_embed_tabs);
        } else
        {
            return a.getResources().getBoolean(c.abc_action_bar_embed_tabs_pre_jb);
        }
    }

    public int e()
    {
        TypedArray typedarray = a.obtainStyledAttributes(null, l.ActionBar, b.actionBarStyle, 0);
        int j = typedarray.getLayoutDimension(l.ActionBar_height, 0);
        Resources resources = a.getResources();
        int i = j;
        if (!d())
        {
            i = Math.min(j, resources.getDimensionPixelSize(e.abc_action_bar_stacked_max_height));
        }
        typedarray.recycle();
        return i;
    }

    public boolean f()
    {
        return a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int g()
    {
        return a.getResources().getDimensionPixelSize(e.abc_action_bar_stacked_tab_max_width);
    }
}
