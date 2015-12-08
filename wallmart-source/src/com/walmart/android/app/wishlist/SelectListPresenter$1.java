// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;
import com.walmart.android.service.wishlist.CancelableCallback;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.Result;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.wishlist:
//            SelectListPresenter

class  extends CancelableCallback
{

    final SelectListPresenter this$0;

    public void onCancel()
    {
        SelectListPresenter.access$002(SelectListPresenter.this, null);
        mProgressView.setVisibility(8);
    }

    public void onResult(Result result)
    {
        SelectListPresenter.access$002(SelectListPresenter.this, null);
        if (result.successful() && result.hasData())
        {
            mWishLists.add(result.getData());
            result = ((WishList)result.getData()).id;
            SelectListPresenter.access$100(SelectListPresenter.this, result);
            return;
        } else
        {
            mProgressView.setVisibility(8);
            DialogFactory.showDialog(250, mActivity);
            return;
        }
    }

    ()
    {
        this$0 = SelectListPresenter.this;
        super();
    }
}
