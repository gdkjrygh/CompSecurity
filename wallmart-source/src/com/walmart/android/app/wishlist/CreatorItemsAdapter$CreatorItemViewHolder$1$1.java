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

class val.itemId
    implements ener
{

    final val.itemId this$2;
    final String val$itemId;

    public void onNewQuantity(int i)
    {
        itemState.setWantsQuantity(i);
        ts.setText(String.valueOf(i));
        Object obj = itemState.getItem();
        WishListManager.get().updateItemQuantities(((ListItemModel) (obj)).getListId(), ((ListItemModel) (obj)).getId(), i, ((ListItemModel) (obj)).getHasQuantity(), new CallbackSameThread() {

            final CreatorItemsAdapter.CreatorItemViewHolder._cls1._cls1 this$3;

            public void onResultSameThread(Request request, Result result)
            {
                super.onResultSameThread(request, result);
            }

            
            {
                this$3 = CreatorItemsAdapter.CreatorItemViewHolder._cls1._cls1.this;
                super();
            }
        });
        obj = new com.walmartlabs.anivia.older._cls1._cls1("listWantsUpdate");
        if (!TextUtils.isEmpty(val$itemId))
        {
            ((com.walmartlabs.anivia.older._cls1._cls1.val.itemId) (obj)).itemId("itemId", val$itemId);
        }
        MessageBus.getBus().post(obj);
    }

    l.itemState()
    {
        this$2 = final_itemstate;
        val$itemId = String.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/wishlist/CreatorItemsAdapter$CreatorItemViewHolder$1

/* anonymous class */
    class CreatorItemsAdapter.CreatorItemViewHolder._cls1
        implements android.view.View.OnClickListener
    {

        final CreatorItemsAdapter.CreatorItemViewHolder this$1;
        final CreatorListItemModelState val$itemState;

        public void onClick(View view)
        {
            view = itemState.getItem().getUsItemId();
            Object obj = QuantityEditorDialogFragment.newInstance(itemState.getWantsQuantity(), 1, 20);
            ((QuantityEditorDialogFragment) (obj)).setOnNewQuantityListener(view. new CreatorItemsAdapter.CreatorItemViewHolder._cls1._cls1());
            ((QuantityEditorDialogFragment) (obj)).show(CreatorItemsAdapter.access$300(this$0).getSupportFragmentManager(), "CreatorWantsQtyDialog");
            obj = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("listWantsTap");
            if (!TextUtils.isEmpty(view))
            {
                ((com.walmartlabs.anivia.AniviaEventAsJson.Builder) (obj)).putString("itemId", view);
            }
            MessageBus.getBus().post(obj);
        }

            
            {
                this$1 = final_creatoritemviewholder;
                itemState = CreatorListItemModelState.this;
                super();
            }
    }

}
