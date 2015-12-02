// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.pickup.view.WalkingEstimatorCircleView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fxs
    implements cjq, ewp, ewr, exg
{

    private final fwd a;
    private final fws b;
    private final RiderActivity c;
    private final ewm d;
    private final fte e;
    private WalkingEstimatorCircleView f;
    private ViewGroup g;
    private cjn h;
    private double i;
    private int j;
    private boolean k;
    private float l;
    private boolean m;

    public fxs(RiderActivity rideractivity, fwd fwd1, fws fws1, ewm ewm1, fte fte1)
    {
        c = (RiderActivity)gjz.a(rideractivity);
        b = (fws)gjz.a(fws1);
        a = (fwd)gjz.a(fwd1);
        d = (ewm)gjz.a(ewm1);
        e = (fte)gjz.a(fte1);
    }

    private void a(int i1)
    {
        if (f != null)
        {
            k = false;
            f.setRadius(i1);
        }
    }

    private void a(Iterable iterable)
    {
        Object obj;
label0:
        {
            com.ubercab.android.location.UberLatLng uberlatlng = fwd.a(h);
            obj = null;
            Object obj1 = null;
            if (iterable == null)
            {
                break label0;
            }
            Iterator iterator = iterable.iterator();
            iterable = obj1;
            do
            {
                double d1;
                do
                {
                    obj = iterable;
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    d1 = fwd.a(uberlatlng, fwd.a((com.ubercab.rider.realtime.model.DynamicPickupsResponse.PickupLocation)iterator.next()));
                } while (iterable != null && d1 <= iterable.doubleValue());
                obj = Double.valueOf(d1);
                iterable = ((Iterable) (obj));
            } while (((Double) (obj)).doubleValue() < d.e());
            obj = Double.valueOf(d.e());
        }
        if (obj != null)
        {
            a(b.a(h, (int)Math.round(((Double) (obj)).doubleValue())));
            i = ((Double) (obj)).doubleValue();
            return;
        } else
        {
            i = 0.0D;
            q();
            return;
        }
    }

    private void n()
    {
        if (d.l() && h != null && g != null)
        {
            if (!d.k())
            {
                if (o())
                {
                    q();
                    return;
                }
            } else
            {
                switch (e.g())
                {
                case 1: // '\001'
                case 2: // '\002'
                default:
                    q();
                    return;

                case 0: // '\0'
                    p();
                    f.setTranslationY(l);
                    f.a(false);
                    a(d.a());
                    return;

                case 3: // '\003'
                    if (e.j())
                    {
                        r();
                    } else
                    {
                        p();
                        f.setTranslationY(l);
                        f.a(false);
                    }
                    a(d.a());
                    return;

                case 4: // '\004'
                    p();
                    f.setTranslationY(j);
                    f.a(true);
                    return;
                }
            }
        }
    }

    private boolean o()
    {
        return f != null && f.getParent() == g;
    }

    private void p()
    {
        if (f == null)
        {
            f = (WalkingEstimatorCircleView)c.getLayoutInflater().inflate(0x7f03020a, g, false);
            f.a(this);
        }
        if (f.getParent() != g)
        {
            Object obj = new ArrayList();
            for (int i1 = 0; i1 < g.getChildCount(); i1++)
            {
                View view = g.getChildAt(i1);
                g.removeView(view);
                ((List) (obj)).add(view);
            }

            g.addView(f);
            View view1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); g.addView(view1))
            {
                view1 = (View)((Iterator) (obj)).next();
            }

        }
    }

    private void q()
    {
        if (f != null)
        {
            f.a();
            k = true;
        }
    }

    private void r()
    {
        if (f != null && f.getParent() == g)
        {
            g.removeView(f);
        }
    }

    public final void a(float f1, int i1)
    {
        int j1 = Math.round((float)g.getHeight() / 2.0F);
        f1 = ((float)i1 + f1) - (float)j1;
        if (f1 != l)
        {
            l = f1;
            n();
        }
    }

    public final void a(int i1, int j1)
    {
        int k1 = g.getHeight();
        float f1 = (float)k1 / 2.0F;
        j = Math.round(((float)(k1 - i1 - j1) / 2.0F + (float)i1) - f1);
        d.a(Math.round(f1 + (float)j));
    }

    public final void a(ViewGroup viewgroup)
    {
        g = (ViewGroup)gjz.a(viewgroup);
    }

    public final void a(cjg cjg)
    {
        if (e.g() == 0 || e.g() == 3 || e.g() == 4)
        {
            if (!m)
            {
                a(((Iterable) (d.a())));
            }
            a(b.a(h, (int)Math.round(i)));
        }
    }

    public final void a(cjn cjn)
    {
        h = cjn;
        n();
    }

    public final void c()
    {
        if (k)
        {
            k = false;
            g.removeView(f);
            f.b(this);
            f = null;
        }
    }

    public final void d()
    {
        d.a(this);
        d.a(this);
        d.a(this);
        n();
    }

    public final void e()
    {
        d.b(this);
        d.b(this);
        d.a(null);
    }

    public final void f()
    {
        n();
    }

    public final void g()
    {
        n();
    }

    public final boolean h()
    {
        return d.l();
    }

    public final Bitmap i()
    {
        if (f != null)
        {
            return f.getBitmap();
        } else
        {
            return null;
        }
    }

    public final void j()
    {
        m = true;
    }

    public final void k()
    {
    }

    public final void l()
    {
        n();
        m = false;
    }

    public final double m()
    {
        return i;
    }

    public final void u_()
    {
        n();
    }

    public final void v_()
    {
        n();
    }
}
