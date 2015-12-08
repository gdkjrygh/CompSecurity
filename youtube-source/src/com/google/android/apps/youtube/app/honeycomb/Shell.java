// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.content.SharedPreferences;
import android.util.SparseBooleanArray;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.aw;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.utils.PackageUtil;

public final class Shell
{

    private static boolean a;
    private static boolean b;
    private static boolean c;
    private static long d;
    private static long e;

    static long a()
    {
        return d;
    }

    static long a(long l)
    {
        d = 0x7fffffffffffffffL;
        return 0x7fffffffffffffffL;
    }

    public static void a(YouTubeApplication youtubeapplication, aw aw1, SharedPreferences sharedpreferences)
    {
label0:
        {
label1:
            {
                boolean flag1 = false;
                if (a)
                {
                    break label0;
                }
                int i = PackageUtil.g(youtubeapplication);
                int j = aw1.a();
                int k = aw1.b();
                youtubeapplication = aw1.c();
                SparseBooleanArray sparsebooleanarray = aw1.d();
                e = aw1.e();
                d = sharedpreferences.getLong("upgrade_prompt_shown_millis", 0L);
                boolean flag;
                if (i < j || youtubeapplication.get(i))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                b = flag;
                if (i >= k)
                {
                    flag = flag1;
                    if (!sparsebooleanarray.get(i))
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            c = flag;
            a = true;
            L.e((new StringBuilder("App version = ")).append(i).toString());
            L.e((new StringBuilder("Min app version = ")).append(j).toString());
            L.e((new StringBuilder("Target app version = ")).append(k).toString());
            L.e((new StringBuilder("Prompt shown ago = ")).append(System.currentTimeMillis() - d).toString());
        }
    }

    static boolean b()
    {
        return b;
    }

    static boolean c()
    {
        return c;
    }

    static long d()
    {
        return e;
    }
}
