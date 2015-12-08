// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.widget.TextView;
import com.walmart.android.data.ReviewFeedbackResult;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.item:
//            ItemReviewDetailsPresenter

class val.isClickedSelected extends CallbackSameThread
{

    final ItemReviewDetailsPresenter this$0;
    final TextView val$clickedVoteView;
    final TextView val$helpful;
    final boolean val$isClickedSelected;
    final boolean val$isNotClickedEnabled;
    final boolean val$isNotClickedSelected;
    final boolean val$isUndo;
    final TextView val$notClickedVoteView;

    private void onFail()
    {
        val$clickedVoteView.setEnabled(true);
        val$notClickedVoteView.setEnabled(val$isNotClickedEnabled);
        if (val$isNotClickedSelected)
        {
            val$notClickedVoteView.setSelected(true);
            return;
        } else
        {
            val$clickedVoteView.setSelected(val$isClickedSelected);
            return;
        }
    }

    public void onResultSameThread(Request request, Result result)
    {
        super.onResultSameThread(request, result);
        ItemReviewDetailsPresenter.access$200(ItemReviewDetailsPresenter.this).remove(request);
        if (result.successful() && result.hasData() && !((ReviewFeedbackResult)result.getData()).hasErrors)
        {
            request = ItemReviewDetailsPresenter.this;
            result = val$clickedVoteView;
            TextView textview = val$notClickedVoteView;
            boolean flag;
            if (val$helpful == val$clickedVoteView)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ItemReviewDetailsPresenter.access$300(request, result, textview, flag, val$isUndo);
            return;
        } else
        {
            onFail();
            return;
        }
    }

    (boolean flag3)
    {
        this$0 = final_itemreviewdetailspresenter;
        val$clickedVoteView = textview;
        val$notClickedVoteView = textview1;
        val$helpful = textview2;
        val$isUndo = flag;
        val$isNotClickedEnabled = flag1;
        val$isNotClickedSelected = Z.this;
        val$isClickedSelected = flag3;
        super(final_context);
    }
}
