// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.graphics.Point;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.pickup.model.RegionGroupData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class gaz extends ees
    implements ewi
{

    gbj a;
    ckb b;
    private final chp c;
    private final ewg d;
    private final ewh e;
    private final cjn f;
    private final fzl g;
    private final hzb h;
    private final dak i;
    private boolean j;
    private String k;
    private int l;
    private float m;

    public gaz(chp chp1, ewg ewg1, ewh ewh1, cjn cjn1, fzl fzl1, hzb hzb1, RiderActivity rideractivity, 
            dak dak1)
    {
        c = chp1;
        d = ewg1;
        e = ewh1;
        f = cjn1;
        g = fzl1;
        h = hzb1;
        i = dak1;
        l = rideractivity.getResources().getColor(0x7f0d0081);
        m = rideractivity.getResources().getDimension(0x7f0800c6);
    }

    private void a(UberLatLng uberlatlng)
    {
        RiderLocation riderlocation = i.b();
        if (riderlocation == null)
        {
            return;
        }
        if (b != null)
        {
            b.b();
        }
        uberlatlng = gke.a(riderlocation.getUberLatLng(), uberlatlng);
        uberlatlng = (new ckc()).a(uberlatlng).a(m).a(l);
        b = f.a(uberlatlng);
    }

    private String b(com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation pickuplocation)
    {
        pickuplocation = pickuplocation.getProperties().getId();
        return String.format("%s:is_primary=%s", new Object[] {
            pickuplocation, Boolean.valueOf(pickuplocation.equals(k))
        });
    }

    private void h()
    {
        if (a != null)
        {
            a.n();
            a.p();
            a.g().start();
            a = null;
            k = null;
        }
        if (b != null)
        {
            b.b();
            b = null;
        }
    }

    public final void a(Point point)
    {
        ckd ckd1 = f.b();
        if (ckd1 != null && a != null)
        {
            point = ckd1.a(point);
            point = a.b(point);
            if (point != null)
            {
                c.a(AnalyticsEvent.create("tap").setName(n.gY).setValue(b(point)));
                e.a(point);
            }
        }
    }

    public final void a(com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation pickuplocation)
    {
        if (a == null)
        {
            return;
        } else
        {
            a.a(pickuplocation);
            a(pickuplocation.getLatLng());
            return;
        }
    }

    public final void a(RegionGroupData regiongroupdata, com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation pickuplocation)
    {
        if (a == null) goto _L2; else goto _L1
_L1:
        if (!regiongroupdata.getRegionData().getProperties().getId().equals(a.c())) goto _L4; else goto _L3
_L3:
        a(pickuplocation.getLatLng());
_L6:
        return;
_L4:
        h();
_L2:
        k = pickuplocation.getProperties().getId();
        a = (gbj)h.a();
        a.a(regiongroupdata, gbg.a, true, false, true, pickuplocation);
        Animator animator = a.f();
        animator.addListener(new AnimatorListenerAdapter() {

            final gaz a;

            public final void onAnimationCancel(Animator animator1)
            {
                a.g();
            }

            public final void onAnimationEnd(Animator animator1)
            {
                a.g();
            }

            
            {
                a = gaz.this;
                super();
            }
        });
        animator.start();
        a(pickuplocation.getLatLng());
        regiongroupdata = regiongroupdata.getPickupLocations().iterator();
        while (regiongroupdata.hasNext()) 
        {
            pickuplocation = (com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation)regiongroupdata.next();
            c.a(AnalyticsEvent.create("impression").setName(l.hW).setValue(b(pickuplocation)));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final List b()
    {
        Object obj;
        if (a != null)
        {
            if ((obj = a.m()) != null)
            {
                ArrayList arraylist = new ArrayList(((Set) (obj)).size());
                for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation)((Iterator) (obj)).next()).getLatLng())) { }
                return arraylist;
            }
        }
        return null;
    }

    public final void c()
    {
        h();
    }

    public final void e()
    {
        if (j || d.e() || !d.c())
        {
            return;
        } else
        {
            j = true;
            e.a(this);
            e.a(Collections.singletonList(this));
            return;
        }
    }

    public final void f()
    {
        if (!j)
        {
            return;
        } else
        {
            j = false;
            e.b(this);
            h();
            return;
        }
    }

    final void g()
    {
        if (a == null)
        {
            return;
        }
        Animator animator = a.j();
        if (animator == null)
        {
            h();
            return;
        } else
        {
            animator.start();
            g.b();
            return;
        }
    }
}
