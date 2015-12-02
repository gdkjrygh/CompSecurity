// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.ubercab.client.feature.pickup.model.GuidedPickupVenueDetails;
import com.ubercab.client.feature.trip.address.AddressView;
import com.ubercab.client.feature.trip.overlay.AddressOverlayView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class fxn
    implements evw, gcj
{

    private static final long c;
    com.ubercab.client.feature.pickup.model.GuidedPickupVenue.VenueFeature a;
    AddressOverlayView b;
    private final cev d;
    private final gju e;
    private final gmg f;
    private final evt g;
    private final List h = new ArrayList();
    private final dak i;
    private final dal j;
    private final fte k;
    private fvb l;
    private ViewGroup m;

    public fxn(cev cev1, gju gju1, gmg gmg1, evt evt1, dak dak1, dal dal1, fte fte1)
    {
        d = cev1;
        e = gju1;
        f = gmg1;
        g = evt1;
        i = dak1;
        j = dal1;
        k = fte1;
    }

    private static int a(com.ubercab.client.feature.pickup.model.GuidedPickupVenue.VenueProperties venueproperties)
    {
        String s = venueproperties.getSubType();
        venueproperties = s;
        if (TextUtils.isEmpty(s))
        {
            venueproperties = "airport";
        }
        venueproperties.hashCode();
        JVM INSTR lookupswitch 5: default 72
    //                   -991666997: 121
    //                   -80148009: 163
    //                   3088947: 135
    //                   96891546: 149
    //                   110621192: 107;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        byte byte0 = -1;
_L8:
        switch (byte0)
        {
        default:
            return 0x7f020198;

        case 0: // '\0'
            return 0x7f020199;

        case 1: // '\001'
            return 0x7f020195;

        case 2: // '\002'
            return 0x7f020196;

        case 3: // '\003'
            return 0x7f020197;
        }
_L6:
        if (!venueproperties.equals("train")) goto _L1; else goto _L7
_L7:
        byte0 = 0;
          goto _L8
_L2:
        if (!venueproperties.equals("airport")) goto _L1; else goto _L9
_L9:
        byte0 = 1;
          goto _L8
_L4:
        if (!venueproperties.equals("dock")) goto _L1; else goto _L10
_L10:
        byte0 = 2;
          goto _L8
_L5:
        if (!venueproperties.equals("event")) goto _L1; else goto _L11
_L11:
        byte0 = 3;
          goto _L8
_L3:
        if (!venueproperties.equals("generic")) goto _L1; else goto _L12
_L12:
        byte0 = 4;
          goto _L8
    }

    private boolean g()
    {
        if (a != null && k.g() == 0)
        {
            long l1 = j.Q();
            if (gju.a() - l1 >= c)
            {
                return true;
            }
        }
        return false;
    }

    private void h()
    {
        g.n();
        if (m == null)
        {
            throw new IllegalStateException("Root view cannot be null");
        } else
        {
            Context context = m.getContext();
            b = (AddressOverlayView)LayoutInflater.from(context).inflate(0x7f0301e9, m, false);
            b.a(this);
            com.ubercab.client.feature.pickup.model.GuidedPickupVenue.VenueProperties venueproperties = a.getProperties();
            b.a(venueproperties.getWelcomeTitle(), venueproperties.getWelcomeDescription());
            d.a(this);
            AddressView addressview = b.a();
            addressview.a();
            addressview.setClickable(true);
            addressview.e(false);
            addressview.setVisibility(0);
            addressview.a(false);
            addressview.c(0);
            addressview.g(8);
            addressview.d(false);
            addressview.a(0);
            addressview.b(0);
            addressview.a(context.getString(0x7f070357));
            addressview.a(i.b());
            int i1 = a(venueproperties);
            b.a(i1);
            m.addView(b);
            b.setVisibility(8);
            b.setOnClickListener(new android.view.View.OnClickListener() {

                final fxn a;

                public final void onClick(View view)
                {
                    a.e();
                }

            
            {
                a = fxn.this;
                super();
            }
            });
            return;
        }
    }

    public final void a()
    {
        a = null;
        j.a(0L);
    }

    public final void a(ViewGroup viewgroup)
    {
        m = viewgroup;
    }

    public final void a(GuidedPickupVenueDetails guidedpickupvenuedetails)
    {
        if (g.k())
        {
            a = guidedpickupvenuedetails.getVenueFeature();
            if (!g())
            {
                f();
                return;
            }
            if (b == null)
            {
                h();
                d();
                return;
            }
        }
    }

    public final void a(fvb fvb1)
    {
        l = fvb1;
    }

    public final void a(fxo fxo1)
    {
        h.add(fxo1);
    }

    public final void b()
    {
        e();
        for (Iterator iterator = h.iterator(); iterator.hasNext(); ((fxo)iterator.next()).t()) { }
    }

    public final void b(fxo fxo1)
    {
        h.remove(fxo1);
    }

    public final boolean c()
    {
        if (b == null)
        {
            return false;
        } else
        {
            e();
            return true;
        }
    }

    final void d()
    {
label0:
        {
            if (l == null)
            {
                throw new IllegalStateException("Address controller cannot be null");
            }
            if (b != null && b.getVisibility() != 0)
            {
                int i1 = l.q();
                if (i1 == 0)
                {
                    break label0;
                }
                b.b(i1);
                if (f.b(dbf.bV))
                {
                    g.a(g.i());
                }
            }
            return;
        }
        b.postDelayed(new Runnable() {

            final fxn a;

            public final void run()
            {
                a.d();
            }

            
            {
                a = fxn.this;
                super();
            }
        }, 50L);
    }

    final void e()
    {
        if (b == null)
        {
            return;
        } else
        {
            b.animate().alpha(0.0F).setListener(new AnimatorListenerAdapter() {

                final fxn a;

                public final void onAnimationEnd(Animator animator)
                {
                    a.f();
                }

            
            {
                a = fxn.this;
                super();
            }
            }).start();
            j.a(gju.a());
            return;
        }
    }

    final void f()
    {
        if (b != null)
        {
            m.removeView(b);
            d.b(this);
            b = null;
        }
    }

    public final void onPinLocation(daq daq1)
    {
        while (!g.k() || b == null) 
        {
            return;
        }
        b.a().a(daq1.a());
    }

    static 
    {
        c = TimeUnit.HOURS.toMillis(1L);
    }
}
