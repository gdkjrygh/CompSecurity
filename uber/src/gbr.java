// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.map.Marker;
import com.ubercab.client.core.model.AppConfig;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.trip.map.layer.route.InfoWindowView;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripLeg;
import com.ubercab.rider.realtime.model.TripLegAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class gbr extends ees
{

    private final chp a;
    private final dqt b;
    private final cjf c;
    private final Bitmap d;
    private final Bitmap e;
    private final Bitmap f;
    private final cev g;
    private final Context h;
    private final hku i;
    private final gmg j;
    private final cjn k;
    private final fzl l;
    private final eel m;
    private final dpg n;
    private icl o;
    private Marker p;
    private InfoWindowView q;
    private String r;
    private List s;
    private List t;
    private List u;
    private TripLegAction v;

    public gbr(Context context, cev cev1, cjn cjn1, eel eel1, fzl fzl1, cjf cjf1, gmg gmg1, 
            chp chp1, dpg dpg1, hku hku1, dqt dqt)
    {
        a = chp1;
        c = cjf1;
        cjf1 = context.getResources();
        d = ((BitmapDrawable)cjf1.getDrawable(0x7f020283)).getBitmap();
        e = ((BitmapDrawable)cjf1.getDrawable(0x7f020286)).getBitmap();
        f = ((BitmapDrawable)cjf1.getDrawable(0x7f020288)).getBitmap();
        g = cev1;
        h = context;
        j = gmg1;
        k = cjn1;
        l = fzl1;
        m = eel1;
        n = dpg1;
        i = hku1;
        b = dqt;
    }

    static dqt a(gbr gbr1)
    {
        return gbr1.b;
    }

    static String a(gbr gbr1, String s1)
    {
        gbr1.r = s1;
        return s1;
    }

    static List a(Trip trip, Client client, String s1)
    {
        return b(trip, client, s1);
    }

    static List a(gbr gbr1, List list)
    {
        gbr1.s = list;
        return list;
    }

    private void a(Trip trip, Client client, List list)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = list.iterator();
        do
        {
            if (iterator.hasNext())
            {
                Object obj = (TripLeg)iterator.next();
                if (((TripLeg) (obj)).getActions() == null || ((TripLeg) (obj)).getActions().isEmpty() || trip.isLegForClient(((TripLeg) (obj)), client.getUuid()))
                {
                    continue;
                }
                v = (TripLegAction)((TripLeg) (obj)).getActions().get(0);
                list = trip.getEntity(v.getEntityRef());
                obj = trip.getLocation(((TripLeg) (obj)).getLocationEndRef());
                if (list == null || obj == null || ((Location) (obj)).getLatitude() == 0.0D || ((Location) (obj)).getLongitude() == 0.0D)
                {
                    continue;
                }
                boolean flag1 = "ForwardDispatch".equals(v.getContext());
                if (j.b(dbf.h) && flag1)
                {
                    continue;
                }
                boolean flag;
                if (flag1 && j.a(dbf.h))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    list = e;
                } else
                if ("Pickup".equals(v.getType()))
                {
                    list = f;
                } else
                {
                    list = d;
                }
                list = k.a((new cjz()).a(new UberLatLng(((Location) (obj)).getLatitude(), ((Location) (obj)).getLongitude())).a(cjf.a(list)).a(0.5F, 0.5F));
                if (list != null)
                {
                    list.setInfoWindowAnchor(0.5F);
                    if (flag)
                    {
                        p = list;
                    }
                    arraylist.add(list);
                    if (flag)
                    {
                        list.b();
                        a.a(l.bM);
                    }
                    continue;
                }
            }
            t = arraylist;
            return;
        } while (true);
    }

    static void a(gbr gbr1, Trip trip, Client client, List list)
    {
        gbr1.b(trip, client, list);
    }

    private static List b(Trip trip, Client client, String s1)
    {
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 2: default 32
    //                   -1978426120: 58
    //                   -1929061692: 73;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_73;
_L4:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            return trip.getLegsBetweenCurrentLegAndPickup(client.getUuid());

        case 1: // '\001'
            return trip.getRemainingLegs();
        }
