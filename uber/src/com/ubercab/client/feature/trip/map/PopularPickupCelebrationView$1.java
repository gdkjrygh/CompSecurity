// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.ubercab.client.feature.trip.map:
//            PopularPickupCelebrationView

class a extends AnimatorListenerAdapter
{

    final PopularPickupCelebrationView a;

    public void onAnimationCancel(Animator animator)
    {
        for (animator = PopularPickupCelebrationView.a(a).iterator(); animator.hasNext(); ((stener)animator.next()).f()) { }
    }

    public void onAnimationEnd(Animator animator)
    {
        for (animator = PopularPickupCelebrationView.a(a).iterator(); animator.hasNext(); ((stener)animator.next()).f()) { }
    }

    public void onAnimationStart(Animator animator)
    {
        for (animator = PopularPickupCelebrationView.a(a).iterator(); animator.hasNext(); ((stener)animator.next()).e()) { }
    }

    stener(PopularPickupCelebrationView popularpickupcelebrationview)
    {
        a = popularpickupcelebrationview;
        super();
    }
}
