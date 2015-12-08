// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;
import android.widget.Toast;
import com.walmart.android.service.wishlist.CancelableCallback;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmart.android.app.wishlist:
//            SelectListPresenter, ListCreatorPresenter

class  extends CancelableCallback
{

    final SelectListPresenter this$0;
    final String val$listId;

    protected void onCancel()
    {
        SelectListPresenter.access$202(SelectListPresenter.this, null);
        mProgressView.setVisibility(8);
    }

    protected void onResult(Result result)
    {
        SelectListPresenter.access$202(SelectListPresenter.this, null);
        mProgressView.setVisibility(8);
        if (result.successful() && result.hasData())
        {
            result = new ListCreatorPresenter(mActivity, val$listId, mWishLists);
            SelectListPresenter.access$300(SelectListPresenter.this);
            SelectListPresenter.access$400(SelectListPresenter.this, result, false);
            Toast.makeText(mActivity, 0x7f090645, 0).show();
            return;
        } else
        {
            DialogFactory.showDialog(251, mActivity);
            return;
        }
    }

    ()
    {
        this$0 = final_selectlistpresenter;
        val$listId = String.this;
        super();
    }
}
