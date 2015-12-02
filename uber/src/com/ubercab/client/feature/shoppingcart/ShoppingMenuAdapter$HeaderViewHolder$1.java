// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;

import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import dru;

final class a extends dru
{

    final Animation a;
    final hoppingMealInfo b;

    public final void onAnimationEnd(Animation animation)
    {
        b.atsLogo.setVisibility(8);
        b.hoppingMealInfo.startAnimation(a);
        b.hoppingMealInfo.setVisibility(0);
    }

    ( , Animation animation)
    {
        b = ;
        a = animation;
        super();
    }
}
