// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.http.AndroidHttpClient;
import com.android.a.a.a;
import com.android.a.a.d;
import com.android.a.a.g;
import com.android.a.a.k;
import com.android.a.s;
import com.jiubang.playsdk.main.b;
import java.io.File;

public class j
{

    private static s a;

    public static s a()
    {
        if (a != null)
        {
            return a;
        } else
        {
            throw new IllegalStateException("Not initialized");
        }
    }

    private static s a(Context context, com.android.a.a.j j1)
    {
        Object obj;
        File file;
        file = new File(b.d);
        obj = "volley/0";
        String s1 = context.getPackageName();
        context = context.getPackageManager().getPackageInfo(s1, 0);
        context = (new StringBuilder()).append(s1).append("/").append(((PackageInfo) (context)).versionCode).toString();
        obj = context;
_L2:
        context = j1;
        if (j1 == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 9)
            {
                context = new k();
            } else
            {
                context = new g(AndroidHttpClient.newInstance(((String) (obj))));
            }
        }
        context = new a(context);
        context = new s(new d(file, 0x500000), context);
        context.a();
        return context;
        context;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(Context context)
    {
        a = b(context);
    }

    private static s b(Context context)
    {
        return a(context, null);
    }
}