_L2:
        if (s1.equals("WaitingForPickup"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s1.equals("OnTrip"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    private void b(Trip trip, Client client, List list)
    {
        ArrayList arraylist = new ArrayList();
        String s1 = trip.getCurrentRoute();
        int i1 = 0;
        while (i1 < list.size()) 
        {
            TripLeg tripleg = (TripLeg)list.get(i1);
            String s2 = tripleg.getEncodedPolyline();
            Object obj = s2;
            if (i1 == 0)
            {
                obj = s2;
                if (!TextUtils.isEmpty(s1))
                {
                    obj = s1;
                }
            }
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                continue;
            }
            obj = een.a(((String) (obj)));
            if (obj == null || ((List) (obj)).isEmpty())
            {
                continue;
            }
            int j1;
            if (trip.isClientPartOfTripDuringLeg(client.getUuid(), tripleg))
            {
                j1 = m.a();
            } else
            {
                j1 = m.b();
            }
            obj = k.a((new ckc()).a(((Iterable) (obj))).a(m.c()).a(j1));
            if (obj == null)
            {
                break;
            }
            arraylist.add(obj);
            i1++;
        }
        u = arraylist;
    }

    static void b(gbr gbr1)
    {
        gbr1.g();
    }

    static void b(gbr gbr1, Trip trip, Client client, List list)
    {
        gbr1.a(trip, client, list);
    }

    static void c(gbr gbr1)
    {
        gbr1.h();
    }

    static List d(gbr gbr1)
    {
        return gbr1.s;
    }

    static String e(gbr gbr1)
    {
        return gbr1.r;
    }

    static fzl f(gbr gbr1)
    {
        return gbr1.l;
    }

    private void g()
    {
        if (u == null)
        {
            return;
        }
        for (Iterator iterator = u.iterator(); iterator.hasNext(); ((ckb)iterator.next()).b()) { }
        u = null;
    }

    private void h()
    {
        if (t == null)
        {
            return;
        }
        for (Iterator iterator = t.iterator(); iterator.hasNext(); ((Marker)iterator.next()).a()) { }
        t = null;
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList();
        if (u != null && !u.isEmpty())
        {
            for (Iterator iterator = u.iterator(); iterator.hasNext(); arraylist.addAll(((ckb)iterator.next()).a())) { }
        }
        if (t != null && !t.isEmpty())
        {
            for (Iterator iterator1 = t.iterator(); iterator1.hasNext(); arraylist.add(((Marker)iterator1.next()).getPosition())) { }
        }
        if (arraylist.isEmpty())
        {
            return null;
        } else
        {
            return arraylist;
        }
    }

    public final void a(Marker marker)
    {
label0:
        {
            if (p != null && p.getId().equals(marker.getId()))
            {
                a.a(n.au);
                if (!marker.d())
                {
                    break label0;
                }
                marker.c();
            }
            return;
        }
        marker.b();
    }

    public final View b(Marker marker)
    {
        if (p == null || !marker.getId().equals(p.getId()))
        {
            return null;
        }
        if (q == null)
        {
            q = new InfoWindowView(h);
        }
        q.a(v.getDescription());
        return q;
    }

    public final void e()
    {
        g.a(this);
        if (o != null)
        {
            o.b();
        }
        o = ica.a(i.d(), i.e(), i.h(), new gbt((byte)0)).a(ico.a()).c(new gbs(this, (byte)0));
    }

    public final void f()
    {
        g.b(this);
        if (o != null)
        {
            o.b();
            o = null;
        }
    }

    public final void onPingEvent(dar dar1)
    {
        if (!n.n())
        {
            dar1 = dar1.a();
            if (!dul.q(dar1) || !dar1.getAppConfig().isUseTripLegsEnabled())
            {
                g();
                h();
                s = null;
                r = null;
                return;
            }
            List list = b(dar1.getTrip(), dar1.getClient(), dar1.getClient().getStatus());
            String s1 = dar1.getTrip().getCurrentRoute();
            if (!gjx.a(s, list) || !gjx.a(r, s1))
            {
                s = list;
                r = s1;
                g();
                h();
                if (list != null)
                {
                    b(dar1.getTrip(), dar1.getClient(), list);
                    a(dar1.getTrip(), dar1.getClient(), list);
                }
                l.b();
                return;
            }
        }
    }
}
