// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.ubercab.client.feature.trip.map:
//            PinView, ETACircleView

final class t> extends AnimatorListenerAdapter
{

    final View a;
    final PinView b;

    public final void onAnimationStart(Animator animator)
    {
        a.setClickable(true);
        b.mEtaCircleView.a(true);
    }

    iew(PinView pinview, View view)
    {
        b = pinview;
        a = view;
        super();
    }
}
