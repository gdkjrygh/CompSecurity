// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.astuetz;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package com.astuetz:
//            PagerSlidingTabStrip

private class <init>
    implements android.support.v4.view.
{

    final PagerSlidingTabStrip this$0;

    public void onPageScrollStateChanged(int i)
    {
        if (i == 0)
        {
            PagerSlidingTabStrip.access$300(PagerSlidingTabStrip.this, PagerSlidingTabStrip.access$200(PagerSlidingTabStrip.this).getCurrentItem(), 0);
        }
        if (delegatePageListener != null)
        {
            delegatePageListener.ageScrollStateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int j)
    {
        PagerSlidingTabStrip.access$102(PagerSlidingTabStrip.this, i);
        PagerSlidingTabStrip.access$402(PagerSlidingTabStrip.this, f);
        PagerSlidingTabStrip.access$300(PagerSlidingTabStrip.this, i, (int)((float)PagerSlidingTabStrip.access$500(PagerSlidingTabStrip.this).getChildAt(i).getWidth() * f));
        invalidate();
        if (delegatePageListener != null)
        {
            delegatePageListener.ageScrolled(i, f, j);
        }
    }

    public void onPageSelected(int i)
    {
        if (delegatePageListener != null)
        {
            delegatePageListener.ageSelected(i);
        }
    }

    private Listener()
    {
        this$0 = PagerSlidingTabStrip.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
