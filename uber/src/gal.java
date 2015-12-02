// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.trip.event.PanelSlideEvent;
import com.ubercab.rider.realtime.model.City;
import java.util.Map;

public final class gal
{

    int a;
    PanelSlideEvent b;
    private final int c;
    private int d;
    private int e;
    private boolean f;
    private hkr g;
    private ViewGroup h;
    private View i;
    private ViewGroup j;
    private View k;

    public gal(hkr hkr1, RiderActivity rideractivity)
    {
        a = 0x80000000;
        c = duz.a(rideractivity);
        g = hkr1;
    }

    private static void a(View view, boolean flag, float f1)
    {
        if (flag)
        {
            view.animate().translationY(f1);
            return;
        } else
        {
            view.setTranslationY(f1);
            return;
        }
    }

    private void b(boolean flag)
    {
        if (b == null)
        {
            a(flag);
            return;
        } else
        {
            float f1 = d();
            a(i, flag, f1);
            a(j, flag, f1);
            f1 = e();
            a(k, flag, f1);
            a(h, flag, f1);
            return;
        }
    }

    private float d()
    {
        int l = b.b();
        float f1 = b.a();
        int i1 = i.getMeasuredHeight() - l - d;
        l = i1;
        if (!f())
        {
            l = i1 - e;
        }
        return -(((float)l / 2.0F) * f1);
    }

    private float e()
    {
        int l;
        if (f())
        {
            l = -e;
        } else
        {
            l = -c;
        }
        return (float)l * b.a();
    }

    private boolean f()
    {
        return fte.b(a);
    }

    public final void a()
    {
        Object obj = g.b();
        if (obj != null)
        {
            obj = ((City) (obj)).getVehicleViews();
        } else
        {
            obj = null;
        }
        if (obj == null || ((Map) (obj)).isEmpty())
        {
            a(true);
        }
    }

    public final void a(int l, int i1)
    {
        e = l;
        d = i1;
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            if (bundle.containsKey("com.ubercab.STATE_PREVIOUS_SLIDE_EVENT"))
            {
                b = (PanelSlideEvent)bundle.getParcelable("com.ubercab.STATE_PREVIOUS_SLIDE_EVENT");
            }
            a = bundle.getInt("com.ubercab.STATE_CURRENT_TRIP_STATE", 0x80000000);
            if (bundle.containsKey("com.ubercab.STATE_CURRENT_Y_TRANSLATION"))
            {
                bundle = bundle.getFloatArray("com.ubercab.STATE_CURRENT_Y_TRANSLATION");
                i.setTranslationY(bundle[0]);
                j.setTranslationY(bundle[1]);
                k.setTranslationY(bundle[2]);
                h.setTranslationY(bundle[3]);
                return;
            }
        }
    }

    public final void a(View view, ViewGroup viewgroup, View view1, ViewGroup viewgroup1)
    {
        i = view;
        j = viewgroup;
        h = viewgroup1;
        k = view1;
    }

    public final void a(dar dar1)
    {
        if (!dul.e(dar1.a()))
        {
            a(true);
        }
    }

    public final void a(boolean flag)
    {
        b = null;
        float f1;
        if (f)
        {
            f1 = -c;
        } else
        {
            f1 = 0.0F;
        }
        a(i, flag, 0.0F);
        a(((View) (j)), flag, 0.0F);
        a(((View) (h)), flag, f1);
        a(k, flag, f1);
    }

    public final void b(Bundle bundle)
    {
        if (b != null)
        {
            bundle.putParcelable("com.ubercab.STATE_PREVIOUS_SLIDE_EVENT", b);
        }
        bundle.putInt("com.ubercab.STATE_CURRENT_TRIP_STATE", a);
        bundle.putFloatArray("com.ubercab.STATE_CURRENT_Y_TRANSLATION", new float[] {
            i.getTranslationY(), j.getTranslationY(), k.getTranslationY(), h.getTranslationY()
        });
    }

    public final boolean b()
    {
        return b != null && b.a() != 0.0F;
    }

    public final int c()
    {
        if (f)
        {
            return 0;
        } else
        {
            return c;
        }
    }

    public final void onPanelSlideEvent(PanelSlideEvent panelslideevent)
    {
        b = panelslideevent;
        b(false);
    }

    public final void onTripUiStateEvent(fzc fzc1)
    {
        int l = fzc1.b();
        if (a == l || l == 0x80000000)
        {
            return;
        }
        boolean flag = fte.b(a);
        boolean flag1 = fte.b(l);
        a = l;
        if (b != null && b.a() >= 1E-05F)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        f = false;
        if (a == 1 || a == 2)
        {
            f = true;
            a(true);
            return;
        }
        if (l && (a == 3 || a == 4 || flag != flag1))
        {
            a(true);
            return;
        } else
        {
            b(true);
            return;
        }
    }
}
