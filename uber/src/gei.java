// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.summary.TripSummaryView;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.CreditBalance;
import com.ubercab.rider.realtime.model.FareInfo;
import com.ubercab.rider.realtime.model.Metadata;
import com.ubercab.rider.realtime.model.PaymentProfile;
import com.ubercab.rider.realtime.model.RewardInfo;
import com.ubercab.rider.realtime.model.VehicleView;

public final class gei
    implements gek
{

    TripSummaryView a;
    private final chp b;
    private final RiderActivity c;
    private final hkr d;
    private final gmg e;
    private final fqg f;
    private final dal g;
    private final fsx h;
    private final fte i;
    private gej j;
    private PaymentProfile k;
    private String l;
    private boolean m;

    public gei(chp chp1, hkr hkr1, gmg gmg1, fqg fqg1, RiderActivity rideractivity, dal dal1, fsx fsx1, 
            fte fte1)
    {
        b = chp1;
        f = fqg1;
        d = hkr1;
        e = gmg1;
        c = rideractivity;
        g = dal1;
        h = fsx1;
        i = fte1;
    }

    private void d(boolean flag)
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!flag || g.T())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!TextUtils.isEmpty(l))
        {
            a.a(l, true);
            a.d(true);
            a.e(false);
            a.c(false);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        FareInfo fareinfo = f.b();
        TripSummaryView tripsummaryview = a;
        if (fareinfo != null && fareinfo.isFareElevated())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        tripsummaryview.c(flag);
        if (fareinfo != null && fareinfo.getMetadata() != null)
        {
            a.a(fareinfo.getMetadata().getFormattedFare(), false);
            a.e(true);
            a.d(true);
            b.a(AnalyticsEvent.create("impression").setName(l.ff).setValue(fareinfo.getMetadata().getFormattedFare()));
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private boolean g()
    {
        boolean flag1 = false;
        Object obj = h.a();
        City city = d.b();
        boolean flag = flag1;
        if (city != null)
        {
            flag = flag1;
            if (obj != null)
            {
                obj = ((PaymentProfile) (obj)).getRewardInfo();
                flag = flag1;
                if (obj != null)
                {
                    flag = flag1;
                    if (((RewardInfo) (obj)).isEnrolled())
                    {
                        flag = flag1;
                        if (!((RewardInfo) (obj)).isEarnOnly())
                        {
                            flag = flag1;
                            if (!((RewardInfo) (obj)).usePointsDisabled())
                            {
                                flag = flag1;
                                if (era.a(city.getCountryIso2()))
                                {
                                    flag = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final void a()
    {
        if (a.a())
        {
            b.a(AnalyticsEvent.create("tap").setName(n.F).setValue("tap on capacity"));
            if (j != null)
            {
                j.l();
                return;
            }
        }
    }

    public final void a(int i1)
    {
        if (a == null)
        {
            return;
        } else
        {
            a.a(String.valueOf(i1));
            a.b(true);
            return;
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        gjz.a(viewgroup);
        i.b(true);
        a = (TripSummaryView)c.getLayoutInflater().inflate(0x7f0301d9, viewgroup, false);
        viewgroup.addView(a);
        a.a(this);
        b.a(AnalyticsEvent.create("impression").setName(l.ax).setValue("show"));
    }

    public final void a(fyi fyi1, boolean flag)
    {
        while (a == null || fyi1.a() != null) 
        {
            return;
        }
        l = null;
        if (flag)
        {
            a.e(false);
            a.c(false);
            a.a(c.getString(0x7f07049d), false);
            return;
        } else
        {
            a.d(false);
            return;
        }
    }

    public final void a(gej gej1)
    {
        j = (gej)gjz.a(gej1);
    }

    public final void a(boolean flag)
    {
        l = f.c();
        d(flag);
    }

    public final void a(boolean flag, boolean flag1, boolean flag2)
    {
        if (a != null)
        {
            TripSummaryView tripsummaryview = a;
            int i1;
            boolean flag3;
            if (flag || flag1)
            {
                i1 = 0x7f0200e9;
            } else
            {
                i1 = 0x7f0200e8;
            }
            tripsummaryview.setBackgroundResource(i1);
            tripsummaryview = a;
            if (!flag)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            tripsummaryview.a(flag3);
            if (flag)
            {
                a.d(true);
                if (a.d())
                {
                    a.e(false);
                    a.c(false);
                    a.a(c.getString(0x7f07049d), false);
                }
            }
            if (!flag2)
            {
                d(flag1);
            }
            f();
            if ((flag2 || flag1) && !g.T() || !i.l())
            {
                Object obj = d.b();
                if (obj != null)
                {
                    obj = ((City) (obj)).findVehicleViewById(i.m());
                    a.a(String.format(c.getString(0x7f070792), new Object[] {
                        Integer.valueOf(((VehicleView) (obj)).getCapacity())
                    }));
                    a.b(false);
                    return;
                }
            } else
            {
                a(i.k());
                return;
            }
        }
    }

    public final void b()
    {
        b.a(AnalyticsEvent.create("tap").setName(n.H).setValue("tap on payment"));
        if (j != null)
        {
            j.k();
        }
    }

    public final void b(boolean flag)
    {
        l = f.c();
        d(flag);
    }

    public final void c()
    {
        b.a(AnalyticsEvent.create("tap").setName(n.G).setValue("tap on fare"));
        if (j != null)
        {
            j.a(a.e());
        }
    }

    public final boolean c(boolean flag)
    {
        if (e.b(dbf.aN) || e.b(dbf.cK))
        {
            return false;
        }
        if (flag)
        {
            return true;
        }
        if (g())
        {
            return false;
        }
        Object obj = d.b();
        if (obj == null)
        {
            return false;
        }
        Object obj1 = ((City) (obj)).findVehicleViewById(i.m());
        if (obj1 == null)
        {
            return false;
        }
        if (((VehicleView) (obj1)).getAllowRidepool())
        {
            return true;
        }
        obj1 = ((VehicleView) (obj1)).getLinkedVehicleViewId();
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            obj = null;
        } else
        {
            obj = ((City) (obj)).findVehicleViewById(((String) (obj1)));
        }
        return e.a(dbf.b) && obj != null && ((VehicleView) (obj)).getAllowRidepool();
    }

    public final void d()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.b();
            j = null;
            a = null;
            i.b(false);
            return;
        }
    }

    public final boolean e()
    {
        return a != null && a.getParent() != null;
    }

    public final void f()
    {
        boolean flag1 = false;
        if (a != null)
        {
            Object obj = d.c();
            City city = d.b();
            if (obj != null && city != null && ((Client) (obj)).getPaymentProfiles() != null && ((Client) (obj)).getCreditBalances() != null)
            {
                PaymentProfile paymentprofile = h.a();
                boolean flag2 = h.d();
                if (k == null || !k.equals(paymentprofile) || flag2 != m || a.c())
                {
                    String s = null;
                    int i1;
                    boolean flag;
                    if (paymentprofile != null)
                    {
                        k = paymentprofile;
                        i1 = esj.c(paymentprofile.getCardType());
                        s = dui.a(c, paymentprofile, ((Client) (obj)).getPaymentProfiles(), false, true);
                    } else
                    {
                        i1 = 0;
                    }
                    obj = dtv.a(city.getCurrencyCode(), ((Client) (obj)).getCreditBalances());
                    flag = flag1;
                    if (flag2)
                    {
                        flag = flag1;
                        if (obj != null)
                        {
                            flag = true;
                        }
                    }
                    m = flag;
                    if (m)
                    {
                        a.a(0x7f020277);
                        if (obj != null)
                        {
                            a.b(((CreditBalance) (obj)).getAmountString());
                            return;
                        }
                    } else
                    {
                        a.a(i1);
                        a.b(s);
                        return;
                    }
                }
            }
        }
    }
}
