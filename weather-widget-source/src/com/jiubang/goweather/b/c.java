// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.goweather.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.text.TextUtils;
import java.io.InputStream;

// Referenced classes of package com.jiubang.goweather.b:
//            f, e

public abstract class c
{

    protected String a;
    protected int b;

    public c()
    {
    }

    public abstract InputStream a(String s, e e, f f1);

    public abstract void a();

    public boolean a(f f1, Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context != null && context.isConnected())
        {
            int i = context.getType();
            a = Proxy.getDefaultHost();
            b = Proxy.getDefaultPort();
            if (TextUtils.isEmpty(a))
            {
                a = null;
            }
            if (i == 0)
            {
                if (!TextUtils.isEmpty(a))
                {
                    f1.a(3);
                } else
                {
                    f1.a(2);
                }
            } else
            if (i == 1)
            {
                f1.a(1);
            } else
            if (i == 6)
            {
                f1.a(4);
            } else
            if (i == 9)
            {
                f1.a(5);
            } else
            if (i == 4)
            {
                f1.a(6);
            } else
            {
                f1.a(7);
            }
            return true;
        } else
        {
            f1.a(16);
            a = null;
            return false;
        }
    }

    public abstract String b(String s, e e, f f1);
}
