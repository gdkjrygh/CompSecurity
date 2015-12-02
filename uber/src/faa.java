// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.ubercab.client.feature.profiles.onboarding.OnBoardingIntroCard;
import com.ubercab.client.feature.profiles.onboarding.OnBoardingIntroImageFragment;
import java.util.List;

public final class faa extends FragmentPagerAdapter
{

    private final List a;

    public faa(FragmentManager fragmentmanager, List list)
    {
        super(fragmentmanager);
        a = list;
    }

    private OnBoardingIntroImageFragment a(int i)
    {
        return OnBoardingIntroImageFragment.a((OnBoardingIntroCard)a.get(i));
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Fragment getItem(int i)
    {
        return a(i);
    }
}
