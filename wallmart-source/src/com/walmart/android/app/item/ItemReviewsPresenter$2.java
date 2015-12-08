// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.app.item:
//            ItemReviewsPresenter

class this._cls0
    implements android.content.Listener
{

    final ItemReviewsPresenter this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ItemReviewsPresenter.access$100(ItemReviewsPresenter.this).removeDialog(3);
    }

    _cls9()
    {
        this$0 = ItemReviewsPresenter.this;
        super();
    }
}
