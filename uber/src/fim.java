// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.ubercab.client.core.model.ShoppingCartCharges;
import com.ubercab.client.feature.shoppingcart.model.Store;
import com.ubercab.rider.realtime.response.Promotion;
import java.util.List;
import java.util.Map;

public final class fim
{

    final Map a = new ArrayMap();
    final Map b = new ArrayMap();
    List c;
    private final cev d;
    private final dkq e;

    public fim(cev cev1, dkq dkq1)
    {
        gjz.a(cev1);
        d = cev1;
        e = dkq1;
    }

    public final void a()
    {
        d.a(this);
    }

    public final void a(double d1, double d2, String s)
    {
        e.a(d1, d2, s);
    }

    public final void a(String s)
    {
        a.remove(s);
    }

    public final void a(String s, Promotion promotion)
    {
        a.put(s, promotion);
    }

    public final void a(String s, String s1)
    {
label0:
        {
            Object obj = (Store)b.get(s1);
            if (obj != null)
            {
                ((Store) (obj)).clearShoppingCartIfExpired();
                obj = ((Store) (obj)).getItemsForServer();
                if (obj == null || ((List) (obj)).isEmpty())
                {
                    break label0;
                }
                e.a(((List) (obj)), s, s1, "");
            }
            return;
        }
        d.c(new fje(null));
    }

    public final void a(String s, String s1, long l)
    {
        e.a(s, s1, l);
    }

    public final void a(String s, String s1, String s2)
    {
        e.a(s, s1, s2);
    }

    public final void a(String s, String s1, String s2, long l)
    {
        e.a(s, s1, s2, l);
    }

    public final void a(String s, String s1, String s2, Double double1, Double double2)
    {
label0:
        {
            Object obj = (Store)b.get(s1);
            if (obj != null)
            {
                ((Store) (obj)).clearShoppingCartIfExpired();
                obj = ((Store) (obj)).getItemsForServer();
                if (obj == null || ((List) (obj)).isEmpty())
                {
                    break label0;
                }
                e.a(((List) (obj)), s, s1, s2, double1, double2);
            }
            return;
        }
        d.c(new fje(null));
    }

    public final Promotion b(String s)
    {
        return (Promotion)a.get(s);
    }

    public final void b()
    {
        d.b(this);
    }

    public final Store c(String s)
    {
        s = (Store)b.get(s);
        if (s != null)
        {
            s.clearShoppingCartIfExpired();
        }
        return s;
    }

    public final void onDeleteReminderResponseEvent(fiz fiz1)
    {
        String s = fiz1.c();
        String s1 = fiz1.a();
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) || !b.containsKey(s))
        {
            return;
        }
        if (fiz1.d())
        {
            Store store = (Store)b.get(s);
            store.removeReminder(s1, fiz1.b());
            d.c(new fjg(s, store, false));
            return;
        } else
        {
            d.c(new fjc(2, fiz1.c(), fiz1.a()));
            return;
        }
    }

    public final void onInventoryResponseEvent(fja fja1)
    {
        Store store = null;
        boolean flag = true;
        String s = fja1.b();
        if (fja1.c())
        {
            if (b.containsKey(s))
            {
                store = (Store)b.get(s);
                int i = store.getInventoryHash();
                store.updateInventory(fja1.a());
                if (i != store.getInventoryHash())
                {
                    fja1 = store;
                } else
                {
                    flag = false;
                    fja1 = store;
                }
            } else
            {
                fja1 = Store.createFromInventory(fja1.a());
                b.put(s, fja1);
            }
        } else
        {
            c = null;
            flag = false;
            fja1 = store;
        }
        d.c(new fjg(s, fja1, flag));
    }

    public final void onReminderResponseEvent(fjd fjd1)
    {
        String s = fjd1.e();
        String s1 = fjd1.a();
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) || !b.containsKey(s))
        {
            return;
        }
        if (fjd1.f())
        {
            Store store = (Store)b.get(s);
            store.setReminder(s1, fjd1.b(), fjd1.d());
            d.c(new fjg(s, store, false));
            return;
        } else
        {
            d.c(new fjc(fjd1.c(), fjd1.e(), fjd1.a()));
            return;
        }
    }

    public final void onShoppingChargesResponseEvent(dni dni1)
    {
        if (!dni1.i() || dni1.g() == null)
        {
            d.c(new fje(null));
            return;
        }
        if (((ShoppingCartCharges)dni1.g()).isAllowCheckout() != null && ((ShoppingCartCharges)dni1.g()).isAllowCheckout().booleanValue())
        {
            String s = dni1.a();
            Store store = (Store)b.get(s);
            store.setCartCharges((ShoppingCartCharges)dni1.g());
            d.c(new fjf(s, store));
            return;
        } else
        {
            d.c(new fje(((ShoppingCartCharges)dni1.g()).getFooter()));
            return;
        }
    }
}
