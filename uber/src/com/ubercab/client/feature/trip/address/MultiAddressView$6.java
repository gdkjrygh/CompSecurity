// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            MultiAddressView, AddressView

final class a extends AnimatorListenerAdapter
{

    final MultiAddressView a;

    public final void onAnimationEnd(Animator animator)
    {
        a.mAddressViewPickup.setVisibility(8);
        a.mAddressViewDestination.setTranslationY(0.0F);
        MultiAddressView.b(a);
    }

    (MultiAddressView multiaddressview)
    {
        a = multiaddressview;
        super();
    }
}
