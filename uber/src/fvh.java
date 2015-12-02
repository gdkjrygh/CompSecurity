// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.chat.ChatConversationActivity;
import com.ubercab.client.feature.trip.contact.ContactDriverAnonymouslyFragment;
import com.ubercab.client.feature.trip.contact.ContactDriverFragment;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripDriver;

public final class fvh
{

    private RiderActivity a;
    private chp b;
    private drc c;
    private hkr d;
    private gmg e;

    public fvh(RiderActivity rideractivity, chp chp1, drc drc, hkr hkr1, gmg gmg1)
    {
        a = rideractivity;
        b = chp1;
        c = drc;
        d = hkr1;
        e = gmg1;
    }

    private void a(TripDriver tripdriver)
    {
        String s = tripdriver.getMobile();
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[fvi.a().length];
                try
                {
                    a[fvi.a - 1] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[fvi.c - 1] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[fvi.d - 1] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[fvi.e - 1] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[fvi.b - 1] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[c(tripdriver) - 1])
        {
        case 1: // '\001'
        default:
            return;

        case 2: // '\002'
            fut.a(a, s);
            b.a(n.N);
            return;

        case 3: // '\003'
            fut.c(a, s);
            b.a(n.M);
            return;

        case 4: // '\004'
            ContactDriverFragment.a(a);
            b.a(n.J);
            b.a(n.L);
            return;

        case 5: // '\005'
            ContactDriverFragment.a(a);
            break;
        }
        b.a(n.L);
    }

    private void b(TripDriver tripdriver)
    {
        boolean flag = fut.a(c, e, tripdriver);
        boolean flag1 = fut.a(c);
        boolean flag2 = fut.a(e, tripdriver);
        if (flag || flag1)
        {
            ContactDriverAnonymouslyFragment.a(a);
            if (flag2)
            {
                b.a(n.J);
            }
            return;
        }
        if (flag2)
        {
            tripdriver = a.getString(0x7f0701c2, new Object[] {
                tripdriver.getName()
            });
        } else
        {
            tripdriver = a.getString(0x7f0700ae);
        }
        dtp.a(a, 0, tripdriver);
    }

    private int c(TripDriver tripdriver)
    {
        boolean flag = fut.a(c, e, tripdriver);
        boolean flag1 = fut.a(e, tripdriver);
        boolean flag2 = fut.a(c);
        if (!dre.a(dre.a(d.d(), d.e(), d.f())) || !flag2 && !flag)
        {
            return fvi.a;
        }
        if (flag1)
        {
            if (!flag2)
            {
                return fvi.a;
            } else
            {
                return fvi.e;
            }
        }
        if (!flag2)
        {
            return fvi.c;
        }
        if (!flag)
        {
            return fvi.d;
        } else
        {
            return fvi.b;
        }
    }

    public final void a()
    {
        Object obj = d.f();
        if (obj != null)
        {
            obj = ((Trip) (obj)).getDriver();
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            return;
        }
        if (e.a(dbf.cE) || e.a(dbf.cF))
        {
            b(((TripDriver) (obj)));
            return;
        } else
        {
            a(((TripDriver) (obj)));
            return;
        }
    }

    public final void b()
    {
        android.content.Intent intent = ChatConversationActivity.a(a);
        a.startActivity(intent);
    }
}
