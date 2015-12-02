// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ListView;

// Referenced classes of package com.ubercab.client.feature.trip:
//            TripActivity

final class a
    implements android.view.animation.tionListener
{

    final boolean a;
    final TripActivity b;

    public final void onAnimationEnd(Animation animation)
    {
        TripActivity.a(b, false);
        TripActivity.b(b, false);
        b.mListViewDrawerProfilesList.setVisibility(8);
        b.mDrawerProfileFooter.setVisibility(8);
        if (a)
        {
            b.mDrawerLayout.closeDrawers();
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
        TripActivity.b(b, true);
        b.mDrawerProfileFooter.setVisibility(0);
        b.mDrawerProfileFooter.startAnimation(TripActivity.c(b, false));
        b.mHeaderExpandIcon.startAnimation(TripActivity.d(b, false));
    }

    ner(TripActivity tripactivity, boolean flag)
    {
        b = tripactivity;
        a = flag;
        super();
    }
}
