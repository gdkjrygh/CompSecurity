// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.view.View;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.ui.OnSingleClickListener;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseLandingPagePresenter

class val.list extends OnSingleClickListener
{

    final BaseLandingPagePresenter this$0;
    final WishList val$list;

    public void onSingleClick(View view)
    {
        handleListSelectedAction(val$list.id);
        view = (new com.walmartlabs.anivia.init>("existingListTap")).utString("tapLocation", getPageName());
        MessageBus.getBus().post(view);
    }

    A(WishList wishlist)
    {
        this$0 = final_baselandingpagepresenter;
        val$list = wishlist;
        super(Presenter.this);
    }
}
