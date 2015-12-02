// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

// Referenced classes of package com.ubercab.client.feature.trip:
//            TripActivity

final class a
    implements android.view.animation.tionListener
{

    final TripActivity a;

    public final void onAnimationEnd(Animation animation)
    {
        TripActivity.a(a, true);
        TripActivity.b(a, false);
        a.mDrawerProfileFooter.setVisibility(0);
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        TripActivity.b(a, true);
        a.mDrawerProfileFooter.startAnimation(TripActivity.c(a, true));
        a.mHeaderExpandIcon.startAnimation(TripActivity.d(a, true));
    }

    ner(TripActivity tripactivity)
    {
        a = tripactivity;
        super();
    }
}
