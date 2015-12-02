// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.tray;

import android.animation.Animator;

// Referenced classes of package com.ubercab.client.feature.trip.tray:
//            DiscountProgressAnimView

final class a
    implements android.animation.ProgressAnimView._cls2
{

    final DiscountProgressAnimView a;

    public final void onAnimationCancel(Animator animator)
    {
        DiscountProgressAnimView.b(a);
        if (DiscountProgressAnimView.c(a))
        {
            a.c();
        }
    }

    public final void onAnimationEnd(Animator animator)
    {
        DiscountProgressAnimView.b(a);
        if (DiscountProgressAnimView.c(a))
        {
            a.c();
        }
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    (DiscountProgressAnimView discountprogressanimview)
    {
        a = discountprogressanimview;
        super();
    }
}
