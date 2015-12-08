// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.content.Context;
import com.walmart.android.service.wishlist.CancelableCallback;
import com.walmart.android.service.wishlist.WishListResults;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.utils.WLog;
import java.util.Arrays;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ListCreatorPresenter

class init> extends CancelableCallback
{

    final ListCreatorPresenter this$0;

    protected void onCancel()
    {
        WLog.d(ListCreatorPresenter.access$1300(), "reloadAvailableLists().onCancel");
        ListCreatorPresenter.access$2802(ListCreatorPresenter.this, null);
    }

    public void onResult(Result result)
    {
        WLog.d(ListCreatorPresenter.access$1300(), "reloadAvailableLists().onResult");
        ListCreatorPresenter.access$2802(ListCreatorPresenter.this, null);
        if (result.successful() && result.hasData() && ((WishListResults)result.getData()).searchResults != null)
        {
            ListCreatorPresenter.access$2902(ListCreatorPresenter.this, Arrays.asList(((WishListResults)result.getData()).searchResults));
            ListCreatorPresenter.access$500(ListCreatorPresenter.this).setModel(ListCreatorPresenter.access$2900(ListCreatorPresenter.this));
            if (ListCreatorPresenter.access$2100(ListCreatorPresenter.this))
            {
                ListCreatorPresenter.access$3000(ListCreatorPresenter.this, true);
            }
        }
    }

    tsAdapter(Context context)
    {
        this$0 = ListCreatorPresenter.this;
        super(context);
    }
}
