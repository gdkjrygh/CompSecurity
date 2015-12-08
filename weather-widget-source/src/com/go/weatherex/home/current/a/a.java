// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.current.a;

import android.support.v4.app.FragmentActivity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.w;
import com.go.weatherex.home.c.e;
import com.go.weatherex.home.current.aa;
import com.go.weatherex.home.current.ab;
import com.go.weatherex.i.c;
import java.util.ArrayList;
import java.util.List;

public class a extends BaseAdapter
{

    private f a;
    private com.go.weatherex.framework.fragment.a b;
    private String c;
    private final ArrayList d = new ArrayList();
    private SparseArray e;

    public a(com.go.weatherex.framework.fragment.a a1, String s)
    {
        e = new SparseArray();
        a = com.gau.go.launcherex.gowidget.weather.util.f.a(a1.getActivity().getApplicationContext());
        b = a1;
        c = s;
        d.add(Integer.valueOf(1));
        d.add(Integer.valueOf(3));
        d.add(Integer.valueOf(2));
        d.add(Integer.valueOf(5));
        d.add(Integer.valueOf(4));
        if (h())
        {
            d.add(Integer.valueOf(7));
        }
        if (GoWidgetApplication.a)
        {
            d.add(Integer.valueOf(6));
        }
        d.add(Integer.valueOf(8));
    }

    private boolean h()
    {
        boolean flag1 = false;
        Object obj = a.a(c);
        boolean flag = flag1;
        if (obj != null)
        {
            obj = com.go.weatherex.home.c.e.a(((WeatherBean) (obj)).k);
            int i = 0;
            int j;
            int k;
            for (j = 0; i < ((SparseArray) (obj)).size(); j = k)
            {
                k = j;
                if (((List)((SparseArray) (obj)).valueAt(i)).size() >= 2)
                {
                    k = j + 1;
                }
                i++;
            }

            flag = flag1;
            if (j >= 2)
            {
                flag = true;
            }
        }
        return flag;
    }

    public Integer a(int i)
    {
        return (Integer)d.get(i);
    }

    public void a()
    {
        int j = e.size();
        for (int i = 0; i < j; i++)
        {
            ((aa)e.valueAt(i)).k();
        }

    }

    public void a(List list, w w)
    {
        int k = e.size();
        for (int i = 0; i < k; i++)
        {
            ((aa)e.valueAt(i)).a(list, w);
        }

        if (!d.contains(Integer.valueOf(7)) && h())
        {
            int j = d.indexOf(Integer.valueOf(6));
            if (j != -1)
            {
                d.add(j, Integer.valueOf(7));
            } else
            {
                d.add(Integer.valueOf(7));
            }
            notifyDataSetChanged();
        }
    }

    public void b()
    {
        int j = e.size();
        for (int i = 0; i < j; i++)
        {
            ((aa)e.valueAt(i)).j();
        }

    }

    public void b(int i)
    {
        int k = e.size();
        for (int j = 0; j < k; j++)
        {
            ((aa)e.valueAt(j)).a(i);
        }

    }

    public void c()
    {
        int j = e.size();
        for (int i = 0; i < j; i++)
        {
            ((aa)e.valueAt(i)).i();
        }

        e.clear();
    }

    public void c(int i)
    {
        int k = e.size();
        for (int j = 0; j < k; j++)
        {
            ((aa)e.valueAt(j)).b(i);
        }

    }

    public void d()
    {
        int j = e.size();
        for (int i = 0; i < j; i++)
        {
            ((aa)e.valueAt(i)).a();
        }

    }

    public void d(int i)
    {
        int k = e.size();
        for (int j = 0; j < k; j++)
        {
            ((aa)e.valueAt(j)).c(i);
        }

    }

    public void e()
    {
        int j = e.size();
        for (int i = 0; i < j; i++)
        {
            ((aa)e.valueAt(i)).b();
        }

    }

    public void e(int i)
    {
        int k = e.size();
        for (int j = 0; j < k; j++)
        {
            ((aa)e.valueAt(j)).d(i);
        }

    }

    public void f()
    {
        int j = e.size();
        for (int i = 0; i < j; i++)
        {
            ((aa)e.valueAt(i)).c();
        }

    }

    public void f(int i)
    {
        int k = e.size();
        for (int j = 0; j < k; j++)
        {
            ((aa)e.valueAt(j)).e(i);
        }

    }

    public void g()
    {
        int j = e.size();
        for (int i = 0; i < j; i++)
        {
            ((aa)e.valueAt(i)).h();
        }

    }

    public int getCount()
    {
        if (com.go.weatherex.i.c.a(a.a(c)))
        {
            return d.size();
        } else
        {
            return 0;
        }
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        i = a(i).intValue();
        viewgroup = (aa)e.get(i);
        view = viewgroup;
        if (viewgroup == null)
        {
            view = ab.a(b, i);
            view.a(c);
            e.put(i, view);
        }
        view.g();
        return view.f();
    }

    public int getViewTypeCount()
    {
        return d.size();
    }
}
