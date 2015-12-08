// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseItemViewHolder, BaseListItemModelState, AddToCartController

class this._cls0
    implements android.view.aseItemViewHolder._cls3
{

    final BaseItemViewHolder this$0;

    public void onClick(View view)
    {
        if (mItemState != null && mItemState.isInCartState())
        {
            mAddToCartController.closeQuickAdd();
        }
    }

    e()
    {
        this$0 = BaseItemViewHolder.this;
        super();
    }
}
