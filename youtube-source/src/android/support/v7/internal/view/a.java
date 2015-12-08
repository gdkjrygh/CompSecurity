// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.a.c;
import android.support.v7.a.d;
import android.support.v7.a.e;
import android.support.v7.a.g;
import android.support.v7.a.k;
import android.util.DisplayMetrics;

public final class a
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

    public final int a()
    {
        return a.getResources().getInteger(g.a);
    }

    public final int b()
    {
        return a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public final boolean c()
    {
        return a.getResources().getBoolean(d.a);
    }

    public final int d()
    {
        TypedArray typedarray = a.obtainStyledAttributes(null, k.a, c.b, 0);
        int j = typedarray.getLayoutDimension(1, 0);
        Resources resources = a.getResources();
        int i = j;
        if (!c())
        {
            i = Math.min(j, resources.getDimensionPixelSize(e.a));
        }
        typedarray.recycle();
        return i;
    }

    public final boolean e()
    {
        return a.getApplicationInfo().targetSdkVersion < 14;
    }

    public final int f()
    {
        return a.getResources().getDimensionPixelSize(e.b);
    }
}
