// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.d.j;
import com.google.android.apps.youtube.common.network.ConnectivityReceiver;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bd;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.apps.youtube.datalib.innertube.ag;

// Referenced classes of package com.google.android.apps.youtube.core:
//            a, aw, Analytics

public abstract class BaseApplication extends Application
    implements bd
{

    private ConnectivityReceiver a;
    private com.google.android.apps.youtube.core.a b;
    private boolean c;
    private boolean d;

    public BaseApplication()
    {
    }

    public final aw A()
    {
        return b.aO();
    }

    public final SharedPreferences B()
    {
        return b.aP();
    }

    public final h C()
    {
        return b.aX();
    }

    public final Analytics D()
    {
        return b.ba();
    }

    public final a E()
    {
        return b.bf();
    }

    protected boolean a()
    {
        return true;
    }

    protected abstract com.google.android.apps.youtube.core.a b();

    protected void c()
    {
        L.a(g());
        String s = b.aP().getString("version", null);
        String s1 = PackageUtil.f(this);
        boolean flag;
        if (!s1.equals(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (c)
        {
            b.aP().edit().putString("version", s1).remove("device_id").remove("device_key").apply();
        }
        a = new ConnectivityReceiver(getApplicationContext(), b.bf());
        b.bh().a();
        b.bf().a(b.bi());
    }

    public String g()
    {
        return "?";
    }

    public final void onCreate()
    {
        super.onCreate();
        if (a() && !d)
        {
            d = true;
            b = b();
            c();
        }
    }

    public ag x()
    {
        return null;
    }

    public com.google.android.apps.youtube.core.a y()
    {
        return b;
    }

    public final boolean z()
    {
        return c;
    }
}
