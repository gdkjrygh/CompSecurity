// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import java.util.List;

public final class dov extends czr
{

    private static final List a = gke.a("rtapi.riders.account_banned", "rtapi.unauthorized");
    private final hjk b;
    private final RiderActivity c;
    private final dqx d;
    private final dal e;
    private icl f;

    public dov(hjk hjk1, RiderActivity rideractivity, dqx dqx, dal dal)
    {
        b = hjk1;
        c = rideractivity;
        d = dqx;
        e = dal;
    }

    static dqx a(dov dov1)
    {
        return dov1.d;
    }

    static RiderActivity b(dov dov1)
    {
        return dov1.c;
    }

    static dal c(dov dov1)
    {
        return dov1.e;
    }

    static List d()
    {
        return a;
    }

    public final void b()
    {
        f = b.b().a(ico.a()).b(new ick() {

            final dov a;

            private void a(Error error)
            {
                error = error.getRealtimeError();
                if (error != null && dov.d().contains(error.getCode()))
                {
                    dov.a(a).c();
                    if (!TextUtils.isEmpty(error.getMessage()))
                    {
                        dov.b(a).a_(error.getMessage());
                    }
                    ijg.a(dbf.af.name()).d("DispatchResponse_ERROR_LOGOUT", new Object[0]);
                    dov.c(a).P();
                    dov.b(a).v();
                }
            }

            public final void a()
            {
            }

            public final volatile void a(Object obj)
            {
                a((Error)obj);
            }

            public final void a(Throwable throwable)
            {
            }

            
            {
                a = dov.this;
                super();
            }
        });
    }

    public final void c()
    {
        if (f != null)
        {
            f.b();
        }
    }

}
