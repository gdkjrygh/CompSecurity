// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.realtime.error.GlobalStateErrors;
import com.ubercab.client.core.realtime.model.PollingResponse;
import com.ubercab.realtime.error.Error;
import com.ubercab.realtime.error.RealtimeError;
import com.ubercab.rider.realtime.request.param.Location;
import com.ubercab.rider.realtime.response.BootstrapRider;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class doy
{

    private final hkb a;
    private final iir b;
    private final doz c;
    private final ici d;

    private doy(hkb hkb, iir iir, dox dox1, gmg gmg, ici ici)
    {
        a = hkb;
        b = iir;
        c = new doz(dox1, gmg, (byte)0);
        d = ici;
    }

    public doy(hkb hkb, iir iir, hji hji, gmg gmg, ici ici)
    {
        this(hkb, iir, new dox(hji), gmg, ici);
    }

    static iir a(doy doy1)
    {
        return doy1.b;
    }

    static hkb b(doy doy1)
    {
        return doy1.a;
    }

    public final ica a(Map map, Location location, hjm hjm)
    {
        return ica.a(new idh(map, location, hjm) {

            final Map a;
            final Location b;
            final hjm c;
            final doy d;

            private ica a()
            {
                return doy.b(d).a(a, b, c);
            }

            public final Object call()
            {
                return a();
            }

            
            {
                d = doy.this;
                a = map;
                b = location;
                c = hjm;
                super();
            }
        }).b(new ide() {

            final doy a;

            private void a(BootstrapRider bootstraprider)
            {
                doy.a(a).a(PollingResponse.create(bootstraprider));
            }

            public final void call(Object obj)
            {
                a((BootstrapRider)obj);
            }

            
            {
                a = doy.this;
                super();
            }
        }).a(new ide() {

            final doy a;

            private void a(Throwable throwable)
            {
                doy.a(a).a(PollingResponse.create((Error)throwable));
            }

            public final void call(Object obj)
            {
                a((Throwable)obj);
            }

            
            {
                a = doy.this;
                super();
            }
        }).e(new idi() {

            final doy a;

            private static ica a(Throwable throwable)
            {
                RealtimeError realtimeerror = ((Error)throwable).getRealtimeError();
                if (realtimeerror != null && GlobalStateErrors.get().contains(realtimeerror.getCode()))
                {
                    return ica.b();
                } else
                {
                    return ica.b(throwable);
                }
            }

            public final volatile Object a(Object obj)
            {
                return a((Throwable)obj);
            }

            
            {
                a = doy.this;
                super();
            }
        }).h(dvf.a(TimeUnit.SECONDS, d)).a(c);
    }
}
