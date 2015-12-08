// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.models.ListItemModel;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseItemViewHolder, BaseListItemModelState, AddToCartController

class this._cls0
    implements android.view.aseItemViewHolder._cls2
{

    final BaseItemViewHolder this$0;

    public void onClick(View view)
    {
        if (mItemState != null && !mItemState.isInCartState())
        {
            mAddToCartController.openQuickAdd(BaseItemViewHolder.this, mItemState);
            MessageBus.getBus().post((new com.walmartlabs.anivia.lder("listCartTap")).putString("itemId", mItemState.getItem().getUsItemId()));
        }
    }

    del()
    {
        this$0 = BaseItemViewHolder.this;
        super();
    }
}
