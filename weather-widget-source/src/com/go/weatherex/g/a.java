// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.gau.go.launcherex.gowidget.c.h;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gtp.a.a.c.d;
import com.jiubang.goweather.c.t;
import java.util.Map;

// Referenced classes of package com.go.weatherex.g:
//            e, b, c, h, 
//            l, d

public class a extends com.go.weatherex.framework.fragment.a
    implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, android.widget.TextView.OnEditorActionListener, e
{

    private int a;
    private h b;
    private View c;
    private TextView d;
    private ViewGroup e;
    private EditText f;
    private View g;
    private com.go.weatherex.g.h h;
    private l i;
    private int j;
    private t k;
    private Activity l;
    private com.go.weatherex.g.d m;
    private TextWatcher n;
    private final c o = new c(this);

    public a()
    {
        j = 0;
        k = null;
        n = new b(this);
    }

    static View a(a a1)
    {
        return a1.g;
    }

    static EditText b(a a1)
    {
        return a1.f;
    }

    private void b()
    {
        if (getArguments() == null);
    }

    static l c(a a1)
    {
        return a1.i;
    }

    private void c()
    {
        d.setText(l.getString(0x7f080188));
        f.setHint(l.getString(0x7f080189));
    }

    static void d(a a1)
    {
        a1.j();
    }

    private boolean d()
    {
        boolean flag = false;
        j();
        if (a != 1)
        {
            a(1);
            flag = true;
        }
        if (!flag && com.gau.go.launcherex.gowidget.weather.util.f.a(l()).c().isEmpty())
        {
            l.finish();
            return true;
        } else
        {
            return flag;
        }
    }

    static com.go.weatherex.g.d e(a a1)
    {
        return a1.m;
    }

    private void j()
    {
        ((InputMethodManager)l.getSystemService("input_method")).hideSoftInputFromWindow(f.getWindowToken(), 0);
    }

    private void k()
    {
        h.a(0);
    }

    private Context l()
    {
        return l.getApplicationContext();
    }

    private void m()
    {
        if (!com.gtp.a.a.c.d.b(l()))
        {
            Toast.makeText(l, 0x7f0801ad, 0).show();
            return;
        }
        String s = f.getText().toString();
        if (s == null || s.length() == 0)
        {
            Toast.makeText(l, 0x7f080189, 0).show();
            return;
        } else
        {
            j();
            i.a(s);
            return;
        }
    }

    public void a(int i1)
    {
        if (a == i1)
        {
            return;
        }
        a = i1;
        switch (a)
        {
        default:
            throw new IllegalArgumentException("illegal state!");

        case 1: // '\001'
            i.a(8);
            i.b();
            k();
            return;

        case 2: // '\002'
            h.a(8);
            break;
        }
        i.a(0);
    }

    public void a(CityBean citybean)
    {
        m.b(citybean);
    }

    public void a(CityBean citybean, boolean flag)
    {
        if (flag)
        {
            Toast.makeText(l, 0x7f08019e, 0).show();
            return;
        } else
        {
            Toast.makeText(l, l.getString(0x7f0801b2, new Object[] {
                citybean.b()
            }), 0).show();
            h();
            return;
        }
    }

    protected boolean a()
    {
        return d();
    }

    public void h()
    {
        ((com.go.weatherex.framework.fragment.a)getParentFragment()).h();
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        l = activity;
    }

    public void onClick(View view)
    {
        if (view.equals(c))
        {
            long l1 = SystemClock.elapsedRealtime();
            view = GoWidgetApplication.c(GoWidgetApplication.b()).a();
            if (view != null)
            {
                view.edit().putLong("key_city_fragment_backkey_click_time", l1).commit();
            }
            if (!d())
            {
                h();
            }
        } else
        if (view.equals(g))
        {
            f.setText("");
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030076, viewgroup, false);
    }

    public void onDestroyView()
    {
        if (k != null)
        {
            k.a();
        }
        h.a();
        m.a();
        super.onDestroyView();
    }

    public boolean onEditorAction(TextView textview, int i1, KeyEvent keyevent)
    {
        if ((i1 == 3 || i1 == 6 || i1 == 0) && textview.equals(f))
        {
            if (i1 == 0)
            {
                j = j + 1;
                if (j == 0x7fffffff)
                {
                    j = 0;
                }
            }
            if (j % 2 == 0 && j != 0)
            {
                return true;
            } else
            {
                m();
                return true;
            }
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
        f.setHint(l.getString(0x7f080189));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        m = new com.go.weatherex.g.d(l());
        m.a(this);
        b = new h();
        b.a(500L);
        c = c(0x7f090226);
        c.setOnClickListener(this);
        d = (TextView)c(0x7f090202);
        f = (EditText)c(0x7f0902b6);
        f.setOnEditorActionListener(this);
        f.setOnFocusChangeListener(this);
        f.addTextChangedListener(n);
        g = c(0x7f0902b7);
        g.setOnClickListener(this);
        g.setVisibility(8);
        e = (ViewGroup)c(0x7f0901eb);
        h = new com.go.weatherex.g.h(e, l, this, o);
        e.addView(h.b());
        i = new l(l, this, o, false);
        e.addView(i.a());
        b();
        a(1);
        c();
    }
}
