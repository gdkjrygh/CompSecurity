// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.view;

import android.view.View;

// Referenced classes of package com.walmartlabs.payment.view:
//            SlidingUpPanelLayout

class this._cls0
    implements android.view.UpPanelLayout._cls1
{

    final SlidingUpPanelLayout this$0;

    public void onClick(View view)
    {
        if (!isEnabled() || !isTouchEnabled())
        {
            return;
        }
        if (SlidingUpPanelLayout.access$100(SlidingUpPanelLayout.this) != nelState.EXPANDED && SlidingUpPanelLayout.access$100(SlidingUpPanelLayout.this) != nelState.ANCHORED)
        {
            if (SlidingUpPanelLayout.access$200(SlidingUpPanelLayout.this) < 1.0F)
            {
                setPanelState(nelState.ANCHORED);
                return;
            } else
            {
                setPanelState(nelState.EXPANDED);
                return;
            }
        } else
        {
            setPanelState(nelState.COLLAPSED);
            return;
        }
    }

    nelState()
    {
        this$0 = SlidingUpPanelLayout.this;
        super();
    }
}
