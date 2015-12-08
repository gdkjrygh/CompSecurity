// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.innertube;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.a.a.a.a.ct;
import com.google.a.a.a.a.ii;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.au;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.datalib.a.f;
import java.util.Locale;

public final class h
    implements f
{

    private final Context a;
    private final PackageManager b;
    private final au c;

    public h(Context context, PackageManager packagemanager, au au1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (PackageManager)com.google.android.apps.youtube.common.fromguava.c.a(packagemanager);
        c = (au)com.google.android.apps.youtube.common.fromguava.c.a(au1);
    }

    private String a()
    {
        String s;
        try
        {
            s = b.getPackageInfo(a.getPackageName(), 0).versionName;
            String as[] = s.split("\\.");
            if (as.length == 3)
            {
                s = TextUtils.join(".", new String[] {
                    as[0], as[1]
                });
            }
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new RuntimeException("PackageManager did not find our package name!", namenotfoundexception);
        }
        return s;
    }

    public final void a(ii ii1)
    {
        ct ct1;
        if (ii1.b != null)
        {
            ct1 = ii1.b;
        } else
        {
            ct1 = new ct();
        }
        ct1.n = Locale.getDefault().toString();
        ct1.o = Util.a(a);
        ct1.j = 3;
        ct1.k = a();
        ct1.m = android.os.Build.VERSION.RELEASE;
        ct1.l = "Android";
        ct1.h = Build.MANUFACTURER;
        ct1.i = Build.MODEL;
        ct1.e = com.google.android.apps.youtube.common.e.c.a(ct1.e, c.a(a));
        ii1.d = c.b(a);
        ii1.b = ct1;
    }
}
