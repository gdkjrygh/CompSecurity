// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.pickup.model.RegionGroupData;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ewh
    implements evu
{

    RegionGroupData a;
    com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation b;
    boolean c;
    int d;
    private final cev e;
    private final evt f;
    private final ewg g;
    private final dak h;
    private final List i = new CopyOnWriteArrayList();
    private final evn j;
    private boolean k;

    public ewh(cev cev1, evn evn1, evt evt1, ewg ewg1, dak dak1)
    {
        d = 0x80000000;
        e = cev1;
        g = ewg1;
        f = evt1;
        h = dak1;
        j = evn1;
    }

    private static com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation a(RegionGroupData regiongroupdata)
    {
        Object obj = null;
        Object obj1 = null;
        regiongroupdata = regiongroupdata.getPickupLocations();
        float f1 = 0.0F;
        if (regiongroupdata != null)
        {
            Iterator iterator = regiongroupdata.iterator();
            regiongroupdata = obj1;
            do
            {
                obj = regiongroupdata;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = (com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation)iterator.next();
                Float float1 = ((com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation) (obj)).getRank();
                if (float1 != null && float1.floatValue() > f1)
                {
                    f1 = float1.floatValue();
                    regiongroupdata = ((RegionGroupData) (obj));
                }
            } while (true);
        }
        return ((com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation) (obj));
    }

    private void g()
    {
        com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation pickuplocation = null;
        if (i()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = h.b();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((RiderLocation) (obj)).getUberLatLng();
        }
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = f.a(((com.ubercab.android.location.UberLatLng) (obj)), "building");
        }
        if (obj != null)
        {
            pickuplocation = a(((RegionGroupData) (obj)));
        }
        if (a != obj || pickuplocation != b)
        {
            b = pickuplocation;
            a = ((RegionGroupData) (obj));
            h();
            if (a != null && (d == 0 || d == 2))
            {
                obj = a.getAllPickupLocations().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    pickuplocation = (com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation)((Iterator) (obj)).next();
                    j.a(pickuplocation.getLatLng());
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void h()
    {
        a(i);
    }

    private boolean i()
    {
        return !g.e() && g.c();
    }

    public final void a(com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation pickuplocation)
    {
        b = pickuplocation;
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((ewi)iterator.next()).a(pickuplocation)) { }
    }

    public final void a(ewi ewi1)
    {
        i.add(ewi1);
    }

    public final void a(List list)
    {
        if (i())
        {
            boolean flag;
            if (c && a != null && b != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            list = list.iterator();
            while (list.hasNext()) 
            {
                ewi ewi1 = (ewi)list.next();
                if (flag)
                {
                    ewi1.a(a, b);
                } else
                {
                    ewi1.c();
                }
            }
        }
    }

    public final boolean a(int l)
    {
        if (g.c()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (g.e())
        {
            break; /* Loop/switch isn't completed */
        }
        if (a == null)
        {
            g();
        }
        if (b == null) goto _L1; else goto _L3
_L3:
        return f.b(l);
    }

    public final void b(ewi ewi1)
    {
        i.remove(ewi1);
    }

    public final void c()
    {
        if (k)
        {
            return;
        } else
        {
            k = true;
            e.a(this);
            f.a(this);
            g();
            return;
        }
    }

    public final void d()
    {
        if (!k)
        {
            return;
        } else
        {
            k = false;
            c = false;
            e.b(this);
            f.b(this);
            x_();
            return;
        }
    }

    public final void e()
    {
        if (!i())
        {
            return;
        }
        if (b == null)
        {
            ijg.c("Unable to select hotspot, no suggested hotspot found", new Object[0]);
            return;
        } else
        {
            c = false;
            h();
            e.c(new gaq(RiderLocation.create("hotspot", b.getLatLng())));
            return;
        }
    }

    public final com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion.PickupLocation f()
    {
        return b;
    }

    public final void onTripUiStateChange(fzc fzc1)
    {
        d = fzc1.b();
        boolean flag;
        if (i() && d == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (c != flag)
        {
            c = flag;
            h();
        }
    }

    public final void w_()
    {
        g();
    }

    public final void x_()
    {
        if (!i())
        {
            return;
        } else
        {
            a = null;
            b = null;
            h();
            return;
        }
    }
}
