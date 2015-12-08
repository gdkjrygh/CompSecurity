// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themeconfig;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.gau.go.launcherex.goweather.goplay.q;
import com.gau.go.launcherex.gowidget.weather.view.ThemeSettingActivity;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.themestore.ac;
import com.go.weatherex.themestore.aj;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.d.d;
import com.jiubang.playsdk.f.e;
import java.util.List;

// Referenced classes of package com.go.weatherex.themeconfig:
//            o, l

public class n extends a
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    private int a;
    private ListView b;
    private l c;
    private View d;
    private View e;
    private TextView f;
    private TextView g;
    private d h;
    private final aj i = new o(this);

    public n()
    {
    }

    public static n a(Activity activity, int k)
    {
        n n1 = new n();
        n1.b(activity);
        activity = new Bundle();
        activity.putInt("widget_type", k);
        n1.setArguments(activity);
        return n1;
    }

    private void a(int k)
    {
        switch (k)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("mode undefined:").append(k).toString());

        case 3: // '\003'
            b.setVisibility(0);
            d.setVisibility(8);
            e.setVisibility(8);
            return;

        case 4: // '\004'
            b.setVisibility(8);
            d.setVisibility(8);
            e.setVisibility(0);
            g.setVisibility(8);
            f.setText(getString(0x7f08050a));
            return;

        case 2: // '\002'
            b.setVisibility(8);
            d.setVisibility(8);
            e.setVisibility(0);
            g.setVisibility(0);
            f.setText(getString(0x7f080344));
            return;

        case 1: // '\001'
            b.setVisibility(8);
            d.setVisibility(0);
            e.setVisibility(8);
            return;
        }
    }

    static void a(n n1)
    {
        n1.b();
    }

    static void a(n n1, int k)
    {
        n1.a(k);
    }

    private void b()
    {
        if (!isAdded())
        {
            return;
        }
        List list = d();
        if (list.size() > 0)
        {
            c = new l(getActivity(), list, b);
            c.a(ac.h().b(getActivity()));
            b.setAdapter(c);
            return;
        }
        if (com.jiubang.playsdk.f.e.j(getActivity()))
        {
            a(4);
            return;
        } else
        {
            a(2);
            return;
        }
    }

    private void b(Bundle bundle)
    {
        a = bundle.getInt("widget_type", 1);
    }

    static void b(n n1)
    {
        n1.c();
    }

    private void c()
    {
        if (c != null)
        {
            c.a(d());
        }
    }

    private List d()
    {
        h = ac.a(1);
        return ac.a(a, h);
    }

    private void j()
    {
        g.setText(getString(0x7f0804e2));
        f.setText(getString(0x7f080344));
    }

    protected void f()
    {
        super.f();
        if (isDetached())
        {
            return;
        } else
        {
            j();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        b(getArguments());
        if (ac.b())
        {
            a(3);
            b();
            return;
        } else
        {
            a(1);
            ac.c();
            return;
        }
    }

    public void onClick(View view)
    {
        if (view.equals(g))
        {
            a(1);
            ac.c();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030096, viewgroup, false);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ac.b(i);
    }

    public void onItemClick(AdapterView adapterview, View view, int k, long l1)
    {
        if (k == c.a() - 1)
        {
            adapterview = ThemeSettingActivity.a(getActivity(), 33, 40, 40);
            adapterview.addFlags(0x4000000);
            startActivity(adapterview);
        } else
        {
            adapterview = (com.jiubang.playsdk.d.e)c.getItem(k);
            if (adapterview != null && h != null)
            {
                ac.g().a(getActivity(), adapterview, h.a());
                return;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        b = (ListView)c(0x7f0903a1);
        b.setOnItemClickListener(this);
        d = c(0x7f0903a0);
        e = c(0x7f0903a3);
        f = (TextView)e.findViewById(0x7f090225);
        g = (TextView)e.findViewById(0x7f090543);
        g.setOnClickListener(this);
        j();
        ac.a(i);
    }
}
