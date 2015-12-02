// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.whatsapp:
//            PagerSlidingTabStrip, ak7

class us
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{

    final PagerSlidingTabStrip a;

    private us(PagerSlidingTabStrip pagerslidingtabstrip)
    {
        a = pagerslidingtabstrip;
        super();
    }

    us(PagerSlidingTabStrip pagerslidingtabstrip, ak7 ak7)
    {
        this(pagerslidingtabstrip);
    }

    public void onPageScrollStateChanged(int i)
    {
        if (i == 0)
        {
            PagerSlidingTabStrip.a(a, PagerSlidingTabStrip.c(a).getCurrentItem(), 0);
        }
        if (a.y != null)
        {
            a.y.onPageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int j)
    {
        PagerSlidingTabStrip.a(a, i);
        PagerSlidingTabStrip.a(a, f);
        PagerSlidingTabStrip.a(a, i, (int)((float)PagerSlidingTabStrip.a(a).getChildAt(i).getWidth() * f));
        a.invalidate();
        if (a.y != null)
        {
            a.y.onPageScrolled(i, f, j);
        }
    }

    public void onPageSelected(int i)
    {
        if (a.y != null)
        {
            a.y.onPageSelected(i);
        }
    }
}
