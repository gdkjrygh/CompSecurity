// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.walmart.android.data.ReviewFeedbackResult;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.item:
//            ItemReviewDetailsPresenter

class val.inappropriate extends CallbackSameThread
{

    final ItemReviewDetailsPresenter this$0;
    final TextView val$inappropriate;

    public void onResultSameThread(Request request, Result result)
    {
        super.onResultSameThread(request, result);
        ItemReviewDetailsPresenter.access$200(ItemReviewDetailsPresenter.this).remove(request);
        if (result.successful() && result.hasData() && !((ReviewFeedbackResult)result.getData()).hasErrors)
        {
            ViewUtil.findViewById(ItemReviewDetailsPresenter.access$400(ItemReviewDetailsPresenter.this), 0x7f100557).setVisibility(0);
            return;
        } else
        {
            val$inappropriate.setEnabled(true);
            val$inappropriate.setTextColor(ItemReviewDetailsPresenter.access$500(ItemReviewDetailsPresenter.this).getResources().getColor(0x7f0f0063));
            return;
        }
    }

    (TextView textview)
    {
        this$0 = final_itemreviewdetailspresenter;
        val$inappropriate = textview;
        super(Context.this);
    }
}
