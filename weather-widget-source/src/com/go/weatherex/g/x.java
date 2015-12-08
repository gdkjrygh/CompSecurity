// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.a.a.a;
import com.a.a.d;
import com.a.a.s;
import com.gau.go.launcherex.gowidget.weather.model.CityBean;
import com.go.weatherex.framework.fragment.f;
import java.util.List;

// Referenced classes of package com.go.weatherex.g:
//            s, t

class x extends BaseAdapter
{

    float a;
    float b;
    float c;
    float d;
    boolean e;
    final com.go.weatherex.g.s f;

    private x(com.go.weatherex.g.s s1)
    {
        f = s1;
        super();
        e = false;
    }

    x(com.go.weatherex.g.s s1, t t)
    {
        this(s1);
    }

    private void a(View view, int i)
    {
        if (!e)
        {
            return;
        } else
        {
            int j = i / 4;
            s as[] = new s[2];
            float f1 = a;
            float f2 = d;
            as[0] = s.a(view, "translationX", new float[] {
                f1 - (float)(i % 4) * f2, 0.0F
            });
            as[0].a(500L);
            f1 = b;
            f2 = c;
            as[1] = s.a(view, "translationY", new float[] {
                f1 - (float)j * f2, 0.0F
            });
            as[1].a(500L);
            view = new d();
            view.a(as);
            view.a();
            return;
        }
    }

    public void a(float f1, float f2)
    {
        a = f1;
        b = f2;
    }

    public void b(float f1, float f2)
    {
        d = f1;
        c = f2;
    }

    public int getCount()
    {
        if (com.go.weatherex.g.s.a(f) != null)
        {
            return com.go.weatherex.g.s.a(f).size();
        } else
        {
            return 0;
        }
    }

    public Object getItem(int i)
    {
        return Integer.valueOf(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        if (view == null)
        {
            view1 = f.i().a(0x7f0300f1, viewgroup, false);
            view = (TextView)view1.findViewById(0x7f09009d);
            view1.setTag(view);
            viewgroup = view;
        } else
        {
            viewgroup = (TextView)view.getTag();
            view1 = view;
        }
        viewgroup.setText(((CityBean)com.go.weatherex.g.s.a(f).get(i)).b());
        view1.clearAnimation();
        if (com.go.weatherex.g.s.a(f).equals(s.b(f)))
        {
            a(view1, i);
        }
        return view1;
    }
}
