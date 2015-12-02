// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.model.AppConfig;
import com.ubercab.client.core.model.Ping;
import com.ubercab.rider.realtime.model.Trip;
import java.util.List;

public final class gbv extends ees
{

    private final cev a;
    private final hku b;
    private final cjn c;
    private final fzl d;
    private final eel e;
    private final dpg f;
    private final fte g;
    private String h;
    private ckb i;
    private icl j;

    public gbv(cev cev1, hku hku1, cjn cjn1, fzl fzl1, eel eel1, dpg dpg1, fte fte1)
    {
        a = cev1;
        b = hku1;
        c = cjn1;
        d = fzl1;
        e = eel1;
        f = dpg1;
        g = fte1;
    }

    static void a(gbv gbv1)
    {
        gbv1.g();
    }

    static void a(gbv gbv1, String s)
    {
        gbv1.a(s);
    }

    private void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            g();
        } else
        if (h == null || !h.equals(s))
        {
            g();
            List list = een.a(s);
            if (list != null && !list.isEmpty())
            {
                h = s;
                i = c.a((new ckc()).a(list).a(e.c()).a(e.a()));
                d.b();
                return;
            }
        }
    }

    static fte b(gbv gbv1)
    {
        return gbv1.g;
    }

    private void g()
    {
        if (i == null)
        {
            return;
        } else
        {
            i.b();
            i = null;
            h = null;
            return;
        }
    }

    public final List a()
    {
        if (i == null || i.a() == null || i.a().isEmpty())
        {
            return null;
        } else
        {
            return gkk.a(gki.a(i.a(), new gjv() {

                final gbv a;

                private static UberLatLng a(UberLatLng uberlatlng)
                {
                    return new UberLatLng(uberlatlng.a(), uberlatlng.b());
                }

                public final Object apply(Object obj)
                {
                    return a((UberLatLng)obj);
                }

            
            {
                a = gbv.this;
                super();
            }
            }));
        }
    }

    public final void e()
    {
        a.a(this);
        if (j != null && !j.c())
        {
            j.b();
        }
        j = b.h().c(new gbw(this, (byte)0));
    }

    public final void f()
    {
        j.b();
        a.b(this);
    }

    public final void onPingEvent(dar dar1)
    {
        boolean flag1 = true;
        if (!f.n())
        {
            dar1 = dar1.a();
            if (dul.q(dar1) && dar1.getAppConfig().isUseTripLegsEnabled())
            {
                g();
                return;
            }
            int k = g.g();
            boolean flag2 = g.a();
            boolean flag3 = g.j();
            boolean flag;
            if (k == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (k != 4)
            {
                flag1 = false;
            }
            if (!flag2 || !flag3 || !flag && !flag1)
            {
                if (!dul.f(dar1))
                {
                    g();
                    return;
                } else
                {
                    a(dar1.getTrip().getRouteToDestination());
                    return;
                }
            }
        }
    }
}
