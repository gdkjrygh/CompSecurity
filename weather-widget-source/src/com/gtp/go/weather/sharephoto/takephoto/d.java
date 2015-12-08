// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import com.gtp.a.a.c.a;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterParameter;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            h, f, i

public class d
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private Activity a;
    private View b;
    private ViewGroup c;
    private HorizontalScrollView d;
    private FilterService e;
    private List f;
    private Bitmap g;
    private int h;
    private boolean i;
    private i j;
    private final SparseArray k = new SparseArray();

    public d(Activity activity, View view, FilterService filterservice)
    {
        a = activity;
        b = view;
        c = (ViewGroup)a(0x7f0904f7);
        d = (HorizontalScrollView)a(0x7f0904f6);
        d.getViewTreeObserver().addOnGlobalLayoutListener(this);
        e = filterservice;
        activity = e.getAllFilter(0);
        f = new ArrayList();
        int l = com.gtp.a.a.c.a.a();
        activity = activity.iterator();
        do
        {
            if (!activity.hasNext())
            {
                break;
            }
            view = (FilterParameter)activity.next();
            if (l == 3 || l == 2)
            {
                int i1 = view.getTypeId();
                if (i1 == 0x20000 || i1 == 32768 || i1 == 16384 || i1 == 0x10000)
                {
                    continue;
                }
            }
            filterservice = new h(this, null);
            filterservice.b = false;
            filterservice.a = view;
            f.add(filterservice);
        } while (true);
        if (f.size() > 0)
        {
            ((h)f.get(0)).b = true;
        }
    }

    static Activity a(d d1)
    {
        return d1.a;
    }

    private View a(int l, int i1)
    {
        h h1 = (h)f.get(l);
        f f1 = new f(this, i1);
        f1.a(h1);
        return f1.a;
    }

    static void a(d d1, h h1)
    {
        d1.a(h1);
    }

    private void a(h h1)
    {
        Iterator iterator = f.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            h h2 = (h)iterator.next();
            if (!h2.b)
            {
                continue;
            }
            h2.b = false;
            break;
        } while (true);
        h1.b = true;
        d();
        a(h1.a);
    }

    private void a(FilterParameter filterparameter)
    {
        if (j != null)
        {
            j.a(filterparameter);
        }
    }

    static Bitmap b(d d1)
    {
        return d1.g;
    }

    static SparseArray c(d d1)
    {
        return d1.k;
    }

    static FilterService d(d d1)
    {
        return d1.e;
    }

    private void d()
    {
        if (!i)
        {
            return;
        }
        int i1 = d.getScrollX();
        int j1 = d.getScrollY();
        c.removeAllViews();
        int k1 = f.size();
        for (int l = 0; l < k1; l++)
        {
            View view = a(l, h);
            c.addView(view);
        }

        d.scrollTo(i1, j1);
    }

    protected View a(int l)
    {
        return b.findViewById(l);
    }

    public void a()
    {
        d();
    }

    public void a(Bitmap bitmap)
    {
        g = bitmap;
        k.clear();
    }

    public void a(i l)
    {
        j = l;
    }

    public FilterParameter b()
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            h h1 = (h)iterator.next();
            if (h1.b)
            {
                return h1.a;
            }
        }

        return null;
    }

    public void b(int l)
    {
        b.setVisibility(l);
    }

    public void c()
    {
        k.clear();
    }

    public void c(int l)
    {
        if (f.size() > 0 && l >= 0 && l < f.size())
        {
            a((h)f.get(l));
        }
    }

    public void onGlobalLayout()
    {
        if (!i)
        {
            h = (int)((float)d.getWidth() / 4.5F);
            i = true;
            d();
        }
    }
}
