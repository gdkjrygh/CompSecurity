// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import android.view.View;
import com.walmart.android.service.wishlist.models.ReceiptModel;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ReceiptMatchPresenter, MatchedItemsAdapter

class this._cls0 extends CallbackSameThread
{

    final ReceiptMatchPresenter this$0;

    public void onResultSameThread(Request request, Result result)
    {
        ReceiptMatchPresenter.access$1002(ReceiptMatchPresenter.this, null);
        if (result.successful() && result.hasData())
        {
            ReceiptMatchPresenter.access$1100(ReceiptMatchPresenter.this).setVisibility(8);
            request = (ReceiptModel)result.getData();
            if (request.hasMatches())
            {
                ReceiptMatchPresenter.access$1200(ReceiptMatchPresenter.this).setVisibility(0);
                ReceiptMatchPresenter.access$1300(ReceiptMatchPresenter.this).setVisibility(8);
                ReceiptMatchPresenter.access$000(ReceiptMatchPresenter.this).setItems(request.getMatchedItems());
                return;
            } else
            {
                ReceiptMatchPresenter.access$1200(ReceiptMatchPresenter.this).setVisibility(8);
                ReceiptMatchPresenter.access$1300(ReceiptMatchPresenter.this).setVisibility(0);
                return;
            }
        } else
        {
            ReceiptMatchPresenter.access$1400(ReceiptMatchPresenter.this, 3);
            return;
        }
    }

    (Context context)
    {
        this$0 = ReceiptMatchPresenter.this;
        super(context);
    }
}
