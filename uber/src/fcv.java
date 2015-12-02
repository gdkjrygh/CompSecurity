// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.model.Item;
import com.ubercab.client.feature.receipt.MealReceiptFragment;
import com.ubercab.ui.Button;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class fcv extends FragmentStatePagerAdapter
{

    final Map a = new HashMap();
    private final chp b;
    private final List c;
    private final ArrayList d;
    private final ArrayList e;
    private final Button f;
    private final ViewPager g;
    private final Map h = new HashMap();

    public fcv(chp chp1, FragmentManager fragmentmanager, List list, ArrayList arraylist, ArrayList arraylist1, Button button, ViewPager viewpager)
    {
        super(fragmentmanager);
        b = chp1;
        c = list;
        d = arraylist;
        e = arraylist1;
        f = button;
        g = viewpager;
        a();
    }

    public static Map a(fcv fcv1)
    {
        return fcv1.b();
    }

    private void a()
    {
        if (g != null)
        {
            g.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

                final fcv a;

                public final void onPageScrollStateChanged(int i)
                {
                    int j = fcv.f(a).getCurrentItem();
                    Object obj = ((Item)fcv.d(a).get(j)).getUuid();
                    obj = (MealReceiptFragment)a.a.get(obj);
                    switch (i)
                    {
                    default:
                        return;

                    case 0: // '\0'
                        ((MealReceiptFragment) (obj)).a(j, a.getCount());
                        return;

                    case 1: // '\001'
                        ((MealReceiptFragment) (obj)).b();
                        break;
                    }
                }

                public final void onPageScrolled(int i, float f1, int j)
                {
                }

                public final void onPageSelected(int i)
                {
                    String s = ((Item)fcv.d(a).get(i)).getUuid();
                    ((MealReceiptFragment)a.a.get(s)).a(i, a.getCount());
                    fcv.e(a).a(AnalyticsEvent.create("impression").setName(l.iA).setValue(s));
                }

            
            {
                a = fcv.this;
                super();
            }
            });
        }
    }

    private Map b()
    {
        return h;
    }

    static Map b(fcv fcv1)
    {
        return fcv1.h;
    }

    static Button c(fcv fcv1)
    {
        return fcv1.f;
    }

    static List d(fcv fcv1)
    {
        return fcv1.c;
    }

    static chp e(fcv fcv1)
    {
        return fcv1.b;
    }

    static ViewPager f(fcv fcv1)
    {
        return fcv1.g;
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Fragment getItem(int i)
    {
        Object obj = (Item)c.get(i);
        String s = ((Item) (obj)).getUuid();
        if (a.containsKey(s))
        {
            obj = (MealReceiptFragment)a.get(s);
        } else
        {
            obj = MealReceiptFragment.a(((Item) (obj)), d, e);
            a.put(s, obj);
        }
        ((MealReceiptFragment) (obj)).a(new fda(((MealReceiptFragment) (obj)), s) {

            final MealReceiptFragment a;
            final String b;
            final fcv c;

            public final void a()
            {
                com.ubercab.client.core.model.MealReceiptRating mealreceiptrating = a.a();
                fcv.b(c).put(b, mealreceiptrating);
                if (!fcv.c(c).isEnabled())
                {
                    fcv.c(c).setEnabled(true);
                }
            }

            public final void b()
            {
                fcv.b(c).remove(b);
                if (fcv.b(c).isEmpty())
                {
                    fcv.c(c).setEnabled(false);
                }
            }

            
            {
                c = fcv.this;
                a = mealreceiptfragment;
                b = s;
                super();
            }
        });
        ((MealReceiptFragment) (obj)).a(s);
        ((MealReceiptFragment) (obj)).a(getCount());
        ((MealReceiptFragment) (obj)).b(i);
        ((MealReceiptFragment) (obj)).a(f);
        ((MealReceiptFragment) (obj)).a(g);
        if (i == 0)
        {
            b.a(AnalyticsEvent.create("impression").setName(l.iA).setValue(s));
        }
        return ((Fragment) (obj));
    }
}
