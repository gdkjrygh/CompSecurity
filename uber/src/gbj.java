// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.feature.pickup.model.RegionGroupData;
import com.ubercab.client.feature.trip.map.layer.pickup.HotspotMarker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class gbj
    implements gbh
{

    static boolean a = false;
    final List b = new ArrayList();
    private final chp c;
    private final gbi d;
    private Set e;
    private RegionGroupData f;
    private boolean g;
    private boolean h;
    private int i;
    private Animator j;
    private AnimatorSet k;
    private AnimatorSet l;
    private AnimatorSet m;
    private HotspotMarker n;
    private com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation o;

    gbj(chp chp1, gbi gbi1)
    {
        i = gbg.a;
        c = chp1;
        d = gbi1;
    }

    static int a(gbj gbj1, int i1)
    {
        gbj1.i = i1;
        return i1;
    }

    private void q()
    {
        if (f == null || e == null || e.isEmpty())
        {
            return;
        }
        Iterator iterator = e.iterator();
        float f1 = 0.0F;
        HotspotMarker hotspotmarker = null;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation pickuplocation = (com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation)iterator.next();
            HotspotMarker hotspotmarker1 = d.a(pickuplocation, i);
            hotspotmarker1.a(this);
            b.add(hotspotmarker1);
            if (o != null)
            {
                if (pickuplocation == o)
                {
                    hotspotmarker = hotspotmarker1;
                }
            } else
            if (pickuplocation.getRank() != null && pickuplocation.getRank().floatValue() > f1)
            {
                f1 = pickuplocation.getRank().floatValue();
                hotspotmarker = hotspotmarker1;
            }
        } while (true);
        HotspotMarker hotspotmarker2 = hotspotmarker;
        if (!b.isEmpty())
        {
            hotspotmarker2 = hotspotmarker;
            if (hotspotmarker == null)
            {
                hotspotmarker2 = hotspotmarker;
                if (a)
                {
                    hotspotmarker2 = (HotspotMarker)b.get(0);
                }
            }
        }
        n = hotspotmarker2;
    }

    private boolean r()
    {
        return l != null && l.isRunning() || k != null && k.isRunning() || m != null && m.isRunning();
    }

    private boolean s()
    {
        return k != null && (k.isRunning() || k.isStarted());
    }

    public final void a()
    {
        c.a(AnalyticsEvent.create("impression").setName(l.bW).setValue(b()).setValuePosition(Long.valueOf(e.size())));
    }

    public final void a(com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation pickuplocation)
    {
        p();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            HotspotMarker hotspotmarker = (HotspotMarker)iterator.next();
            if (hotspotmarker.getPickupLocation() != pickuplocation)
            {
                continue;
            }
            n = hotspotmarker;
            break;
        } while (true);
        if (j() != null)
        {
            j().start();
        }
    }

    final void a(RegionGroupData regiongroupdata, int i1, boolean flag, boolean flag1, boolean flag2)
    {
        a(regiongroupdata, i1, flag, flag1, flag2, null);
    }

    final void a(RegionGroupData regiongroupdata, int i1, boolean flag, boolean flag1, boolean flag2, com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation pickuplocation)
    {
        f = regiongroupdata;
        g = flag;
        h = flag2;
        Set set;
        if (flag1)
        {
            set = f.getAllPickupLocations();
        } else
        {
            set = f.getPickupLocations();
        }
        e = set;
        o = pickuplocation;
        i = i1;
        f = regiongroupdata;
        q();
    }

    final boolean a(UberLatLng uberlatlng)
    {
        return f != null && f.containsLatLng(uberlatlng);
    }

    final com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation b(UberLatLng uberlatlng)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            HotspotMarker hotspotmarker = (HotspotMarker)iterator.next();
            if (hotspotmarker.a(uberlatlng))
            {
                return (com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation)hotspotmarker.getPickupLocation();
            }
        }

        return null;
    }

    final String b()
    {
        ArrayList arraylist = new ArrayList(f.getAllRegionIds());
        Collections.sort(arraylist);
        return gjw.a(":").a(arraylist);
    }

    final String c()
    {
        if (f != null)
        {
            return f.getRegionData().getProperties().getId();
        } else
        {
            return null;
        }
    }

    final void c(UberLatLng uberlatlng)
    {
        if (!b.isEmpty() && !r() && g)
        {
            Iterator iterator = b.iterator();
            while (iterator.hasNext()) 
            {
                HotspotMarker hotspotmarker = (HotspotMarker)iterator.next();
                hotspotmarker.a(UberLatLng.a(uberlatlng, hotspotmarker.getPosition()));
            }
        }
    }

    final boolean d()
    {
        if (s())
        {
            return false;
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (((HotspotMarker)iterator.next()).a())
            {
                return true;
            }
        }

        return false;
    }

    final boolean e()
    {
        return i == gbg.a;
    }

    final Animator f()
    {
        if (l == null)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = b.iterator();
            for (int i1 = 0; iterator.hasNext(); i1 += 50)
            {
                Animator animator = ((HotspotMarker)iterator.next()).getShowAnimator();
                if (g)
                {
                    animator.setStartDelay(i1);
                }
                arraylist.add(animator);
            }

            l = new AnimatorSet();
            l.playTogether(arraylist);
            if (!g)
            {
                l.setDuration(0L);
            }
        }
        return l;
    }

    final Animator g()
    {
        if (k == null)
        {
            Object obj = new ArrayList();
            for (Iterator iterator = b.iterator(); iterator.hasNext(); ((List) (obj)).add(((HotspotMarker)iterator.next()).getRemoveAnimator())) { }
            k = new AnimatorSet();
            k.playTogether(((java.util.Collection) (obj)));
            obj = k;
            long l1;
            if (g)
            {
                l1 = 1000L;
            } else
            {
                l1 = 0L;
            }
            ((AnimatorSet) (obj)).setDuration(l1);
        }
        return k;
    }

    final void h()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((HotspotMarker)iterator.next()).b(this)) { }
        b.clear();
    }

    final Animator i()
    {
        if (m == null)
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = b.iterator(); iterator.hasNext(); arraylist.add(((HotspotMarker)iterator.next()).getTransitionToPrimaryAnimator())) { }
            m = new AnimatorSet();
            m.playTogether(arraylist);
            m.addListener(new AnimatorListenerAdapter() {

                final gbj a;

                public final void onAnimationStart(Animator animator)
                {
                    gbj.a(a, gbg.a);
                }

            
            {
                a = gbj.this;
                super();
            }
            });
            if (!g)
            {
                m.setDuration(0L);
            }
        }
        return m;
    }

    final Animator j()
    {
        if (n != null && h)
        {
            j = n.getPulseAnimator();
            return j;
        } else
        {
            return null;
        }
    }

    final com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation k()
    {
        if (n == null || i != gbg.a)
        {
            return null;
        } else
        {
            return (com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation)n.getPickupLocation();
        }
    }

    final UberLatLng l()
    {
        if (n == null || i != gbg.a)
        {
            return null;
        } else
        {
            return n.getPosition();
        }
    }

    public final Set m()
    {
        return e;
    }

    final void n()
    {
        if (l != null)
        {
            l.cancel();
        }
    }

    final void o()
    {
        if (k != null)
        {
            k.cancel();
        }
    }

    final void p()
    {
        if (n != null)
        {
            n.setSelected(false);
        }
        if (j != null && (j.isRunning() || j.isStarted()))
        {
            j.cancel();
        }
    }

}
