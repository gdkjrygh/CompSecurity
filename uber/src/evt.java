// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.pickup.model.GuidedPickupGeocodeRegion;
import com.ubercab.client.feature.pickup.model.GuidedPickupSnap;
import com.ubercab.client.feature.pickup.model.GuidedPickupVenue;
import com.ubercab.client.feature.pickup.model.GuidedPickupVenueDetails;
import com.ubercab.client.feature.pickup.model.GuidedPickupVenueSelection;
import com.ubercab.client.feature.pickup.model.RegionGroupData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class evt
    implements evr, ewr
{

    final GuidedPickupVenueDetails a = GuidedPickupVenueDetails.create(null, null, null);
    RiderLocation b;
    GuidedPickupGeocodeRegion c;
    UberLatLng d;
    private final chp e;
    private final cev f;
    private final gmg g;
    private final eww h;
    private final evp i;
    private final ewg j;
    private final dak k;
    private final List l = new CopyOnWriteArrayList();
    private final List m = new CopyOnWriteArrayList();
    private GuidedPickupSnap n;
    private Long o;
    private UberLatLng p;
    private boolean q;
    private long r;
    private boolean s;

    public evt(chp chp1, cev cev1, gmg gmg1, evp evp1, eww eww1, ewg ewg1, dak dak1)
    {
        e = chp1;
        f = cev1;
        g = gmg1;
        i = evp1;
        h = eww1;
        j = ewg1;
        k = dak1;
    }

    private boolean A()
    {
        if (p != null)
        {
            if (b == null || b.getUberLatLng() == null)
            {
                return false;
            }
            if (UberLatLng.a(p, b.getUberLatLng()) <= 250D)
            {
                return false;
            }
        }
        return true;
    }

    private String B()
    {
        Object obj2 = null;
        Object obj = h().getVenueFeature();
        Object obj1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((com.ubercab.client.feature.pickup.model.GuidedPickupVenue.VenueFeature) (obj)).getProperties();
        }
        if (obj == null)
        {
            obj1 = null;
        } else
        {
            obj1 = ((com.ubercab.client.feature.pickup.model.GuidedPickupVenue.VenueProperties) (obj)).getName();
        }
        if (obj == null)
        {
            obj = obj2;
        } else
        {
            obj = ((com.ubercab.client.feature.pickup.model.GuidedPickupVenue.VenueProperties) (obj)).getId();
        }
        return String.format("%s:%s:%s", new Object[] {
            obj1, "airport", obj
        });
    }

    private GuidedPickupVenueSelection a(UberLatLng uberlatlng)
    {
        Object obj1;
        Iterator iterator;
        if (a == null || a.getVenueFeature() == null || uberlatlng == null)
        {
            return null;
        }
        obj1 = a.getVenueFeature().getZones();
        if (obj1 == null)
        {
            return null;
        }
        iterator = ((List) (obj1)).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature)iterator.next();
        if (!ecx.a(uberlatlng, ((com.ubercab.rider.realtime.model.GeoJsonFeature) (obj)))) goto _L4; else goto _L3
_L3:
        if (obj == null)
        {
            Iterator iterator1 = ((List) (obj1)).iterator();
            double d1 = 0.0D;
            do
            {
                obj1 = obj;
                if (!iterator1.hasNext())
                {
                    break;
                }
                obj1 = (com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature)iterator1.next();
                double d2 = UberLatLng.a(uberlatlng, ecx.b(((com.ubercab.rider.realtime.model.GeoJsonFeature) (obj1))));
                if (obj == null || d2 < d1)
                {
                    obj = obj1;
                    d1 = d2;
                }
            } while (true);
        } else
        {
            obj1 = obj;
        }
        if (obj1 != null)
        {
            obj = ((com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature) (obj1)).getPickups();
        } else
        {
            obj = null;
        }
        if (obj == null || ((List) (obj)).isEmpty()) goto _L6; else goto _L5
_L5:
        if (!g.b(dbf.bS)) goto _L8; else goto _L7
_L7:
        uberlatlng = (com.ubercab.client.feature.pickup.model.GuidedPickupVenue.PickupFeature)((List) (obj)).get(0);
