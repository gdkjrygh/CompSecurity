// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.walmart.android.app.item:
//            ItemReviewDetailsPresenter

class val.notHelpful
    implements android.view.ailsPresenter._cls1
{

    final ItemReviewDetailsPresenter this$0;
    final TextView val$helpful;
    final TextView val$notHelpful;

    public void onClick(View view)
    {
        ItemReviewDetailsPresenter.access$000(ItemReviewDetailsPresenter.this, view, val$helpful, val$notHelpful);
    }

    ()
    {
        this$0 = final_itemreviewdetailspresenter;
        val$helpful = textview;
        val$notHelpful = TextView.this;
        super();
    }
}
