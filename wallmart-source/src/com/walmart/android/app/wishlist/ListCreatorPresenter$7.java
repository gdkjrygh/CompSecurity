// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import com.walmart.android.service.wishlist.WishList;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ListCreatorPresenter

class this._cls0
    implements tUpdatedCallback
{

    final ListCreatorPresenter this$0;

    public void onListUpdated(WishList wishlist)
    {
        ListCreatorPresenter.access$1002(ListCreatorPresenter.this, wishlist);
        ListCreatorPresenter.access$500(ListCreatorPresenter.this).updateList(wishlist);
        ListCreatorPresenter.access$1100(ListCreatorPresenter.this);
        ListCreatorPresenter.access$1200(ListCreatorPresenter.this);
    }

    stsAdapter()
    {
        this$0 = ListCreatorPresenter.this;
        super();
    }
}
