// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.animation.LinearInterpolator;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.map.Marker;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.trip.map.layer.pins.DestinationPinView;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.FareInfo;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.UpfrontFare;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.ArrayList;
import java.util.List;

public final class gbo extends ees
    implements gbn
{

    private RiderLocation A;
    private RiderLocation B;
    private icl C;
    private dte D;
    Marker a;
    final DestinationPinView b;
    private final chp c;
    private final cjf d;
    private final cev e;
    private final hkr f;
    private final hku g;
    private final gmg h;
    private final cjn i;
    private final fqg j;
    private final dpg k;
    private final dak l;
    private final dal m;
    private final fte n;
    private final ewm o;
    private final int p;
    private boolean q;
    private boolean r;
    private int s;
    private Integer t;
    private String u;
    private Animator v;
    private Marker w;
    private Marker x;
    private Marker y;
    private Point z;

    public gbo(chp chp1, cjf cjf1, cev cev1, Context context, hkr hkr1, hku hku1, gmg gmg1, 
            cjn cjn1, fqg fqg1, dpg dpg1, dak dak1, dal dal1, fte fte1, ewm ewm1, 
            boolean flag)
    {
        s = 0x80000000;
        c = chp1;
        d = cjf1;
        e = cev1;
        f = hkr1;
        g = hku1;
        h = gmg1;
        i = cjn1;
        j = fqg1;
        k = dpg1;
        l = dak1;
        m = dal1;
        q = flag;
        n = fte1;
        o = ewm1;
        p = context.getResources().getInteger(0x7f0b0010);
        D = new dte(context);
        b = (DestinationPinView)LayoutInflater.from(context).inflate(0x7f0300a0, null, false);
        b.a(this);
    }

    private static Point a(Point point, Point point1, Point point2)
    {
        point1.negate();
        point2.offset(point1.x, point1.y);
        point2.negate();
        point.offset(point2.x, point2.y);
        return point;
    }

    private void a(Trip trip)
    {
        if (trip == null || trip.getPickupLocation() == null)
        {
            i();
        } else
        {
            Object obj = trip.getEtaString();
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                i();
                return;
            }
            if (!((String) (obj)).equals(u))
            {
                android.graphics.Bitmap bitmap = D.a(((String) (obj)));
                if (bitmap == null)
                {
                    i();
                    return;
                }
                u = ((String) (obj));
                obj = cjf.a(bitmap);
                trip = trip.getPickupLocation();
                trip = new UberLatLng(trip.getLatitude(), trip.getLongitude());
                if (x == null)
                {
                    trip = (new cjz()).a(((cje) (obj))).a(trip);
                    x = i.a(trip);
                    return;
                } else
                {
                    x.setPosition(trip);
                    x.setIcon(((cje) (obj)));
                    return;
                }
            }
        }
    }

    static void a(gbo gbo1, Trip trip)
    {
        gbo1.b(trip);
    }

    private static boolean a(RiderLocation riderlocation, Location location)
    {
        UberLatLng uberlatlng = null;
        if (riderlocation != null || location != null)
        {
            if (riderlocation != null)
            {
                riderlocation = riderlocation.getUberLatLng();
            } else
            {
                riderlocation = null;
            }
            if (location != null)
            {
                uberlatlng = new UberLatLng(location.getLatitude(), location.getLongitude());
            }
            if (riderlocation == null || location == null || !riderlocation.a(uberlatlng))
            {
                return false;
            }
        }
        return true;
    }

    private void b(Trip trip)
    {
        d(trip);
        c(trip);
        k();
        e(trip);
    }

    private void c(Trip trip)
    {
        if (n.i() == null)
        {
            j();
            return;
        }
        int i1 = n.g();
        boolean flag1 = n.a();
        boolean flag;
        if (flag1 && h.a(dbf.cK))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag1, flag);
        switch (i1)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            j();
            return;

        case 3: // '\003'
        case 4: // '\004'
            l();
            return;

        case 7: // '\007'
            f(trip);
            break;
        }
    }

    private void d(Trip trip)
    {
label0:
        {
            boolean flag3 = false;
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag4;
            boolean flag5;
            if (n.g() == 4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (n.g() == 3)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (n.g() == 2)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            flag4 = n.a();
            flag5 = n.j();
            if (!flag && (!flag1 || !flag4 || !flag5))
            {
                flag = flag3;
                if (!flag2)
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (trip != null && trip.getPickupLocation() != null)
        {
            trip = trip.getPickupLocation();
            trip = new UberLatLng(trip.getLatitude(), trip.getLongitude());
        } else
        if (l.b() != null)
        {
            trip = l.b().getUberLatLng();
        } else
        {
            trip = null;
        }
        if (trip == null || !flag)
        {
            if (y != null)
            {
                y.a();
                y = null;
            }
            return;
        }
        if (y != null)
        {
            y.setPosition(trip);
            return;
        } else
        {
            cje cje = cjf.a(0x7f020287);
            trip = (new cjz()).a(cje).a(trip);
            y = i.a(trip);
            return;
        }
    }

    private void e(Trip trip)
    {
        int i1 = n.g();
        if (i1 == 5 || i1 == 6)
        {
            if (!o.l() || !o.k())
            {
                a(trip);
                return;
            } else
            {
                i();
                return;
            }
        } else
        {
            i();
            return;
        }
    }

    private void f(Trip trip)
    {
        Integer integer;
        RiderLocation riderlocation;
label0:
        {
            Location location1 = null;
            boolean flag2 = false;
            riderlocation = n.i();
            RiderLocation riderlocation1 = n.h();
            int i1 = n.g();
            boolean flag;
            boolean flag1;
            boolean flag3;
            boolean flag4;
            boolean flag5;
            if (trip == null)
            {
                integer = null;
            } else
            {
                integer = Integer.valueOf(trip.getEtaToDestination());
            }
            flag3 = gjx.a(B, riderlocation1);
            flag4 = gjx.a(A, riderlocation);
            flag5 = gjx.a(t, integer);
            if (s == i1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (r == q)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            B = riderlocation1;
            A = riderlocation;
            s = i1;
            t = integer;
            r = q;
            if (flag3 && flag4 && flag5 && flag && flag1 && a != null)
            {
                return;
            }
            if (!flag3 || !flag4 || !flag)
            {
                q = false;
            }
            flag = flag2;
            if (h.a(dbf.bF))
            {
                break label0;
            }
            Location location;
            if (trip != null)
            {
                location = trip.getPickupLocation();
            } else
            {
                location = null;
            }
            if (trip != null)
            {
                location1 = trip.getDestination();
            }
            flag3 = a(riderlocation1, location);
            flag4 = a(riderlocation, location1);
            if (flag3)
            {
                flag = flag2;
                if (flag4)
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (flag)
        {
            trip = cjf.a(0x7f020284);
        } else
        if (integer != null)
        {
            trip = cjf.a(D.a(integer.intValue(), q));
        } else
        {
            trip = cjf.a(0x7f020282);
        }
        if (a == null)
        {
            trip = (new cjz()).a(trip).a(riderlocation.getUberLatLng());
            a = i.a(trip);
            return;
        } else
        {
            a.setPosition(riderlocation.getUberLatLng());
            a.setIcon(trip);
            return;
        }
    }

    private void g()
    {
        Object obj;
        if (w == null)
        {
            if ((obj = l.c()) != null)
            {
                cje cje = cjf.a(0x7f02022e);
                obj = (new cjz()).a(cje).a(0.5F, 0.5F).a(((RiderLocation) (obj)).getUberLatLng());
                w = i.a(((cjz) (obj)));
                return;
            }
        }
    }

    private void h()
    {
        if (w == null)
        {
            return;
        } else
        {
            w.a();
            w = null;
            return;
        }
    }

    private void i()
    {
        if (x != null)
        {
            x.a();
            x = null;
            u = null;
        }
    }

    private void j()
    {
        if (a != null)
        {
            a.a();
            a = null;
        }
    }

    private void k()
    {
        int i1 = n.g();
        if (i1 != 4 && i1 != 7)
        {
            g();
            return;
        } else
        {
            h();
            return;
        }
    }

    private void l()
    {
        Object obj = n.i();
        cje cje = cjf.a(b.d());
        if (a == null)
        {
            obj = (new cjz()).a(cje).a(((RiderLocation) (obj)).getUberLatLng());
            a = i.a(((cjz) (obj)));
            return;
        } else
        {
            a.setIcon(cje);
            a.setPosition(((RiderLocation) (obj)).getUberLatLng());
            return;
        }
    }

    final void a(Animator animator)
    {
        v = animator;
    }

    public final void a(Bundle bundle)
    {
        bundle.putBoolean("com.ubercab.STATE_SHOW_DESTINATION_ETA_TIME", q);
    }

    public final void a(Marker marker)
    {
        if (a != null && marker.getId().equals(a.getId()))
        {
            boolean flag;
            if (!q)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            q = flag;
            c(f.f());
            if (h.a(dbf.aT) && z != null)
            {
                b.a(z);
            } else
            {
                if (b.c())
                {
                    c();
                    return;
                }
                if (b.b())
                {
                    z_();
                    return;
                }
            }
        }
    }

    public final List b()
    {
        if (n.i() != null && n.g() == 3 && n.a() && b.b())
        {
            ckd ckd1 = i.b();
            if (ckd1 != null)
            {
                Object obj = n.i().getUberLatLng();
                int i2 = b.getWidth();
                int l1 = b.getHeight();
                obj = ckd1.a(((UberLatLng) (obj)));
                int i1 = ((Point) (obj)).x;
                int j1 = i2 / 2;
                int k1 = ((Point) (obj)).x;
                i2 /= 2;
                l1 = ((Point) (obj)).y - l1;
                obj = new ArrayList();
                ((List) (obj)).add(ckd1.a(new Point(i1 - j1, l1)));
                ((List) (obj)).add(ckd1.a(new Point(i2 + k1, l1)));
                return ((List) (obj));
            }
        }
        return null;
    }

    public final void b(Point point)
    {
        if (h.a(dbf.aT) && fte.e(n.g()) && a != null && i.b() != null)
        {
            z = a(point, b.a(), i.b().a(a.getPosition()));
        }
    }

    public final void c()
    {
        c.a(n.de);
        e.c(new fyj());
    }

    public final void e()
    {
        e.a(this);
        if (C == null || C.c())
        {
            C = g.h().c(new gbp(this, (byte)0));
        }
    }

    public final void f()
    {
        if (v != null)
        {
            v.end();
        }
        e.b(this);
        if (C != null)
        {
            C.b();
        }
    }

    public final void onDestinationChangedEvent(fyi fyi)
    {
        b(f.f());
    }

    public final void onDeviceLocationEvent(dap dap1)
    {
        dap1 = dap1.a();
        if (w == null)
        {
            return;
        }
        dap1 = dap1.getUberLatLng();
        TypeEvaluator typeevaluator = new TypeEvaluator() {

            final gbo a;

            private static UberLatLng a(float f1, UberLatLng uberlatlng, UberLatLng uberlatlng1)
            {
                return dub.a(f1, uberlatlng, uberlatlng1);
            }

            public final Object evaluate(float f1, Object obj, Object obj1)
            {
                return a(f1, (UberLatLng)obj, (UberLatLng)obj1);
            }

            
            {
                a = gbo.this;
                super();
            }
        };
        dap1 = ObjectAnimator.ofObject(w, "position", typeevaluator, new Object[] {
            dap1
        });
        dap1.setInterpolator(new LinearInterpolator());
        dap1.setDuration(p);
        dap1.addListener(new drv() {

            final gbo a;

            public final void onAnimationEnd(Animator animator)
            {
                super.onAnimationEnd(animator);
                a.a(null);
            }

            
            {
                a = gbo.this;
                super();
            }
        });
        dap1.start();
        if (v != null)
        {
            v.cancel();
        }
        a(dap1);
    }

    public final void onFareEvent(fyk fyk1)
    {
        boolean flag2 = true;
        Trip trip = f.f();
        if (!n.a())
        {
            c(trip);
            return;
        }
        Object obj1 = j.b();
        UpfrontFare upfrontfare = j.d();
        boolean flag3 = h.a(dbf.aT);
        Object obj = m.E();
        City city = f.b();
        boolean flag;
        boolean flag1;
        if (city == null)
        {
            obj = null;
        } else
        {
            obj = city.findVehicleViewById(((String) (obj)));
        }
        if (obj != null)
        {
            if ((((VehicleView) (obj)).getAllowFareEstimate() || upfrontfare != null) && !n.n())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && upfrontfare != null && upfrontfare.getCapacity() != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag || obj1 == null || !((FareInfo) (obj1)).isFareElevated())
            {
                flag2 = false;
            }
            flag3 = flag2 & flag3;
        } else
        {
            flag = false;
            flag1 = false;
        }
        if (flag && upfrontfare != null)
        {
            c.a(AnalyticsEvent.create("impression").setName(l.ff).setValue(fyk1.b()));
        }
        obj1 = b;
        if (flag)
        {
            obj = fyk1.b();
        } else
        {
            obj = "";
        }
        ((DestinationPinView) (obj1)).a(((String) (obj)));
        b.a(flag3);
        obj = b;
        if (flag)
        {
            fyk1 = fyk1.c();
        } else
        {
            fyk1 = "";
        }
        ((DestinationPinView) (obj)).b(fyk1);
        obj = b;
        if (flag1)
        {
            fyk1 = upfrontfare.getCapacity().toString();
        } else
        {
            fyk1 = "";
        }
        ((DestinationPinView) (obj)).c(fyk1);
        c(trip);
    }

    public final void onPingEvent(dar dar)
    {
        if (k.n())
        {
            return;
        } else
        {
            b(f.f());
            return;
        }
    }

    public final void onTripUiStateChangedEvent(fzc fzc)
    {
        b(f.f());
    }

    public final void z_()
    {
        c.a(n.dg);
        e.c(new fyz());
    }
}
