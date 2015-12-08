// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.youtube.core.ui.r;
import com.google.android.apps.youtube.core.ui.s;
import com.google.android.apps.youtube.core.ui.t;
import java.util.concurrent.atomic.AtomicInteger;

public final class ah
{

    private static r a;
    private static final AtomicInteger b = new AtomicInteger(1);

    public static int a()
    {
        int i;
        int k;
        do
        {
            k = b.get();
            int j = k + 1;
            i = j;
            if (j > 0xffffff)
            {
                i = 1;
            }
        } while (!b.compareAndSet(k, i));
        return k;
    }

    public static int a(float f)
    {
        if (f <= 0.0F)
        {
            return 0;
        }
        if (f >= 1.0F)
        {
            return 255;
        } else
        {
            return (int)(255F * f);
        }
    }

    public static Bitmap a(Context context, Bitmap bitmap, float f)
    {
        if (a == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                a = new t();
            } else
            {
                a = new s();
            }
        }
        return a.a(context, bitmap, 2.0F);
    }

    public static Toast a(Context context, CharSequence charsequence, int i)
    {
        return Toast.makeText(context.getApplicationContext(), charsequence, i);
    }

    public static void a(Context context, int i, int j)
    {
        Toast.makeText(context.getApplicationContext(), i, j).show();
    }

    public static void a(View view, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public static void b(Context context, CharSequence charsequence, int i)
    {
        a(context, charsequence, 1).show();
    }

}
