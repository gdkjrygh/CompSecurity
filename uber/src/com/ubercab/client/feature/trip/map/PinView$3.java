// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

// Referenced classes of package com.ubercab.client.feature.trip.map:
//            PinView

final class t> extends AnimatorListenerAdapter
{

    final PinView a;

    public final void onAnimationStart(Animator animator)
    {
        a.mViewGroupPin.setVisibility(0);
    }

    (PinView pinview)
    {
        a = pinview;
        super();
    }
}
