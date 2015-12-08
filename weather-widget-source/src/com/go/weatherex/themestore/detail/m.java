// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore.detail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.ImageView;
import com.go.weatherex.themestore.an;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.main.c;
import com.jiubang.playsdk.main.g;
import com.jiubang.playsdk.main.o;
import com.jiubang.playsdk.views.ContentFrame;
import com.jiubang.playsdk.views.n;

// Referenced classes of package com.go.weatherex.themestore.detail:
//            o, a, n

public abstract class m
    implements android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener, com.jiubang.playsdk.views.m, n
{

    protected Context a;
    protected ViewGroup b;
    protected g c;
    protected LayoutInflater d;
    protected o e;
    protected y f;
    protected c g;
    protected a h;
    protected android.widget.AdapterView.OnItemClickListener i;
    protected android.view.View.OnClickListener j;
    protected com.jiubang.playsdk.views.m k;
    protected View l;
    protected an m;

    public m(o o1)
    {
        e = o1;
        a = e.b();
        f = y.a();
        f.a(a);
        d = LayoutInflater.from(a);
        g = y.a().b();
    }

    private void b()
    {
        m.a.setOnClickListener(new com.go.weatherex.themestore.detail.o(this));
    }

    public View a(int ai[], int ai1[])
    {
        View view = n();
        b(ai, ai1);
        return view;
    }

    public void a()
    {
        if (k != null)
        {
            k.a();
        }
    }

    public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener, android.view.View.OnClickListener onclicklistener, com.jiubang.playsdk.views.m m1)
    {
        i = onitemclicklistener;
        j = onclicklistener;
        k = m1;
    }

    public void a(c c1)
    {
        if (f != null)
        {
            f.a(c1);
        }
        g = c1;
    }

    protected void a(String s)
    {
        if (c != null)
        {
            c.a(s);
        }
    }

    public void a(int ai[])
    {
        if (ai == null)
        {
            m.c.setVisibility(8);
        } else
        {
            int i1 = 0;
            while (i1 < ai.length) 
            {
                m.c.setId(ai[i1]);
                m.c.setOnClickListener(j);
                i1++;
            }
        }
    }

    public void b(int ai[])
    {
        h = new a(a);
        if (ai != null)
        {
            h.a(ai);
            h.a(this);
            m.g.setOnClickListener(new com.go.weatherex.themestore.detail.n(this));
            return;
        } else
        {
            m.g.setVisibility(8);
            return;
        }
    }

    protected void b(int ai[], int ai1[])
    {
        b(ai);
        a(ai1);
        b();
        e();
        h();
    }

    protected abstract void e();

    protected abstract int f();

    protected abstract void g();

    public void h()
    {
    }

    public void i()
    {
        a(null, null, null);
    }

    protected View n()
    {
        View view = d.inflate(0x7f0300a5, null);
        ContentFrame contentframe = (ContentFrame)view.findViewById(0x7f0903d8);
        contentframe.getParent().bringChildToFront(contentframe);
        l = view.findViewById(0x7f090050);
        m = new an(a, l.findViewById(0x7f0903d7));
        m.d.setVisibility(8);
        contentframe.a(d, f());
        b = contentframe.a();
        c = new g(contentframe, b, null, null);
        return view;
    }

    public void o()
    {
        p();
        g();
        h();
    }

    public void onClick(View view)
    {
        if (j != null)
        {
            j.onClick(view);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (i != null)
        {
            i.onItemClick(adapterview, view, i1, l1);
        }
        h.a();
    }

    protected void p()
    {
        if (c != null)
        {
            c.a();
        }
    }

    protected void q()
    {
        if (c != null)
        {
            c.a(350);
        }
    }

    public void r()
    {
        h.a(l);
    }
}
