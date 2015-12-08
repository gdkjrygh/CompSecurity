// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.messagecenter;

import android.content.Context;
import io.wecloud.message.ClientService;
import io.wecloud.message.frontia.a;
import io.wecloud.message.frontia.b;
import io.wecloud.message.frontia.c;

// Referenced classes of package com.go.weatherex.messagecenter:
//            a, i, m

public class MessageCenterService extends ClientService
{

    public MessageCenterService()
    {
    }

    private void a(Context context, b b1)
    {
        com.go.weatherex.messagecenter.a a1 = new com.go.weatherex.messagecenter.a();
        a1.a(b1.d());
        a1.b(b1.f());
        a1.c(b1.g());
        a1.b(b1.k());
        a1.a(b1.e());
        a1.d(b1.l());
        a1.e(b1.m());
        a1.f(b1.n());
        a1.a(com.gau.go.launcherex.gowidget.messagecenter.a.b.a(System.currentTimeMillis(), "yyyy-MM-dd HH:mm:ss"));
        com.go.weatherex.messagecenter.i.a(context).a(a1);
    }

    private void d()
    {
        a a1 = new a(getApplicationContext(), 0x7f0300c7, 0, 0, 0, 0);
        a1.a(true);
        a1.a(0x7f020309);
        c.a("2", a1);
    }

    protected void a()
    {
        d();
    }

    protected void a(Context context, int j)
    {
    }

    protected void a(Context context, long l, String s, String s1, String s2, int j, 
            String s3, int k)
    {
        com.go.weatherex.messagecenter.i.a(context).a(l);
    }

    protected void a(Context context, String s)
    {
        com.go.weatherex.messagecenter.m.a(context, s);
    }

    protected void a(b b1)
    {
        a(getApplicationContext(), b1);
    }

    protected void b()
    {
    }
}
