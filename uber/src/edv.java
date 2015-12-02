// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Ping;

public final class edv
{

    public edv()
    {
    }

    static edt a(RiderActivity rideractivity, gmg gmg, rw rw1, dod dod, eee eee1, dce dce, dal dal)
    {
        return new edt(rideractivity, gmg, rw1, dod, eee1, dce, dal);
    }

    static rw a()
    {
        return rw.a();
    }

    static eee b()
    {
        return new eee();
    }

    final ica a(cev cev)
    {
        return ica.a(new edo(cev) {

            final edv a;

            public final void onLocationEvent(ciy ciy1)
            {
                if (a() != null)
                {
                    a().a(ciy1.a());
                }
            }

            public final void onNoLocationEvent(ciz ciz)
            {
                if (a() != null)
                {
                    a().a(null);
                }
            }

            
            {
                a = edv.this;
                super(cev);
            }
        });
    }

    final ica b(cev cev)
    {
        return ica.a(new edo(cev) {

            final edv a;

            public final void onPingClientResponseEvent(dmr dmr1)
            {
                if (dmr1.e() && dul.a((Ping)dmr1.g()) && a() != null)
                {
                    a().a(((Ping)dmr1.g()).getClient());
                }
            }

            
            {
                a = edv.this;
                super(cev);
            }
        });
    }
}
