// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;
import com.walmart.android.service.wishlist.CancelableCallback;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.app.wishlist:
//            LandingPagePresenter, ListCreatorActivity

class <init> extends CancelableCallback
{

    final LandingPagePresenter this$0;

    protected void onCancel()
    {
        LandingPagePresenter.access$002(LandingPagePresenter.this, null);
        mProgressView.setVisibility(8);
    }

    protected void onResult(Result result)
    {
        LandingPagePresenter.access$002(LandingPagePresenter.this, null);
        mProgressView.setVisibility(8);
        if (result.successful() && result.hasData())
        {
            result = ((WishList)result.getData()).id;
            ListCreatorActivity.launch(mActivity, result);
            return;
        } else
        {
            DialogFactory.showDialog(250, mActivity);
            return;
        }
    }

    ()
    {
        this$0 = LandingPagePresenter.this;
        super();
    }
}
