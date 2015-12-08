// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ReceiptMatchPresenter

class this._cls0
    implements android.view.iptMatchPresenter._cls3
{

    final ReceiptMatchPresenter this$0;

    public void onClick(View view)
    {
        ReceiptMatchPresenter.access$600(ReceiptMatchPresenter.this).startReceiptScanner();
        ReceiptMatchPresenter.access$800(ReceiptMatchPresenter.this);
    }

    dateListener()
    {
        this$0 = ReceiptMatchPresenter.this;
        super();
    }
}
