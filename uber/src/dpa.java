// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.realtime.model.PollingResponse;
import com.ubercab.realtime.error.Error;
import com.ubercab.rider.realtime.request.param.Location;
import com.ubercab.rider.realtime.response.Status;

public final class dpa
{

    private final iir a;
    private final hkm b;

    public dpa(iir iir, hkm hkm1)
    {
        a = iir;
        b = hkm1;
    }

    static iir a(dpa dpa1)
    {
        return dpa1.a;
    }

    public final ica a(Location location, hjm hjm)
    {
        return b.a(location, hjm).b(new ide() {

            final dpa a;

            private void a(Status status)
            {
                dpa.a(a).a(PollingResponse.create(status));
            }

            public final void call(Object obj)
            {
                a((Status)obj);
            }

            
            {
                a = dpa.this;
                super();
            }
        }).a(new ide() {

            final dpa a;

            private void a(Throwable throwable)
            {
                dpa.a(a).a(PollingResponse.create((Error)throwable));
            }

            public final void call(Object obj)
            {
                a((Throwable)obj);
            }

            
            {
                a = dpa.this;
                super();
            }
        });
    }
}
