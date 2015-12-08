// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.gau.go.launcherex.goweather.goplay.q;
import com.go.weatherex.ad.c.e;
import com.go.weatherex.framework.fragment.a;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.d.d;
import java.util.List;

// Referenced classes of package com.go.weatherex.themestore:
//            u, ac, r, aj

public class t extends a
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{

    private int a;
    private ListView b;
    private com.go.weatherex.ad.nativead.a c;
    private r d;
    private View e;
    private TextView f;
    private TextView g;
    private View h;
    private View i;
    private d j;
    private final aj k = new u(this);

    public t()
    {
    }

    public static t a(Activity activity, int l)
    {
        t t1 = new t();
        t1.b(activity);
        activity = new Bundle();
        activity.putInt("theme_type", l);
        t1.setArguments(activity);
        return t1;
    }

    private void a(int l)
    {
        switch (l)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("mode undefined:").append(l).toString());

        case 3: // '\003'
            b.setVisibility(0);
            i.setVisibility(8);
            h.setVisibility(8);
            return;

        case 2: // '\002'
            b.setVisibility(8);
            i.setVisibility(8);
            h.setVisibility(0);
            return;

        case 1: // '\001'
            b.setVisibility(8);
            i.setVisibility(0);
            h.setVisibility(8);
            return;
        }
    }

    static void a(t t1)
    {
        t1.b();
    }

    static void a(t t1, int l)
    {
        t1.a(l);
    }

    private void b()
    {
        if (isDetached())
        {
            return;
        }
        j = com.go.weatherex.themestore.ac.a(a);
        Object obj = com.go.weatherex.themestore.ac.a(j);
        if (((List) (obj)).size() > 0)
        {
            d = new r(getActivity(), ((List) (obj)), b);
            d.b(ac.h().b(getActivity()));
            d.a(getResources().getInteger(0x7f0b0008));
            obj = d;
            boolean flag;
            if (!com.go.weatherex.ad.c.e.a(getActivity()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((r) (obj)).a(flag);
            b.setAdapter(d);
            return;
        } else
        {
            a(2);
            return;
        }
    }

    private void b(Bundle bundle)
    {
        a = bundle.getInt("theme_type", 1);
    }

    static void b(t t1)
    {
        t1.c();
    }

    private void c()
    {
        if (d != null)
        {
            j = com.go.weatherex.themestore.ac.a(a);
            List list = com.go.weatherex.themestore.ac.a(j);
            d.a(list);
        }
    }

    private void d()
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
            d();
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
        } else
        {
            a(1);
            ac.c();
        }
        d();
    }

    public void onClick(View view)
    {
        if (view.equals(g))
        {
            a(1);
            com.go.weatherex.themestore.ac.d();
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
        ac.b(k);
        c.a();
        if (d != null)
        {
            d.c();
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int l, long l1)
    {
        if (l == d.a() - 1)
        {
            if (j != null && !TextUtils.isEmpty(j.h()))
            {
                l = com.jiubang.playsdk.f.a.a(j.h());
                ac.g().a(getActivity(), l, j.a());
            }
        } else
        {
            adapterview = (com.jiubang.playsdk.d.e)d.getItem(l);
            if (adapterview != null && j != null)
            {
                ac.g().a(getActivity(), adapterview, j.a());
                return;
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        b = (ListView)c(0x7f0903a1);
        i = c(0x7f0903a0);
        e = i.findViewById(0x7f090224);
        h = c(0x7f0903a3);
        f = (TextView)h.findViewById(0x7f090225);
        g = (TextView)h.findViewById(0x7f090543);
        b.setOnItemClickListener(this);
        c = new com.go.weatherex.ad.nativead.a(getActivity());
        b.addFooterView(c);
        if (!com.go.weatherex.ad.c.e.a(getActivity()))
        {
            c.a(getString(0x7f08003e));
        }
        g.setOnClickListener(this);
        com.go.weatherex.themestore.ac.a(k);
    }
}
