// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.google.analytics.tracking.android.EasyTracker;
import com.gtp.go.weather.coupon.a.e;
import com.gtp.go.weather.coupon.a.h;
import com.gtp.go.weather.coupon.b.b;
import com.jiubang.core.c.a.a;
import com.jiubang.core.c.a.c;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            f, h, j, k, 
//            CouponCollectActivity, p, q

public class CouponsActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener, h, c
{

    private View a;
    private View b;
    private ListView c;
    private k d;
    private ArrayList e;
    private e f;
    private com.jiubang.core.c.a.b g;
    private com.gtp.go.weather.sharephoto.photo.b h;
    private int i;
    private q j;
    private View k;
    private View l;
    private View m;
    private boolean n;
    private boolean o;
    private f p;
    private View q;
    private TextView r;
    private boolean s;

    public CouponsActivity()
    {
        e = new ArrayList();
        i = 1;
        n = false;
        o = false;
        s = false;
    }

    private void a(b b1)
    {
        TextView textview;
        if (p == null)
        {
            p = new f(this);
        }
        textview = p.b();
        textview.setClickable(true);
        p.a();
        textview.setBackgroundResource(0x7f020641);
        b1.f();
        JVM INSTR tableswitch 1 2: default 72
    //                   1 104
    //                   2 154;
           goto _L1 _L2 _L3
_L1:
        p.a(new com.gtp.go.weather.coupon.view.h(this, b1, textview));
        if (!s)
        {
            p.f();
        }
        return;
_L2:
        textview.setText(getString(0x7f08028d));
        p.b(getString(0x7f08028a));
        p.d(getString(0x7f08028b));
        p.c(b1.h());
        continue; /* Loop/switch isn't completed */
_L3:
        textview.setText(getString(0x7f080284));
        p.b(getString(0x7f080282));
        p.d(getString(0x7f080283));
        p.d();
        if (true) goto _L1; else goto _L4
_L4:
    }

    static void a(CouponsActivity couponsactivity, b b1)
    {
        couponsactivity.a(b1);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            l.setVisibility(0);
            m.setVisibility(4);
        } else
        {
            l.setVisibility(4);
            m.setVisibility(0);
        }
        k.setVisibility(0);
    }

    static boolean a(CouponsActivity couponsactivity)
    {
        return couponsactivity.o;
    }

    static boolean a(CouponsActivity couponsactivity, boolean flag)
    {
        couponsactivity.n = flag;
        return flag;
    }

    private void b(b b1)
    {
        b1 = new a(b1.i(), com.gtp.go.weather.coupon.c.a.a, (new StringBuilder()).append(com.gtp.go.weather.sharephoto.d.h.a(b1.i())).append(".png").toString());
        g.a(b1);
    }

    static void b(CouponsActivity couponsactivity, b b1)
    {
        couponsactivity.b(b1);
    }

    static void b(CouponsActivity couponsactivity, boolean flag)
    {
        couponsactivity.a(flag);
    }

    static boolean b(CouponsActivity couponsactivity)
    {
        return couponsactivity.n;
    }

    static ArrayList c(CouponsActivity couponsactivity)
    {
        return couponsactivity.e;
    }

    private void c(b b1)
    {
        if (b1 != null)
        {
            String s1 = String.valueOf(b1.b());
            ImageView imageview = (ImageView)c.findViewWithTag(s1);
            b1 = b1.j();
            if (imageview != null && !TextUtils.isEmpty(b1))
            {
                b1 = h.a(getApplicationContext(), b1, s1, "", new j(this));
                if (b1 != null)
                {
                    imageview.setImageDrawable(b1);
                    return;
                } else
                {
                    imageview.setImageResource(0x7f0205c6);
                    return;
                }
            }
        }
    }

    static int d(CouponsActivity couponsactivity)
    {
        int i1 = couponsactivity.i;
        couponsactivity.i = i1 + 1;
        return i1;
    }

    static int e(CouponsActivity couponsactivity)
    {
        return couponsactivity.i;
    }

    static e f(CouponsActivity couponsactivity)
    {
        return couponsactivity.f;
    }

    static k g(CouponsActivity couponsactivity)
    {
        return couponsactivity.d;
    }

    static ListView h(CouponsActivity couponsactivity)
    {
        return couponsactivity.c;
    }

    static com.gtp.go.weather.sharephoto.photo.b i(CouponsActivity couponsactivity)
    {
        return couponsactivity.h;
    }

    static f j(CouponsActivity couponsactivity)
    {
        return couponsactivity.p;
    }

    public void a(a a1)
    {
    }

    public void a(ArrayList arraylist)
    {
        if (arraylist != null && !arraylist.isEmpty())
        {
            b b1;
            for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); e.add(b1))
            {
                b1 = (b)iterator.next();
            }

            d.notifyDataSetChanged();
            f.a(0, arraylist);
            q.setVisibility(8);
            r.setVisibility(8);
            return;
        } else
        {
            f.a(i, null);
            return;
        }
    }

    public void a(ArrayList arraylist, int i1)
    {
        n = false;
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        if (i1 == 0)
        {
            e.clear();
        }
        if (q.getVisibility() == 0)
        {
            q.setVisibility(8);
        }
        if (arraylist.isEmpty()) goto _L4; else goto _L3
_L3:
        arraylist = arraylist.iterator();
        i1 = 0;
_L6:
        b b1;
        boolean flag;
        if (!arraylist.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = (b)arraylist.next();
        Iterator iterator = e.iterator();
        b b2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_294;
            }
            b2 = (b)iterator.next();
        } while (b2.b() != b1.b());
        b2.c(b1.g());
        b2.b(b1.e());
        flag = true;
