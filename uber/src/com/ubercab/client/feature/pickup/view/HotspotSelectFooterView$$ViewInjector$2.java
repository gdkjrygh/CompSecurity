// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.view;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.ubercab.client.feature.pickup.view:
//            HotspotSelectFooterView

final class a extends DebouncingOnClickListener
{

    final HotspotSelectFooterView a;
    final nClick b;

    public final void doClick(View view)
    {
        a.onOptOutCtaButtonClick();
    }

    ( , HotspotSelectFooterView hotspotselectfooterview)
    {
        b = ;
        a = hotspotselectfooterview;
        super();
    }
}
