// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            StackedViewLayout

final class a extends AnimatorListenerAdapter
{

    final StackedViewLayout a;

    public final void onAnimationEnd(Animator animator)
    {
        StackedViewLayout.a(a);
    }

    A(StackedViewLayout stackedviewlayout)
    {
        a = stackedviewlayout;
        super();
    }
}