_L9:
        if (obj1 != null)
        {
            return GuidedPickupVenueSelection.create(((com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature) (obj1)), uberlatlng, true);
        } else
        {
            return null;
        }
_L8:
        if (g.a(dbf.bS, dbx.a))
        {
            uberlatlng = (com.ubercab.client.feature.pickup.model.GuidedPickupVenue.PickupFeature)ecx.a(uberlatlng, ((List) (obj)));
            continue; /* Loop/switch isn't completed */
        }
_L6:
        uberlatlng = null;
        if (true) goto _L9; else goto _L2
_L2:
        obj = null;
        if (true) goto _L3; else goto _L10
_L10:
    }

    private static String a(com.ubercab.client.feature.pickup.model.GuidedPickupVenue.VenueFeature venuefeature, com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature zonefeature, com.ubercab.client.feature.pickup.model.GuidedPickupVenue.PickupFeature pickupfeature)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(venuefeature.getProperties().getId());
        venuefeature = zonefeature.getProperties().getId();
        if (venuefeature == null)
        {
            venuefeature = "";
        }
        arraylist.add(venuefeature);
        if (pickupfeature != null)
        {
            venuefeature = pickupfeature.getProperties().getId();
            if (venuefeature == null)
            {
                venuefeature = "";
            }
            arraylist.add(venuefeature);
        }
        return gjw.a(";").a(arraylist);
    }

    private void a(GuidedPickupGeocodeRegion guidedpickupgeocoderegion, UberLatLng uberlatlng)
    {
        c = guidedpickupgeocoderegion;
        d = uberlatlng;
    }

    private void a(GuidedPickupVenueDetails guidedpickupvenuedetails)
    {
        for (Iterator iterator = l.iterator(); iterator.hasNext(); ((evw)iterator.next()).a(guidedpickupvenuedetails)) { }
        for (guidedpickupvenuedetails = m.iterator(); guidedpickupvenuedetails.hasNext(); ((evu)guidedpickupvenuedetails.next()).x_()) { }
    }

    private boolean a(UberLatLng uberlatlng, double d1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b != null)
        {
            UberLatLng uberlatlng1 = b.getUberLatLng();
            flag = flag1;
            if (uberlatlng1 != null)
            {
                flag = flag1;
                if (UberLatLng.a(uberlatlng, uberlatlng1) <= d1)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static boolean a(UberLatLng uberlatlng, RegionGroupData regiongroupdata)
    {
        return regiongroupdata != null && ecx.a(uberlatlng, regiongroupdata.getRegionData());
    }

    private void b(UberLatLng uberlatlng)
    {
        if (A())
        {
            p = uberlatlng;
            h.a(uberlatlng);
            return;
        } else
        {
            u();
            return;
        }
    }

    private String p()
    {
        if (g())
        {
            return "venue";
        }
        if (!j.b())
        {
            return "disabled";
        }
        Object obj = b;
        if (obj == null || ((RiderLocation) (obj)).getUberLatLng() == null)
        {
            return "warning";
        }
        obj = ((RiderLocation) (obj)).getUberLatLng();
        RegionGroupData regiongroupdata = a(((UberLatLng) (obj)), "building");
        if (regiongroupdata != null && !regiongroupdata.getPickupLocations().isEmpty())
        {
            return "building";
        }
        regiongroupdata = a(((UberLatLng) (obj)), "block");
        if (regiongroupdata != null && !regiongroupdata.getPickupLocations().isEmpty())
        {
            return "block";
        }
        if (c == null || d == null || UberLatLng.a(d, ((UberLatLng) (obj))) > 250D)
        {
            return "unknown";
        } else
        {
            return "none";
        }
    }

    private boolean q()
    {
        Object obj;
        if (b == null)
        {
            obj = null;
        } else
        {
            obj = b.getUberLatLng();
        }
        if (obj != null)
        {
            if ((obj = i.a(((UberLatLng) (obj)), "hotspot", "building")) != null && !((RegionGroupData) (obj)).getAllPickupLocations().isEmpty())
            {
                return true;
            }
        }
        return false;
    }

    private boolean r()
    {
        RiderLocation riderlocation = k.c();
        return b != null && b.getUberLatLng() != null && riderlocation != null && riderlocation.getUberLatLng() != null && b.getUberLatLng().a(riderlocation.getUberLatLng());
    }

    private void s()
    {
        for (Iterator iterator = m.iterator(); iterator.hasNext(); ((evu)iterator.next()).w_()) { }
        for (Iterator iterator1 = l.iterator(); iterator1.hasNext(); ((evw)iterator1.next()).a()) { }
    }

    private boolean t()
    {
        return c != null || n != null || s;
    }

    private void u()
    {
        if (!t())
        {
            y();
        } else
        {
            int i1 = e();
            final class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[evv.a().length];
                    try
                    {
                        a[evv.c - 1] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[evv.a - 1] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1.a[i1 - 1])
            {
            default:
                y();
                return;

            case 1: // '\001'
                a(h());
                return;

            case 2: // '\002'
                break;
            }
            if (v() != null)
            {
                s();
                return;
            }
        }
    }

    private RegionGroupData v()
    {
        if (j.b() && c != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((RegionGroupData) (obj));
_L2:
        RegionGroupData regiongroupdata;
        obj = b;
        if (obj == null || ((RiderLocation) (obj)).getUberLatLng() == null)
        {
            return null;
        }
        regiongroupdata = a(((RiderLocation) (obj)).getUberLatLng(), ((String) (null)));
        if (regiongroupdata == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = regiongroupdata;
        if (!regiongroupdata.getAllPickupLocations().isEmpty()) goto _L4; else goto _L3
_L3:
        return null;
    }

    private void w()
    {
        if (t())
        {
            c = null;
            d = null;
            n = null;
            a.setVenueSnap(null).validate();
            y();
        }
    }

    private boolean x()
    {
        return j.b() || k();
    }

    private void y()
    {
        for (Iterator iterator = l.iterator(); iterator.hasNext(); ((evw)iterator.next()).a()) { }
        for (Iterator iterator1 = m.iterator(); iterator1.hasNext(); ((evu)iterator1.next()).x_()) { }
    }

    private void z()
    {
        if (a.getVenueFeature() == null && a.getVenueSnap() != null)
        {
            h.a(a.getVenueSnap().getId());
        }
    }

    public final RegionGroupData a(UberLatLng uberlatlng, String s1)
    {
        gjz.a(uberlatlng);
        return i.a(uberlatlng, "hotspot", s1);
    }

    public final void a(UberLatLng uberlatlng, double d1, GuidedPickupGeocodeRegion guidedpickupgeocoderegion)
    {
        if (!a(uberlatlng, d1))
        {
            a(((GuidedPickupGeocodeRegion) (null)), ((UberLatLng) (null)));
            u();
            return;
        } else
        {
            a(guidedpickupgeocoderegion, uberlatlng);
            u();
            return;
        }
    }

    public final void a(GuidedPickupVenueSelection guidedpickupvenueselection)
    {
        if (g() && !gjx.a(a.getVenueSelection(), guidedpickupvenueselection))
        {
            a.setVenueSelection(guidedpickupvenueselection).validate();
            if (guidedpickupvenueselection != null)
            {
                Object obj1 = a.getVenueFeature();
                if (obj1 != null)
                {
                    com.ubercab.client.feature.pickup.model.GuidedPickupVenue.ZoneFeature zonefeature = guidedpickupvenueselection.getSelectedZone();
                    com.ubercab.client.feature.pickup.model.GuidedPickupVenue.PickupFeature pickupfeature = guidedpickupvenueselection.getSelectedPickup();
                    Object obj;
                    UberLatLng uberlatlng;
                    String s1;
                    if (pickupfeature == null)
                    {
                        uberlatlng = ecx.b(zonefeature);
                        obj = zonefeature.getProperties().getName();
                        guidedpickupvenueselection = "venue_zone";
                    } else
                    {
                        uberlatlng = ecx.a(pickupfeature);
                        obj = String.format("%s - %s", new Object[] {
                            zonefeature.getProperties().getName(), pickupfeature.getProperties().getName()
                        });
                        guidedpickupvenueselection = "venue_pickup";
                        r = r + 1L;
                        e.a(AnalyticsEvent.create("impression").setName(l.jb).setValue(B()));
                    }
                    s1 = String.format("%s, %s", new Object[] {
                        obj, ((com.ubercab.client.feature.pickup.model.GuidedPickupVenue.VenueFeature) (obj1)).getProperties().getName()
                    });
                    obj1 = a(((com.ubercab.client.feature.pickup.model.GuidedPickupVenue.VenueFeature) (obj1)), zonefeature, pickupfeature);
                    obj = RiderLocation.create("venue", uberlatlng, null, s1, ((String) (obj)));
                    ((RiderLocation) (obj)).setReference(((String) (obj1)), guidedpickupvenueselection);
                    guidedpickupvenueselection = new gaq(((RiderLocation) (obj)));
                    f.c(guidedpickupvenueselection);
                    return;
                }
            }
        }
    }

    public final void a(evu evu1)
    {
        m.add(evu1);
    }

    public final void a(evw evw1)
    {
        l.add(evw1);
    }

    public final void a(Long long1)
    {
        o = long1;
    }

    public final boolean a(int i1)
    {
        i1;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 34
    //                   1 32
    //                   2 42
    //                   3 34;
           goto _L1 _L2 _L1 _L3 _L2
_L1:
        return false;
_L2:
        return j.d();
_L3:
        if (j.c() && j.e())
        {
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void b(evu evu1)
    {
        m.remove(evu1);
    }

    public final void b(evw evw1)
    {
        l.remove(evw1);
    }

    final boolean b(int i1)
    {
        if (b != null)
        {
            boolean flag2 = j.c();
            boolean flag1 = j.a();
            boolean flag;
            boolean flag3;
            if (r() && b.getAccuracy() < 1000F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag3 = b.isLocationSearchResult();
            if (i1 == 0 && (flag1 || flag || flag3) && q())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag3)
            {
                flag1 = q();
            } else
            if (i1 == 2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag2 && (flag || flag1))
            {
                return true;
            }
        }
        return false;
    }

    public final void c()
    {
        if (!q && x())
        {
            q = true;
            f.a(this);
            i.a(this);
        }
    }

    public final void d()
    {
        if (q)
        {
            q = false;
            f.b(this);
            i.b(this);
        }
    }

    public final int e()
    {
        if (g())
        {
            return evv.c;
        }
        if (s)
        {
            return evv.b;
        }
        if (j.b())
        {
            return evv.a;
        } else
        {
            return evv.d;
        }
    }

    public final String f()
    {
        String s1;
        if (b == null)
        {
            s1 = "(null)";
        } else
        {
            s1 = b.getType();
        }
        return String.format("%s:%s", new Object[] {
            s1, p()
        });
    }

    public final boolean g()
    {
        return k() && a.getVenueSnap() != null;
    }

    public final GuidedPickupVenueDetails h()
    {
        return a;
    }

    public final GuidedPickupVenueSelection i()
    {
        UberLatLng uberlatlng;
        if (b != null)
        {
            uberlatlng = b.getUberLatLng();
        } else
        {
            uberlatlng = null;
        }
        return a(uberlatlng);
    }

    public final Long j()
    {
        return o;
    }

    public final boolean k()
    {
        return g.a(dbf.bU);
    }

    public final void l()
    {
        e.a(AnalyticsEvent.create("tap").setName(n.U).setValuePosition(Long.valueOf(r)).setValue(B()));
    }

    public final void m()
    {
        e.a(AnalyticsEvent.create("tap").setName(n.V).setValuePosition(Long.valueOf(r)).setValue(B()));
    }

    public final void n()
    {
        e.a(AnalyticsEvent.create("impression").setName(l.jc).setValue(B()));
    }

    public final void o()
    {
        r = 0L;
    }

    public final void onGeoRegionResponse(ews ews1)
    {
        if (!x())
        {
            return;
        }
        if (!ews1.i())
        {
            ijg.c(ews1.j(), "Guided Pickup GeoRegion failed: (%d) %s", new Object[] {
                Integer.valueOf(ews1.n()), ews1.l()
            });
            a(((GuidedPickupGeocodeRegion) (null)), ((UberLatLng) (null)));
            u();
            return;
        } else
        {
            i.a(ews1);
            return;
        }
    }

    public final void onGuidedPickupVenueResponse(ewu ewu1)
    {
        com.ubercab.client.feature.pickup.model.GuidedPickupSnap.Data data = a.getVenueSnap();
        if (data == null || !ewu1.a().equals(data.getId()))
        {
            return;
        }
        if (!ewu1.i())
        {
            ijg.c(ewu1.j(), "Failed to retrieve venue: (%d) %s", new Object[] {
                Integer.valueOf(ewu1.n()), ewu1.l()
            });
            a.setVenueSnap(null).validate();
            u();
            return;
        } else
        {
            a.setVenueFeature(((GuidedPickupVenue)ewu1.g()).getData()).validate();
            u();
            return;
        }
    }

    public final void onPinLocationEvent(daq daq1)
    {
        byte byte0 = 0;
        if (x()) goto _L2; else goto _L1
_L1:
        w();
_L9:
        return;
_L2:
        String s1;
        b = daq1.a();
        daq1 = b.getUberLatLng();
        s1 = b.getType();
        if (daq1 == null || s1 == null)
        {
            ijg.c("No location on PinLocationEvent.", new Object[0]);
            return;
        }
        s1 = b.getType();
        s1.hashCode();
        JVM INSTR lookupswitch 2: default 96
    //                   112093807: 161
    //                   1099603663: 174;
           goto _L3 _L4 _L5
_L3:
        byte0 = -1;
_L6:
        switch (byte0)
        {
        default:
            if (k())
            {
                a(((GuidedPickupVenueSelection) (null)));
                h.a(com.ubercab.client.feature.pickup.model.GuidedPickupSnap.Location.create(daq1));
            }
            if (j.b())
            {
                b(daq1);
                return;
            }
            break;

        case 1: // '\001'
            continue; /* Loop/switch isn't completed */

        case 0: // '\0'
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!s1.equals("venue")) goto _L3; else goto _L6
_L5:
        if (!s1.equals("hotspot")) goto _L3; else goto _L7
_L7:
        byte0 = 1;
          goto _L6
        if (!k()) goto _L9; else goto _L8
_L8:
        a(((GuidedPickupVenueSelection) (null)));
        return;
        if (true) goto _L9; else goto _L10
_L10:
    }

    public final void onSnapResponse(ewt ewt1)
    {
        if (!ewt1.i() || ewt1.g() == null)
        {
            if (!ewt1.i())
            {
                ijg.c(ewt1.j(), "Guided Pickup Snap failed: (%d) %s", new Object[] {
                    Integer.valueOf(ewt1.n()), ewt1.l()
                });
            } else
            {
                ijg.c("Guided Pickup Snap failed due to null model in response.", new Object[0]);
            }
            n = null;
            a.setVenueSnap(null).validate();
            u();
            return;
        }
        n = (GuidedPickupSnap)ewt1.g();
        ewt1 = n.getData();
        a.setVenueSnap(null);
        ewt1 = ewt1.iterator();
_L6:
        if (!ewt1.hasNext()) goto _L2; else goto _L1
_L1:
        com.ubercab.client.feature.pickup.model.GuidedPickupSnap.Data data;
        String s1;
        byte byte0;
        data = (com.ubercab.client.feature.pickup.model.GuidedPickupSnap.Data)ewt1.next();
        s1 = data.getKind();
        byte0 = -1;
        s1.hashCode();
        JVM INSTR tableswitch 112093807 112093807: default 172
    //                   112093807 207;
           goto _L3 _L4
_L3:
        switch (byte0)
        {
        case 0: // '\0'
            a.setVenueSnap(data);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s1.equals("venue"))
        {
            byte0 = 0;
        }
        if (true) goto _L3; else goto _L2
_L2:
        a.validate();
        u();
        z();
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void u_()
    {
        s = true;
    }

    public final void v_()
    {
        s = false;
    }
}
