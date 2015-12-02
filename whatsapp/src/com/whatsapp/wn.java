// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            afn, App, _p, ak3

class wn extends PagerAdapter
{

    final afn a;

    private wn(afn afn1)
    {
        a = afn1;
        super();
    }

    wn(afn afn1, ak3 ak3)
    {
        this(afn1);
    }

    public void destroyItem(View view, int i, Object obj)
    {
        ((ViewPager)view).removeView((View)obj);
    }

    public int getCount()
    {
        return afn.f(a).length;
    }

    public Object instantiateItem(View view, int i)
    {
        View view1 = afn.e(a).inflate(0x7f030062, null);
        ListView listview = (ListView)view1.findViewById(0x102000a);
        int j = i;
        if (!App.aR())
        {
            j = afn.f(a).length - 1 - i;
        }
        if (afn.f(a)[j] == null)
        {
            afn.f(a)[j] = new _p(a, afn.b(a), j);
        }
        listview.setAdapter(afn.f(a)[j]);
        listview.setEmptyView(view1.findViewById(0x1020004));
        ((ViewPager)view).addView(view1, 0);
        return view1;
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }
}
