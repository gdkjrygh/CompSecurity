// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.rider.realtime.request.body.LocationBody;

public final class foz
    implements gmk
{

    private final hkn a;
    private final dak b;
    private final dal c;
    private final gju d;
    private final gmg e;
    private final cev f;
    private String g;
    private RiderLocation h;
    private RiderLocation i;
    private String j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;

    public foz(hkn hkn1, dak dak, dal dal1, gju gju1, gmg gmg1, cev cev1)
    {
        k = 0x80000000;
        a = hkn1;
        b = dak;
        c = dal1;
        d = gju1;
        e = gmg1;
        f = cev1;
        e.a(this);
    }

    private static LocationBody a(RiderLocation riderlocation)
    {
        if (riderlocation != null)
        {
            if ((riderlocation = riderlocation.getUberLatLng()) != null)
            {
                return LocationBody.create().setLatitude(Float.valueOf((float)riderlocation.a())).setLongitude(Float.valueOf((float)riderlocation.b()));
            }
        }
        return null;
    }

    private static boolean a(RiderLocation riderlocation, RiderLocation riderlocation1)
    {
        if (riderlocation != null)
        {
            riderlocation = riderlocation.getUberLatLng();
        } else
        {
            riderlocation = null;
        }
        riderlocation1 = riderlocation1.getUberLatLng();
        return riderlocation != riderlocation1 && (riderlocation == null || riderlocation1 == null || UberLatLng.a(riderlocation1, riderlocation) > 160.93440246582031D);
    }

    private boolean e()
    {
        return e.a(dbf.ay) && !fte.b(k);
    }

    public final void a()
    {
        if (!n)
        {
            f.a(this);
            n = true;
        }
    }

    public final void a(gmj gmj)
    {
        m = true;
        if (l)
        {
            a("open");
            l = false;
        }
    }

    public final void a(String s)
    {
        if (e())
        {
            j = c.z();
            if (g == null)
            {
                g = c.E();
            }
            if (!TextUtils.isEmpty(j) && !TextUtils.isEmpty(g))
            {
                LocationBody locationbody = a(i);
                LocationBody locationbody1 = a(h);
                a.a(j, locationbody, locationbody1, c.O(), g, s, Long.valueOf(gju.a())).a(new ide() {

                    final foz a;

                    public final volatile void call(Object obj)
                    {
                    }

            
            {
                a = foz.this;
                super();
            }
                }, new ide() {

                    final foz a;

                    private static void a(Throwable throwable)
                    {
                        ijg.c(throwable, "Error sending surge input event.", new Object[0]);
                    }

                    public final void call(Object obj)
                    {
                        a((Throwable)obj);
                    }

            
            {
                a = foz.this;
                super();
            }
                });
                return;
            }
        }
    }

    public final void b()
    {
        if (n)
        {
            f.b(this);
            n = false;
        }
    }

    public final void c()
    {
        l = true;
    }

    public final boolean d()
    {
        return m;
    }

    public final void onDeviceLocationEvent(dap dap1)
    {
        dap1 = dap1.a();
        if (a(h, dap1))
        {
            h = dap1;
            a("device_location_change");
        }
    }

    public final void onPinLocationEvent(daq daq1)
    {
        if (daq1 != null)
        {
            if (a(i, daq1 = daq1.a()))
            {
                i = daq1;
                a("pin_location_change");
                return;
            }
        }
    }

    public final void onTripUiStateChanged(fzc fzc1)
    {
        int i1;
label0:
        {
            i1 = fzc1.b();
            if (k != i1)
            {
                if (i1 != 4)
                {
                    break label0;
                }
                a("request_trip");
                k = i1;
            }
            return;
        }
        if (fte.b(k) && fte.d(i1))
        {
            k = i1;
            a("open");
            return;
        } else
        {
            k = i1;
            return;
        }
    }

    public final void onVehicleViewSelectedEvent(fzf fzf1)
    {
        if (!fzf1.a().equals(g))
        {
            g = fzf1.a();
            a("vvid_change");
        }
    }
}
