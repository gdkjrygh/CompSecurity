// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.faresplit.master;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.faresplit.master:
//            FareSplitSummaryFragment

final class a extends DebouncingOnClickListener
{

    final FareSplitSummaryFragment a;
    final ite b;

    public final void doClick(View view)
    {
        a.onClickButtonInvite();
    }

    ( , FareSplitSummaryFragment faresplitsummaryfragment)
    {
        b = ;
        a = faresplitsummaryfragment;
        super();
    }
}
