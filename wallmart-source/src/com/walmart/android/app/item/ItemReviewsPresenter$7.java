// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.walmart.android.wmui.ScrollDirectionListener;

// Referenced classes of package com.walmart.android.app.item:
//            ItemReviewsPresenter

class it> extends ScrollDirectionListener
{

    final ItemReviewsPresenter this$0;
    final int val$offset;

    public void onScrollDirectionChanged(int i)
    {
        if (!ItemReviewsPresenter.access$900(ItemReviewsPresenter.this))
        {
            return;
        }
        float f1;
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            float f = ItemReviewsPresenter.access$1000(ItemReviewsPresenter.this).getHeight();
            ItemReviewsPresenter.access$1100(ItemReviewsPresenter.this).animate().y(f);
            return;

        case 1: // '\001'
            f1 = ItemReviewsPresenter.access$1000(ItemReviewsPresenter.this).getHeight() - val$offset;
            break;
        }
        ItemReviewsPresenter.access$1100(ItemReviewsPresenter.this).animate().y(f1);
    }

    _cls9(int i)
    {
        this$0 = final_itemreviewspresenter;
        val$offset = i;
        super(Context.this);
    }
}
