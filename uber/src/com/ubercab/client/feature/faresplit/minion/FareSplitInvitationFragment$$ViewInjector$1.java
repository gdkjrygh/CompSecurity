// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.faresplit.minion;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.faresplit.minion:
//            FareSplitInvitationFragment

final class a extends DebouncingOnClickListener
{

    final FareSplitInvitationFragment a;
    final icked b;

    public final void doClick(View view)
    {
        a.onButtonAcceptClicked();
    }

    ( , FareSplitInvitationFragment faresplitinvitationfragment)
    {
        b = ;
        a = faresplitinvitationfragment;
        super();
    }
}
