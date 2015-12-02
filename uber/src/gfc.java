// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.ubercab.client.feature.trip.tray.DiscountProgressAnimView;
import com.ubercab.client.feature.trip.tray.TrayRidepoolSavingsLayout;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.Trip;
import com.ubercab.rider.realtime.model.TripEntity;
import com.ubercab.rider.realtime.model.TripLeg;
import com.ubercab.rider.realtime.model.TripLegAction;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class gfc extends gfm
{

    final TrayRidepoolSavingsLayout a;

    private gfc(TrayRidepoolSavingsLayout trayridepoolsavingslayout)
    {
        a = trayridepoolsavingslayout;
        super(trayridepoolsavingslayout);
    }

    public gfc(TrayRidepoolSavingsLayout trayridepoolsavingslayout, byte byte0)
    {
        this(trayridepoolsavingslayout);
    }

    static void a(gfc gfc1)
    {
        gfc1.m();
    }

    static void a(gfc gfc1, String s)
    {
        gfc1.d(s);
    }

    private void a(String s)
    {
        c();
        String s2 = TrayRidepoolSavingsLayout.a(d.f());
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = a.b(s);
        }
        d(s1);
    }

    private void a(String s, String s1)
    {
        l();
        d(TrayRidepoolSavingsLayout.a(a).getString(0x7f070627));
        String s3 = TrayRidepoolSavingsLayout.a(d.f());
        String s2 = s3;
        if (TextUtils.isEmpty(s3))
        {
            s2 = a.a(s, s1);
        }
        a.postDelayed(new Runnable(s2) {

            final String a;
            final gfc b;

            public final void run()
            {
                gfc.a(b);
                b.a.postDelayed(new Runnable(this) {

                    final _cls1 a;

                    public final void run()
                    {
                        gfc.b(a.b);
                        gfc.a(a.b, a.a);
                    }

            
            {
                a = _pcls1;
                super();
            }
                }, 1600L);
            }

            
            {
                b = gfc.this;
                a = s;
                super();
            }
        }, 1600L);
    }

    private static boolean a(Client client, Trip trip)
    {
        if (client != null && trip != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Set set = trip.getEntities().keySet();
        List list = trip.getLegs();
        Iterator iterator = ((TripLeg)list.get(trip.getCurrentLegIndex())).getActions().iterator();
        TripLegAction triplegaction1;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            triplegaction1 = (TripLegAction)iterator.next();
        } while (!triplegaction1.getEntityRef().equals(client.getUuid()) || !triplegaction1.getType().equals("Dropoff"));
label0:
        for (int i = 0; i < trip.getCurrentLegIndex(); i++)
        {
            client = ((TripLeg)list.get(i)).getActions().iterator();
            do
            {
                if (!client.hasNext())
                {
                    continue label0;
                }
                TripLegAction triplegaction = (TripLegAction)client.next();
                if (triplegaction.getType().equals("Dropoff"))
                {
                    set.remove(triplegaction.getEntityRef());
                }
            } while (true);
        }

        if (set.size() == 1)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static TripEntity b(Client client, Trip trip)
    {
        if (client == null || trip == null)
        {
            return null;
        }
        for (trip = trip.getEntities().values().iterator(); trip.hasNext();)
        {
            TripEntity tripentity = (TripEntity)trip.next();
            if (!gjx.a(tripentity.getUuid(), client.getUuid()))
            {
                return tripentity;
            }
        }

        return null;
    }

    static void b(gfc gfc1)
    {
        gfc1.o();
    }

    private void b(String s)
    {
        String s2 = TrayRidepoolSavingsLayout.a(d.f());
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = a.c(s);
        }
        n();
        d(s1);
    }

    private void c()
    {
        a.mViewFlipper.setDisplayedChild(0);
        a.mUberPoolMatchAnimationView.a();
    }

    private void c(String s)
    {
        String s2 = TrayRidepoolSavingsLayout.a(d.f());
        String s1 = s2;
        if (TextUtils.isEmpty(s2))
        {
            s1 = a.a(s);
        }
        d(s1);
        o();
    }

    private void d(String s)
    {
        s = dux.a(s, TrayRidepoolSavingsLayout.a(a).getColor(0x7f0d0078));
        String s1 = ((TextView)a.mTextSwitcher.getCurrentView()).getText().toString();
        if (!s.toString().equals(s1))
        {
            a.mTextSwitcher.setText(s);
        }
    }

    private void l()
    {
        a.mViewFlipper.setDisplayedChild(0);
        a.mUberPoolMatchAnimationView.b();
    }

    private void m()
    {
        a.mViewFlipper.setDisplayedChild(0);
        a.mUberPoolMatchAnimationView.c();
    }

    private void n()
    {
        a.mViewFlipper.setDisplayedChild(1);
    }

    private void o()
    {
        a.mNotMatchedIcon.setScaleX(0.0F);
        a.mNotMatchedIcon.setScaleY(0.0F);
        a.mNotMatchedIcon.setAlpha(0.0F);
        n();
        a.mNotMatchedIcon.animate().setInterpolator(new OvershootInterpolator(1.0F)).alpha(1.0F).scaleX(1.0F).scaleY(1.0F).setDuration(TrayRidepoolSavingsLayout.a(a).getInteger(0x7f0b0010)).start();
    }

    public final int a()
    {
        gfq gfq1 = h.d();
        if (gfq1.a() == gfr.d)
        {
            return TrayRidepoolSavingsLayout.b(a);
        }
        if (gfq1.b() == gfr.d)
        {
            return TrayRidepoolSavingsLayout.c(a);
        } else
        {
            return 0;
        }
    }

    public final void a(gfj gfj1)
    {
        Object obj;
        Trip trip;
        String s;
        boolean flag;
        flag = true;
        super.a(gfj1);
        trip = gfj1.f();
        a(gfp.a(trip));
        if (!i)
        {
            TrayRidepoolSavingsLayout.a(a, null);
            return;
        }
        obj = drf.a(gfj1.a(), trip);
        boolean flag1;
        if (obj != null && ((VehicleView) (obj)).getAllowRidepool())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a.a(flag1);
        s = TrayRidepoolSavingsLayout.b(trip);
        if (gjx.a(s, TrayRidepoolSavingsLayout.d(a)))
        {
            flag = false;
        }
        if (trip != null)
        {
            obj = trip.getExtraStates();
        } else
        {
            obj = null;
        }
        if (!"UberPoolNotMatched".equals(s) || !flag) goto _L2; else goto _L1
_L1:
        c((String)((Map)((Map) (obj)).get("UberPoolNotMatched")).get("promoString"));
_L4:
        TrayRidepoolSavingsLayout.a(a, s);
        return;
_L2:
        if ("UberPoolMatched".equals(s))
        {
            obj = (String)((Map)((Map) (obj)).get("UberPoolMatched")).get("promoString");
            if (a(gfj1.b(), trip))
            {
                b(((String) (obj)));
            } else
            if (flag)
            {
                gfj1 = b(gfj1.b(), trip);
                if (obj != null && gfj1 != null)
                {
                    a(gfj1.getTitle(), ((String) (obj)));
                }
            }
        } else
        if ("UberPoolMatching".equals(s) && flag)
        {
            a((String)((Map)((Map) (obj)).get("UberPoolMatching")).get("promoString"));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(gfk gfk1)
    {
        super.a(gfk1);
        if (gfk1 != null && this.i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int j;
        int k = b();
        j = a();
        i = k;
        if (k != j)
        {
            i = k;
            switch (com.ubercab.client.feature.trip.tray.TrayRidepoolSavingsLayout._cls2.a[gfk1.b().ordinal()])
            {
            default:
                i = k;
                break;

            case 1: // '\001'
                break;

            case 2: // '\002'
                break; /* Loop/switch isn't completed */

            case 3: // '\003'
                break MISSING_BLOCK_LABEL_115;
            }
        }
_L4:
        gfk1 = h();
        if (((android.view.ViewGroup.MarginLayoutParams) (gfk1)).height != i)
        {
            gfk1.height = i;
            a.requestLayout();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        i = j;
          goto _L4
        i = TrayRidepoolSavingsLayout.c(a);
        float f = j;
        i = (int)((float)(i - j) * gfk1.c() + f);
          goto _L4
    }

    public final int b()
    {
        if (i)
        {
            return TrayRidepoolSavingsLayout.c(a);
        } else
        {
            return 0;
        }
    }
}
