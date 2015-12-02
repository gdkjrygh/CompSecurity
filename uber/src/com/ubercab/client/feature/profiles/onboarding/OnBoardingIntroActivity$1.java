// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.onboarding;

import com.ubercab.ui.PagerIndicator;

// Referenced classes of package com.ubercab.client.feature.profiles.onboarding:
//            OnBoardingIntroActivity

final class a
    implements android.support.v4.view.ener
{

    final OnBoardingIntroActivity a;

    public final void onPageScrollStateChanged(int i)
    {
        a.mPagerIndicator.onPageScrollStateChanged(i);
    }

    public final void onPageScrolled(int i, float f, int j)
    {
        a.mPagerIndicator.onPageScrolled(i, f, j);
    }

    public final void onPageSelected(int i)
    {
        a.mPagerIndicator.onPageSelected(i);
    }

    (OnBoardingIntroActivity onboardingintroactivity)
    {
        a = onboardingintroactivity;
        super();
    }
}
