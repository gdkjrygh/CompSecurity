// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.support.v4.view.ViewPager;
import android.view.ViewTreeObserver;

// Referenced classes of package com.whatsapp:
//            PagerSlidingTabStrip, App

class ak7
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final PagerSlidingTabStrip a;

    ak7(PagerSlidingTabStrip pagerslidingtabstrip)
    {
        a = pagerslidingtabstrip;
        super();
    }

    public void onGlobalLayout()
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT < 16)
            {
                a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
        PagerSlidingTabStrip.a(a, PagerSlidingTabStrip.c(a).getCurrentItem());
        PagerSlidingTabStrip.a(a, PagerSlidingTabStrip.b(a), 0);
    }
}
