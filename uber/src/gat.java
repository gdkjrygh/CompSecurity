// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.LayoutInflater;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.map.Marker;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.trip.map.layer.pickup.DynamicPickupsWalkingCallout;
import com.ubercab.client.feature.trip.map.layer.pickup.HotspotMarker;
import com.ubercab.rider.realtime.model.GeoJsonPoint;
import com.ubercab.rider.realtime.model.Trip;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class gat extends ees
    implements ewn, ewo, ewp, ewr
{

    final Set a = new HashSet();
    gas b;
    Marker c;
    ckb d;
    UberLatLng e;
    private final cjf f;
    private final cev g;
    private final gau h;
    private final DynamicPickupsWalkingCallout i;
    private final gbi j;
    private final cjn k;
    private final ewm l;
    private final fte m;
    private final List n = new ArrayList();
    private final List o = new ArrayList();
    private final fxs p;
    private final eel q;
    private AnimatorSet r;
    private AnimatorSet s;
    private HotspotMarker t;
    private cjk u;
    private boolean v;
    private boolean w;

    public gat(Context context, cjf cjf1, cev cev1, gau gau1, gbi gbi1, cjn cjn1, eel eel1, 
            fte fte1, ewm ewm1, fxs fxs1)
    {
        u = new cjk();
        f = (cjf)gjz.a(cjf1);
        g = (cev)gjz.a(cev1);
        h = (gau)gjz.a(gau1);
        j = (gbi)gjz.a(gbi1);
        k = (cjn)gjz.a(cjn1);
        q = (eel)gjz.a(eel1);
        m = (fte)gjz.a(fte1);
        l = (ewm)gjz.a(ewm1);
        p = (fxs)gjz.a(fxs1);
        p.a(cjn1);
        i = (DynamicPickupsWalkingCallout)LayoutInflater.from(context).inflate(0x7f030054, null, false);
        i.a("SMART PICKUP");
        i.b("XX min walk");
        i.c("??");
    }

    private Animator a(HotspotMarker hotspotmarker)
    {
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            0, HotspotMarker.a(hotspotmarker.getState$646e883f()) * 2
        });
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener(hotspotmarker) {

            final HotspotMarker a;
            final gat b;

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                valueanimator1 = (Integer)valueanimator1.getAnimatedValue();
                a.setOverlayDimensions(valueanimator1.intValue());
            }

            
            {
                b = gat.this;
                a = hotspotmarker;
                super();
            }
        });
        valueanimator.setRepeatCount(-1);
        valueanimator.setRepeatMode(2);
        valueanimator.setDuration(500L);
        return valueanimator;
    }

    private HotspotMarker a(com.ubercab.rider.realtime.model.DynamicPickupsResponse.PickupLocation pickuplocation)
    {
        return j.a(pickuplocation, gbg.a);
    }

    private static com.ubercab.rider.realtime.model.DynamicPickupsResponse.PickupLocation a(UberLatLng uberlatlng)
    {
        return com.ubercab.rider.realtime.model.DynamicPickupsResponse.PickupLocation.create(new GeoJsonPoint(uberlatlng) {

            final UberLatLng a;

            public final volatile Object getCoordinates()
            {
                return getCoordinates();
            }

            public final List getCoordinates()
            {
                return Arrays.asList(new Double[] {
                    Double.valueOf(a.b()), Double.valueOf(a.a())
                });
            }

            public final String getType()
            {
                return "Point";
            }

            
            {
                a = uberlatlng;
                super();
            }
        });
    }

    private void a(UberLatLng uberlatlng, int i1)
    {
        i1 = Math.round((float)i1 * 2.0F * 1.2F);
        new cjf();
        cje cje = cjf.a(p.i());
        p();
        b = gau.a(k, cje, uberlatlng, i1);
    }

    private void a(UberLatLng uberlatlng, UberLatLng uberlatlng1)
    {
        if (d == null && uberlatlng != null && uberlatlng1 != null)
        {
            d = k.a((new ckc()).a(Arrays.asList(new UberLatLng[] {
                uberlatlng, uberlatlng1
            })).a(q.c()).a(q.a()));
            com.ubercab.rider.realtime.model.DynamicPickupsResponse.PickupLocation pickuplocation = a(uberlatlng);
            t = j.a(pickuplocation, gbg.a);
            t.getShowAnimator().start();
            a(t).start();
            if (w)
            {
                uberlatlng = cjk.a((new ciq()).a(uberlatlng).a(uberlatlng1).a(), 300);
                k.a(uberlatlng);
                return;
            }
        }
    }

    private void a(UberLatLng uberlatlng, String s1)
    {
        if (uberlatlng == null)
        {
            return;
        }
        i.c(s1);
        if (c != null)
        {
            c.a();
        }
        s1 = cjf.a(i.a());
        c = gau.a(k, s1, uberlatlng);
    }

    private void a(List list)
    {
        q();
        o.addAll(list);
        int j1 = Math.round(150F / (float)list.size());
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        for (int i1 = 0; list.hasNext(); i1 += j1)
        {
            Object obj = a((com.ubercab.rider.realtime.model.DynamicPickupsResponse.PickupLocation)list.next());
            a.add(obj);
            obj = ((HotspotMarker) (obj)).getShowAnimator();
            ((Animator) (obj)).setStartDelay(i1);
            arraylist.add(obj);
        }

        s = new AnimatorSet();
        s.playTogether(arraylist);
        s.start();
    }

    private void m()
    {
        if (!l.l())
        {
            return;
        }
        if (!l.k())
        {
            q();
            return;
        }
        int i1 = m.g();
        if (i1 == 3 && m.j())
        {
            if (m.h() != null)
            {
                a(m.h().getUberLatLng(), (int)Math.round(p.m()));
            }
        } else
        {
            p();
        }
        if (i1 == 5 || i1 == 6)
        {
            UberLatLng uberlatlng1 = l.n();
            UberLatLng uberlatlng = m.h().getUberLatLng();
            a(uberlatlng1, uberlatlng);
            if (l.o() != null)
            {
                String s1 = l.o().getEtaString();
                if (!TextUtils.isEmpty(s1))
                {
                    a(uberlatlng, s1);
                } else
                {
                    o();
                }
            }
        } else
        {
            n();
            o();
        }
        if (i1 != 3 && i1 != 4 && i1 != 0)
        {
            q();
        } else
        if (l.a() != null && l.a(o))
        {
            a(l.a());
        }
        if (i1 == 4)
        {
            w = true;
            r();
            return;
        } else
        {
            w = false;
            s();
            return;
        }
    }

    private void n()
    {
        if (d != null)
        {
            d.b();
            d = null;
        }
        if (t != null)
        {
            t.b();
            t = null;
        }
    }

    private void o()
    {
        if (c != null)
        {
            c.a();
            c = null;
        }
    }

    private void p()
    {
        if (b != null)
        {
            b.a();
            b = null;
        }
    }

    private void q()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((HotspotMarker)iterator.next()).getRemoveAnimator().start()) { }
        a.clear();
        o.clear();
    }

    private void r()
    {
        if (r == null)
        {
            r = t();
            r.start();
        }
    }

    private void s()
    {
        if (r != null)
        {
            r.end();
            r = null;
        }
    }

    private AnimatorSet t()
    {
        ArrayList arraylist = new ArrayList();
        Object obj = a.iterator();
        for (int i1 = 0; ((Iterator) (obj)).hasNext(); i1 += 90)
        {
            Animator animator = a((HotspotMarker)((Iterator) (obj)).next());
            animator.setStartDelay(i1);
            arraylist.add(animator);
        }

        obj = new AnimatorSet();
        ((AnimatorSet) (obj)).playTogether(arraylist);
        return ((AnimatorSet) (obj));
    }

    private boolean u()
    {
        return l.l();
    }

    public final void a(Point point)
    {
        if (!u())
        {
            return;
        } else
        {
            l.c();
            return;
        }
    }

    public final void a(cjg cjg1)
    {
        gjz.a(cjg1);
        while (!u() || !l.k()) 
        {
            return;
        }
        l.a(cjg1);
    }

    public final void d()
    {
        if (!u())
        {
            return;
        } else
        {
            l.c();
            return;
        }
    }

    public final void e()
    {
        if (v || !u())
        {
            return;
        } else
        {
            v = true;
            g.a(this);
            l.a(this);
            l.a(this);
            l.a(this);
            l.a(this);
            l.g();
            return;
        }
    }

    public final void f()
    {
        if (!v)
        {
            return;
        } else
        {
            v = false;
            g.b(this);
            l.b(this);
            l.b(this);
            l.b(this);
            l.b(this);
            return;
        }
    }

    public final void g()
    {
        m();
    }

    public final void h()
    {
        m();
    }

    public final void i()
    {
        m();
    }

    public final void j()
    {
        if (k.a() != null)
        {
            UberLatLng uberlatlng = e;
            e = k.a().b();
            if (uberlatlng != null && uberlatlng.equals(e))
            {
                return;
            }
        }
        q();
    }

    public final void k()
    {
        if (k.a() != null && e != null && e.equals(k.a().b()))
        {
            l.d();
        }
    }

    public final void l()
    {
        m();
    }

    public final void onDynamicPickupsCacheUpdatedEvent(evm evm)
    {
        if (u());
    }

    public final void onTripUiStateChangedEvent(fzc fzc)
    {
        m();
    }

    public final void u_()
    {
        m();
    }

    public final void v_()
    {
        m();
    }

    public final void y_()
    {
        super.y_();
        if (!u())
        {
            return;
        } else
        {
            l.b();
            return;
        }
    }
}
