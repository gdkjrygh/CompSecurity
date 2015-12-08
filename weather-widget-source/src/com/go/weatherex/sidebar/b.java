// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.billing.BillingActivity;
import com.gau.go.launcherex.gowidget.c.h;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gau.go.launcherex.gowidget.statistics.w;
import com.gau.go.launcherex.gowidget.weather.d.f;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.provider.WeatherContentProvider;
import com.go.weatherex.b.a.e;
import com.go.weatherex.city.EditCityScrollComponent;
import com.go.weatherex.city.i;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.home.ArrowIcon;
import com.go.weatherex.home.b.l;
import com.go.weatherex.messagecenter.o;
import com.go.weatherex.setting.u;
import com.gtp.go.weather.sharephoto.photo.PhotoActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

// Referenced classes of package com.go.weatherex.sidebar:
//            h, c, d, e, 
//            SidebarGoAdView, f, g

public class b extends a
    implements android.view.View.OnClickListener, i, o
{

    private EditCityScrollComponent a;
    private ArrowIcon b;
    private TextView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private SidebarGoAdView j;
    private TextView k;
    private final com.go.weatherex.sidebar.h l = new com.go.weatherex.sidebar.h(this, null);
    private com.gau.go.launcherex.gowidget.weather.util.f m;
    private com.go.weatherex.messagecenter.i n;
    private g o;
    private final h p = new h();
    private ArrayList q;
    private ArrayList r;
    private Bitmap s;
    private Bitmap t;
    private Handler u;
    private e v;
    private e w;

    public b()
    {
        u = new c(this);
        v = new d(this);
        w = new com.go.weatherex.sidebar.e(this);
    }

    static Bitmap a(b b1, Bitmap bitmap)
    {
        b1.t = bitmap;
        return bitmap;
    }

    static ArrayList a(b b1)
    {
        return b1.r;
    }

    private void a(int i1)
    {
        if (i1 != 1) goto _L2; else goto _L1
_L1:
        if (r != null && !r.isEmpty()) goto _L4; else goto _L3
_L3:
        return;
_L4:
        String s1 = ((com.jiubang.commerce.ad.a.a)r.get(0)).g();
        com.jiubang.commerce.ad.a.a a1 = (com.jiubang.commerce.ad.a.a)r.get(0);
        if (t != null && !t.isRecycled())
        {
            boolean flag = GoWidgetApplication.b(getActivity().getApplicationContext()).b();
            if (j != null && !flag)
            {
                j.setVisibility(0);
                j.a(a1, t, s1, i1);
                com.jiubang.commerce.ad.a.a(GoWidgetApplication.b(), a1, "", "");
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (i1 == 2 && q != null && !q.isEmpty())
        {
            String s2 = ((com.jiubang.commerce.ad.a.a)q.get(0)).g();
            com.jiubang.commerce.ad.a.a a2 = (com.jiubang.commerce.ad.a.a)q.get(0);
            if (s != null && !s.isRecycled())
            {
                boolean flag1 = GoWidgetApplication.b(getActivity().getApplicationContext()).b();
                if (j != null && !flag1)
                {
                    j.setVisibility(0);
                    j.a(a2, s, s2, i1);
                    com.jiubang.commerce.ad.a.a(GoWidgetApplication.b(), a2, "", "");
                    return;
                }
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    static void a(b b1, int i1)
    {
        b1.a(i1);
    }

    static void a(b b1, ArrayList arraylist)
    {
        b1.a(arraylist);
    }

    static void a(b b1, ArrayList arraylist, int i1)
    {
        b1.a(arraylist, i1);
    }

    private void a(String s1)
    {
        s1 = new com.gau.go.launcherex.gowidget.statistics.a.a(93, s1);
        s1.e("2");
        com.gau.go.launcherex.gowidget.statistics.q.a(getActivity().getApplicationContext()).a(s1);
    }

    private void a(ArrayList arraylist)
    {
        if (arraylist != null && !arraylist.isEmpty())
        {
            Iterator iterator = arraylist.iterator();
            while (iterator.hasNext()) 
            {
                com.jiubang.commerce.ad.a.a a1 = (com.jiubang.commerce.ad.a.a)iterator.next();
                if (com.jiubang.commerce.utils.b.a(getActivity(), a1.f()))
                {
                    arraylist.remove(a1);
                }
            }
        }
    }

    private void a(ArrayList arraylist, int i1)
    {
        if (arraylist != null && !arraylist.isEmpty())
        {
            if (!TextUtils.isEmpty(arraylist = ((com.jiubang.commerce.ad.a.a)arraylist.get(0)).h()))
            {
                com.go.weatherex.home.b.l.c().a(arraylist, new com.go.weatherex.sidebar.f(this, arraylist, i1));
                return;
            }
        }
    }

    static Bitmap b(b b1, Bitmap bitmap)
    {
        b1.s = bitmap;
        return bitmap;
    }

    static ArrayList b(b b1)
    {
        return b1.q;
    }

    static ArrayList b(b b1, ArrayList arraylist)
    {
        b1.q = arraylist;
        return arraylist;
    }

    private void b()
    {
        if (GoWidgetApplication.b(getActivity().getApplicationContext()).b())
        {
            c.setVisibility(8);
            return;
        } else
        {
            c.setVisibility(0);
            return;
        }
    }

    public static void b(Context context, int i1, int j1)
    {
        Intent intent = new Intent(context, com/gau/go/launcherex/gowidget/billing/BillingActivity);
        intent.putExtra("recommend_type", i1);
        intent.putExtra("recommend_enterance", j1);
        intent.addFlags(0x10000000);
        context.startActivity(intent);
    }

    static Handler c(b b1)
    {
        return b1.u;
    }

    static ArrayList c(b b1, ArrayList arraylist)
    {
        b1.r = arraylist;
        return arraylist;
    }

    private void c()
    {
        Object obj;
        if (com.gau.go.launcherex.gowidget.statistics.w.p(getActivity()))
        {
            obj = Uri.parse("http://weibo.com/u/3144676512");
        } else
        {
            obj = Uri.parse("http://www.facebook.com/pages/GO-Weather-EX/488274257857852?ref=hl");
            a("c000_fb");
        }
        obj = new Intent("android.intent.action.VIEW", ((Uri) (obj)));
        try
        {
            startActivity(((Intent) (obj)));
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Toast.makeText(getActivity().getApplicationContext(), 0x7f0801e0, 0).show();
        }
    }

    static EditCityScrollComponent d(b b1)
    {
        return b1.a;
    }

    static com.gau.go.launcherex.gowidget.weather.util.f e(b b1)
    {
        return b1.m;
    }

    static void f(b b1)
    {
        b1.b();
    }

    static SidebarGoAdView g(b b1)
    {
        return b1.j;
    }

    static com.go.weatherex.messagecenter.i h(b b1)
    {
        return b1.n;
    }

    public void a(int i1, com.go.weatherex.city.a a1)
    {
        a(10, a1.a);
        a(12, a1.a, 0L, true);
        a(7, Boolean.valueOf(true));
    }

    public void a(Vector vector)
    {
        if (!isAdded())
        {
            return;
        }
        int i1 = vector.size();
        if (i1 == 0)
        {
            h.setVisibility(8);
            return;
        }
        if (i1 <= 9)
        {
            h.setVisibility(0);
            h.setText((new StringBuilder()).append(i1).append("").toString());
            h.setBackgroundResource(0x7f0200d2);
            return;
        } else
        {
            h.setVisibility(0);
            h.setText("");
            h.setBackgroundResource(0x7f0200d1);
            return;
        }
    }

    protected boolean a()
    {
        if (a.b())
        {
            a.a(false);
            return true;
        } else
        {
            return super.a();
        }
    }

    public void b(int i1, com.go.weatherex.city.a a1)
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(a1.a);
        m.a(arraylist);
    }

    protected void b(int i1, Object obj)
    {
        super.b(i1, obj);
        if (i1 == 1 && j != null)
        {
            j.c();
        } else
        if (i1 == 5)
        {
            a.e();
            return;
        }
    }

    protected void f()
    {
        super.f();
        if (getActivity() != null)
        {
            c.setText(getString(0x7f0802f8));
            k.setText(getString(0x7f0802fc));
            d.setText(getString(0x7f0802fd));
            e.setText(getString(0x7f080450));
            g.setText(getString(0x7f0802ff));
            f.setText(getString(0x7f0802fe));
            i.setText(getString(0x7f080491));
        }
        a.a();
        j.b();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        p.a(500L);
        n = com.go.weatherex.messagecenter.i.a(getActivity());
        n.b(this);
        o = new g(this, new Handler());
        getActivity().getContentResolver().registerContentObserver(WeatherContentProvider.q, false, o);
        b = (ArrowIcon)c(0x7f090389);
        b.a(true);
        a = (EditCityScrollComponent)c(0x7f09037f);
        a.b("2");
        a.a(this);
        a.a(this);
        c = (TextView)c(0x7f090382);
        d = (TextView)c(0x7f090384);
        e = (TextView)c(0x7f090385);
        k = (TextView)c(0x7f090381);
        f = (TextView)c(0x7f090388);
        g = (TextView)c(0x7f090386);
        h = (TextView)c(0x7f090387);
        i = (TextView)c(0x7f090383);
        j = (SidebarGoAdView)c(0x7f090380);
        j.setVisibility(8);
        j.a(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        i.setOnClickListener(this);
        WeatherBean weatherbean;
        for (bundle = m.d().iterator(); bundle.hasNext(); a.a(weatherbean))
        {
            weatherbean = (WeatherBean)bundle.next();
        }

        b();
        a(k, 4, true);
        q = new ArrayList();
        r = new ArrayList();
        com.go.weatherex.b.a.a.a(GoWidgetApplication.b()).a(v, 1);
        com.go.weatherex.b.a.a.a(GoWidgetApplication.b()).a(w, 5);
        com.go.weatherex.b.a.a.a(GoWidgetApplication.b()).a();
        com.go.weatherex.b.a.a.a(GoWidgetApplication.b()).b();
    }

    public void onClick(View view)
    {
        if (!p.a(hashCode()))
        {
            if (a.b())
            {
                a.a(false);
            }
            a a1 = (a)getParentFragment();
            if (view.equals(b))
            {
                a(7, Boolean.valueOf(true));
                return;
            }
            if (view.equals(d))
            {
                a("c000_fucsetting");
                a1.a(com/go/weatherex/setting/u, null);
                return;
            }
            if (view.equals(e))
            {
                c();
                return;
            }
            if (view.equals(f))
            {
                a("c000_qa");
                a1.a(com/go/weatherex/d/a, null);
                return;
            }
            if (view.equals(g))
            {
                a("c000_msgc");
                a1.a(com/go/weatherex/messagecenter/b, null);
                return;
            }
            if (view.equals(i))
            {
                startActivity(new Intent(getActivity(), com/gtp/go/weather/sharephoto/photo/PhotoActivity));
                getActivity().overridePendingTransition(0x7f040002, 0x7f040004);
                view = new com.gau.go.launcherex.gowidget.statistics.a.a(117, "g001");
                view.d("2");
                com.gau.go.launcherex.gowidget.statistics.q.a(getActivity().getApplicationContext()).a(view);
                com.gau.go.launcherex.gowidget.statistics.q.a(getActivity().getApplicationContext()).a(new com.gau.go.launcherex.gowidget.statistics.a.a(93, "c000_sharepic"));
                return;
            }
            if (view.equals(c))
            {
                b(getActivity().getApplicationContext(), 2, 11);
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        m = com.gau.go.launcherex.gowidget.weather.util.f.a(getActivity());
        a(new int[] {
            1, 5
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030090, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        getActivity().getContentResolver().unregisterContentObserver(o);
        com.go.weatherex.b.a.a.a(GoWidgetApplication.b()).b(v, 1);
        com.go.weatherex.b.a.a.a(GoWidgetApplication.b()).b(w, 5);
        if (q != null)
        {
            q.clear();
            q = null;
        }
        if (r != null)
        {
            r.clear();
            r = null;
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        b(l);
    }

    public void onResume()
    {
        super.onResume();
        if (n != null)
        {
            n.b(this);
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        a(l);
    }
}
