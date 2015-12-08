// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.DialogInterface;
import com.walmart.android.app.item.ShopSortManager;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfPresenter

class this._cls0
    implements android.content.nClickListener
{

    final ShelfPresenter this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        mSortManager.setSelectedOption(i);
        ShelfPresenter.access$100(ShelfPresenter.this, 1);
    }

    r()
    {
        this$0 = ShelfPresenter.this;
        super();
    }
}
