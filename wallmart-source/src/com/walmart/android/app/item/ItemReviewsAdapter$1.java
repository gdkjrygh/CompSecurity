// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import com.walmart.android.data.ReviewResult;
import com.walmart.android.service.review.ItemReviewService;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;
import java.util.List;

// Referenced classes of package com.walmart.android.app.item:
//            ItemReviewsAdapter

class oader extends com.walmartlabs.ui.recycler.Loader
{

    final ItemReviewsAdapter this$0;

    public void loadMore(int i)
    {
        int j = Math.min(ItemReviewsAdapter.access$000(ItemReviewsAdapter.this) - i, 50);
        WLog.d(ItemReviewsAdapter.access$100(), (new StringBuilder()).append("requesting ").append(j).append(" reviews from offset ").append(i).toString());
        ItemReviewsAdapter.access$202(ItemReviewsAdapter.this, Services.get().getItemReviewService().getReviewsForItem(ItemReviewsAdapter.access$700(ItemReviewsAdapter.this), ItemReviewsAdapter.access$800(ItemReviewsAdapter.this), i, j).addCallback(new CallbackSameThread(ItemReviewsAdapter.access$300(ItemReviewsAdapter.this)) {

            final ItemReviewsAdapter._cls1 this$1;

            private List validateAndGetReviews(Result result)
            {
                if (result.successful() && result.hasData())
                {
                    return ((ReviewResult)result.getData()).results;
                } else
                {
                    return null;
                }
            }

            public void onResultSameThread(Request request, Result result)
            {
                boolean flag = true;
                super.onResultSameThread(request, result);
                ItemReviewsAdapter.access$202(this$0, null);
                request = validateAndGetReviews(result);
                if (request != null)
                {
                    WLog.d(ItemReviewsAdapter.access$100(), (new StringBuilder()).append("Got ").append(request.size()).append(" more reviews").toString());
                    result = ItemReviewsAdapter._cls1.this;
                    if (request.size() == 0 || getDataItemCount() + request.size() >= ItemReviewsAdapter.access$000(this$0))
                    {
                        flag = false;
                    }
                    result.notifyBatchLoaded(request, flag);
                    return;
                }
                if (ItemReviewsAdapter.access$500(this$0) != null)
                {
                    ItemReviewsAdapter.access$500(this$0).onFailedToLoad(result.getError());
                }
                ItemReviewsAdapter._cls1 _lcls1 = ItemReviewsAdapter._cls1.this;
                StringBuilder stringbuilder = (new StringBuilder()).append("Error: ");
                if (result.hasError())
                {
                    request = result.getError();
                } else
                {
                    request = "unknown";
                }
                _lcls1.notifyLoadFailed(stringbuilder.append(request).toString(), true);
            }

            
            {
                this$1 = ItemReviewsAdapter._cls1.this;
                super(context);
            }
        }));
    }

    public void reset()
    {
        super.reset();
        if (ItemReviewsAdapter.access$200(ItemReviewsAdapter.this) != null)
        {
            ItemReviewsAdapter.access$200(ItemReviewsAdapter.this).cancel();
            ItemReviewsAdapter.access$202(ItemReviewsAdapter.this, null);
        }
    }



    ()
    {
        this$0 = ItemReviewsAdapter.this;
        super();
    }
}
