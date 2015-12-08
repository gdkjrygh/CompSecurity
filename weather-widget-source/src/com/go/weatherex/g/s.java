// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.view.ViewCompat;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.c.h;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.go.weatherex.framework.fragment.a;
import com.gtp.a.a.c.d;
import com.jiubang.goweather.c.t;
import com.jiubang.goweather.c.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.go.weatherex.g:
//            e, t, v, l, 
//            d, w, u, y, 
//            x

public class s extends a
    implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemClickListener, android.widget.TextView.OnEditorActionListener, e
{

    private View a;
    private TextView b;
    private ViewGroup c;
    private SparseArray d;
    private ViewGroup e;
    private EditText f;
    private ViewGroup g;
    private l h;
    private y i;
    private View j;
    private GridView k;
    private x l;
    private List m;
    private List n;
    private List o;
    private t p;
    private int q;
    private h r;
    private Activity s;
    private com.go.weatherex.g.d t;
    private TextWatcher u;
    private final v v = new v(this);

    public s()
    {
        p = null;
        u = new com.go.weatherex.g.t(this);
    }

    static List a(s s1)
    {
        return s1.o;
    }

    private void a(int i1)
    {
        if (q == i1)
        {
            return;
        }
        q = i1;
        switch (q)
        {
        default:
            throw new IllegalArgumentException("illegal state!");

        case 1: // '\001'
            e.setVisibility(0);
            h.a(8);
            h.b();
            return;

        case 2: // '\002'
            e.setVisibility(8);
            break;
        }
        h.a(0);
    }

    private void a(CityBean citybean)
    {
        t.b(citybean);
    }

    static void a(s s1, int i1)
    {
        s1.a(i1);
    }

    static void a(s s1, CityBean citybean)
    {
        s1.a(citybean);
    }

    static void a(s s1, List list)
    {
        s1.a(list);
    }

    private void a(String s1)
    {
        int i1 = c.getChildCount();
        String s2 = s1;
        if (i1 > 0)
        {
            s2 = (new StringBuilder()).append(" > ").append(s1).toString();
        }
        s1 = b(i1);
        w w1 = (w)s1.getTag();
        w1.b.setText(s2);
        if (i1 == 0)
        {
            w1.b.setOnClickListener(new com.go.weatherex.g.u(this, i1));
        }
        c.addView(s1);
    }

    private void a(List list)
    {
        a(list, ((String) (null)));
    }

    private void a(List list, String s1)
    {
        o = list;
        k.setAdapter(l);
    }

    private View b(int i1)
    {
        View view1 = (View)d.get(i1);
        View view = view1;
        if (view1 == null)
        {
            view = (new w(this, c)).a;
            d.put(i1, view);
        }
        return view;
    }

    static List b(s s1)
    {
        return s1.n;
    }

    private void b()
    {
        if (getArguments() == null);
    }

    static View c(s s1)
    {
        return s1.j;
    }

    private void c()
    {
        b.setText(s.getString(0x7f080188));
        f.setHint(s.getString(0x7f080189));
    }

    static EditText d(s s1)
    {
        return s1.f;
    }

    private void d()
    {
        m.clear();
        j();
        a(m);
    }

    static l e(s s1)
    {
        return s1.h;
    }

    static List f(s s1)
    {
        return s1.m;
    }

    static ViewGroup g(s s1)
    {
        return s1.c;
    }

    static void h(s s1)
    {
        s1.k();
    }

    static com.go.weatherex.g.d i(s s1)
    {
        return s1.t;
    }

    private void j()
    {
        if (m.size() == 0)
        {
            String as[] = s.getResources().getStringArray(0x7f0d001a);
            for (int i1 = 0; i1 < as.length; i1++)
            {
                CityBean citybean = new CityBean(null, as[i1], null, null, null, null);
                m.add(citybean);
            }

        }
    }

    private void k()
    {
        ((InputMethodManager)s.getSystemService("input_method")).hideSoftInputFromWindow(f.getWindowToken(), 0);
    }

    private Context l()
    {
        return s.getApplicationContext();
    }

    private void m()
    {
        if (!com.gtp.a.a.c.d.b(l()))
        {
            Toast.makeText(s, 0x7f0801ad, 0).show();
            return;
        }
        String s1 = f.getText().toString();
        if (s1 == null || s1.length() == 0)
        {
            Toast.makeText(s, 0x7f080189, 0).show();
            return;
        } else
        {
            k();
            h.a(s1);
            return;
        }
    }

