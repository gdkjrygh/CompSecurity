// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.fragments;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.walmart.android.fragments:
//            OnboardingFragment

class val.viewPager
    implements android.view.ardingFragment._cls1
{

    final OnboardingFragment this$0;
    final ViewPager val$viewPager;

    public void onClick(View view)
    {
        val$viewPager.setCurrentItem(val$viewPager.getCurrentItem() + 1, true);
    }

    ()
    {
        this$0 = final_onboardingfragment;
        val$viewPager = ViewPager.this;
        super();
    }
}
