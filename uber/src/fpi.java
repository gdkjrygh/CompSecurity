// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.feature.survey.SurveyDialogFragment;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.DynamicPickup;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.Map;

public final class fpi
{

    Handler a;
    Double b;
    private final cev c;
    private final gju d;
    private final hkr e;
    private final gmg f;
    private final RiderActivity g;
    private final dal h;
    private final fte i;
    private boolean j;

    public fpi(cev cev1, gju gju1, hkr hkr1, gmg gmg1, RiderActivity rideractivity, dal dal1, fte fte1)
    {
        a = new Handler(Looper.getMainLooper());
        c = (cev)gjz.a(cev1);
        d = (gju)gjz.a(gju1);
        e = (hkr)gjz.a(hkr1);
        f = (gmg)gjz.a(gmg1);
        g = (RiderActivity)gjz.a(rideractivity);
        h = (dal)gjz.a(dal1);
        i = (fte)gjz.a(fte1);
    }

    private static String a(Trip trip)
    {
        if (trip != null)
        {
            if ((trip = trip.getExtraStates()) != null)
            {
                if (trip.containsKey("UberPoolNotMatched"))
                {
                    return "UberPoolNotMatched";
                }
                if (trip.containsKey("UberPoolMatched"))
                {
                    return "UberPoolMatched";
                }
                if (trip.containsKey("UberPoolMatching"))
                {
                    return "UberPoolMatching";
                }
            }
        }
        return null;
    }

    private void a(int i1, int j1, Bundle bundle)
    {
        while (!fte.a(i.f()) || gju.a() <= h.a(j1)) 
        {
            return;
        }
        SurveyDialogFragment.a(g, i1, j1, bundle);
    }

    private void a(long l1)
    {
        if (l1 != 0L)
        {
            a.postDelayed(new Runnable() {

                final fpi a;

                public final void run()
                {
                    a.c();
                }

            
            {
                a = fpi.this;
                super();
            }
            }, l1);
        }
    }

    private static boolean a(City city, String s)
    {
        gjz.a(s);
        if (city != null)
        {
            if ((city = city.findVehicleViewById(s)) != null && city.getAllowRidepool())
            {
                return true;
            }
        }
        return false;
    }

    private void b(long l1)
    {
        h.a("estimated_pickup_time", l1);
        Object obj = i.h();
        dal dal1 = h;
        if (obj != null)
        {
            obj = ((RiderLocation) (obj)).getShortFormatted();
        } else
        {
            obj = null;
        }
        dal1.a("last_pickup_location", ((String) (obj)));
    }

    private int d()
    {
        boolean flag1 = false;
        if (i())
        {
            int i1 = l();
            if (i1 != 0)
            {
                return i1;
            }
            Object obj = e.f();
            if (obj != null)
            {
                double d1;
                byte byte0;
                int j1;
                if (k())
                {
                    j1 = ((Trip) (obj)).getEtaToDestination() * 1000;
                    Object obj1 = ((Trip) (obj)).getDynamicPickup();
                    boolean flag = flag1;
                    if (obj1 != null)
                    {
                        flag = flag1;
                        if (((DynamicPickup) (obj1)).getOriginalPickupLocation() != null)
                        {
                            flag = flag1;
                            if (!((DynamicPickup) (obj1)).getOriginalPickupLocation().equals(((Trip) (obj)).getPickupLocation()))
                            {
                                flag = true;
                            }
                        }
                    }
                    if (flag)
                    {
                        byte0 = 3;
                        d1 = f.a(dbf.bB, "probability_threshold", 1.0D);
                    } else
                    if ("UberPoolMatched".equals(a(((Trip) (obj)))))
                    {
                        d1 = f.a(dbf.bB, "probability_threshold", 1.0D);
                        byte0 = 2;
                    } else
                    {
                        h.a(2, 2);
                        a(j1 / 2);
                        return 2;
                    }
                } else
                {
                    d1 = f.a(dbf.bY, "pickup_threshold", 1.0D);
                    j1 = 0;
                    byte0 = 1;
                }
                if (g() <= d1)
                {
                    obj = new Bundle();
                    obj1 = i.h();
                    if (obj1 != null)
                    {
                        ((Bundle) (obj)).putString("survey.survey_pickup_address", ((RiderLocation) (obj1)).getShortFormatted());
                    }
                    a(6020, byte0, ((Bundle) (obj)));
                    h.a(byte0, 1);
                    return 1;
                } else
                {
                    h.a(byte0, 2);
                    a(j1 / 2);
                    return 2;
                }
            }
        }
        return 2;
    }

