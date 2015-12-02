// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles.onboarding;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.feature.profiles.onboarding:
//            Shape_OnBoardingIntroCard

public abstract class OnBoardingIntroCard
    implements Parcelable
{

    OnBoardingIntroCard()
    {
    }

    public static OnBoardingIntroCard a(String s, int i, int j)
    {
        return (new Shape_OnBoardingIntroCard()).a(s).b(i).a(j);
    }

    abstract int a();

    abstract OnBoardingIntroCard a(int i);

    abstract OnBoardingIntroCard a(String s);

    abstract OnBoardingIntroCard b(int i);

    abstract String b();

    abstract int c();
}
