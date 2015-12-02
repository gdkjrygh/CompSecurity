// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            AddressFlowEditText

final class a extends AnimatorListenerAdapter
{

    final AddressFlowEditText a;

    public final void onAnimationEnd(Animator animator)
    {
        if (!AddressFlowEditText.i(a))
        {
            a.mClearButton.setVisibility(8);
        }
    }

    public final void onAnimationStart(Animator animator)
    {
        if (AddressFlowEditText.i(a))
        {
            a.mClearButton.setVisibility(0);
        }
    }

    (AddressFlowEditText addressflowedittext)
    {
        a = addressflowedittext;
        super();
    }
}
