// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.payment.view.OnSingleClickListener;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            ValuePropositionFragment

class this._cls0 extends OnSingleClickListener
{

    final ValuePropositionFragment this$0;

    public void onSingleClick(View view)
    {
        MessageBus.getBus().post(new com.walmartlabs.anivia.init>("mobilePayGetStarted"));
        ((llback)ValuePropositionFragment.access$100(ValuePropositionFragment.this)).onSetup();
    }

    llback()
    {
        this$0 = ValuePropositionFragment.this;
        super();
    }
}
