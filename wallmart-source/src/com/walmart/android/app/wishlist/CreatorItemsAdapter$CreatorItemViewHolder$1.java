// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.WishListManager;
import com.walmart.android.service.wishlist.models.ListItemModel;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.app.wishlist:
//            CreatorItemsAdapter, CreatorListItemModelState, QuantityEditorDialogFragment

class val.itemState
    implements android.view.torItemViewHolder._cls1
{

    final is._cls0 this$1;
    final CreatorListItemModelState val$itemState;

    public void onClick(final View itemId)
    {
        itemId = val$itemState.getItem().getUsItemId();
        Object obj = QuantityEditorDialogFragment.newInstance(val$itemState.getWantsQuantity(), 1, 20);
        ((QuantityEditorDialogFragment) (obj)).setOnNewQuantityListener(new QuantityEditorDialogFragment.OnNewQuantityListener() {

            final CreatorItemsAdapter.CreatorItemViewHolder._cls1 this$2;
            final String val$itemId;

            public void onNewQuantity(int i)
            {
                itemState.setWantsQuantity(i);
                mWants.setText(String.valueOf(i));
                Object obj1 = itemState.getItem();
                WishListManager.get().updateItemQuantities(((ListItemModel) (obj1)).getListId(), ((ListItemModel) (obj1)).getId(), i, ((ListItemModel) (obj1)).getHasQuantity(), new CallbackSameThread() {

                    final _cls1 this$3;

                    public void onResultSameThread(Request request, Result result)
                    {
                        super.onResultSameThread(request, result);
                    }

            
            {
                this$3 = _cls1.this;
                super();
            }
                });
                obj1 = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listWantsUpdate");
                if (!TextUtils.isEmpty(itemId))
                {
                    ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj1)).putString("itemId", itemId);
                }
                MessageBus.getBus().post(obj1);
            }

            
            {
                this$2 = CreatorItemsAdapter.CreatorItemViewHolder._cls1.this;
                itemId = s;
                super();
            }
        });
        ((QuantityEditorDialogFragment) (obj)).show(CreatorItemsAdapter.access$300(_fld0).getSupportFragmentManager(), "CreatorWantsQtyDialog");
        obj = new com.walmartlabs.anivia.wHolder.this._cls0("listWantsTap");
        if (!TextUtils.isEmpty(itemId))
        {
            ((com.walmartlabs.anivia.wHolder.this._cls0) (obj))._mth0("itemId", itemId);
        }
        MessageBus.getBus().post(obj);
    }

    _cls1.val.itemId()
    {
        this$1 = final_itemid;
        val$itemState = CreatorListItemModelState.this;
        super();
    }
}
