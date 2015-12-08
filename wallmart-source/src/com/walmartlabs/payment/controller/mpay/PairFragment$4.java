// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.content.DialogInterface;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            PairFragment

class this._cls0
    implements android.content..OnDismissListener
{

    final PairFragment this$0;

    public void onDismiss(DialogInterface dialoginterface)
    {
        ((llbacks)PairFragment.access$600(PairFragment.this)).onPairingError();
    }

    llbacks()
    {
        this$0 = PairFragment.this;
        super();
    }
}