_L8:
        if (!flag)
        {
            e.add(b1);
            i1 = 1;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (i1 != 0)
        {
            d.notifyDataSetChanged();
        }
        k.setVisibility(8);
_L7:
        if (e.isEmpty())
        {
            r.setVisibility(0);
            r.setText(getString(0x7f08027f));
        }
        return;
_L4:
        o = true;
        a(false);
        if (true) goto _L7; else goto _L2
_L2:
        k.setVisibility(8);
        if (e.isEmpty())
        {
            q.setVisibility(8);
            r.setVisibility(0);
            r.setText(getString(0x7f0801d0));
        }
        Toast.makeText(getApplicationContext(), getString(0x7f0801d0), 0).show();
        return;
        flag = false;
          goto _L8
    }

    public void b(a a1)
    {
    }

    public void c(a a1)
    {
        if (a1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        b b1;
        Iterator iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            b1 = (b)iterator.next();
        } while (!a1.a.equals(b1.i()));
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        b1.b(true);
        if (TextUtils.isEmpty(b1.j()))
        {
            b1.f(a1.a());
        }
        c(b1);
        return;
    }

    public void d(a a1)
    {
    }

    public void onClick(View view)
    {
        if (view.equals(a))
        {
            finish();
        } else
        if (view.equals(b) && com.gau.go.launcherex.gowidget.weather.util.r.a(view))
        {
            view = new Intent();
            view.setFlags(0x4000000);
            view.setClass(this, com/gtp/go/weather/coupon/view/CouponCollectActivity);
            startActivity(view);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030054);
        c = (ListView)findViewById(0x7f090255);
        a = findViewById(0x7f090250);
        a.setOnClickListener(this);
        b = findViewById(0x7f090252);
        b.setOnClickListener(this);
        q = findViewById(0x7f090253);
        q.setVisibility(0);
        r = (TextView)findViewById(0x7f090254);
        k = getLayoutInflater().inflate(0x7f0300e3, null);
        l = k.findViewById(0x7f09049c);
        l.setVisibility(4);
        m = k.findViewById(0x7f09049d);
        m.setVisibility(4);
        c.addFooterView(k);
        g = new com.jiubang.core.c.a.b(getApplicationContext());
        g.a(this);
        f = new e(getApplicationContext());
        f.a(g);
        h = new com.gtp.go.weather.sharephoto.photo.b();
        d = new k(this);
        c.setAdapter(d);
        c.setOnScrollListener(new p(this, null));
        j = new q(this);
        bundle = new IntentFilter();
        bundle.addAction("com.gau.go.launcherex.gowidget.weatherwidget.ACTION_COUPON_DELETE");
        registerReceiver(j, bundle);
        f.a();
        f.a(this);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(j);
        s = true;
        e.clear();
        h.b();
        g.a(false);
        f.b();
    }

    protected void onStart()
    {
        super.onStart();
        EasyTracker.getInstance().activityStart(this);
    }

    protected void onStop()
    {
        super.onStop();
        EasyTracker.getInstance().activityStop(this);
    }
}
