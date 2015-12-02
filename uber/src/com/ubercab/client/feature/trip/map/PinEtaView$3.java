// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

// Referenced classes of package com.ubercab.client.feature.trip.map:
//            PinEtaView

final class a extends AnimatorListenerAdapter
{

    final PinEtaView a;

    public final void onAnimationStart(Animator animator)
    {
        a.mViewGroupPin.setVisibility(0);
    }

    (PinEtaView pinetaview)
    {
        a = pinetaview;
        super();
    }
}
