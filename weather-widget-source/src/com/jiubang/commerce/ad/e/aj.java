// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Proxy;
import android.text.TextUtils;
import com.jiubang.commerce.utils.j;
import com.jiubang.commerce.utils.k;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            ak

public class aj
{

    private static int c = 2;
    private static aj d;
    private Context a;
    private int b;
    private BroadcastReceiver e;

    private aj(Context context)
    {
        b = 0;
        e = new ak(this);
        a = context;
        a();
    }

    static int a(aj aj1, int i)
    {
        aj1.b = i;
        return i;
    }

    public static aj a(Context context)
    {
        if (d == null)
        {
            d = new aj(context);
        }
        return d;
    }

    private boolean c()
    {
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("isUseProxy(host=").append(Proxy.getDefaultHost()).append(")").toString());
        }
        return !TextUtils.isEmpty(Proxy.getDefaultHost());
    }

    public void a()
    {
        IntentFilter intentfilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        a.registerReceiver(e, intentfilter);
    }

    public boolean b()
    {
        while (!k.a(a) || !j.a && k.b(a) && (c() || c == b)) 
        {
            return false;
        }
        return true;
    }

}
