// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.Trip;

public final class dby extends gme
{

    dpg a;
    private final Context b;
    private String c;

    public dby(cev cev1, Context context, hku hku1, hkr hkr1, daj daj1)
    {
        b = context;
        hku1.h().c(new dbz(this, (byte)0));
        cev1.a(this);
        context = hkr1.f();
        cev1 = context;
        if (context == null)
        {
            hku1 = daj1.b();
            cev1 = context;
            if (hku1 != null)
            {
                cev1 = hku1.getTrip();
            }
        }
        if (cev1 != null)
        {
            cev1 = cev1.getUuid();
        } else
        {
            cev1 = null;
        }
        c = cev1;
    }

    static void a(dby dby1)
    {
        dby1.d();
    }

    static void a(dby dby1, String s)
    {
        dby1.a(s);
    }

    private void a(String s)
    {
        boolean flag;
        if (!gjx.a(s, c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = s;
        if (flag)
        {
            b();
        }
    }

    private String c()
    {
        return c;
    }

    private void d()
    {
        if (a == null)
        {
            ((RiderApplication)b.getApplicationContext()).b().a(this);
        }
    }

    public final Object a()
    {
        return c();
    }

    public final void onPingEvent(dar dar1)
    {
        d();
        if (a.n())
        {
            return;
        }
        dar1 = dar1.a();
        if (dul.f(dar1))
        {
            a(dar1.getTrip().getUuid());
            return;
        } else
        {
            a(((String) (null)));
            return;
        }
    }
}
