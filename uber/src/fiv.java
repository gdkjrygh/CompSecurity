// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.feature.shoppingcart.ShoppingConfirmationView;
import com.ubercab.client.feature.shoppingcart.model.Store;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class fiv
    implements fin
{

    ShoppingConfirmationView a;
    private final drc b;
    private final hkr c;
    private final RiderActivity d;
    private final fim e;
    private final fte f;
    private final Set g = new HashSet();
    private ViewGroup h;

    public fiv(drc drc1, hkr hkr1, RiderActivity rideractivity, fim fim1, fte fte1)
    {
        b = drc1;
        c = hkr1;
        d = rideractivity;
        e = fim1;
        f = fte1;
    }

    private boolean c()
    {
        return a != null && a.getVisibility() == 0;
    }

    private void d()
    {
        if (a == null)
        {
            return;
        } else
        {
            a.b(this);
            h.removeView(a);
            a = null;
            return;
        }
    }

    public final void a()
    {
        Iterator iterator = g.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            fiw fiw1 = (fiw)iterator.next();
            if (fiw1 != null)
            {
                fiw1.m_();
            }
        } while (true);
    }

    public final void a(int i, int j)
    {
        if (!c())
        {
            return;
        } else
        {
            a.a(i, j);
            return;
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        h = viewgroup;
    }

    public final void a(fiw fiw1)
    {
        if (fiw1 == null)
        {
            return;
        } else
        {
            g.add(fiw1);
            return;
        }
    }

    public final void a(fzc fzc1)
    {
        if (!fte.e(fzc1.b()))
        {
            d();
        } else
        if (!c())
        {
            fzc1 = f.m();
            Object obj = c.b();
            if (obj == null)
            {
                fzc1 = null;
            } else
            {
                fzc1 = ((City) (obj)).findVehicleViewById(fzc1);
            }
            if (fzc1 != null)
            {
                obj = fzc1.getUuid();
            } else
            {
                obj = null;
            }
            if (b.k() || fzc1 == null || !fzc1.getEnableVehicleInventoryView() || obj == null || e == null || e.c(((String) (obj))) == null || e.c(((String) (obj))).getShoppingCartTotalItemsCount() <= 0)
            {
                d();
                return;
            }
            if (h == null)
            {
                throw new IllegalStateException("RootView cannot be null");
            }
            if (a == null)
            {
                a = (ShoppingConfirmationView)d.getLayoutInflater().inflate(0x7f0301f6, h, false);
                h.addView(a);
                a.a(this);
            }
            a.a(((String) (obj)), e);
            return;
        }
    }

    public final int b()
    {
        if (!c())
        {
            return 0;
        } else
        {
            return a.a();
        }
    }

    public final void b(fiw fiw1)
    {
        g.remove(fiw1);
    }
}
