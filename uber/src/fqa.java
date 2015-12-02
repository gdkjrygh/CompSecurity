// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.vendor.google.GmmProductSurge;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.ProductGroup;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class fqa
{

    fqb a;
    boolean b;
    private final RiderActivity c;
    private final hkr d;
    private final gmg e;
    private final dak f;
    private final fta g;
    private final fte h;

    public fqa(RiderActivity rideractivity, hkr hkr1, gmg gmg, dak dak1, fta fta1, fte fte1)
    {
        c = rideractivity;
        d = hkr1;
        e = gmg;
        f = dak1;
        g = fta1;
        h = fte1;
    }

    private RiderLocation a(Uri uri, RiderLocation riderlocation)
    {
        uri = dwk.a(uri);
        if (uri != null)
        {
            if (uri.equals(riderlocation))
            {
                uri.setTitle(c.getString(0x7f0702c8));
            } else
            if (!uri.hasReverseGeocodeData())
            {
                uri.setTitle(c.getString(0x7f0701d6));
                return uri;
            }
        }
        return uri;
    }

    private VehicleView a(String s)
    {
label0:
        {
            Object obj = d.b();
            if (s == null || obj == null || ((City) (obj)).getVehicleViews() == null)
            {
                break label0;
            }
            obj = ((City) (obj)).getVehicleViews().values().iterator();
            VehicleView vehicleview;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                vehicleview = (VehicleView)((Iterator) (obj)).next();
            } while (!s.equals(vehicleview.getUuid()));
            return vehicleview;
        }
        return null;
    }

    private void a(Uri uri)
    {
        uri = Uri.parse((new StringBuilder("?")).append(uri.getEncodedQuery().replace("%5B", "[").replace("%5D", "]")).toString());
        Object obj = f.c();
        RiderLocation riderlocation = dwk.a(uri, ((RiderLocation) (obj)));
        if (riderlocation != null)
        {
            g.a(riderlocation);
        }
        obj = a(uri, ((RiderLocation) (obj)));
        if (obj != null)
        {
            h.a(((RiderLocation) (obj)));
        }
        obj = dwk.c(uri);
        VehicleView vehicleview = a(((String) (obj)));
        City city = d.b();
        if (vehicleview != null)
        {
            if (city != null)
            {
                a(riderlocation, vehicleview, city);
            } else
            {
                String s = vehicleview.getId();
                h.c(s);
                b = b(s);
            }
        }
        if (b)
        {
            return;
        } else
        {
            b(uri, ((String) (obj)));
            a(riderlocation, vehicleview);
            b = true;
            return;
        }
    }

    private void a(Uri uri, String s)
    {
label0:
        {
label1:
            {
                if (a == null || s == null || !fte.b(s.toLowerCase()))
                {
                    break label0;
                }
                s = uri.getQueryParameter("fallback_url");
                if (s != null)
                {
                    uri = s;
                    if (!s.isEmpty())
                    {
                        break label1;
                    }
                }
                uri = c.getString(0x7f0706cc);
            }
            s = c.getString(0x7f070625);
            String s1 = c.getString(0x7f0703d3);
            a.a(s, s1, uri);
        }
    }

    private void a(RiderLocation riderlocation, VehicleView vehicleview)
    {
        if (vehicleview != null && riderlocation != null && a != null)
        {
            a.n_();
        }
    }

    private void a(RiderLocation riderlocation, VehicleView vehicleview, City city)
    {
        ProductGroup productgroup = null;
        if (vehicleview.getProductGroupUuid() != null)
        {
            productgroup = city.findProductGroupByUuid(vehicleview.getProductGroupUuid());
        }
        if (productgroup != null && !fte.a(productgroup.getGroupType()))
        {
            h.a(productgroup);
        } else
        {
            h.c(vehicleview.getId());
            a(riderlocation, vehicleview);
        }
        b = true;
    }

    private void b(Uri uri)
    {
        Uri uri1 = Uri.parse((new StringBuilder("?")).append(uri.getEncodedQuery().replace("%5B", "[").replace("%5D", "]")).toString());
        Object obj = f.c();
        Object obj1 = dwk.a(uri1);
        VehicleView vehicleview;
        if (obj1 != null || obj == null)
        {
            obj = obj1;
        }
        if (obj != null)
        {
            g.a(((RiderLocation) (obj)));
        }
        vehicleview = a(dwk.c(uri1));
        obj1 = d.b();
        if (vehicleview == null || obj1 == null) goto _L2; else goto _L1
_L1:
        a(((RiderLocation) (obj)), vehicleview, ((City) (obj1)));
_L4:
        b = true;
        return;
_L2:
        if (obj1 != null)
        {
            obj = dwk.d(uri1);
            if (obj != null)
            {
                obj1 = ((City) (obj1)).findFirstProductGroupByType(((String) (obj)));
                if (obj1 != null)
                {
                    h.a(((ProductGroup) (obj1)));
                } else
                {
                    a(uri, ((String) (obj)));
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(Uri uri, String s)
    {
        if (a != null)
        {
            uri = dwk.e(uri);
            a.a(new GmmProductSurge(s, uri));
        }
    }

    private static boolean b(Intent intent)
    {
        return (intent.getFlags() & 0x100000) != 0;
    }

    private boolean b(String s)
    {
        if (a != null)
        {
            return a.a(s);
        } else
        {
            return false;
        }
    }

    public final void a(Intent intent)
    {
        Uri uri = intent.getData();
        if (!b && !b(intent) && uri != null && uri.isHierarchical() && drd.a(d.d()) && "uber".equals(intent.getScheme()))
        {
            intent = uri.getQueryParameter("action");
            boolean flag = "setPickup".equals(intent);
            boolean flag1 = "setDropoff".equals(intent);
            if (flag)
            {
                a(uri);
                return;
            }
            if (flag1)
            {
                b(uri);
                return;
            }
        }
    }

    public final void a(fqb fqb1)
    {
        a = fqb1;
    }

    public final void b(fqb fqb1)
    {
        if (a != null && a.equals(fqb1))
        {
            a = null;
        }
    }
}
