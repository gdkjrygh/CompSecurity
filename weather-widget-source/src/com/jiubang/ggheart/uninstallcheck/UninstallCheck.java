// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.ggheart.uninstallcheck;

import android.content.Context;
import android.util.Log;
import com.gtp.a.a.b.c;

public class UninstallCheck
{

    private static boolean a = false;

    public static int a(Context context)
    {
        if (a)
        {
            context = (new StringBuilder()).append("/data/data/").append(context.getPackageName()).toString();
            return check((new StringBuilder()).append(context).append("/lockfile").toString());
        } else
        {
            return -2;
        }
    }

    public static int a(Context context, String s)
    {
        if (a)
        {
            String s1 = (new StringBuilder()).append("/data/data/").append(context.getPackageName()).toString();
            String s2 = (new StringBuilder()).append(s1).append("/obserfile").toString();
            String s3 = (new StringBuilder()).append(s1).append("/lockfile").toString();
            return init(context.getPackageCodePath(), s1, s, s2, s3, android.os.Build.VERSION.SDK_INT);
        } else
        {
            return 0;
        }
    }

    public static native int check(String s);

    public static native int init(String s, String s1, String s2, String s3, String s4, int i);

    static 
    {
        Log.d("myunistall_init", "load jni lib init");
        System.loadLibrary("uninstalled");
        a = true;
_L1:
        return;
        Throwable throwable;
        throwable;
        a = false;
        c.a("myunistall_init", "can not load libunistalled");
        if (c.a())
        {
            throwable.printStackTrace();
        }
          goto _L1
    }
}