    private boolean n()
    {
        k();
        q;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 62
    //                   2 90;
           goto _L1 _L2 _L3
_L1:
        if (com.gau.go.launcherex.gowidget.weather.util.f.a(s.getApplicationContext()).c().isEmpty())
        {
            s.finish();
            return true;
        } else
        {
            return false;
        }
_L2:
        if (o.equals(n))
        {
            o();
            a(m);
            return true;
        }
          goto _L1
_L3:
        a(1);
        return true;
    }

    private void o()
    {
        if (c.getChildCount() > 1)
        {
            c.removeViewAt(c.getChildCount() - 1);
        }
    }

    public void a(CityBean citybean, boolean flag)
    {
        if (flag)
        {
            Toast.makeText(s, 0x7f08019e, 0).show();
            return;
        } else
        {
            Toast.makeText(s, s.getString(0x7f0801b2, new Object[] {
                citybean.b()
            }), 0).show();
            h();
            return;
        }
    }

    protected boolean a()
    {
        return n();
    }

    public void h()
    {
        ((a)getParentFragment()).h();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        s = activity;
    }

    public void onClick(View view)
    {
        if (view.equals(a))
        {
            long l1 = SystemClock.elapsedRealtime();
            view = GoWidgetApplication.c(GoWidgetApplication.b()).a();
            if (view != null)
            {
                view.edit().putLong("key_city_fragment_backkey_click_time", l1).commit();
            }
            if (!n())
            {
                h();
            }
        } else
        if (view.equals(j))
        {
            f.setText("");
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030078, viewgroup, false);
    }

    public void onDestroyView()
    {
        if (p != null)
        {
            p.a();
        }
        if (i != null)
        {
            i.c();
        }
        t.a();
        super.onDestroyView();
    }

    public boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
    {
        if ((i1 == 3 || i1 == 6 || i1 == 0) && textview.equals(f))
        {
            m();
            return true;
        } else
        {
            return false;
        }
    }

    public void onFocusChange(View view, boolean flag)
    {
label0:
        {
            if (view.equals(f))
            {
                if (!flag)
                {
                    break label0;
                }
                f.setHint("");
            }
            return;
        }
        f.setHint(s.getString(0x7f080189));
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if ((adapterview instanceof GridView) && o != null && i1 >= 0 && i1 < o.size())
        {
            adapterview = (CityBean)o.get(i1);
            if (o.equals(m))
            {
                com.jiubang.goweather.c.u.a(s, adapterview.b(), 0x7f06001e, n);
                l.a(view.getLeft(), view.getTop());
                l.b(view.getWidth(), view.getHeight());
                l.e = true;
                a(n);
                a((new StringBuilder()).append(adapterview.b()).append(" ").toString());
            } else
            if (o.equals(n))
            {
                a(adapterview);
                return;
            }
        }
    }

    public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        if (1 == i1)
        {
            l.e = false;
            k();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        d = new SparseArray();
        r = new h();
        r.a(500L);
        t = new com.go.weatherex.g.d(l());
        t.a(this);
        a = c(0x7f090226);
        a.setOnClickListener(this);
        b = (TextView)c(0x7f090202);
        f = (EditText)c(0x7f0902b6);
        f.addTextChangedListener(u);
        f.setOnFocusChangeListener(this);
        f.setOnEditorActionListener(this);
        j = c(0x7f0902b7);
        j.setOnClickListener(this);
        j.setVisibility(8);
        e = (ViewGroup)c(0x7f0902ba);
        k = (GridView)c(0x7f0902bc);
        ViewCompat.setLayerType(k, 1, null);
        l = new x(this, null);
        k.setAdapter(l);
        k.setOnItemClickListener(this);
        k.setOnScrollListener(this);
        c = (ViewGroup)c(0x7f0902bb);
        g = (ViewGroup)c(0x7f0901eb);
        h = new l(s, this, v, true);
        g.addView(h.a());
        if (com.gau.go.launcherex.gowidget.weather.util.f.a(l()).g() == null)
        {
            i = new y(this, e, v);
            e.addView(i.b(), 0);
        }
        m = new ArrayList();
        n = new ArrayList();
        d();
        a(1);
        a(s.getString(0x7f08018b));
        b();
        c();
    }
}
