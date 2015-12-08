// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview;

import android.view.View;

public class a
{

    public static int a(int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return c(i);
        } else
        {
            return b(i);
        }
    }

    public static void a(View view, Runnable runnable)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            b(view, runnable);
            return;
        } else
        {
            view.postDelayed(runnable, 16L);
            return;
        }
    }

    private static int b(int i)
    {
        return (0xff00 & i) >> 8;
    }

    private static void b(View view, Runnable runnable)
    {
        view.postOnAnimation(runnable);
    }

    private static int c(int i)
    {
        return (0xff00 & i) >> 8;
    }
}
