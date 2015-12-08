// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.city;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.go.weatherex.city:
//            a, b

public class CityLinearLayout extends LinearLayout
    implements android.view.View.OnClickListener
{

    private LayoutInflater a;
    private android.widget.LinearLayout.LayoutParams b;
    private android.widget.LinearLayout.LayoutParams c;
    private View d;
    private ArrayList e;
    private SparseArray f;
    private b g;
    private boolean h;

    public CityLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new ArrayList();
        f = new SparseArray();
        a = LayoutInflater.from(getContext());
    }

    private View a(View view)
    {
        View view1 = new View(getContext());
        f.put(view.hashCode(), view1);
        return view1;
    }

    private View e()
    {
        return a.inflate(0x7f03004e, null, false);
    }

    private android.widget.LinearLayout.LayoutParams f()
    {
        Resources resources = getResources();
        int j = Math.min(resources.getDisplayMetrics().widthPixels, resources.getDisplayMetrics().heightPixels);
        int k = resources.getDimensionPixelOffset(0x7f0c01c0);
        int l = resources.getDimensionPixelOffset(0x7f0c01c2);
        int i1 = resources.getInteger(0x7f0b0006);
        return new android.widget.LinearLayout.LayoutParams((j - k * 2 - (i1 - 1) * l) / i1, -1);
    }

    private android.widget.LinearLayout.LayoutParams g()
    {
        return new android.widget.LinearLayout.LayoutParams(getResources().getDimensionPixelOffset(0x7f0c01c2), -1);
    }

    private boolean h()
    {
        return d() > 9;
    }

    private a i()
    {
        int j = e.size();
        if (j == 0)
        {
            return null;
        } else
        {
            return (a)e.get(j - 1);
        }
    }

    public a a(int j)
    {
        if (e.isEmpty())
        {
            return null;
        } else
        {
            return (a)e.get(j);
        }
    }

    public void a(a a1)
    {
        int j = getChildCount();
        addView(a1, j - 1, b);
        a1.setOnClickListener(this);
        e.add(a1);
        a1 = a(((View) (a1)));
        addView(a1, j, c);
        if (h())
        {
            a1.setVisibility(8);
            d.setVisibility(8);
            return;
        } else
        {
            a1.setVisibility(0);
            d.setVisibility(0);
            return;
        }
    }

    public void a(b b1)
    {
        g = b1;
    }

    public void a(boolean flag)
    {
        if (h == flag) goto _L2; else goto _L1
_L1:
        Object obj;
        h = flag;
        a a1 = i();
        obj = null;
        if (a1 != null)
        {
            obj = (View)f.get(a1.hashCode());
        }
        if (!h) goto _L4; else goto _L3
_L3:
        if (obj != null)
        {
            ((View) (obj)).setVisibility(8);
        }
        d.setVisibility(8);
_L5:
        for (obj = e.iterator(); ((Iterator) (obj)).hasNext(); ((a)((Iterator) (obj)).next()).a(h)) { }
        break; /* Loop/switch isn't completed */
_L4:
        if (!h())
        {
            if (obj != null)
            {
                ((View) (obj)).setVisibility(0);
            }
            d.setVisibility(0);
        }
        if (true) goto _L5; else goto _L2
_L2:
    }

    public boolean a()
    {
        return h;
    }

    public void b()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((a)iterator.next()).a()) { }
    }

    public void b(a a1)
    {
label0:
        {
            if (a1 != null)
            {
                e.remove(a1);
                removeView(a1);
                a1 = (View)f.get(a1.hashCode());
                if (a1 != null)
                {
                    removeView(a1);
                }
                if (h() || h)
                {
                    break label0;
                }
                d.setVisibility(0);
            }
            return;
        }
        d.setVisibility(8);
    }

    public ArrayList c()
    {
        return e;
    }

    public int d()
    {
        return e.size();
    }

    public void onClick(View view)
    {
        if (g != null)
        {
            g.a(view);
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = f();
        c = g();
        d = e();
        d.setOnClickListener(this);
        addView(d, b);
    }
}
