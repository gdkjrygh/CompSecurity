// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.slider;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.trip.slider:
//            PanelRateCardView

final class a extends DebouncingOnClickListener
{

    final PanelRateCardView a;
    final reClick b;

    public final void doClick(View view)
    {
        a.onViewGroupMinFareClick();
    }

    ( , PanelRateCardView panelratecardview)
    {
        b = ;
        a = panelratecardview;
        super();
    }
}
