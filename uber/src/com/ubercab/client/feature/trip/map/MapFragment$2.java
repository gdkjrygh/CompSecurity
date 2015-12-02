// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.map;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageButton;

// Referenced classes of package com.ubercab.client.feature.trip.map:
//            MapFragment

final class a extends AnimatorListenerAdapter
{

    final MapFragment a;

    public final void onAnimationEnd(Animator animator)
    {
        if (a.mButtonMyLocation != null)
        {
            a.mButtonMyLocation.setVisibility(8);
        }
    }

    (MapFragment mapfragment)
    {
        a = mapfragment;
        super();
    }
}
