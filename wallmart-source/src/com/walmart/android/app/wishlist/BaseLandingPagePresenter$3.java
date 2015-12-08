// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import com.walmart.android.service.wishlist.CancelableCallback;
import com.walmart.android.service.wishlist.WishListResults;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.Result;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseLandingPagePresenter

class t> extends CancelableCallback
{

    final BaseLandingPagePresenter this$0;

    public void onCancel()
    {
        BaseLandingPagePresenter.access$302(BaseLandingPagePresenter.this, null);
        mWishLists.clear();
        BaseLandingPagePresenter.access$400(BaseLandingPagePresenter.this, mWishLists);
    }

    public void onResult(Result result)
    {
        BaseLandingPagePresenter.access$302(BaseLandingPagePresenter.this, null);
        mWishLists.clear();
        if (result.successful() && result.hasData())
        {
            if (((WishListResults)result.getData()).searchResults != null)
            {
                mWishLists.addAll(Arrays.asList(((WishListResults)result.getData()).searchResults));
            }
        } else
        {
            DialogFactory.showDialog(900, mActivity);
        }
        BaseLandingPagePresenter.access$400(BaseLandingPagePresenter.this, mWishLists);
    }

    A(Context context)
    {
        this$0 = BaseLandingPagePresenter.this;
        super(context);
    }
}
