// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.LocationHistoryResponse;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.client.core.model.LocationSearchResults;
import com.ubercab.client.feature.trip.event.PanelSlideEvent;
import com.ubercab.client.feature.trip.prediction.DestinationPredictionView;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class gdb
    implements dcm, gda
{

    private final chp a;
    private final hkr b;
    private final gmg c;
    private final dch d;
    private final RiderActivity e;
    private final dal f;
    private final fta g;
    private final fte h;
    private final Set i = new HashSet();
    private final Set j = new HashSet();
    private View k;
    private LocationSearchResult l;
    private DestinationPredictionView m;
    private View n;
    private ViewGroup o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;

    public gdb(chp chp1, hkr hkr1, gmg gmg1, dch dch1, RiderActivity rideractivity, dal dal1, fta fta1, 
            fte fte1)
    {
        boolean flag1 = true;
        super();
        v = 0;
        w = 0x80000000;
        a = chp1;
        b = hkr1;
        c = gmg1;
        d = dch1;
        e = rideractivity;
        f = dal1;
        g = fta1;
        h = fte1;
        boolean flag;
        if (c.a(dbf.bK) || c.a(dbf.bD))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        if (c.a(dbf.bE) && c.a(dbf.bM))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        t = flag;
    }

    private static dci a(String s1)
    {
        dci dci1 = (dci)dch.a.get(s1);
        s1 = dci1;
        if (dci1 == null)
        {
            s1 = (dci)dch.a.get("");
        }
        return s1;
    }

    private boolean p()
    {
        Object obj = b.b();
        if (obj != null)
        {
            obj = ((City) (obj)).findVehicleViewById(f.E());
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            int i1 = h.g();
            com.ubercab.rider.realtime.model.FareSplit faresplit = dre.a(b.d(), b.e(), b.f());
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if (p && v != 2 && v != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (((VehicleView) (obj)).getAllowRidepool() && !fte.e(i1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!((VehicleView) (obj)).getAllowRidepool() && !fte.b(i1))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (c.b(dbf.bR) && g.b())
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (!flag1 && !flag2 && dre.a(faresplit) && !flag3 && !r && !h.j() && !s && ((VehicleView) (obj)).isDestinationEnabled() && !flag && !u)
            {
                return false;
            }
        }
        return true;
    }

    private void q()
    {
        if (p())
        {
            u();
            return;
        }
        if (m == null)
        {
            m = (DestinationPredictionView)e.getLayoutInflater().inflate(0x7f03004e, o, false);
            m.a(this);
            o.addView(m, 0);
            m.setVisibility(8);
        }
        if (m != null)
        {
            if (!z())
            {
                u();
                return;
            } else
            {
                x();
                y();
                return;
            }
        } else
        {
            u();
            return;
        }
    }

    private String r()
    {
        String s2 = l.getTag();
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = "cache";
        }
        return String.format("%s:%s:%s", new Object[] {
            s1, l.getLatitude().toString(), l.getLongitude().toString()
        });
    }

    private String s()
    {
        String s2 = l.getTag();
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = "cache";
        }
        return String.format("%s:%s:%s:%s", new Object[] {
            s1, l.getRelevance(), l.getLatitude().toString(), l.getLongitude().toString()
        });
    }

    private String t()
    {
        String s1 = l.getNickname();
        String s2 = l.getFormattedAddress();
        String s3 = l.getShortAddress();
        String s4 = l.getLongAddress();
        if (!TextUtils.isEmpty(s1))
        {
            return s1;
        }
        if (!TextUtils.isEmpty(s3))
        {
            return s3;
        }
        if (!TextUtils.isEmpty(s2))
        {
            return s2;
        }
        if (!TextUtils.isEmpty(s4))
        {
            return s4;
        } else
        {
            return null;
        }
    }

    private void u()
    {
        if (m == null)
        {
            return;
        } else
        {
            m.a();
            return;
        }
    }

    private void v()
    {
        a.a(AnalyticsEvent.create("tap").setName(n.R).setValue(r()));
    }

    private void w()
    {
        com.ubercab.android.location.UberLatLng uberlatlng = l.getUberLatLng();
        if (j.contains(uberlatlng))
        {
            return;
        } else
        {
            j.add(uberlatlng);
            a.a(AnalyticsEvent.create("impression").setName(l.aJ).setValue(s()));
            return;
        }
    }

    private void x()
    {
        if (m == null)
        {
            return;
        }
        if (k == null)
        {
            k = e.findViewById(0x7f0e05e4);
        }
        if (n == null)
        {
            n = e.findViewById(0x7f0e0561);
        }
        boolean flag = false;
        int i1 = ((flag) ? 1 : 0);
        if (n != null)
        {
            i1 = ((flag) ? 1 : 0);
            if (k != null)
            {
                i1 = k.getBottom() + n.getTop();
            }
        }
        m.a(i1);
    }

    private void y()
    {
        if (m == null)
        {
            return;
        } else
        {
            w();
            m.b();
            return;
        }
    }

    private boolean z()
    {
        if (l != null)
        {
            dci dci1 = a(l.getTag());
            String s1 = t();
            if (s1 != null)
            {
                if (dci1 == dci.b)
                {
                    s1 = e.getString(0x7f07025b);
                } else
                if (dci1 == dci.c)
                {
                    s1 = e.getString(0x7f07025d);
                } else
                {
                    s1 = e.getString(0x7f07025c, new Object[] {
                        s1
                    });
                }
                m.a(dci1);
                m.a(s1);
                return true;
            }
        }
        return false;
    }

    public final void a()
    {
        if (!t)
        {
            return;
        } else
        {
            d.a(this);
            u();
            return;
        }
    }

    public final void a(int i1)
    {
        if (!t)
        {
            return;
        }
        v = i1;
        if (i1 == 2)
        {
            d.b(this);
            return;
        } else
        {
            u();
            return;
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        if (!t)
        {
            return;
        } else
        {
            o = viewgroup;
            return;
        }
    }

    public final void a(LocationHistoryResponse locationhistoryresponse)
    {
        if (t)
        {
            d.a(this);
            if (locationhistoryresponse != null)
            {
                locationhistoryresponse = locationhistoryresponse.getDropoffs();
                if (locationhistoryresponse == null)
                {
                    u();
                    return;
                }
                locationhistoryresponse = locationhistoryresponse.getPrimaryResult();
                if (locationhistoryresponse == null)
                {
                    u();
                    return;
                }
                if (!locationhistoryresponse.equals(l))
                {
                    l = locationhistoryresponse;
                }
                q();
                return;
            }
        }
    }

    public final void a(PanelSlideEvent panelslideevent)
    {
        if (!t)
        {
            return;
        }
        if (panelslideevent.a() != 0.0F)
        {
            u();
            u = true;
            return;
        } else
        {
            u = false;
            d.b(this);
            return;
        }
    }

    public final void a(fzc fzc1)
    {
        int i1;
        if (!t)
        {
            return;
        }
        i1 = fzc1.b();
        if (w != 7) goto _L2; else goto _L1
_L1:
        r = false;
        u();
_L4:
        w = i1;
        return;
_L2:
        if (i1 == 5 || i1 == 6)
        {
            d.b(this);
        } else
        if (w != i1)
        {
            u();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(gdc gdc1)
    {
        i.add(gdc1);
    }

    public final void b()
    {
        if (t && l != null)
        {
            u();
            v();
            Iterator iterator = i.iterator();
            while (iterator.hasNext()) 
            {
                ((gdc)iterator.next()).a(RiderLocation.create(l));
            }
        }
    }

    public final void b(gdc gdc1)
    {
        i.remove(gdc1);
        d.a(this);
    }

    public final void c()
    {
        while (!t || !q) 
        {
            return;
        }
        d.b(this);
        q = false;
    }

    public final void d()
    {
        if (!t)
        {
            return;
        } else
        {
            r = true;
            u();
            return;
        }
    }

    public final void e()
    {
        if (!t)
        {
            return;
        } else
        {
            r = false;
            return;
        }
    }

    public final void f()
    {
        while (!t || !h.j()) 
        {
            return;
        }
        r = true;
        u();
    }

    public final void g()
    {
        if (!t)
        {
            return;
        } else
        {
            q = true;
            return;
        }
    }

    public final void h()
    {
        while (!t || p || fte.b(w)) 
        {
            return;
        }
        u();
    }

    public final void i()
    {
        while (!t || p || fte.b(w)) 
        {
            return;
        }
        r = false;
        d.b(this);
    }

    public final void j()
    {
        if (!t)
        {
            return;
        } else
        {
            d.b(this);
            return;
        }
    }

    public final void k()
    {
        while (!t || !c.b(dbf.bR) || !g.b()) 
        {
            return;
        }
        u();
    }

    public final void l()
    {
        if (!t)
        {
            return;
        } else
        {
            s = false;
            d.b(this);
            return;
        }
    }

    public final void m()
    {
        if (!t)
        {
            return;
        } else
        {
            s = true;
            u();
            return;
        }
    }

    public final void n()
    {
        if (!t)
        {
            return;
        } else
        {
            d.b(this);
            return;
        }
    }

    public final void o()
    {
        if (!t)
        {
            return;
        } else
        {
            d.b(this);
            return;
        }
    }
}
