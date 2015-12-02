// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.model.Ping;
import com.ubercab.client.feature.trip.dispatch.DispatchingStatusToolbarOverlay;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.ProductGroup;
import com.ubercab.ui.TextView;
import com.ubercab.ui.Toolbar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class fxf
    implements fvo, fxj, fxv
{

    private ImageView A;
    private boolean B;
    private boolean C;
    private boolean D;
    private float E;
    String a;
    String b;
    private final chp c;
    private final hkr d;
    private final fvn e;
    private final int f;
    private final int g;
    private final Map h = new LinkedHashMap();
    private final dpg i;
    private final Resources j;
    private final dce k;
    private final RiderActivity l;
    private final dal m;
    private final fxk n = new fxk();
    private final fte o;
    private final List p = new ArrayList();
    private final List q = new ArrayList();
    private View r;
    private DispatchingStatusToolbarOverlay s;
    private TextView t;
    private ImageView u;
    private Toolbar v;
    private Drawable w;
    private fxi x;
    private ViewGroup y;
    private ViewGroup z;

    public fxf(RiderActivity rideractivity, hkr hkr1, dce dce1, fte fte1, chp chp1, dpg dpg1, dal dal1, 
            fvn fvn1)
    {
        c = chp1;
        d = hkr1;
        e = fvn1;
        l = rideractivity;
        i = dpg1;
        j = rideractivity.getResources();
        k = dce1;
        m = dal1;
        o = fte1;
        g = j.getDimensionPixelSize(0x7f08025d);
        f = j.getDimensionPixelSize(0x7f08025c);
        r();
    }

    private Drawable a(boolean flag)
    {
        if (flag)
        {
            return new ColorDrawable(j.getColor(0x7f0d006c));
        } else
        {
            return w;
        }
    }

    static fxi a(fxf fxf1)
    {
        return fxf1.x;
    }

    private void a(int i1, ImageView imageview)
    {
        if (i1 > 0)
        {
            b(imageview);
            return;
        } else
        {
            u = imageview;
            return;
        }
    }

    private void a(ActionBar actionbar)
    {
        if (7 != o.g())
        {
            return;
        } else
        {
            B = true;
            actionbar.c(false);
            v.setBackgroundDrawable(a(B));
            s();
            v.addView(t);
            return;
        }
    }

    private static void a(ViewGroup viewgroup)
    {
        viewgroup.setLayoutParams(new android.support.v7.widget.Toolbar.LayoutParams(-2));
    }

    private void a(ImageView imageview)
    {
        imageview.setColorFilter(j.getColor(0x7f0d006f));
    }

    private void a(ImageView imageview, int i1)
    {
        if (u != null)
        {
            if (u != imageview)
            {
                b(imageview);
            }
            return;
        } else
        {
            a(i1, imageview);
            return;
        }
    }

    private static void a(ProductGroup productgroup, ViewGroup viewgroup)
    {
        ((TextView)viewgroup.findViewById(0x7f0e052a)).setText(productgroup.getDescription());
    }

    private void a(ProductGroup productgroup, ImageView imageview)
    {
        imageview.setOnClickListener(new android.view.View.OnClickListener(productgroup) {

            final ProductGroup a;
            final fxf b;

            public final void onClick(View view)
            {
                fxf.a(b, a, n.hs);
                fxf.a(b).b();
                view = (ImageView)fxf.b(b).get(a);
                if (view != null)
                {
                    b.a(a);
                    b.a(view, a);
                }
            }

            
            {
                b = fxf.this;
                a = productgroup;
                super();
            }
        });
    }

    private void a(ProductGroup productgroup, ImageView imageview, int i1)
    {
        int j1 = (int)j.getDimension(0x7f080262);
        imageview.setImageResource(i1);
        imageview.setContentDescription(productgroup.getName());
        imageview.setPadding(j1, 0, j1, 0);
        imageview.setTag(productgroup);
        imageview.setColorFilter(j.getColor(0x7f0d0082));
    }

    private void a(ProductGroup productgroup, n n1)
    {
        c.a(AnalyticsEvent.create("tap").setName(n1).setValue(productgroup.getUuid()));
    }

    static void a(fxf fxf1, ImageView imageview)
    {
        fxf1.c(imageview);
    }

    static void a(fxf fxf1, ProductGroup productgroup, n n1)
    {
        fxf1.a(productgroup, n1);
    }

    private void a(String s1)
    {
label0:
        {
            if (!TextUtils.isEmpty(s1) && !s1.equals(b))
            {
                ProductGroup productgroup = b(s1);
                ImageView imageview;
                if (productgroup != null)
                {
                    imageview = (ImageView)h.get(productgroup);
                } else
                {
                    imageview = null;
                }
                if (productgroup == null || imageview == null)
                {
                    break label0;
                }
                a(imageview, productgroup);
                b = s1;
                a = null;
            }
            return;
        }
        a = s1;
    }

    private void a(List list)
    {
        z.removeAllViews();
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            ProductGroup productgroup = (ProductGroup)list.get(i1);
            ImageView imageview = (ImageView)h.get(productgroup);
            if (imageview != null)
            {
                imageview.setPadding((int)E, (int)E, (int)E, (int)E);
                imageview.setTag(productgroup);
                z.addView(imageview);
                a(imageview, i1);
                arraylist.add(productgroup.getUuid());
            }
        }

        a(z);
        p();
        a(((List) (arraylist)), l.ik);
    }

    private void a(List list, l l1)
    {
        String s1 = TextUtils.join(",", list);
        c.a(AnalyticsEvent.create("impression").setName(l1).setValue(s1).setValuePosition(Long.valueOf(list.size())));
    }

    private ProductGroup b(String s1)
    {
        if (TextUtils.isEmpty(s1) || p == null)
        {
            return null;
        }
        for (Iterator iterator = p.iterator(); iterator.hasNext();)
        {
            ProductGroup productgroup = (ProductGroup)iterator.next();
            if (s1.equals(productgroup.getUuid()))
            {
                return productgroup;
            }
        }

        return null;
    }

    static Map b(fxf fxf1)
    {
        return fxf1.h;
    }

    private void b(int i1)
    {
        if (i1 == 4)
        {
            E = j.getDimension(0x7f08025b);
            return;
        } else
        {
            E = j.getDimension(0x7f08025e);
            return;
        }
    }

    private void b(ImageView imageview)
    {
        imageview.setColorFilter(j.getColor(0x7f0d0083));
    }

    private void b(City city)
    {
        if (!B) goto _L2; else goto _L1
_L1:
        return;
_L2:
        c(city);
        if (g())
        {
            h();
        }
        if (n())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (z.equals(r)) goto _L1; else goto _L3
_L3:
        v.removeView(r);
        v.addView(z);
        r = z;
        return;
        if (A.equals(r)) goto _L1; else goto _L4
_L4:
        if (r != null)
        {
            v.removeView(r);
        }
        r = A;
        v.addView(A);
        return;
    }

    private void b(ProductGroup productgroup)
    {
        Iterator iterator = h.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (!((ProductGroup)entry.getKey()).equals(productgroup))
            {
                b((ImageView)entry.getValue());
            }
        } while (true);
    }

    static void b(fxf fxf1, ImageView imageview)
    {
        fxf1.a(imageview);
    }

    private void b(List list)
    {
        b(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ProductGroup productgroup = (ProductGroup)list.next();
            if (productgroup != null && !h.containsKey(productgroup))
            {
                ImageView imageview = c(productgroup.getGroupType());
                if (imageview != null)
                {
                    imageview.setContentDescription(productgroup.getName());
                    h.put(productgroup, imageview);
                }
            }
        } while (true);
    }

    private void b(boolean flag)
    {
        if (flag)
        {
            if (r.getParent() == null)
            {
                v.addView(r);
            }
            return;
        } else
        {
            v.removeView(r);
            return;
        }
    }

    private ImageView c(String s1)
    {
        int i1 = d(s1);
        if (i1 == 0)
        {
            return null;
        } else
        {
            s1 = new ImageView(l);
            s1.setImageResource(i1);
            return s1;
        }
    }

    static chp c(fxf fxf1)
    {
        return fxf1.c;
    }

    private String c(int i1)
    {
        switch (i1)
        {
        case 4: // '\004'
        default:
            return null;

        case 2: // '\002'
            return j.getString(0x7f070272).toUpperCase(Locale.getDefault());

        case 3: // '\003'
            return j.getString(0x7f0700a0).toUpperCase(Locale.getDefault());

        case 5: // '\005'
            return j.getString(0x7f0701e8).toUpperCase(Locale.getDefault());

        case 6: // '\006'
            return j.getString(0x7f07006c).toUpperCase(Locale.getDefault());

        case 7: // '\007'
            return j.getString(0x7f0702f9).toUpperCase(Locale.getDefault());
        }
    }

    private void c(ImageView imageview)
    {
        imageview.setColorFilter(j.getColor(0x7f0d0084));
    }

    private void c(City city)
    {
        if (z == null)
        {
            z = new LinearLayout(l);
        }
        Object obj;
        if (city == null)
        {
            obj = null;
        } else
        {
            obj = city.getProductGroups();
        }
        if (obj != null && !((List) (obj)).isEmpty())
        {
            n.a(p, ((List) (obj)));
            obj = n.a();
            p.clear();
            p.addAll(n.b());
            if (city != null)
            {
                e.a(p, city);
            }
            if (!fxm.a.equals(obj))
            {
                b(p);
                a(p);
            }
            if (!TextUtils.isEmpty(a))
            {
                a(a);
                return;
            }
        }
    }

    static void c(fxf fxf1, ImageView imageview)
    {
        fxf1.b(imageview);
    }

    private static int d(String s1)
    {
        byte byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   3105819: 70
    //                   3500280: 85
    //                   3512280: 100;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_100;
_L5:
        switch (byte0)
        {
        default:
            return 0;

        case 0: // '\0'
            return 0x7f020133;

        case 1: // '\001'
            return 0x7f0202d0;

        case 2: // '\002'
            return 0x7f0202d6;
        }
_L2:
        if (s1.equals("eats"))
        {
            byte0 = 0;
        }
          goto _L5
_L3:
        if (s1.equals("ride"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s1.equals("rush"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    static List d(fxf fxf1)
    {
        return fxf1.q;
    }

    static ImageView e(fxf fxf1)
    {
        return fxf1.u;
    }

    static int f(fxf fxf1)
    {
        return fxf1.g;
    }

    static int g(fxf fxf1)
    {
        return fxf1.f;
    }

    private boolean g()
    {
        return p.size() > 1 && x != null && fte.d(o.g()) && !m.i() && x.e();
    }

    private void h()
    {
        ViewGroup viewgroup = q();
        x.b(viewgroup);
        x.c();
    }

    private void i()
    {
        B = false;
        v.setBackgroundDrawable(a(B));
        if (t != null)
        {
            v.removeView(t);
            t = null;
        }
        b(d.b());
        a(o.g());
    }

    private void j()
    {
        if (s != null)
        {
            v.removeView(s);
        }
    }

    private void k()
    {
        if (s == null)
        {
            s = (DispatchingStatusToolbarOverlay)l.getLayoutInflater().inflate(0x7f0301de, y, false);
            s.a(this);
        }
    }

    private void l()
    {
        if (y == null)
        {
            y = (ViewGroup)l.findViewById(0x7f0e052f);
        }
    }

    private void m()
    {
        v.n();
    }

    private boolean n()
    {
        return h.size() <= 1;
    }

    private void o()
    {
        ActionBar actionbar1 = l.b();
        ActionBar actionbar = actionbar1;
        if (actionbar1 == null)
        {
            l.a(v);
            actionbar = l.b();
        }
        actionbar.b(true);
        actionbar.c(false);
        actionbar.d(false);
    }

    private void p()
    {
        ImageView imageview;
        for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext(); imageview.setClickable(true))
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            imageview = (ImageView)entry.getValue();
            imageview.setOnTouchListener(new fxh(this, imageview, (ProductGroup)entry.getKey()));
        }

    }

    private ViewGroup q()
    {
        LinearLayout linearlayout = new LinearLayout(l);
        a(linearlayout);
        b(p.size());
        ArrayList arraylist = new ArrayList();
        Iterator iterator = p.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ProductGroup productgroup = (ProductGroup)iterator.next();
            ViewGroup viewgroup = (ViewGroup)l.getLayoutInflater().inflate(0x7f0301b8, linearlayout, false);
            ImageView imageview = (ImageView)viewgroup.findViewById(0x7f0e0529);
            int i1 = d(productgroup.getGroupType());
            if (i1 != 0)
            {
                a(productgroup, imageview, i1);
                a(productgroup, imageview);
                a(productgroup, viewgroup);
                linearlayout.addView(viewgroup);
                arraylist.add(productgroup.getUuid());
            }
        } while (true);
        a(arraylist, l.il);
        return linearlayout;
    }

    private void r()
    {
        if (A == null)
        {
            A = new ImageView(l);
            android.support.v7.widget.Toolbar.LayoutParams layoutparams;
            int i1;
            boolean flag;
            if (gpp.a(Locale.getDefault()) && "CHINA".equals(k.a()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            D = flag;
            if (D)
            {
                i1 = 0x7f020203;
            } else
            {
                i1 = 0x7f020202;
            }
            A.setImageResource(i1);
            layoutparams = new android.support.v7.widget.Toolbar.LayoutParams(-1);
            A.setLayoutParams(layoutparams);
        }
    }

    private void s()
    {
        if (t == null)
        {
            t = (TextView)l.getLayoutInflater().inflate(0x7f03005d, y, false);
            android.support.v7.widget.Toolbar.LayoutParams layoutparams = new android.support.v7.widget.Toolbar.LayoutParams(-1);
            t.setLayoutParams(layoutparams);
            t.setOnClickListener(new android.view.View.OnClickListener() {

                final fxf a;

                public final void onClick(View view)
                {
                    fxf.c(a).a(n.eu);
                    for (view = fxf.d(a).iterator(); view.hasNext(); ((fxg)view.next()).g()) { }
                }

            
            {
                a = fxf.this;
                super();
            }
            });
        }
    }

    private void t()
    {
        k();
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, (int)j.getDimension(0x7f080056), 0.0F);
        v.removeView(r);
        v.addView(s);
        v.setLayoutParams(layoutparams);
    }

    private void u()
    {
        ArrayList arraylist = new ArrayList(p.size());
        for (Iterator iterator = p.iterator(); iterator.hasNext(); arraylist.add(((ProductGroup)iterator.next()).getUuid())) { }
        String s1 = TextUtils.join(",", arraylist);
        c.a(AnalyticsEvent.create("tap").setName(n.hr).setValue(s1).setValuePosition(Long.valueOf(arraylist.size())));
    }

    public final void a()
    {
        if (!C)
        {
            if (v == null)
            {
                throw new IllegalStateException("Toolbar cannot be null");
            }
            l();
            o();
            m();
            b(d.b());
            C = true;
            e.a(this);
        }
    }

    public final void a(int i1)
    {
        boolean flag1;
        flag1 = true;
        if (!fte.d(i1) && x != null && x.d())
        {
            x.b();
        }
        if (!B) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ActionBar actionbar;
        a();
        actionbar = l.b();
        if (actionbar == null) goto _L1; else goto _L3
_L3:
        i1;
        JVM INSTR tableswitch 3 4: default 80
    //                   3 165
    //                   4 187;
           goto _L4 _L5 _L6
_L4:
        actionbar.d(false);
        actionbar.b(true);
        actionbar.a(true);
        j();
_L7:
        boolean flag;
        String s1 = c(i1);
        if (!TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        actionbar.c(flag);
        actionbar.a(s1);
        if (!TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_222;
        }
        flag = flag1;
        if (s != null)
        {
            if (s.getParent() != null)
            {
                break MISSING_BLOCK_LABEL_222;
            }
            flag = flag1;
        }
_L8:
        b(flag);
        return;
_L5:
        actionbar.d(false);
        actionbar.a(true);
        actionbar.b(true);
        j();
          goto _L7
_L6:
        t();
        s.a();
        actionbar.d(true);
        actionbar.a(false);
        actionbar.b(false);
          goto _L7
        flag = false;
          goto _L8
    }

    final void a(ImageView imageview, ProductGroup productgroup)
    {
        a(imageview);
        b(productgroup);
        u = imageview;
    }

    public final void a(City city)
    {
        if (!i.n())
        {
            return;
        }
        if (!C)
        {
            a();
            return;
        } else
        {
            b(city);
            return;
        }
    }

    final void a(ProductGroup productgroup)
    {
        if (!TextUtils.isEmpty(productgroup.getUuid()) && !productgroup.getUuid().equals(b))
        {
            b = productgroup.getUuid();
            a = null;
            o.a(productgroup);
        }
    }

    public final void a(Toolbar toolbar)
    {
        v = toolbar;
        if (v != null)
        {
            toolbar = v.getBackground();
        } else
        {
            toolbar = null;
        }
        w = toolbar;
    }

    public final void a(dar dar1)
    {
        if (!C)
        {
            a();
            return;
        } else
        {
            b(dar1.a().getCity());
            return;
        }
    }

    public final void a(dzl dzl1)
    {
        boolean flag = dzl1.a();
        if (B != flag)
        {
            a();
            dzl1 = l.b();
            if (dzl1 != null)
            {
                if (flag)
                {
                    a(((ActionBar) (dzl1)));
                    return;
                } else
                {
                    i();
                    return;
                }
            }
        }
    }

    public final void a(fxg fxg1)
    {
        q.add(fxg1);
    }

    public final void a(fxi fxi1)
    {
        x = fxi1;
        if (x != null)
        {
            x.a(this);
        }
    }

    public final void a(fyu fyu1)
    {
        a(fyu1.b());
    }

    public final void a(String s1, String s2)
    {
        for (Iterator iterator = q.iterator(); iterator.hasNext(); ((fxg)iterator.next()).a(s1, s2)) { }
    }

    public final View b()
    {
        a();
        return y;
    }

    public final void b(fxg fxg1)
    {
        q.remove(fxg1);
        e.b(this);
    }

    public final void c()
    {
        a();
        k();
        s.b();
    }

    public final void d()
    {
        a();
        if (s != null)
        {
            s.c();
        }
    }

    public final void e()
    {
        for (Iterator iterator = q.iterator(); iterator.hasNext(); ((fxg)iterator.next()).f()) { }
    }

    public final void f()
    {
        u();
    }
}
