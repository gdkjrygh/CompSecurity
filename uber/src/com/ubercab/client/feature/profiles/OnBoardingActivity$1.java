// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.content.DialogInterface;
import com.ubercab.rider.realtime.model.Profile;

// Referenced classes of package com.ubercab.client.feature.profiles:
//            OnBoardingActivity

final class a
    implements android.content.missListener
{

    final Profile a;
    final OnBoardingActivity b;

    public final void onDismiss(DialogInterface dialoginterface)
    {
        OnBoardingActivity.a(b, a);
    }

    (OnBoardingActivity onboardingactivity, Profile profile)
    {
        b = onboardingactivity;
        a = profile;
        super();
    }
}
