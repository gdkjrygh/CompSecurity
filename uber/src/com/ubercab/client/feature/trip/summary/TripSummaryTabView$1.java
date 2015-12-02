// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.summary;

import android.view.View;
import android.view.animation.Animation;
import com.ubercab.ui.TextView;
import dru;

// Referenced classes of package com.ubercab.client.feature.trip.summary:
//            TripSummaryTabView

final class b extends dru
{

    final String a;
    final boolean b;
    final TripSummaryTabView c;

    public final void onAnimationEnd(Animation animation)
    {
        c.mTabContent.setText(a);
        animation = c.mFooter;
        int i;
        if (b)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        animation.setVisibility(i);
        c.mContentContainer.startAnimation(TripSummaryTabView.a(c));
    }

    (TripSummaryTabView tripsummarytabview, String s, boolean flag)
    {
        c = tripsummarytabview;
        a = s;
        b = flag;
        super();
    }
}
