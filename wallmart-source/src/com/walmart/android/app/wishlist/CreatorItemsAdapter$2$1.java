// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import com.walmart.android.service.wishlist.WishListManager;
import com.walmart.android.service.wishlist.models.ListItemModel;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.app.wishlist:
//            CreatorItemsAdapter, CreatorListItemModelState

class this._cls1 extends CallbackSameThread
{

    final hread this$1;

    public void onResultSameThread(Request request, Result result)
    {
        super.onResultSameThread(request, result);
    }

    e()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/walmart/android/app/wishlist/CreatorItemsAdapter$2

/* anonymous class */
    class CreatorItemsAdapter._cls2
        implements Runnable
    {

        final CreatorItemsAdapter this$0;
        final CreatorListItemModelState val$itemModelState;

        public void run()
        {
            CreatorItemsAdapter.access$000(CreatorItemsAdapter.this).remove(itemModelState);
            CreatorItemsAdapter.access$100(CreatorItemsAdapter.this, itemModelState);
            ListItemModel listitemmodel = itemModelState.getItem();
            WishListManager.get().deleteItem(listitemmodel.getListId(), listitemmodel.getId(), new CreatorItemsAdapter._cls2._cls1());
            CreatorItemsAdapter.access$200(CreatorItemsAdapter.this, listitemmodel);
        }

            
            {
                this$0 = final_creatoritemsadapter;
                itemModelState = CreatorListItemModelState.this;
                super();
            }
    }

}
