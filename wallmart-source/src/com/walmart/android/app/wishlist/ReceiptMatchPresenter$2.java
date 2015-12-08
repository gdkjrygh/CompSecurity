// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ReceiptMatchPresenter

class this._cls0
    implements lectionChangedListener
{

    final ReceiptMatchPresenter this$0;

    public void onSelectionChanged(boolean flag)
    {
        if (flag)
        {
            ReceiptMatchPresenter.access$700(ReceiptMatchPresenter.this).animate().translationY(0.0F).setDuration(300L).start();
            return;
        } else
        {
            ReceiptMatchPresenter.access$700(ReceiptMatchPresenter.this).animate().translationY(ReceiptMatchPresenter.access$700(ReceiptMatchPresenter.this).getHeight()).setDuration(300L).start();
            return;
        }
    }

    lectionChangedListener()
    {
        this$0 = ReceiptMatchPresenter.this;
        super();
    }
}
