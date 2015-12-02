// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;

import android.animation.ValueAnimator;
import android.view.View;

final class a
    implements android.animation.ner
{

    final a a;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        android.view..HeaderViewHolder headerviewholder = a(a).getLayoutParams();
        headerviewholder.a = ((Integer)valueanimator.getAnimatedValue()).intValue();
        a(a).setLayoutParams(headerviewholder);
    }

    ( )
    {
        a = ;
        super();
    }
}
