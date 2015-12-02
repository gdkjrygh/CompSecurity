// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.whatsapp:
//            PagerSlidingTabStrip

class sj
    implements android.view.View.OnClickListener
{

    final int a;
    final PagerSlidingTabStrip b;

    sj(PagerSlidingTabStrip pagerslidingtabstrip, int i)
    {
        b = pagerslidingtabstrip;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        PagerSlidingTabStrip.c(b).setCurrentItem(a);
    }
}
