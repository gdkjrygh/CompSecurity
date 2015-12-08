// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.text.TextUtils;
import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.app.cart.CartUtils;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.models.ListItemModel;
import com.walmart.android.wmui.NumberPicker;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseItemViewHolder, BaseListItemModelState, ItemAdapterCallback, AddToCartController

class this._cls0
    implements android.view.aseItemViewHolder._cls5
{

    final BaseItemViewHolder this$0;

    public void onClick(View view)
    {
        if (mItemState != null && mItemState.isInCartState())
        {
            mItemState.setIsAddToCartInProgress(true);
            mCartIcon.setVisibility(8);
            mCartProgress.setVisibility(0);
            int i = mQuickAddCartQtyEditor.getCurrent();
            if (mCallback != null)
            {
                Object obj = mItemState.getItem();
                mCallback.addToCart(((ListItemModel) (obj)), i);
                String s = ((ListItemModel) (obj)).getUsItemId();
                view = ((ListItemModel) (obj)).getPrice();
                if (TextUtils.isEmpty(view))
                {
                    view = "";
                } else
                {
                    view = CartUtils.formatPriceForAnalytics(view);
                }
                obj = BaseItemViewHolder.access$000(BaseItemViewHolder.this, ((ListItemModel) (obj)));
                view = (new com.walmartlabs.anivia.lder("addToCart")).putString("itemId", s).putString("itemPrice", view).putString("prodType", ((String) (obj))).putString("unitCount", String.valueOf(i));
                MessageBus.getBus().post(view);
            }
            mAddToCartController.closeQuickAdd();
        }
    }

    del()
    {
        this$0 = BaseItemViewHolder.this;
        super();
    }
}
