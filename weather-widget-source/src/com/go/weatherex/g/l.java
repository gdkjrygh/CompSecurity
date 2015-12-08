// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import com.gau.go.launcherex.gowidget.weather.a.b;
import com.gau.go.launcherex.gowidget.weather.a.c;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.framework.fragment.f;
import com.gtp.a.a.c.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.go.weatherex.g:
//            o, q, p, m, 
//            n

public class l
    implements android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, b
{

    private Activity a;
    private final View b;
    private final ListView c;
    private final p d = new p(this, null);
    private final List e = new ArrayList();
    private final Map f = new HashMap();
    private final List g = new ArrayList();
    private final List h = new ArrayList();
    private final q i = new q(this);
    private final Handler j;
    private final c k;
    private final com.gau.go.launcherex.gowidget.weather.a.f l;
    private boolean m;
    private final o n = new o(this, null);
    private String o;
    private a p;
    private String q;

    public l(Activity activity, a a1, Handler handler, boolean flag)
    {
        m = false;
        a = activity;
        p = a1;
        j = handler;
        b = p.i().a(0x7f0300f4, null);
        c = (ListView)b.findViewById(0x7f0904e1);
        i.a(8);
        c.setAdapter(d);
        c.setOnItemClickListener(this);
        c.setOnScrollListener(this);
        ViewCompat.setOverScrollMode(c, 2);
        k = new c(a, flag);
        l = new com.gau.go.launcherex.gowidget.weather.a.f(a);
        k.a(this);
        l.a(this);
    }

    static List a(l l1)
    {
        return l1.e;
    }

    private void a(CityBean citybean)
    {
        Message message = Message.obtain();
        message.what = 2;
        message.obj = citybean;
        j.sendMessage(message);
    }

    static void a(l l1, String s)
    {
        l1.e(s);
    }

    static a b(l l1)
    {
        return l1.p;
    }

    static boolean b(l l1, String s)
    {
        return l1.d(s);
    }

    static Activity c(l l1)
    {
        return l1.a;
    }

    private void c()
    {
        int i1 = c.getFirstVisiblePosition();
        e.clear();
        f.clear();
        CityBean citybean;
        for (Iterator iterator = g.iterator(); iterator.hasNext(); e.add(citybean))
        {
            citybean = (CityBean)iterator.next();
            f.put(citybean.a(), citybean);
        }

        Iterator iterator1 = h.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            CityBean citybean1 = (CityBean)iterator1.next();
            if (f.get(citybean1.a()) == null)
            {
                f.put(citybean1.a(), citybean1);
                e.add(citybean1);
            }
        } while (true);
        c.removeFooterView(i.b());
        if (i.b().getVisibility() != 8)
        {
            c.addFooterView(i.b());
        }
        c.setAdapter(d);
        if (m)
        {
            c.setSelection(i1);
        }
        d();
    }

    private void c(String s)
    {
        g.clear();
        k.b(s);
    }

    private void d()
    {
        j.sendEmptyMessage(1);
    }

    private boolean d(String s)
    {
        if (!TextUtils.isEmpty(o) && !TextUtils.isEmpty(s) && (s.equals(o) || s.startsWith(o)))
        {
            return false;
        } else
        {
            o = null;
            h.clear();
            l.b(s);
            i.a(0);
            i.c(0x7f0801ab);
            i.a(true);
            c();
            return true;
        }
    }

    private void e()
    {
        j.sendEmptyMessage(3);
    }

    private void e(String s)
    {
        j.removeCallbacks(n);
        l.a(s);
        i.a(0);
        i.c(0x7f0801ab);
        i.a(true);
        m = true;
        c();
    }

    public View a()
    {
        return b;
    }

    public void a(int i1)
    {
        b.setVisibility(i1);
    }

    public void a(com.gau.go.launcherex.gowidget.weather.a.a a1, com.gau.go.launcherex.gowidget.weather.a.a.a a2)
    {
        boolean flag;
        flag = false;
        m = false;
        i.a(null);
        if (!(a1 instanceof c)) goto _L2; else goto _L1
_L1:
        a1 = a2.a;
        if (!a1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        if (g.size() != 0) goto _L4; else goto _L3
_L3:
        if (com.gtp.a.a.c.d.b(a)) goto _L6; else goto _L5
_L5:
        j.removeCallbacks(n);
        i.a(0);
        i.c(0x7f0801ad);
        i.a(false);
        h.clear();
        c();
_L4:
        return;
_L6:
        j.removeCallbacks(n);
        if (d(a2.c)) goto _L4; else goto _L7
_L7:
        i.a(0);
        i.c(0x7f0801ac);
        i.a(false);
        c();
        return;
        int i1 = ((flag) ? 1 : 0);
        if (a2.c != null)
        {
            i1 = ((flag) ? 1 : 0);
            if (a2.c.getBytes() != null)
            {
                i1 = a2.c.getBytes().length;
            }
        }
        if (i1 < 3)
        {
            i.a(8);
        }
        g.addAll(a1);
_L9:
        c();
        return;
_L2:
        if (a1 instanceof com.gau.go.launcherex.gowidget.weather.a.f)
        {
            switch (a2.b)
            {
            default:
                break;

            case 1: // '\001'
                a1 = a2.a;
                if (a1.isEmpty())
                {
                    o = a2.c;
                    i.a(0);
                    i.c(0x7f0801ac);
                    i.a(false);
                    h.clear();
                    break;
                }
                i.a(8);
                if (h.size() > 0)
                {
                    m = true;
                }
                h.addAll(a1);
                if (a2.a())
                {
                    a1 = a2.b();
                    i.a(0);
                    i.c(0x7f0801a9);
                    i.a(false);
                    i.a(new m(this, a1));
                }
                break;

            case 2: // '\002'
                i.a(0);
                i.c(0x7f0801ad);
                i.a(false);
                h.clear();
                break;

            case 3: // '\003'
                i.a(0);
                i.c(0x7f08019d);
                i.a(false);
                h.clear();
                break;
            }
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void a(String s)
    {
        g.clear();
        j.removeCallbacks(n);
        d(s);
    }

    public void b()
    {
        l.a();
        k.a();
    }

    public void b(String s)
    {
        if (q != null && q.equals(s))
        {
            return;
        }
        q = s;
        c(s);
        if (s.getBytes().length >= 3)
        {
            j.removeCallbacks(n);
            n.a(s);
            j.postDelayed(n, 1000L);
            return;
        } else
        {
            j.removeCallbacks(n);
            h.clear();
            return;
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = (n)view.getTag();
        if (adapterview == null)
        {
            return;
        } else
        {
            a(com.go.weatherex.g.n.a(adapterview));
            return;
        }
    }

    public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        if (i1 == 1)
        {
            e();
        }
    }
}
