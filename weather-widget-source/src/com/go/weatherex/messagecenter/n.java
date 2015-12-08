// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.messagecenter;

import android.content.Context;
import io.wecloud.message.frontia.a;
import io.wecloud.message.frontia.c;

// Referenced classes of package com.go.weatherex.messagecenter:
//            i, a

public class n
{

    private static n e;
    public boolean a;
    public boolean b;
    private int c;
    private Context d;
    private com.go.weatherex.messagecenter.a f;

    private n(Context context)
    {
        a = false;
        b = false;
        d = context;
        c = 0;
    }

    public static n a(Context context)
    {
        com/go/weatherex/messagecenter/n;
        JVM INSTR monitorenter ;
        if (e == null)
        {
            e = new n(context);
        }
        context = e;
        com/go/weatherex/messagecenter/n;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public int a()
    {
        return c;
    }

    public void b()
    {
        if (!a)
        {
            return;
        } else
        {
            a = false;
            a a1 = new a(d, 0x7f0300c7, 0, 0, 0, 0);
            a1.a(true);
            a1.a(0x7f020309);
            io.wecloud.message.frontia.c.a("2", a1);
            return;
        }
    }

    public void c()
    {
        if (b)
        {
            b = false;
            if (f != null)
            {
                com.go.weatherex.messagecenter.i.a(d).a(f);
                return;
            }
        }
    }
}
