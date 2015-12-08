// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gtp.go.weather.coupon.a;
import com.gtp.go.weather.coupon.b.b;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            c, f, a

public class CouponCollectActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, a
{

    private Activity a;
    private ImageView b;
    private ImageView c;
    private ListView d;
    private LinearLayout e;
    private TextView f;
    private TextView g;
    private final ArrayList h = new ArrayList();
    private c i;
    private boolean j;
    private boolean k;
    private LinearLayout l;
    private com.gtp.go.weather.sharephoto.photo.b m;
    private f n;

    public CouponCollectActivity()
    {
        j = false;
        k = false;
    }

    static ArrayList a(CouponCollectActivity couponcollectactivity)
    {
        return couponcollectactivity.h;
    }

    private void a()
    {
        k = b();
        boolean flag;
        if (!k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        for (Iterator iterator = h.iterator(); iterator.hasNext(); ((com.gtp.go.weather.coupon.b.a)iterator.next()).a(k)) { }
        i.notifyDataSetChanged();
    }

    private void a(b b1)
    {
        TextView textview;
        if (n == null)
        {
            n = new f(a);
        }
        textview = n.b();
        textview.setClickable(true);
        n.a();
        textview.setBackgroundResource(0x7f020641);
        b1.f();
        JVM INSTR tableswitch 1 2: default 76
    //                   1 101
    //                   2 151;
           goto _L1 _L2 _L3
_L1:
        n.a(new com.gtp.go.weather.coupon.view.a(this, b1, textview));
        n.f();
        return;
_L2:
        textview.setText(getString(0x7f08028d));
        n.b(getString(0x7f08028a));
        n.d(getString(0x7f08028b));
        n.c(b1.h());
        continue; /* Loop/switch isn't completed */
_L3:
        textview.setText(getString(0x7f080284));
        n.b(getString(0x7f080282));
        n.d(getString(0x7f080283));
        n.d();
        if (true) goto _L1; else goto _L4
_L4:
    }

    static void a(CouponCollectActivity couponcollectactivity, b b1)
    {
        couponcollectactivity.a(b1);
    }

    static boolean a(CouponCollectActivity couponcollectactivity, boolean flag)
    {
        couponcollectactivity.j = flag;
        return flag;
    }

    private boolean b()
    {
        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            if (!((com.gtp.go.weather.coupon.b.a)iterator.next()).a())
            {
                return false;
            }
        }

        return true;
    }

    static boolean b(CouponCollectActivity couponcollectactivity)
    {
        return couponcollectactivity.j;
    }

    static ListView c(CouponCollectActivity couponcollectactivity)
    {
        return couponcollectactivity.d;
    }

    static com.gtp.go.weather.sharephoto.photo.b d(CouponCollectActivity couponcollectactivity)
    {
        return couponcollectactivity.m;
    }

    static ImageView e(CouponCollectActivity couponcollectactivity)
    {
        return couponcollectactivity.c;
    }

    static c f(CouponCollectActivity couponcollectactivity)
    {
        return couponcollectactivity.i;
    }

    private void f()
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        Iterator iterator = h.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.gtp.go.weather.coupon.b.a a1 = (com.gtp.go.weather.coupon.b.a)iterator.next();
            if (a1.a())
            {
                arraylist.add(a1);
                arraylist1.add(Long.valueOf(a1.b()));
            }
        } while (true);
        if (!arraylist1.isEmpty())
        {
            com.gtp.go.weather.coupon.a.a.a(this).a(arraylist1);
        }
        if (!arraylist.isEmpty())
        {
            h.removeAll(arraylist);
            i.notifyDataSetChanged();
        }
        if (h.isEmpty())
        {
            g();
            h();
        }
    }

    static LinearLayout g(CouponCollectActivity couponcollectactivity)
    {
        return couponcollectactivity.e;
    }

    private void g()
    {
        c.setVisibility(8);
        e.setVisibility(8);
        j = false;
        k = false;
        for (Iterator iterator = h.iterator(); iterator.hasNext(); ((com.gtp.go.weather.coupon.b.a)iterator.next()).a(k)) { }
        i.notifyDataSetChanged();
    }

    static f h(CouponCollectActivity couponcollectactivity)
    {
        return couponcollectactivity.n;
    }

    private void h()
    {
        if (h.isEmpty())
        {
            d.setVisibility(8);
            g.setVisibility(0);
            return;
        } else
        {
            d.setVisibility(0);
            g.setVisibility(8);
            return;
        }
    }

    public void a(ArrayList arraylist)
    {
        b b1;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); h.add(new com.gtp.go.weather.coupon.b.a(b1)))
        {
            b1 = (b)arraylist.next();
        }

        i.notifyDataSetChanged();
        l.setVisibility(8);
        h();
    }

    public void onClick(View view)
    {
        if (view.equals(b))
        {
            finish();
        } else
        {
            if (view.equals(c))
            {
                a();
                return;
            }
            if (view.equals(f))
            {
                f();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030052);
        a = this;
        b = (ImageView)findViewById(0x7f09023c);
        c = (ImageView)findViewById(0x7f09023e);
        e = (LinearLayout)findViewById(0x7f090242);
        f = (TextView)findViewById(0x7f090243);
        l = (LinearLayout)findViewById(0x7f09023f);
        g = (TextView)findViewById(0x7f090240);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        f.setOnClickListener(this);
        d = (ListView)findViewById(0x7f090241);
        i = new c(this, null);
        d.setAdapter(i);
        m = new com.gtp.go.weather.sharephoto.photo.b();
        com.gtp.go.weather.coupon.a.a.a(this).a(this);
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && j)
        {
            g();
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }
}
