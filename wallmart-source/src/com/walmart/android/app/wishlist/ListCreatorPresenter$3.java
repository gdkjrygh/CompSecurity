// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ListCreatorPresenter, WishListUtils

class this._cls0 extends OnSingleClickListener
{

    final ListCreatorPresenter this$0;

    public void onSingleClick(View view)
    {
        if (ListCreatorPresenter.access$300(ListCreatorPresenter.this))
        {
            ListCreatorPresenter.access$400(ListCreatorPresenter.this);
        } else
        {
            WishListUtils.launchSignInActivity(ListCreatorPresenter.access$200(ListCreatorPresenter.this), 2);
        }
        MessageBus.getBus().post(new com.walmartlabs.anivia.er("editListTap"));
    }

    (Presenter presenter)
    {
        this$0 = ListCreatorPresenter.this;
        super(presenter);
    }
}
