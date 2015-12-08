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

class ate
    implements Runnable
{

    final CreatorItemsAdapter this$0;
    final CreatorListItemModelState val$itemModelState;

    public void run()
    {
        CreatorItemsAdapter.access$000(CreatorItemsAdapter.this).remove(val$itemModelState);
        CreatorItemsAdapter.access$100(CreatorItemsAdapter.this, val$itemModelState);
        ListItemModel listitemmodel = val$itemModelState.getItem();
        WishListManager.get().deleteItem(listitemmodel.getListId(), listitemmodel.getId(), new CallbackSameThread() {

            final CreatorItemsAdapter._cls2 this$1;

            public void onResultSameThread(Request request, Result result)
            {
                super.onResultSameThread(request, result);
            }

            
            {
                this$1 = CreatorItemsAdapter._cls2.this;
                super();
            }
        });
        CreatorItemsAdapter.access$200(CreatorItemsAdapter.this, listitemmodel);
    }

    ate()
    {
        this$0 = final_creatoritemsadapter;
        val$itemModelState = CreatorListItemModelState.this;
        super();
    }
}
