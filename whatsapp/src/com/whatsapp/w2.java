// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

// Referenced classes of package com.whatsapp:
//            ContactPicker, App, ny, afx, 
//            y5, abx

class w2 extends PagerAdapter
{

    final ContactPicker a;

    private w2(ContactPicker contactpicker)
    {
        a = contactpicker;
        super();
    }

    w2(ContactPicker contactpicker, abx abx)
    {
        this(contactpicker);
    }

    public void destroyItem(View view, int i, Object obj)
    {
        ((ViewPager)view).removeView((View)obj);
    }

    public void finishUpdate(View view)
    {
    }

    public int getCount()
    {
        return !ContactPicker.x(a) && !ContactPicker.v(a) && !ContactPicker.k(a) ? 1 : 3;
    }

    public CharSequence getPageTitle(int i)
    {
        return "";
    }

    public Object instantiateItem(View view, int i)
    {
        View view1;
        ListView listview;
        int j;
label0:
        {
            j = App.am;
            view1 = a.getLayoutInflater().inflate(0x7f030037, null);
            listview = (ListView)view1.findViewById(0x102000a);
            listview.setFastScrollEnabled(true);
            listview.setScrollbarFadingEnabled(true);
            listview.setEmptyView(view1.findViewById(0x7f0b0137));
            listview.setTextFilterEnabled(true);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                listview.setFastScrollAlwaysVisible(true);
                listview.setScrollBarStyle(0x2000000);
                if (j == 0)
                {
                    break label0;
                }
            }
            listview.setSelector(0x7f02063d);
        }
        listview.setOnItemClickListener(new ny(this, listview));
        if (!ContactPicker.o(a) && !ContactPicker.w(a) && !ContactPicker.d(a) && !ContactPicker.x(a) && !ContactPicker.v(a) && !ContactPicker.k(a))
        {
            listview.setOnItemLongClickListener(new afx(this, listview));
        }
        y5 y5_1 = new y5(this);
        view1.findViewById(0x7f0b01db).setOnClickListener(y5_1);
        a.registerForContextMenu(listview);
        i;
        JVM INSTR tableswitch 0 2: default 240
    //                   0 260
    //                   1 361
    //                   2 378;
           goto _L1 _L2 _L3 _L4
_L1:
        listview.setTag(Integer.valueOf(i));
        ((ViewPager)view).addView(view1, 0);
        return view1;
_L2:
        if (ContactPicker.o(a) || ContactPicker.x(a) || ContactPicker.v(a) || ContactPicker.k(a))
        {
            listview.setAdapter(ContactPicker.y(a));
            if (j == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        if (ContactPicker.a(a))
        {
            listview.setAdapter(ContactPicker.n(a));
            if (j == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        listview.setAdapter(ContactPicker.j(a));
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        listview.setAdapter(ContactPicker.n(a));
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        listview.setAdapter(ContactPicker.j(a));
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean isViewFromObject(View view, Object obj)
    {
        return view == obj;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public Parcelable saveState()
    {
        return null;
    }

    public void startUpdate(View view)
    {
    }
}