    private int e()
    {
        while (!h() || !f.a(dbf.bB, dbv.g) || gju.a() - h.o("estimated_pickup_time") > f.a(dbf.bB, "time_to_live", 0x36ee80L)) 
        {
            return 2;
        }
        double d1 = f.a(dbf.bB, "probability_threshold", 1.0D);
        if (g() <= d1)
        {
            Bundle bundle = new Bundle();
            String s = h.p("last_pickup_location");
            h.a("last_pickup_location", null);
            if (s != null)
            {
                bundle.putString("survey.survey_pickup_address", s);
            }
            a(6022, 6, bundle);
            return 1;
        } else
        {
            h.a(6, 2);
            return 2;
        }
    }

    private void f()
    {
        h.b(2);
        h.b(3);
        h.b(1);
        h.b(6);
        h.b(5);
        h.b(4);
    }

    private double g()
    {
        if (b == null)
        {
            return Math.random();
        } else
        {
            return b.doubleValue();
        }
    }

    private boolean h()
    {
        return f.a(dbf.e);
    }

    private boolean i()
    {
        return f.a(dbf.bY, dbv.c) || f.a(dbf.bY, dbv.b) || f.a(dbf.bB, dbv.f) || f.a(dbf.bB, dbv.h);
    }

    private boolean j()
    {
        return f.a(dbf.bY, dbv.a) || f.a(dbf.bY, dbv.b) || f.a(dbf.bA, dbv.d);
    }

    private boolean k()
    {
        return h() && a(e.b(), i.m());
    }

    private int l()
    {
        return h.c(2) + h.c(3) + h.c(1);
    }

    public final int a(int i1)
    {
        if (j()) goto _L2; else goto _L1
_L1:
        return 2;
_L2:
        double d1;
        if (i.g() == 7)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (i1 != 7)
        {
            break; /* Loop/switch isn't completed */
        }
        d1 = f.a(dbf.bA, "probability_threshold", 1.0D);
        if (g() > d1) goto _L1; else goto _L3
_L3:
        a(6019, i1, null);
        return 1;
        return 0;
    }

    public final void a()
    {
        if (h() && !j) goto _L2; else goto _L1
_L1:
        return;
_L2:
        j = true;
        c.a(this);
        int i1 = i.g();
        if (i1 != 0 && i1 != 3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (h.q("receipt_submission_status_identifier"))
        {
            h.a("receipt_submission_status_identifier", false);
            e();
        }
        if (i1 == 3)
        {
            f();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        Trip trip = e.f();
        if (trip != null && d() == 2)
        {
            long l1 = h.o("estimated_pickup_time");
            if (l1 != 0L)
            {
                long l2 = gju.a();
                long l3 = trip.getEtaToDestination() * 1000;
                if (l2 - l1 < l3)
                {
                    a((l3 + (l2 - l1)) / 2L - (l2 - l1));
                    return;
                } else
                {
                    c();
                    return;
                }
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void b()
    {
        while (!h() || !j) 
        {
            return;
        }
        j = false;
        c.b(this);
        a.removeCallbacksAndMessages(null);
    }

    final int c()
    {
        while (!h() || !f.a(dbf.bB, dbv.e)) 
        {
            return 2;
        }
        int i1 = h.c(4);
        if (i1 != 0)
        {
            return i1;
        }
        double d1 = f.a(dbf.bB, "probability_threshold", 1.0D);
        if (g() <= d1)
        {
            Bundle bundle = new Bundle();
            RiderLocation riderlocation = i.h();
            if (riderlocation != null)
            {
                bundle.putString("survey.survey_pickup_address", riderlocation.getShortFormatted());
            }
            a(6021, 4, bundle);
            h.a(4, 1);
            return 1;
        } else
        {
            h.a(4, 2);
            return 2;
        }
    }

    public final void onTripUiStateChanged(fzc fzc1)
    {
        if (fzc1.b() == 3)
        {
            f();
        } else
        {
            Trip trip = e.f();
            if (trip != null)
            {
                long l1 = gju.a();
                if (fzc1.b() == 7)
                {
                    b(l1);
                    d();
                }
                if (fzc1.b() == 6)
                {
                    b((long)trip.getEta() * 60L * 1000L + l1);
                    return;
                }
            }
        }
    }
}
