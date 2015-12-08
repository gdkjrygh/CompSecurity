// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            ah, af, ag

public class ad
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private Activity a;
    private View b;
    private ViewGroup c;
    private HorizontalScrollView d;
    private List e;
    private int f;
    private boolean g;
    private ag h;

    public ad(Activity activity, View view)
    {
        a = activity;
        b = view;
        c = (ViewGroup)a(0x7f090508);
        d = (HorizontalScrollView)a(0x7f0904f6);
        d.getViewTreeObserver().addOnGlobalLayoutListener(this);
        b();
        if (e.size() > 0)
        {
            ((ah)e.get(0)).d = true;
        }
    }

    static Activity a(ad ad1)
    {
        return ad1.a;
    }

    private View a(int i, int j)
    {
        ah ah1 = (ah)e.get(i);
        af af1 = new af(this, j);
        af1.a(ah1);
        return af1.a;
    }

    static void a(ad ad1, ah ah1)
    {
        ad1.a(ah1);
    }

    private void a(ah ah1)
    {
        Iterator iterator = e.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ah ah2 = (ah)iterator.next();
            if (!ah2.d)
            {
                continue;
            }
            ah2.d = false;
            break;
        } while (true);
        ah1.d = true;
        c();
        d(ah1.a);
    }

    private void b()
    {
        e = new ArrayList();
        ah ah1 = new ah(this, null);
        ah1.a = 0;
        ah1.d = false;
        ah1.b = 0x7f080474;
        ah1.c = 0x7f020440;
        e.add(ah1);
        ah1 = new ah(this, null);
        ah1.a = 5;
        ah1.d = false;
        ah1.b = 0x7f080479;
        ah1.c = 0x7f02043f;
        e.add(ah1);
        ah1 = new ah(this, null);
        ah1.a = 1;
        ah1.d = false;
        ah1.b = 0x7f080475;
        ah1.c = 0x7f02043b;
        e.add(ah1);
        ah1 = new ah(this, null);
        ah1.a = 2;
        ah1.d = false;
        ah1.b = 0x7f080476;
        ah1.c = 0x7f02043c;
        e.add(ah1);
        ah1 = new ah(this, null);
        ah1.a = 3;
        ah1.d = false;
        ah1.b = 0x7f080477;
        ah1.c = 0x7f02043d;
        e.add(ah1);
        ah1 = new ah(this, null);
        ah1.a = 4;
        ah1.d = false;
        ah1.b = 0x7f080478;
        ah1.c = 0x7f02043e;
        e.add(ah1);
    }

    private void c()
    {
        if (!g)
        {
            return;
        }
        int j = d.getScrollX();
        int k = d.getScrollY();
        c.removeAllViews();
        int l = e.size();
        for (int i = 0; i < l; i++)
        {
            View view = a(i, f);
            c.addView(view);
        }

        d.scrollTo(j, k);
    }

    private void d(int i)
    {
        if (h != null)
        {
            h.a(i);
        }
    }

    protected View a(int i)
    {
        return b.findViewById(i);
    }

    public void a()
    {
    }

    public void a(ag ag1)
    {
        h = ag1;
    }

    public void b(int i)
    {
        b.setVisibility(i);
    }

    public void c(int i)
    {
        if (e.size() > 0 && i >= 0 && i < e.size())
        {
            a((ah)e.get(i));
        }
    }

    public void onGlobalLayout()
    {
        if (!g)
        {
            f = (int)((float)d.getWidth() / 4.5F);
            g = true;
            c();
        }
    }
}
