// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.Client;
import com.ubercab.client.core.model.LocationHistoryResponse;
import com.ubercab.client.core.model.LocationSearchResults;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.trip.map.MapFragment;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.ReverseGeocode;
import com.ubercab.rider.realtime.request.param.Location;

public final class fta
    implements dcm
{

    private final chp a;
    private final cev b;
    private final hkr c;
    private final hku d;
    private final gmg e;
    private final dkd f;
    private final hjm g;
    private final dch h;
    private final dpa i;
    private final dpg j;
    private final dkn k;
    private final dak l;
    private final fte m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private UberLatLng t;
    private ftd u;
    private RiderLocation v;
    private icl w;

    public fta(chp chp1, cev cev1, hkr hkr1, hku hku1, gmg gmg1, dkd dkd1, dch dch1, 
            hjm hjm, dpa dpa1, dpg dpg1, dkn dkn1, dak dak1, fte fte1)
    {
        n = true;
        a = chp1;
        b = cev1;
        c = hkr1;
        d = hku1;
        e = gmg1;
        f = dkd1;
        h = dch1;
        g = hjm;
        i = dpa1;
        j = dpg1;
        k = dkn1;
        l = dak1;
        m = fte1;
        u = ftd.a;
    }

    static RiderLocation a(fta fta1, RiderLocation riderlocation)
    {
        fta1.v = riderlocation;
        return riderlocation;
    }

    static dak a(fta fta1)
    {
        return fta1.l;
    }

    private static boolean a(ClientStatus clientstatus)
    {
        if (clientstatus == null)
        {
            clientstatus = null;
        } else
        {
            clientstatus = clientstatus.getStatus();
        }
        return "Looking".equals(clientstatus);
    }

    private void b(RiderLocation riderlocation)
    {
        if (!q)
        {
            q = true;
            if (riderlocation != null)
            {
                a.a(l.eC);
                l.a(riderlocation);
                u = ftd.c;
                return;
            }
        }
    }

    private void b(LocationHistoryResponse locationhistoryresponse)
    {
        Object obj = null;
        int i1 = m.g();
        boolean flag;
        if (fte.d(i1) || fte.e(i1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        RiderLocation riderlocation;
        if (flag)
        {
            if ((riderlocation = l.b()) == null || !riderlocation.isExternalLocation())
            {
                if (locationhistoryresponse != null)
                {
                    locationhistoryresponse = locationhistoryresponse.getPickups();
                } else
                {
                    locationhistoryresponse = null;
                }
                if (locationhistoryresponse != null && locationhistoryresponse.getPrimaryResult() != null)
                {
                    locationhistoryresponse = RiderLocation.create(locationhistoryresponse.getPrimaryResult());
                } else
                {
                    locationhistoryresponse = null;
                }
                if (p())
                {
                    locationhistoryresponse = obj;
                }
                b(((RiderLocation) (locationhistoryresponse)));
                return;
            }
        }
    }

    private boolean c(RiderLocation riderlocation)
    {
        while (riderlocation == null || u != ftd.g) 
        {
            return false;
        }
        return true;
    }

    private void m()
    {
        if (m.g() != 3)
        {
            return;
        } else
        {
            s = true;
            return;
        }
    }

    private boolean n()
    {
        return u == ftd.e;
    }

    private void o()
    {
        RiderLocation riderlocation = l.b();
        if (riderlocation == null)
        {
            u = ftd.a;
        } else
        {
            if ("venue".equals(riderlocation.getType()))
            {
                u = ftd.h;
                return;
            }
            if ("hotspot".equals(riderlocation.getType()))
            {
                u = ftd.g;
                return;
            }
            if (riderlocation.isDeviceLocation())
            {
                u = ftd.e;
                return;
            }
            if ("manual".equals(riderlocation.getType()))
            {
                u = ftd.f;
                return;
            }
            if (riderlocation.isLocationSearchResult())
            {
                u = ftd.b;
                return;
            }
            if (riderlocation.isExternalLocation())
            {
                u = ftd.d;
                return;
            }
        }
    }

    private boolean p()
    {
        return p;
    }

    private boolean q()
    {
        RiderLocation riderlocation = l.b();
        ClientStatus clientstatus = c.d();
        if (clientstatus != null)
        {
            boolean flag = a(clientstatus);
            if (!o && p && riderlocation != null && flag)
            {
                return true;
            }
        }
        return false;
    }

    private void r()
    {
        n = true;
        p = false;
    }

    public final void a()
    {
        if (!e.a(dbf.bM))
        {
            return;
        } else
        {
            h.a(this);
            return;
        }
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            q = bundle.getBoolean("com.ubercab.PIN_INITIALIZED", false);
            p = bundle.getBoolean("com.ubercab.USER_MOVED_MAP", false);
        }
    }

    public final void a(RiderLocation riderlocation)
    {
        n = false;
        l.a(riderlocation);
        o();
    }

    public final void a(LocationHistoryResponse locationhistoryresponse)
    {
        if (!e.a(dbf.bM))
        {
            return;
        } else
        {
            h.a(this);
            b(locationhistoryresponse);
            return;
        }
    }

    final void a(ReverseGeocode reversegeocode)
    {
        RiderLocation riderlocation = l.b();
        if (riderlocation != null && reversegeocode != null)
        {
            boolean flag = "manual".equals(riderlocation.getType());
            boolean flag1 = "external".equals(riderlocation.getType());
            boolean flag2 = riderlocation.isDeviceLocation();
            boolean flag3 = riderlocation.isHotspotLocation();
            boolean flag4 = (new UberLatLng(reversegeocode.getLatitude(), reversegeocode.getLongitude())).b(riderlocation.getUberLatLng());
            if (!riderlocation.hasReverseGeocodeData() && (flag || flag1 || flag2 || flag3) && flag4 && !o)
            {
                o();
                l.a(RiderLocation.updateWithReverseGeocode(riderlocation, reversegeocode));
            }
        }
    }

    public final void a(boolean flag)
    {
        o = flag;
        s = true;
    }

    public final boolean a(UberLatLng uberlatlng)
    {
        RiderLocation riderlocation = l.b();
        return riderlocation != null && c(riderlocation) && riderlocation.getUberLatLng().a(uberlatlng);
    }

    public final void b(Bundle bundle)
    {
        bundle.putBoolean("com.ubercab.PIN_INITIALIZED", q);
        bundle.putBoolean("com.ubercab.USER_MOVED_MAP", p);
    }

    public final void b(UberLatLng uberlatlng)
    {
        boolean flag1 = false;
        t = uberlatlng;
        if (!d())
        {
            b.c(new fze(null));
        } else
        if (q())
        {
            RiderLocation riderlocation;
            boolean flag;
label0:
            {
                riderlocation = l.b();
                flag = flag1;
                if (riderlocation == null)
                {
                    break label0;
                }
                if (riderlocation.getUberLatLng() != null)
                {
                    flag = flag1;
                    if (riderlocation.getUberLatLng().b(uberlatlng))
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            if (flag)
            {
                l.a(RiderLocation.create(uberlatlng));
                o();
                return;
            } else
            {
                b.c(new fze(riderlocation));
                return;
            }
        }
    }

    public final boolean b()
    {
        RiderLocation riderlocation = m.h();
        if (riderlocation != null)
        {
            RiderLocation riderlocation1;
            boolean flag;
            boolean flag1;
            boolean flag2;
            if (m.g() == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (riderlocation.getAccuracy() > 1000F)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            riderlocation1 = l.c();
            if (riderlocation1 != null && riderlocation1.getUberLatLng().equals(riderlocation.getUberLatLng()))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (n() && flag2)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (!s && flag && flag2 && flag1)
            {
                return true;
            }
        }
        return false;
    }

    public final ftd c()
    {
        return u;
    }

    public final boolean d()
    {
        boolean flag1 = false;
        RiderLocation riderlocation = l.b();
        boolean flag;
        if (riderlocation == null || riderlocation.getUberLatLng() == null || !riderlocation.getUberLatLng().b(t))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!o || !flag)
        {
            flag1 = true;
        }
        return flag1;
    }

    public final void e()
    {
        if (!r)
        {
            l();
            Eyeball eyeball = c.e();
            if (eyeball != null)
            {
                a(eyeball.getReverseGeocode());
            }
            if (w == null)
            {
                w = d.i().a(ica.a(d.e(), d.g(), new ftc()), new idj() {

                    final fta a;

                    private static ftc a(ftc ftc1)
                    {
                        return ftc1;
                    }

                    public final volatile Object a(Object obj, Object obj1)
                    {
                        return a((ftc)obj1);
                    }

            
            {
                a = fta.this;
                super();
            }
                }).a(ico.a()).c(new ftb(this, (byte)0));
            }
            b.a(this);
            r = true;
        }
    }

    public final void f()
    {
        if (r)
        {
            h.a(this);
            b.b(this);
            if (w != null)
            {
                w.b();
                w = null;
            }
            r = false;
        }
    }

    public final boolean g()
    {
        return u == ftd.g || u == ftd.h;
    }

    public final void h()
    {
        p = true;
    }

    public final void i()
    {
        l.a(RiderLocation.create(MapFragment.c));
        u = ftd.a;
    }

    public final String j()
    {
        Object obj = l.b();
        if (obj == null)
        {
            return null;
        }
        if (((RiderLocation) (obj)).getTag() != null)
        {
            obj = ((RiderLocation) (obj)).getTag();
        } else
        {
            obj = ((RiderLocation) (obj)).getType();
        }
        return String.format("%s:%s", new Object[] {
            obj, u.a()
        });
    }

    final void k()
    {
        l.e();
        q = false;
    }

    final void l()
    {
        boolean flag3 = true;
        boolean flag;
        if (m.g() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        RiderLocation riderlocation;
        if (flag)
        {
            if ((riderlocation = l.c()) != null)
            {
                RiderLocation riderlocation1 = l.b();
                if (riderlocation1 == null)
                {
                    l.a(riderlocation);
                    o();
                    return;
                }
                if (!p && n)
                {
                    UberLatLng uberlatlng = riderlocation.getUberLatLng();
                    boolean flag4 = riderlocation1.isExternalLocation();
                    boolean flag1;
                    boolean flag2;
                    boolean flag5;
                    if (riderlocation1.getUberLatLng().b(uberlatlng))
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    flag5 = riderlocation1.isLocationSearchResult();
                    if (UberLatLng.a(uberlatlng, riderlocation1.getUberLatLng()) <= 200D)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    if (flag5 && flag2)
                    {
                        flag2 = flag3;
                    } else
                    {
                        flag2 = false;
                    }
                    if (!flag4 && !flag1 && !flag2)
                    {
                        a.a(l.eL);
                        l.a(riderlocation);
                        o();
                        return;
                    }
                }
            }
        }
    }

    public final void onForcePinLocationEvent(gaq gaq1)
    {
        a(gaq1.a());
    }

    public final void onLocationHistoryResponse(dme dme1)
    {
        while (e.a(dbf.bM) || !dme1.i()) 
        {
            return;
        }
        b((LocationHistoryResponse)dme1.g());
    }

    public final void onMapClickCurrentLocationEvent(fyp fyp)
    {
        fyp = l.c();
        if (fyp == null)
        {
            return;
        } else
        {
            l.a(fyp);
            r();
            u = ftd.e;
            m();
            return;
        }
    }

    public final void onPinLocationEvent(daq daq1)
    {
        daq1 = daq1.a();
        com.ubercab.rider.realtime.model.Client client = c.c();
        ClientStatus clientstatus = c.d();
        if (client != null && clientstatus != null)
        {
            boolean flag = a(clientstatus);
            if (!q && flag)
            {
                if (!e.a(dbf.bM))
                {
                    f.a(daq1.getUberLatLng().a(), daq1.getUberLatLng().b());
                } else
                {
                    h.b(this);
                }
            }
            if (flag)
            {
                b.c(new fze(daq1));
            }
            if (v != null && daq1.getUberLatLng() != null && !daq1.getUberLatLng().equals(v.getUberLatLng()))
            {
                if (j.n())
                {
                    daq1 = daq1.getUberLatLng();
                    daq1 = Location.create(daq1.a(), daq1.b());
                    i.a(daq1, g).h();
                    return;
                } else
                {
                    k.d();
                    return;
                }
            }
        }
    }

    public final void onPingEvent(dar dar1)
    {
        if (!j.n()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!dul.a(dar1 = dar1.a())) goto _L1; else goto _L3
_L3:
        String s1;
        byte byte0;
        s1 = dar1.getClient().getStatus();
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 2: default 64
    //                   -1929061692: 114
    //                   2014441667: 100;
           goto _L4 _L5 _L6
_L4:
        byte0;
        JVM INSTR tableswitch 0 1: default 88
    //                   0 129
    //                   1 147;
           goto _L7 _L8 _L9
_L7:
        v = l.b();
        return;
_L6:
        if (s1.equals("Looking"))
        {
            byte0 = 0;
        }
          goto _L4
_L5:
        if (s1.equals("OnTrip"))
        {
            byte0 = 1;
        }
          goto _L4
_L8:
        l();
        a(dar1.getClient().getReverseGeocode());
          goto _L7
_L9:
        k();
          goto _L7
    }

    public final void onTripUiStateChangedEvent(fzc fzc1)
    {
        int i1 = fzc1.b();
        if (i1 != 3)
        {
            s = false;
        }
        if (fte.c(i1))
        {
            q = false;
            r();
        }
    }
}
